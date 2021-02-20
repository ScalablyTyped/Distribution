package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRInputOptions extends StObject {
  
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
  implicit class IWebXRInputOptionsMutableBuilder[Self <: IWebXRInputOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControllerOptions(value: IWebXRControllerOptions): Self = StObject.set(x, "controllerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllerOptionsUndefined: Self = StObject.set(x, "controllerOptions", js.undefined)
    
    @scala.inline
    def setCustomControllersRepositoryURL(value: String): Self = StObject.set(x, "customControllersRepositoryURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomControllersRepositoryURLUndefined: Self = StObject.set(x, "customControllersRepositoryURL", js.undefined)
    
    @scala.inline
    def setDisableControllerAnimation(value: Boolean): Self = StObject.set(x, "disableControllerAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableControllerAnimationUndefined: Self = StObject.set(x, "disableControllerAnimation", js.undefined)
    
    @scala.inline
    def setDisableOnlineControllerRepository(value: Boolean): Self = StObject.set(x, "disableOnlineControllerRepository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableOnlineControllerRepositoryUndefined: Self = StObject.set(x, "disableOnlineControllerRepository", js.undefined)
    
    @scala.inline
    def setDoNotLoadControllerMeshes(value: Boolean): Self = StObject.set(x, "doNotLoadControllerMeshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoNotLoadControllerMeshesUndefined: Self = StObject.set(x, "doNotLoadControllerMeshes", js.undefined)
    
    @scala.inline
    def setForceInputProfile(value: String): Self = StObject.set(x, "forceInputProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceInputProfileUndefined: Self = StObject.set(x, "forceInputProfile", js.undefined)
  }
}
