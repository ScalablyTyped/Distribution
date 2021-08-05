package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.IntersectionTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait IntersectionTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowType {
  
  @JSName("type")
  var type_IntersectionTypeAnnotation_ : IntersectionTypeAnnotation
  
  var types: js.Array[FlowType]
}
object IntersectionTypeAnnotation_ {
  
  inline def apply(types: js.Array[FlowType]): IntersectionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("IntersectionTypeAnnotation")
    __obj.asInstanceOf[IntersectionTypeAnnotation_]
  }
  
  extension [Self <: IntersectionTypeAnnotation_](x: Self) {
    
    inline def setType(value: IntersectionTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[FlowType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: FlowType*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
