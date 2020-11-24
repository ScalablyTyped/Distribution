package typings.babylonjs.BABYLON

import typings.babylonjs.anon.EnablePhysics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRHandTrackingOptions extends js.Object {
  
  /**
    * Configuration object for the joint meshes
    */
  var jointMeshes: js.UndefOr[EnablePhysics] = js.native
  
  /**
    * The xrInput that will be used as source for new hands
    */
  var xrInput: WebXRInput = js.native
}
object IWebXRHandTrackingOptions {
  
  @scala.inline
  def apply(xrInput: WebXRInput): IWebXRHandTrackingOptions = {
    val __obj = js.Dynamic.literal(xrInput = xrInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRHandTrackingOptions]
  }
  
  @scala.inline
  implicit class IWebXRHandTrackingOptionsOps[Self <: IWebXRHandTrackingOptions] (val x: Self) extends AnyVal {
    
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
    def setXrInput(value: WebXRInput): Self = this.set("xrInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJointMeshes(value: EnablePhysics): Self = this.set("jointMeshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJointMeshes: Self = this.set("jointMeshes", js.undefined)
  }
}
