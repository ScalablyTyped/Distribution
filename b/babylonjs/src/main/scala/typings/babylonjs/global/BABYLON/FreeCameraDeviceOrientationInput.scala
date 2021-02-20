package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
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
object FreeCameraDeviceOrientationInput {
  
  /**
    * Can be used to detect if a device orientation sensor is available on a device
    * @param timeout amount of time in milliseconds to wait for a response from the sensor (default: infinite)
    * @returns a promise that will resolve on orientation change
    */
  @JSGlobal("BABYLON.FreeCameraDeviceOrientationInput.WaitForOrientationChangeAsync")
  @js.native
  def WaitForOrientationChangeAsync(): js.Promise[_] = js.native
  @JSGlobal("BABYLON.FreeCameraDeviceOrientationInput.WaitForOrientationChangeAsync")
  @js.native
  def WaitForOrientationChangeAsync(timeout: Double): js.Promise[_] = js.native
}
