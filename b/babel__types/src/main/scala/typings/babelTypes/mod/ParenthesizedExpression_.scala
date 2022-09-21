package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ParenthesizedExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ParenthesizedExpression_
  extends StObject
     with BaseNode
     with Expression
     with ExpressionWrapper
     with Standardized {
  
  var expression: Expression
  
  @JSName("type")
  var type_ParenthesizedExpression_ : ParenthesizedExpression
}
object ParenthesizedExpression_ {
  
  inline def apply(expression: Expression): ParenthesizedExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ParenthesizedExpression")
    __obj.asInstanceOf[ParenthesizedExpression_]
  }
  
  extension [Self <: ParenthesizedExpression_](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: ParenthesizedExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
