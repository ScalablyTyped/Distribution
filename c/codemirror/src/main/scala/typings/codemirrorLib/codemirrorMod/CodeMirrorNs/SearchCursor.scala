package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchCursor extends js.Object {
  /** Searches forward or backward from the current position. The return value indicates whether a match was
           * found. If matching a regular expression, the return value will be the array returned by the match method, in case
           * you want to extract matched groups */
  def find(reverse: scala.Boolean): scala.Boolean | js.Array[_] = js.native
  /** Searches forward from the current position. The return value indicates whether a match was
           * found. If matching a regular expression, the return value will be the array returned by the match method, in case
           * you want to extract matched groups */
  def findNext(): scala.Boolean | js.Array[_] = js.native
  /** Searches backward from the current position. The return value indicates whether a match was
           * found. If matching a regular expression, the return value will be the array returned by the match method, in case
           * you want to extract matched groups */
  def findPrevious(): scala.Boolean | js.Array[_] = js.native
  /** Only valid when the last call to find, findNext, or findPrevious did not return false. Returns {line, ch}
           * objects pointing the start of the match. */
  def from(): Position = js.native
  /** Replaces the currently found match with the given text and adjusts the cursor position to reflect the deplacement. */
  def replace(text: java.lang.String): scala.Unit = js.native
  /** Replaces the currently found match with the given text and adjusts the cursor position to reflect the deplacement. */
  def replace(text: java.lang.String, origin: java.lang.String): scala.Unit = js.native
  /** Only valid when the last call to find, findNext, or findPrevious did not return false. Returns {line, ch}
           * objects pointing the end of the match. */
  def to(): Position = js.native
}

