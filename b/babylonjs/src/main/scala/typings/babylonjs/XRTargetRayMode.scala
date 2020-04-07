package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babylonjs.babylonjsStrings.gaze
  - typings.babylonjs.babylonjsStrings.`tracked-pointer`
  - typings.babylonjs.babylonjsStrings.screen
*/
trait XRTargetRayMode extends js.Object

object XRTargetRayMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gaze: typings.babylonjs.babylonjsStrings.gaze = this.cast("gaze")
  @scala.inline
  def screen: typings.babylonjs.babylonjsStrings.screen = this.cast("screen")
  @scala.inline
  def `tracked-pointer`: typings.babylonjs.babylonjsStrings.`tracked-pointer` = this.cast("tracked-pointer")
}

