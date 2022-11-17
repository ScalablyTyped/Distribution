package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnionTypeAnnotation_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_UnionTypeAnnotation_ : "UnionTypeAnnotation"
  
  var types: js.Array[FlowType]
}
object UnionTypeAnnotation_ {
  
  inline def apply(types: js.Array[FlowType]): UnionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnionTypeAnnotation")
    __obj.asInstanceOf[UnionTypeAnnotation_]
  }
  
  extension [Self <: UnionTypeAnnotation_](x: Self) {
    
    inline def setType(value: "UnionTypeAnnotation"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[FlowType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: FlowType*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
