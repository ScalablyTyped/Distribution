package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebXRControllerOptions extends StObject {
  
  /**
    * Should the controller mesh be animated when a user interacts with it
    * The pressed buttons / thumbstick and touchpad animations will be disabled
    */
  var disableMotionControllerAnimation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Do not load the controller mesh, in case a different mesh needs to be loaded.
    */
  var doNotLoadControllerMesh: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Force a specific controller type for this controller.
    * This can be used when creating your own profile or when testing different controllers
    */
  var forceControllerProfile: js.UndefOr[String] = js.undefined
  
  /**
    * Defines a rendering group ID for meshes that will be loaded.
    * This is for the default controllers only.
    */
  var renderingGroupId: js.UndefOr[Double] = js.undefined
}
object IWebXRControllerOptions {
  
  inline def apply(): IWebXRControllerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebXRControllerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebXRControllerOptions] (val x: Self) extends AnyVal {
    
    inline def setDisableMotionControllerAnimation(value: Boolean): Self = StObject.set(x, "disableMotionControllerAnimation", value.asInstanceOf[js.Any])
    
    inline def setDisableMotionControllerAnimationUndefined: Self = StObject.set(x, "disableMotionControllerAnimation", js.undefined)
    
    inline def setDoNotLoadControllerMesh(value: Boolean): Self = StObject.set(x, "doNotLoadControllerMesh", value.asInstanceOf[js.Any])
    
    inline def setDoNotLoadControllerMeshUndefined: Self = StObject.set(x, "doNotLoadControllerMesh", js.undefined)
    
    inline def setForceControllerProfile(value: String): Self = StObject.set(x, "forceControllerProfile", value.asInstanceOf[js.Any])
    
    inline def setForceControllerProfileUndefined: Self = StObject.set(x, "forceControllerProfile", js.undefined)
    
    inline def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
    
    inline def setRenderingGroupIdUndefined: Self = StObject.set(x, "renderingGroupId", js.undefined)
  }
}
