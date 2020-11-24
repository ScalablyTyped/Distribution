package typings.babylonjs.anon

import typings.babylonjs.BABYLON.AbstractMesh
import typings.babylonjs.BABYLON.WebVRController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mesh extends js.Object {
  
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
  implicit class MeshOps[Self <: Mesh] (val x: Self) extends AnyVal {
    
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
    def setController(value: WebVRController): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMesh(value: AbstractMesh): Self = this.set("mesh", value.asInstanceOf[js.Any])
  }
}
