package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.FreeCameraDeviceOrientationInput")
@js.native
/**
  * Instantiates a new input
  * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
  */
class FreeCameraDeviceOrientationInput ()
  extends typings.babylonjs.BABYLON.FreeCameraDeviceOrientationInput
/* static members */
@JSGlobal("BABYLON.FreeCameraDeviceOrientationInput")
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
