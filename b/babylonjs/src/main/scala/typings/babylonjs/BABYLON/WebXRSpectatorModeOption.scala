package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebXRSpectatorModeOption extends StObject {
  
  /**
    * Expected refresh rate (frames per sec) for a spectator camera.
    */
  var fps: js.UndefOr[Double] = js.undefined
  
  /**
    * The index of rigCameras array in a WebXR camera.
    */
  var preferredCameraIndex: js.UndefOr[Double] = js.undefined
}
object WebXRSpectatorModeOption {
  
  inline def apply(): WebXRSpectatorModeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebXRSpectatorModeOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebXRSpectatorModeOption] (val x: Self) extends AnyVal {
    
    inline def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
    
    inline def setFpsUndefined: Self = StObject.set(x, "fps", js.undefined)
    
    inline def setPreferredCameraIndex(value: Double): Self = StObject.set(x, "preferredCameraIndex", value.asInstanceOf[js.Any])
    
    inline def setPreferredCameraIndexUndefined: Self = StObject.set(x, "preferredCameraIndex", js.undefined)
  }
}
