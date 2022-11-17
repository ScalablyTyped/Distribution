package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntersectionTypeAnnotation_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_IntersectionTypeAnnotation_ : "IntersectionTypeAnnotation"
  
  var types: js.Array[FlowType]
}
object IntersectionTypeAnnotation_ {
  
  inline def apply(types: js.Array[FlowType]): IntersectionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IntersectionTypeAnnotation")
    __obj.asInstanceOf[IntersectionTypeAnnotation_]
  }
  
  extension [Self <: IntersectionTypeAnnotation_](x: Self) {
    
    inline def setType(value: "IntersectionTypeAnnotation"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[FlowType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: FlowType*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
