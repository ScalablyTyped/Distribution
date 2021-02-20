package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ExpressionStatement
import typings.babelTypes.babelTypesStrings.ParenthesizedExpression
import typings.babelTypes.babelTypesStrings.TypeCastExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.ExpressionStatement_
  - typings.babelTypes.mod.ParenthesizedExpression_
  - typings.babelTypes.mod.TypeCastExpression_
*/
trait ExpressionWrapper extends _Node
object ExpressionWrapper {
  
  @scala.inline
  def ExpressionStatement_(expression: Expression, `type`: ExpressionStatement): typings.babelTypes.mod.ExpressionStatement_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.ExpressionStatement_]
  }
  
  @scala.inline
  def ParenthesizedExpression_(expression: Expression, `type`: ParenthesizedExpression): typings.babelTypes.mod.ParenthesizedExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.ParenthesizedExpression_]
  }
  
  @scala.inline
  def TypeCastExpression_(expression: Expression, `type`: TypeCastExpression, typeAnnotation: TypeAnnotation_): typings.babelTypes.mod.TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TypeCastExpression_]
  }
}
