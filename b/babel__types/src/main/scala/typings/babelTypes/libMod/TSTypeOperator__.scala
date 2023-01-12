package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSTypeOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeOperator__
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  var operator: String
  
  var typeAnnotation: TSType
  
  @JSName("type")
  var type_TSTypeOperator__ : TSTypeOperator
}
object TSTypeOperator__ {
  
  inline def apply(operator: String, typeAnnotation: TSType): TSTypeOperator__ = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeOperator")
    __obj.asInstanceOf[TSTypeOperator__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSTypeOperator__] (val x: Self) extends AnyVal {
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setType(value: TSTypeOperator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
