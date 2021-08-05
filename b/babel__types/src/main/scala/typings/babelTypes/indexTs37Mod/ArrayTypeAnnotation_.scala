package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ArrayTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait ArrayTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowType {
  
  var elementType: FlowType
  
  @JSName("type")
  var type_ArrayTypeAnnotation_ : ArrayTypeAnnotation
}
object ArrayTypeAnnotation_ {
  
  inline def apply(elementType: FlowType): ArrayTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ArrayTypeAnnotation")
    __obj.asInstanceOf[ArrayTypeAnnotation_]
  }
  
  extension [Self <: ArrayTypeAnnotation_](x: Self) {
    
    inline def setElementType(value: FlowType): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setType(value: ArrayTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
