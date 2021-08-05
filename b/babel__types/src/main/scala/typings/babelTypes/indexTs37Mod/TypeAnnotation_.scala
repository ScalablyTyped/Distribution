package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait TypeAnnotation_
  extends StObject
     with BaseNode
     with Flow {
  
  var typeAnnotation: FlowType
  
  @JSName("type")
  var type_TypeAnnotation_ : TypeAnnotation
}
object TypeAnnotation_ {
  
  inline def apply(typeAnnotation: FlowType): TypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TypeAnnotation")
    __obj.asInstanceOf[TypeAnnotation_]
  }
  
  extension [Self <: TypeAnnotation_](x: Self) {
    
    inline def setType(value: TypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: FlowType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
