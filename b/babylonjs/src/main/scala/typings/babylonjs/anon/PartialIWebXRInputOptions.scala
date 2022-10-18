package typings.babylonjs.anon

import typings.babylonjs.xRWebXRInputSourceMod.IWebXRControllerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.babylonjs/XR/webXRInput.IWebXRInputOptions> */
trait PartialIWebXRInputOptions extends StObject {
  
  var controllerOptions: js.UndefOr[IWebXRControllerOptions] = js.undefined
  
  var customControllersRepositoryURL: js.UndefOr[String] = js.undefined
  
  var disableControllerAnimation: js.UndefOr[Boolean] = js.undefined
  
  var disableOnlineControllerRepository: js.UndefOr[Boolean] = js.undefined
  
  var doNotLoadControllerMeshes: js.UndefOr[Boolean] = js.undefined
  
  var forceInputProfile: js.UndefOr[String] = js.undefined
}
object PartialIWebXRInputOptions {
  
  inline def apply(): PartialIWebXRInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIWebXRInputOptions]
  }
  
  extension [Self <: PartialIWebXRInputOptions](x: Self) {
    
    inline def setControllerOptions(value: IWebXRControllerOptions): Self = StObject.set(x, "controllerOptions", value.asInstanceOf[js.Any])
    
    inline def setControllerOptionsUndefined: Self = StObject.set(x, "controllerOptions", js.undefined)
    
    inline def setCustomControllersRepositoryURL(value: String): Self = StObject.set(x, "customControllersRepositoryURL", value.asInstanceOf[js.Any])
    
    inline def setCustomControllersRepositoryURLUndefined: Self = StObject.set(x, "customControllersRepositoryURL", js.undefined)
    
    inline def setDisableControllerAnimation(value: Boolean): Self = StObject.set(x, "disableControllerAnimation", value.asInstanceOf[js.Any])
    
    inline def setDisableControllerAnimationUndefined: Self = StObject.set(x, "disableControllerAnimation", js.undefined)
    
    inline def setDisableOnlineControllerRepository(value: Boolean): Self = StObject.set(x, "disableOnlineControllerRepository", value.asInstanceOf[js.Any])
    
    inline def setDisableOnlineControllerRepositoryUndefined: Self = StObject.set(x, "disableOnlineControllerRepository", js.undefined)
    
    inline def setDoNotLoadControllerMeshes(value: Boolean): Self = StObject.set(x, "doNotLoadControllerMeshes", value.asInstanceOf[js.Any])
    
    inline def setDoNotLoadControllerMeshesUndefined: Self = StObject.set(x, "doNotLoadControllerMeshes", js.undefined)
    
    inline def setForceInputProfile(value: String): Self = StObject.set(x, "forceInputProfile", value.asInstanceOf[js.Any])
    
    inline def setForceInputProfileUndefined: Self = StObject.set(x, "forceInputProfile", js.undefined)
  }
}
