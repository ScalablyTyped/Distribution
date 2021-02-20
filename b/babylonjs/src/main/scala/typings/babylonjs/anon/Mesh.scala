package typings.babylonjs.anon

import typings.babylonjs.BABYLON.AbstractMesh
import typings.babylonjs.BABYLON.WebVRController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mesh extends StObject {
  
  var controller: WebVRController = js.native
  
  var mesh: AbstractMesh = js.native
}
object Mesh {
  
  @scala.inline
  def apply(controller: WebVRController, mesh: AbstractMesh): Mesh = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mesh]
  }
  
  @scala.inline
  implicit class MeshMutableBuilder[Self <: Mesh] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setController(value: WebVRController): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMesh(value: AbstractMesh): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
  }
}
