package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.NullableTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait NullableTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowType {
  
  var typeAnnotation: FlowType
  
  @JSName("type")
  var type_NullableTypeAnnotation_ : NullableTypeAnnotation
}
object NullableTypeAnnotation_ {
  
  inline def apply(typeAnnotation: FlowType): NullableTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NullableTypeAnnotation")
    __obj.asInstanceOf[NullableTypeAnnotation_]
  }
  
  extension [Self <: NullableTypeAnnotation_](x: Self) {
    
    inline def setType(value: NullableTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: FlowType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
