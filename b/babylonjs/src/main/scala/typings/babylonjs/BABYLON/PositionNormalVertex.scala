package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionNormalVertex extends js.Object {
  
  /** the normal of the vertex (defaut: 0,1,0) */
  var normal: Vector3 = js.native
  
  /** the position of the vertex (defaut: 0,0,0) */
  var position: Vector3 = js.native
}
object PositionNormalVertex {
  
  @scala.inline
  def apply(normal: Vector3, position: Vector3): PositionNormalVertex = {
    val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionNormalVertex]
  }
  
  @scala.inline
  implicit class PositionNormalVertexOps[Self <: PositionNormalVertex] (val x: Self) extends AnyVal {
    
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
    def setNormal(value: Vector3): Self = this.set("normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Vector3): Self = this.set("position", value.asInstanceOf[js.Any])
  }
}
