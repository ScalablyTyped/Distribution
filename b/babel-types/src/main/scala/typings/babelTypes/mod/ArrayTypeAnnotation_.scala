package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ArrayTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayTypeAnnotation_
  extends StObject
     with Node
     with Flow
     with FlowTypeAnnotation {
  
  var elementType: FlowTypeAnnotation
  
  @JSName("type")
  var type_ArrayTypeAnnotation_ : ArrayTypeAnnotation
}
object ArrayTypeAnnotation_ {
  
  inline def apply(elementType: FlowTypeAnnotation, end: Double, loc: SourceLocation, start: Double): ArrayTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayTypeAnnotation")
    __obj.asInstanceOf[ArrayTypeAnnotation_]
  }
  
  extension [Self <: ArrayTypeAnnotation_](x: Self) {
    
    inline def setElementType(value: FlowTypeAnnotation): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setType(value: ArrayTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
