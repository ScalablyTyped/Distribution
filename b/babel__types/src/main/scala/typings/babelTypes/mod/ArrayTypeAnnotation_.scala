package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ArrayTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ArrayTypeAnnotation_
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayTypeAnnotation_] (val x: Self) extends AnyVal {
    
    inline def setElementType(value: FlowType): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setType(value: ArrayTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
