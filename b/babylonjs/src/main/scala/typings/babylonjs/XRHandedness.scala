package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babylonjs.babylonjsStrings.none
  - typings.babylonjs.babylonjsStrings.left
  - typings.babylonjs.babylonjsStrings.right
*/
trait XRHandedness extends js.Object

object XRHandedness {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typings.babylonjs.babylonjsStrings.left = this.cast("left")
  @scala.inline
  def none: typings.babylonjs.babylonjsStrings.none = this.cast("none")
  @scala.inline
  def right: typings.babylonjs.babylonjsStrings.right = this.cast("right")
}

