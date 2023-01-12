package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TypeCastExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeCastExpression_
  extends StObject
     with BaseNode
     with Expression
     with ExpressionWrapper
     with Flow
     with Node {
  
  var expression: Expression
  
  var typeAnnotation: TypeAnnotation_
  
  @JSName("type")
  var type_TypeCastExpression_ : TypeCastExpression
}
object TypeCastExpression_ {
  
  inline def apply(expression: Expression, typeAnnotation: TypeAnnotation_): TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeCastExpression")
    __obj.asInstanceOf[TypeCastExpression_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeCastExpression_] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: TypeCastExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TypeAnnotation_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
