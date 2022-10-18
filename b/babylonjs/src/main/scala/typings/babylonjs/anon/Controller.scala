package typings.babylonjs.anon

import typings.babylonjs.gamepadsControllersWebVRControllerMod.WebVRController
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Controller extends StObject {
  
  var controller: WebVRController
  
  var mesh: AbstractMesh
}
object Controller {
  
  inline def apply(controller: WebVRController, mesh: AbstractMesh): Controller = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[Controller]
  }
  
  extension [Self <: Controller](x: Self) {
    
    inline def setController(value: WebVRController): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setMesh(value: AbstractMesh): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
  }
}
