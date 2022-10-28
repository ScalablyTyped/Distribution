package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.Identifier_
  - typings.babelTypes.mod.RestElement_
  - typings.babelTypes.mod.AssignmentPattern_
  - typings.babelTypes.mod.ArrayPattern_
  - typings.babelTypes.mod.ObjectPattern_
  - typings.babelTypes.mod.TSAsExpression_
  - typings.babelTypes.mod.TSSatisfiesExpression_
  - typings.babelTypes.mod.TSTypeAssertion_
  - typings.babelTypes.mod.TSNonNullExpression_
*/
trait PatternLike
  extends StObject
     with _Node
object PatternLike {
  
  inline def ArrayPattern_(elements: js.Array[Null | PatternLike | LVal]): typings.babelTypes.mod.ArrayPattern_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[typings.babelTypes.mod.ArrayPattern_]
  }
  
  inline def AssignmentPattern_(
    left: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_ | TSAsExpression_ | TSSatisfiesExpression_ | TSTypeAssertion_ | TSNonNullExpression_,
    right: Expression
  ): typings.babelTypes.mod.AssignmentPattern_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[typings.babelTypes.mod.AssignmentPattern_]
  }
  
  inline def Identifier_(name: String): typings.babelTypes.mod.Identifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.babelTypes.mod.Identifier_]
  }
  
  inline def ObjectPattern_(properties: js.Array[RestElement_ | ObjectProperty_]): typings.babelTypes.mod.ObjectPattern_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[typings.babelTypes.mod.ObjectPattern_]
  }
  
  inline def RestElement_(argument: LVal): typings.babelTypes.mod.RestElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[typings.babelTypes.mod.RestElement_]
  }
  
  inline def TSAsExpression_(expression: Expression, typeAnnotation: TSType): typings.babelTypes.mod.TSAsExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSAsExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.TSAsExpression_]
  }
  
  inline def TSNonNullExpression_(expression: Expression): typings.babelTypes.mod.TSNonNullExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSNonNullExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.TSNonNullExpression_]
  }
  
  inline def TSSatisfiesExpression_(expression: Expression, typeAnnotation: TSType): typings.babelTypes.mod.TSSatisfiesExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSSatisfiesExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.TSSatisfiesExpression_]
  }
  
  inline def TSTypeAssertion_(expression: Expression, typeAnnotation: TSType): typings.babelTypes.mod.TSTypeAssertion_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTypeAssertion")
    __obj.asInstanceOf[typings.babelTypes.mod.TSTypeAssertion_]
  }
}
