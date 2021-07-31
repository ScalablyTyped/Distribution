package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchCursor extends StObject {
  
  /** Searches forward or backward from the current position. The return value indicates whether a match was
    * found. If matching a regular expression, the return value will be the array returned by the match method, in case
    * you want to extract matched groups */
  def find(reverse: Boolean): Boolean | js.Array[js.Any] = js.native
  
  /** Searches forward from the current position. The return value indicates whether a match was
    * found. If matching a regular expression, the return value will be the array returned by the match method, in case
    * you want to extract matched groups */
  def findNext(): Boolean | js.Array[js.Any] = js.native
  
  /** Searches backward from the current position. The return value indicates whether a match was
    * found. If matching a regular expression, the return value will be the array returned by the match method, in case
    * you want to extract matched groups */
  def findPrevious(): Boolean | js.Array[js.Any] = js.native
  
  /** Only valid when the last call to find, findNext, or findPrevious did not return false. Returns {line, ch}
    * objects pointing the start of the match. */
  def from(): Position = js.native
  
  /** Replaces the currently found match with the given text and adjusts the cursor position to reflect the deplacement. */
  def replace(text: String): Unit = js.native
  def replace(text: String, origin: String): Unit = js.native
  
  /** Only valid when the last call to find, findNext, or findPrevious did not return false. Returns {line, ch}
    * objects pointing the end of the match. */
  def to(): Position = js.native
}
