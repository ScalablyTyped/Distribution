package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.StringLiteralTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait StringLiteralTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowType {
  
  @JSName("type")
  var type_StringLiteralTypeAnnotation_ : StringLiteralTypeAnnotation
  
  var value: String
}
object StringLiteralTypeAnnotation_ {
  
  inline def apply(value: String): StringLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("StringLiteralTypeAnnotation")
    __obj.asInstanceOf[StringLiteralTypeAnnotation_]
  }
  
  extension [Self <: StringLiteralTypeAnnotation_](x: Self) {
    
    inline def setType(value: StringLiteralTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
