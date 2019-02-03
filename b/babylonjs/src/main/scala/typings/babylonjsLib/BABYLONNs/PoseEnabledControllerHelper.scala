package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the PoseEnabledControllerHelper object that is used initialize a gamepad as the controller type it is specified as (eg. windows mixed reality controller)
  */
@JSGlobal("BABYLON.PoseEnabledControllerHelper")
@js.native
class PoseEnabledControllerHelper () extends js.Object

/* static members */
@JSGlobal("BABYLON.PoseEnabledControllerHelper")
@js.native
object PoseEnabledControllerHelper extends js.Object {
  /**
    * Initializes a gamepad as the controller type it is specified as (eg. windows mixed reality controller)
    * @param vrGamepad the gamepad to initialized
    * @returns a vr controller of the type the gamepad identified as
    */
  def InitiateController(vrGamepad: js.Any): babylonjsLib.BABYLONNs.OculusTouchController | babylonjsLib.BABYLONNs.WindowsMotionController | babylonjsLib.BABYLONNs.ViveController | babylonjsLib.BABYLONNs.GearVRController | babylonjsLib.BABYLONNs.DaydreamController | babylonjsLib.BABYLONNs.GenericController = js.native
}

