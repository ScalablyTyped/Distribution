package typings.babylonjs.BABYLON

import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebVROptions extends js.Object {
  
  /**
    * Should the native controller meshes be initialized. (default: true)
    */
  var controllerMeshes: js.UndefOr[Boolean] = js.native
  
  /**
    * If you'd like to provide your own button to the VRHelper. (default: standard babylon vr button)
    */
  var customVRButton: js.UndefOr[HTMLButtonElement] = js.native
  
  /**
    * To change the default offset from the ground to account for user's height in meters. Will be scaled by positionScale. (default: 1.7)
    */
  var defaultHeight: js.UndefOr[Double] = js.native
  
  /**
    * Creating a default HemiLight only on controllers. (default: true)
    */
  var defaultLightingOnControllers: js.UndefOr[Boolean] = js.native
  
  /**
    * If there are more than one VRDisplays, this will choose the display matching this name. (default: pick first vrDisplay)
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Sets the scale of the vrDevice in babylon space. (default: 1)
    */
  var positionScale: js.UndefOr[Double] = js.native
  
  /**
    * To change the length of the ray for gaze/controllers. Will be scaled by positionScale. (default: 100)
    */
  var rayLength: js.UndefOr[Double] = js.native
  
  /**
    * Sets if the webVR camera should be tracked to the vrDevice. (default: true)
    */
  var trackPosition: js.UndefOr[Boolean] = js.native
  
  /**
    * If you don't want to use the default VR button of the helper. (default: false)
    */
  var useCustomVRButton: js.UndefOr[Boolean] = js.native
  
  /**
    * If multiview should be used if availible (default: false)
    */
  var useMultiview: js.UndefOr[Boolean] = js.native
}
object WebVROptions {
  
  @scala.inline
  def apply(): WebVROptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebVROptions]
  }
  
  @scala.inline
  implicit class WebVROptionsOps[Self <: WebVROptions] (val x: Self) extends AnyVal {
    
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
    def setControllerMeshes(value: Boolean): Self = this.set("controllerMeshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControllerMeshes: Self = this.set("controllerMeshes", js.undefined)
    
    @scala.inline
    def setCustomVRButton(value: HTMLButtonElement): Self = this.set("customVRButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomVRButton: Self = this.set("customVRButton", js.undefined)
    
    @scala.inline
    def setDefaultHeight(value: Double): Self = this.set("defaultHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultHeight: Self = this.set("defaultHeight", js.undefined)
    
    @scala.inline
    def setDefaultLightingOnControllers(value: Boolean): Self = this.set("defaultLightingOnControllers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLightingOnControllers: Self = this.set("defaultLightingOnControllers", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setPositionScale(value: Double): Self = this.set("positionScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionScale: Self = this.set("positionScale", js.undefined)
    
    @scala.inline
    def setRayLength(value: Double): Self = this.set("rayLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRayLength: Self = this.set("rayLength", js.undefined)
    
    @scala.inline
    def setTrackPosition(value: Boolean): Self = this.set("trackPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackPosition: Self = this.set("trackPosition", js.undefined)
    
    @scala.inline
    def setUseCustomVRButton(value: Boolean): Self = this.set("useCustomVRButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCustomVRButton: Self = this.set("useCustomVRButton", js.undefined)
    
    @scala.inline
    def setUseMultiview(value: Boolean): Self = this.set("useMultiview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseMultiview: Self = this.set("useMultiview", js.undefined)
  }
}
