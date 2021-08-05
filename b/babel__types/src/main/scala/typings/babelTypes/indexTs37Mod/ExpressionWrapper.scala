package typings.babelTypes.indexTs37Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.indexTs37Mod.ExpressionStatement_
  - typings.babelTypes.indexTs37Mod.ParenthesizedExpression_
  - typings.babelTypes.indexTs37Mod.TypeCastExpression_
*/
trait ExpressionWrapper
  extends StObject
     with _Node
object ExpressionWrapper {
  
  inline def ExpressionStatement_(expression: Expression): typings.babelTypes.indexTs37Mod.ExpressionStatement_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ExpressionStatement_]
  }
  
  inline def ParenthesizedExpression_(expression: Expression): typings.babelTypes.indexTs37Mod.ParenthesizedExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ParenthesizedExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ParenthesizedExpression_]
  }
  
  inline def TypeCastExpression_(expression: Expression, typeAnnotation: TypeAnnotation_): typings.babelTypes.indexTs37Mod.TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TypeCastExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.TypeCastExpression_]
  }
}
