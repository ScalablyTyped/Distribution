package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Manage the mouse wheel inputs to control an arc rotate camera.
  * @see http://doc.babylonjs.com/how_to/customizing_camera_inputs
  */
@JSGlobal("BABYLON.ArcRotateCameraMouseWheelInput")
@js.native
class ArcRotateCameraMouseWheelInput () extends ICameraInput[ArcRotateCamera] {
  var _observer: js.Any = js.native
  var _wheel: js.Any = js.native
  /**
    * Defines the camera the input is attached to.
    */
  @JSName("camera")
  var camera_ArcRotateCameraMouseWheelInput: ArcRotateCamera = js.native
  /**
    * wheelDeltaPercentage will be used instead of wheelPrecision if different from 0.
    * It defines the percentage of current camera.radius to use as delta when wheel is used.
    */
  var wheelDeltaPercentage: scala.Double = js.native
  /**
    * Gets or Set the mouse wheel precision or how fast is the camera zooming.
    */
  var wheelPrecision: scala.Double = js.native
}

