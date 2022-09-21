package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeOperator
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  var operator: String
  
  var typeAnnotation: TSType
  
  @JSName("type")
  var type_TSTypeOperator: typings.babelTypes.babelTypesStrings.TSTypeOperator
}
object TSTypeOperator {
  
  inline def apply(operator: String, typeAnnotation: TSType): TSTypeOperator = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeOperator")
    __obj.asInstanceOf[TSTypeOperator]
  }
  
  extension [Self <: TSTypeOperator](x: Self) {
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSTypeOperator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
