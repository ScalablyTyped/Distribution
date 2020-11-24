package typings.babylonjs.edgesRendererMod.babylonjsMeshesAbstractMeshAugmentingMod

import typings.babylonjs.edgesRendererMod.EdgesRenderer
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractMesh extends js.Object {
  
  /**
    * Gets the edgesRenderer associated with the mesh
    */
  var edgesRenderer: Nullable[EdgesRenderer] = js.native
}
object AbstractMesh {
  
  @scala.inline
  def apply(): AbstractMesh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbstractMesh]
  }
  
  @scala.inline
  implicit class AbstractMeshOps[Self <: AbstractMesh] (val x: Self) extends AnyVal {
    
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
    def setEdgesRenderer(value: Nullable[EdgesRenderer]): Self = this.set("edgesRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesRendererNull: Self = this.set("edgesRenderer", null)
  }
}
