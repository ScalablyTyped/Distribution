package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "PoseEnabledController")
@js.native
class PoseEnabledController protected ()
  extends typings.babylonjs.gamepadsIndexMod.PoseEnabledController {
  /**
    * Creates a new PoseEnabledController from a gamepad
    * @param browserGamepad the gamepad that the PoseEnabledController should be created from
    */
  def this(browserGamepad: js.Any) = this()
}

/* static members */
@JSImport("babylonjs/index", "PoseEnabledController")
@js.native
object PoseEnabledController extends js.Object {
  /**
    * Name of the child mesh that can be used to cast a ray from the controller
    */
  val POINTING_POSE: String = js.native
}

