package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Manage the device orientation inputs (gyroscope) to control an arc rotate camera.
  * @see http://doc.babylonjs.com/how_to/customizing_camera_inputs
  */
@JSGlobal("BABYLON.ArcRotateCameraVRDeviceOrientationInput")
@js.native
/**
  * Instantiate a new ArcRotateCameraVRDeviceOrientationInput.
  */
class ArcRotateCameraVRDeviceOrientationInput () extends ICameraInput[ArcRotateCamera] {
  var _alpha: js.Any = js.native
  var _deviceOrientationHandler: js.Any = js.native
  var _dirty: js.Any = js.native
  var _gamma: js.Any = js.native
  /**
    * Defines a correction factor applied on the alpha value retrieved from the orientation events.
    */
  var alphaCorrection: scala.Double = js.native
  /**
    * Defines a correction factor applied on the beta value retrieved from the orientation events.
    */
  var betaCorrection: scala.Double = js.native
  /**
    * Defines the camera the input is attached to.
    */
  @JSName("camera")
  var camera_ArcRotateCameraVRDeviceOrientationInput: ArcRotateCamera = js.native
  /**
    * Defines a correction factor applied on the gamma value retrieved from the orientation events.
    */
  var gammaCorrection: scala.Double = js.native
  /** @hidden */
  def _onOrientationEvent(evt: stdLib.DeviceOrientationEvent): scala.Unit = js.native
  /**
    * Update the current camera state depending on the inputs that have been used this frame.
    * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
    */
  @JSName("checkInputs")
  def checkInputs_MArcRotateCameraVRDeviceOrientationInput(): scala.Unit = js.native
}

