package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VRExperienceHelperOptions
  extends StObject
     with WebVROptions {
  
  /**
    * Create a DeviceOrientationCamera to be used as your out of vr camera. (default: true)
    */
  var createDeviceOrientationCamera: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Create a VRDeviceOrientationFreeCamera to be used for VR when no external HMD is found. (default: true)
    */
  var createFallbackVRDeviceOrientationFreeCamera: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of meshes to be used as the teleportation floor. If specified, teleportation will be enabled (default: undefined)
    */
  var floorMeshes: js.UndefOr[js.Array[Mesh]] = js.undefined
  
  /**
    * Uses the main button on the controller to toggle the laser casted. (default: true)
    */
  var laserToggle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines if WebXR should be used instead of WebVR (if available)
    */
  var useXR: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Distortion metrics for the fallback vrDeviceOrientationCamera (default: VRCameraMetrics.Default)
    */
  var vrDeviceOrientationCameraMetrics: js.UndefOr[VRCameraMetrics] = js.undefined
}
object VRExperienceHelperOptions {
  
  inline def apply(): VRExperienceHelperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VRExperienceHelperOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VRExperienceHelperOptions] (val x: Self) extends AnyVal {
    
    inline def setCreateDeviceOrientationCamera(value: Boolean): Self = StObject.set(x, "createDeviceOrientationCamera", value.asInstanceOf[js.Any])
    
    inline def setCreateDeviceOrientationCameraUndefined: Self = StObject.set(x, "createDeviceOrientationCamera", js.undefined)
    
    inline def setCreateFallbackVRDeviceOrientationFreeCamera(value: Boolean): Self = StObject.set(x, "createFallbackVRDeviceOrientationFreeCamera", value.asInstanceOf[js.Any])
    
    inline def setCreateFallbackVRDeviceOrientationFreeCameraUndefined: Self = StObject.set(x, "createFallbackVRDeviceOrientationFreeCamera", js.undefined)
    
    inline def setFloorMeshes(value: js.Array[Mesh]): Self = StObject.set(x, "floorMeshes", value.asInstanceOf[js.Any])
    
    inline def setFloorMeshesUndefined: Self = StObject.set(x, "floorMeshes", js.undefined)
    
    inline def setFloorMeshesVarargs(value: Mesh*): Self = StObject.set(x, "floorMeshes", js.Array(value*))
    
    inline def setLaserToggle(value: Boolean): Self = StObject.set(x, "laserToggle", value.asInstanceOf[js.Any])
    
    inline def setLaserToggleUndefined: Self = StObject.set(x, "laserToggle", js.undefined)
    
    inline def setUseXR(value: Boolean): Self = StObject.set(x, "useXR", value.asInstanceOf[js.Any])
    
    inline def setUseXRUndefined: Self = StObject.set(x, "useXR", js.undefined)
    
    inline def setVrDeviceOrientationCameraMetrics(value: VRCameraMetrics): Self = StObject.set(x, "vrDeviceOrientationCameraMetrics", value.asInstanceOf[js.Any])
    
    inline def setVrDeviceOrientationCameraMetricsUndefined: Self = StObject.set(x, "vrDeviceOrientationCameraMetrics", js.undefined)
  }
}
