package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.ParenthesizedExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParenthesizedExpression_
  extends StObject
     with BaseNode
     with Expression
     with ExpressionWrapper
     with Node
     with Standardized {
  
  var expression: Expression
  
  @JSName("type")
  var type_ParenthesizedExpression_ : ParenthesizedExpression
}
object ParenthesizedExpression_ {
  
  inline def apply(expression: Expression): ParenthesizedExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ParenthesizedExpression")
    __obj.asInstanceOf[ParenthesizedExpression_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParenthesizedExpression_] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: ParenthesizedExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
