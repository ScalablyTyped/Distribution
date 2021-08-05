package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSTypeOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSTypeOperator_
  extends StObject
     with BaseNode
     with TSType {
  
  var operator: String
  
  var typeAnnotation: TSType
  
  @JSName("type")
  var type_TSTypeOperator_ : TSTypeOperator
}
object TSTypeOperator_ {
  
  inline def apply(operator: String, typeAnnotation: TSType): TSTypeOperator_ = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTypeOperator")
    __obj.asInstanceOf[TSTypeOperator_]
  }
  
  extension [Self <: TSTypeOperator_](x: Self) {
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setType(value: TSTypeOperator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
