package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ExpressionStatement
import typings.babelTypes.babelTypesStrings.ParenthesizedExpression
import typings.babelTypes.babelTypesStrings.TypeCastExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.indexTs37Mod.ExpressionStatement_
  - typings.babelTypes.indexTs37Mod.ParenthesizedExpression_
  - typings.babelTypes.indexTs37Mod.TypeCastExpression_
*/
trait ExpressionWrapper extends _Node
object ExpressionWrapper {
  
  @scala.inline
  def ExpressionStatement_(expression: Expression, `type`: ExpressionStatement): typings.babelTypes.indexTs37Mod.ExpressionStatement_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ExpressionStatement_]
  }
  
  @scala.inline
  def ParenthesizedExpression_(expression: Expression, `type`: ParenthesizedExpression): typings.babelTypes.indexTs37Mod.ParenthesizedExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ParenthesizedExpression_]
  }
  
  @scala.inline
  def TypeCastExpression_(expression: Expression, `type`: TypeCastExpression, typeAnnotation: TypeAnnotation_): typings.babelTypes.indexTs37Mod.TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.TypeCastExpression_]
  }
}
