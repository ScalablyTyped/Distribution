package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.ExpressionStatement_
  - typings.babelTypes.mod.ParenthesizedExpression_
  - typings.babelTypes.mod.TypeCastExpression_
*/
trait ExpressionWrapper
  extends StObject
     with _Node
object ExpressionWrapper {
  
  @scala.inline
  def ExpressionStatement_(expression: Expression): typings.babelTypes.mod.ExpressionStatement_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.ExpressionStatement_]
  }
  
  @scala.inline
  def ParenthesizedExpression_(expression: Expression): typings.babelTypes.mod.ParenthesizedExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ParenthesizedExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.ParenthesizedExpression_]
  }
  
  @scala.inline
  def TypeCastExpression_(expression: Expression, typeAnnotation: TypeAnnotation_): typings.babelTypes.mod.TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TypeCastExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.TypeCastExpression_]
  }
}
