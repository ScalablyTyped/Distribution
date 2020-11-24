package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubMesh extends js.Object {
  
  var effect: typings.babylonjs.BABYLON.Effect = js.native
  
  var subMesh: Nullable[typings.babylonjs.BABYLON.SubMesh] = js.native
}
object SubMesh {
  
  @scala.inline
  def apply(effect: typings.babylonjs.BABYLON.Effect): SubMesh = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubMesh]
  }
  
  @scala.inline
  implicit class SubMeshOps[Self <: SubMesh] (val x: Self) extends AnyVal {
    
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
    def setEffect(value: typings.babylonjs.BABYLON.Effect): Self = this.set("effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubMesh(value: Nullable[typings.babylonjs.BABYLON.SubMesh]): Self = this.set("subMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubMeshNull: Self = this.set("subMesh", null)
  }
}
