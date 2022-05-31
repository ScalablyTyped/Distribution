package typings.babylonjs.anon

import typings.babylonjs.BABYLON.NodeMaterialConnectionPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmitVertex extends StObject {
  
  var emitFragment: Boolean
  
  var emitVertex: Boolean
  
  var notConnectedNonOptionalInputs: js.Array[NodeMaterialConnectionPoint]
}
object EmitVertex {
  
  inline def apply(
    emitFragment: Boolean,
    emitVertex: Boolean,
    notConnectedNonOptionalInputs: js.Array[NodeMaterialConnectionPoint]
  ): EmitVertex = {
    val __obj = js.Dynamic.literal(emitFragment = emitFragment.asInstanceOf[js.Any], emitVertex = emitVertex.asInstanceOf[js.Any], notConnectedNonOptionalInputs = notConnectedNonOptionalInputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitVertex]
  }
  
  extension [Self <: EmitVertex](x: Self) {
    
    inline def setEmitFragment(value: Boolean): Self = StObject.set(x, "emitFragment", value.asInstanceOf[js.Any])
    
    inline def setEmitVertex(value: Boolean): Self = StObject.set(x, "emitVertex", value.asInstanceOf[js.Any])
    
    inline def setNotConnectedNonOptionalInputs(value: js.Array[NodeMaterialConnectionPoint]): Self = StObject.set(x, "notConnectedNonOptionalInputs", value.asInstanceOf[js.Any])
    
    inline def setNotConnectedNonOptionalInputsVarargs(value: NodeMaterialConnectionPoint*): Self = StObject.set(x, "notConnectedNonOptionalInputs", js.Array(value :_*))
  }
}
