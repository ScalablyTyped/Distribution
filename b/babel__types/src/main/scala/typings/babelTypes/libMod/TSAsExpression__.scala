package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSAsExpression__
  extends StObject
     with BaseNode {
  
  var expression: Expression
  
  var typeAnnotation: TSType
  
  @JSName("type")
  var type_TSAsExpression__ : "TSAsExpression"
}
object TSAsExpression__ {
  
  inline def apply(expression: Expression, typeAnnotation: TSType): TSAsExpression__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSAsExpression")
    __obj.asInstanceOf[TSAsExpression__]
  }
  
  extension [Self <: TSAsExpression__](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: "TSAsExpression"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
