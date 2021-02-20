package typings.babylonjs.anon

import typings.babylonjs.BABYLON.NodeMaterialConnectionPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmitVertex extends StObject {
  
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
  implicit class EmitVertexMutableBuilder[Self <: EmitVertex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmitFragment(value: Boolean): Self = StObject.set(x, "emitFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmitVertex(value: Boolean): Self = StObject.set(x, "emitVertex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotConnectedNonOptionalInputs(value: js.Array[NodeMaterialConnectionPoint]): Self = StObject.set(x, "notConnectedNonOptionalInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotConnectedNonOptionalInputsVarargs(value: NodeMaterialConnectionPoint*): Self = StObject.set(x, "notConnectedNonOptionalInputs", js.Array(value :_*))
  }
}
