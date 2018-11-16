package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines the PoseEnabledController object that contains state of a vr capable controller
     */
@JSImport("babylonjs", "PoseEnabledController")
@js.native
class PoseEnabledController protected ()
  extends babylonjsLib.BABYLONNs.PoseEnabledController {
  /**
           * Creates a new PoseEnabledController from a gamepad
           * @param browserGamepad the gamepad that the PoseEnabledController should be created from
           */
  def this(browserGamepad: js.Any) = this()
}

/**
     * Defines the PoseEnabledController object that contains state of a vr capable controller
     */
@JSImport("babylonjs", "PoseEnabledController")
@js.native
object PoseEnabledController extends js.Object {
  /**
           * Name of the child mesh that can be used to cast a ray from the controller
           */
  val POINTING_POSE: java.lang.String = js.native
}

