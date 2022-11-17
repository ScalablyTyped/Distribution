package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TupleTypeAnnotation_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_TupleTypeAnnotation_ : "TupleTypeAnnotation"
  
  var types: js.Array[FlowType]
}
object TupleTypeAnnotation_ {
  
  inline def apply(types: js.Array[FlowType]): TupleTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TupleTypeAnnotation")
    __obj.asInstanceOf[TupleTypeAnnotation_]
  }
  
  extension [Self <: TupleTypeAnnotation_](x: Self) {
    
    inline def setType(value: "TupleTypeAnnotation"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[FlowType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: FlowType*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
