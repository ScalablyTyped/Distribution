package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshLODLevel extends js.Object {
  
  /** Defines the distance where this level should start being displayed */
  var distance: Double = js.native
  
  /** Defines the mesh to use to render this level */
  var mesh: Nullable[Mesh] = js.native
}
object MeshLODLevel {
  
  @scala.inline
  def apply(distance: Double): MeshLODLevel = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshLODLevel]
  }
  
  @scala.inline
  implicit class MeshLODLevelOps[Self <: MeshLODLevel] (val x: Self) extends AnyVal {
    
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
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMesh(value: Nullable[Mesh]): Self = this.set("mesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshNull: Self = this.set("mesh", null)
  }
}
