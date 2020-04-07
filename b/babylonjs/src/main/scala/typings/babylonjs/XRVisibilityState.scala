package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babylonjs.babylonjsStrings.visible
  - typings.babylonjs.babylonjsStrings.`visible-blurred`
  - typings.babylonjs.babylonjsStrings.hidden
*/
trait XRVisibilityState extends js.Object

object XRVisibilityState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hidden: typings.babylonjs.babylonjsStrings.hidden = this.cast("hidden")
  @scala.inline
  def visible: typings.babylonjs.babylonjsStrings.visible = this.cast("visible")
  @scala.inline
  def `visible-blurred`: typings.babylonjs.babylonjsStrings.`visible-blurred` = this.cast("visible-blurred")
}

