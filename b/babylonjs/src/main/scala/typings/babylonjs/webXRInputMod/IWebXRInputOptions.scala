package typings.babylonjs.webXRInputMod

import typings.babylonjs.webXRInputSourceMod.IWebXRControllerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRInputOptions extends js.Object {
  
  /**
    * Optional options to pass to the controller. Will be overridden by the Input options where applicable
    */
  var controllerOptions: js.UndefOr[IWebXRControllerOptions] = js.native
  
  /**
    * A custom URL for the controllers repository
    */
  var customControllersRepositoryURL: js.UndefOr[String] = js.native
  
  /**
    * Should the controller model's components not move according to the user input
    */
  var disableControllerAnimation: js.UndefOr[Boolean] = js.native
  
  /**
    * Do not send a request to the controller repository to load the profile.
    *
    * Instead, use the controllers available in babylon itself.
    */
  var disableOnlineControllerRepository: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true no model will be automatically loaded
    */
  var doNotLoadControllerMeshes: js.UndefOr[Boolean] = js.native
  
  /**
    * If set, this profile will be used for all controllers loaded (for example "microsoft-mixed-reality")
    * If not found, the xr input profile data will be used.
    * Profiles are defined here - https://github.com/immersive-web/webxr-input-profiles/
    */
  var forceInputProfile: js.UndefOr[String] = js.native
}
object IWebXRInputOptions {
  
  @scala.inline
  def apply(): IWebXRInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebXRInputOptions]
  }
  
  @scala.inline
  implicit class IWebXRInputOptionsOps[Self <: IWebXRInputOptions] (val x: Self) extends AnyVal {
    
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
    def setControllerOptions(value: IWebXRControllerOptions): Self = this.set("controllerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControllerOptions: Self = this.set("controllerOptions", js.undefined)
    
    @scala.inline
    def setCustomControllersRepositoryURL(value: String): Self = this.set("customControllersRepositoryURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomControllersRepositoryURL: Self = this.set("customControllersRepositoryURL", js.undefined)
    
    @scala.inline
    def setDisableControllerAnimation(value: Boolean): Self = this.set("disableControllerAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableControllerAnimation: Self = this.set("disableControllerAnimation", js.undefined)
    
    @scala.inline
    def setDisableOnlineControllerRepository(value: Boolean): Self = this.set("disableOnlineControllerRepository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableOnlineControllerRepository: Self = this.set("disableOnlineControllerRepository", js.undefined)
    
    @scala.inline
    def setDoNotLoadControllerMeshes(value: Boolean): Self = this.set("doNotLoadControllerMeshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoNotLoadControllerMeshes: Self = this.set("doNotLoadControllerMeshes", js.undefined)
    
    @scala.inline
    def setForceInputProfile(value: String): Self = this.set("forceInputProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceInputProfile: Self = this.set("forceInputProfile", js.undefined)
  }
}
