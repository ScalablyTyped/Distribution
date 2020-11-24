package typings.babylonjs.anon

import typings.babylonjs.BABYLON.NodeMaterialConnectionPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmitVertex extends js.Object {
  
  var emitFragment: Boolean = js.native
  
  var emitVertex: Boolean = js.native
  
  var notConnectedNonOptionalInputs: js.Array[NodeMaterialConnectionPoint] = js.native
}
object EmitVertex {
  
  @scala.inline
  def apply(
    emitFragment: Boolean,
    emitVertex: Boolean,
    notConnectedNonOptionalInputs: js.Array[NodeMaterialConnectionPoint]
  ): EmitVertex = {
    val __obj = js.Dynamic.literal(emitFragment = emitFragment.asInstanceOf[js.Any], emitVertex = emitVertex.asInstanceOf[js.Any], notConnectedNonOptionalInputs = notConnectedNonOptionalInputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitVertex]
  }
  
  @scala.inline
  implicit class EmitVertexOps[Self <: EmitVertex] (val x: Self) extends AnyVal {
    
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
    def setEmitFragment(value: Boolean): Self = this.set("emitFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmitVertex(value: Boolean): Self = this.set("emitVertex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotConnectedNonOptionalInputsVarargs(value: NodeMaterialConnectionPoint*): Self = this.set("notConnectedNonOptionalInputs", js.Array(value :_*))
    
    @scala.inline
    def setNotConnectedNonOptionalInputs(value: js.Array[NodeMaterialConnectionPoint]): Self = this.set("notConnectedNonOptionalInputs", value.asInstanceOf[js.Any])
  }
}
