package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRControllerOptions extends js.Object {
  
  /**
    * Should the controller mesh be animated when a user interacts with it
    * The pressed buttons / thumbstick and touchpad animations will be disabled
    */
  var disableMotionControllerAnimation: js.UndefOr[Boolean] = js.native
  
  /**
    * Do not load the controller mesh, in case a different mesh needs to be loaded.
    */
  var doNotLoadControllerMesh: js.UndefOr[Boolean] = js.native
  
  /**
    * Force a specific controller type for this controller.
    * This can be used when creating your own profile or when testing different controllers
    */
  var forceControllerProfile: js.UndefOr[String] = js.native
  
  /**
    * Defines a rendering group ID for meshes that will be loaded.
    * This is for the default controllers only.
    */
  var renderingGroupId: js.UndefOr[Double] = js.native
}
object IWebXRControllerOptions {
  
  @scala.inline
  def apply(): IWebXRControllerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebXRControllerOptions]
  }
  
  @scala.inline
  implicit class IWebXRControllerOptionsOps[Self <: IWebXRControllerOptions] (val x: Self) extends AnyVal {
    
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
    def setDisableMotionControllerAnimation(value: Boolean): Self = this.set("disableMotionControllerAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableMotionControllerAnimation: Self = this.set("disableMotionControllerAnimation", js.undefined)
    
    @scala.inline
    def setDoNotLoadControllerMesh(value: Boolean): Self = this.set("doNotLoadControllerMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoNotLoadControllerMesh: Self = this.set("doNotLoadControllerMesh", js.undefined)
    
    @scala.inline
    def setForceControllerProfile(value: String): Self = this.set("forceControllerProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceControllerProfile: Self = this.set("forceControllerProfile", js.undefined)
    
    @scala.inline
    def setRenderingGroupId(value: Double): Self = this.set("renderingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderingGroupId: Self = this.set("renderingGroupId", js.undefined)
  }
}
