package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VRExperienceHelperOptions extends WebVROptions {
  
  /**
    * Create a DeviceOrientationCamera to be used as your out of vr camera. (default: true)
    */
  var createDeviceOrientationCamera: js.UndefOr[Boolean] = js.native
  
  /**
    * Create a VRDeviceOrientationFreeCamera to be used for VR when no external HMD is found. (default: true)
    */
  var createFallbackVRDeviceOrientationFreeCamera: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of meshes to be used as the teleportation floor. If specified, teleportation will be enabled (default: undefined)
    */
  var floorMeshes: js.UndefOr[js.Array[Mesh]] = js.native
  
  /**
    * Uses the main button on the controller to toggle the laser casted. (default: true)
    */
  var laserToggle: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines if WebXR should be used instead of WebVR (if available)
    */
  var useXR: js.UndefOr[Boolean] = js.native
  
  /**
    * Distortion metrics for the fallback vrDeviceOrientationCamera (default: VRCameraMetrics.Default)
    */
  var vrDeviceOrientationCameraMetrics: js.UndefOr[VRCameraMetrics] = js.native
}
object VRExperienceHelperOptions {
  
  @scala.inline
  def apply(): VRExperienceHelperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VRExperienceHelperOptions]
  }
  
  @scala.inline
  implicit class VRExperienceHelperOptionsOps[Self <: VRExperienceHelperOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateDeviceOrientationCamera(value: Boolean): Self = this.set("createDeviceOrientationCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDeviceOrientationCamera: Self = this.set("createDeviceOrientationCamera", js.undefined)
    
    @scala.inline
    def setCreateFallbackVRDeviceOrientationFreeCamera(value: Boolean): Self = this.set("createFallbackVRDeviceOrientationFreeCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateFallbackVRDeviceOrientationFreeCamera: Self = this.set("createFallbackVRDeviceOrientationFreeCamera", js.undefined)
    
    @scala.inline
    def setFloorMeshesVarargs(value: Mesh*): Self = this.set("floorMeshes", js.Array(value :_*))
    
    @scala.inline
    def setFloorMeshes(value: js.Array[Mesh]): Self = this.set("floorMeshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloorMeshes: Self = this.set("floorMeshes", js.undefined)
    
    @scala.inline
    def setLaserToggle(value: Boolean): Self = this.set("laserToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaserToggle: Self = this.set("laserToggle", js.undefined)
    
    @scala.inline
    def setUseXR(value: Boolean): Self = this.set("useXR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseXR: Self = this.set("useXR", js.undefined)
    
    @scala.inline
    def setVrDeviceOrientationCameraMetrics(value: VRCameraMetrics): Self = this.set("vrDeviceOrientationCameraMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVrDeviceOrientationCameraMetrics: Self = this.set("vrDeviceOrientationCameraMetrics", js.undefined)
  }
}
