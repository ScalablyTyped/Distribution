package typings.babylonjs.BABYLON

import typings.babylonjs.anon.EnablePhysics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRHandTrackingOptions extends StObject {
  
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
  implicit class IWebXRHandTrackingOptionsMutableBuilder[Self <: IWebXRHandTrackingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJointMeshes(value: EnablePhysics): Self = StObject.set(x, "jointMeshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJointMeshesUndefined: Self = StObject.set(x, "jointMeshes", js.undefined)
    
    @scala.inline
    def setXrInput(value: WebXRInput): Self = StObject.set(x, "xrInput", value.asInstanceOf[js.Any])
  }
}
