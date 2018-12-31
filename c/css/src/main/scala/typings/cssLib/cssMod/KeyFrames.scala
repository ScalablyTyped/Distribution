package typings
package cssLib.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyFrames extends Node {
  /** Array of nodes with the types keyframe and comment. */
  var keyframes: js.UndefOr[js.Array[KeyFrame | Comment]] = js.undefined
  /** The name of the keyframes rule. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The vendor prefix in @keyframes, or undefined if there is none. */
  var vendor: js.UndefOr[java.lang.String] = js.undefined
}

