package typings.babylonjs.anon

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.webVRControllerMod.WebVRController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Controller extends StObject {
  
  var controller: WebVRController = js.native
  
  var mesh: AbstractMesh = js.native
}
object Controller {
  
  @scala.inline
  def apply(controller: WebVRController, mesh: AbstractMesh): Controller = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[Controller]
  }
  
  @scala.inline
  implicit class ControllerMutableBuilder[Self <: Controller] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setController(value: WebVRController): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMesh(value: AbstractMesh): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
  }
}
