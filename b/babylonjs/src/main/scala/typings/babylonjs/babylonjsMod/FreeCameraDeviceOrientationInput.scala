package typings.babylonjs.babylonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/index", "FreeCameraDeviceOrientationInput")
@js.native
/**
  * Instantiates a new input
  * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
  */
class FreeCameraDeviceOrientationInput ()
  extends typings.babylonjs.inputsIndexMod.FreeCameraDeviceOrientationInput
/* static members */
object FreeCameraDeviceOrientationInput {
  
  @JSImport("babylonjs/Cameras/index", "FreeCameraDeviceOrientationInput")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Can be used to detect if a device orientation sensor is available on a device
    * @param timeout amount of time in milliseconds to wait for a response from the sensor (default: infinite)
    * @returns a promise that will resolve on orientation change
    */
  inline def WaitForOrientationChangeAsync(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("WaitForOrientationChangeAsync")().asInstanceOf[js.Promise[js.Any]]
  inline def WaitForOrientationChangeAsync(timeout: Double): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("WaitForOrientationChangeAsync")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
}
