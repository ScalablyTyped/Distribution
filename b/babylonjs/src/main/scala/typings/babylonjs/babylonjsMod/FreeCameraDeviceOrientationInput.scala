package typings.babylonjs.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Cameras/index", "FreeCameraDeviceOrientationInput")
@js.native
/**
  * Instantiates a new input
  * @see http://doc.babylonjs.com/how_to/customizing_camera_inputs
  */
class FreeCameraDeviceOrientationInput ()
  extends typings.babylonjs.inputsIndexMod.FreeCameraDeviceOrientationInput

/* static members */
@JSImport("babylonjs/Cameras/index", "FreeCameraDeviceOrientationInput")
@js.native
object FreeCameraDeviceOrientationInput extends js.Object {
  /**
    * Can be used to detect if a device orientation sensor is available on a device
    * @param timeout amount of time in milliseconds to wait for a response from the sensor (default: infinite)
    * @returns a promise that will resolve on orientation change
    */
  def WaitForOrientationChangeAsync(): js.Promise[_] = js.native
  def WaitForOrientationChangeAsync(timeout: Double): js.Promise[_] = js.native
}

