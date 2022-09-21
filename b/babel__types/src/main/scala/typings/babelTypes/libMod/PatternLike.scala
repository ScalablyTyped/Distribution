package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.Identifier_
  - typings.babelTypes.libMod.RestElement_
  - typings.babelTypes.libMod.AssignmentPattern_
  - typings.babelTypes.libMod.ArrayPattern_
  - typings.babelTypes.libMod.ObjectPattern_
  - typings.babelTypes.libMod.TSAsExpression
  - typings.babelTypes.libMod.TSTypeAssertion
  - typings.babelTypes.libMod.TSNonNullExpression
*/
trait PatternLike extends StObject
object PatternLike {
  
  inline def ArrayPattern_(elements: js.Array[Null | PatternLike | LVal]): typings.babelTypes.libMod.ArrayPattern_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[typings.babelTypes.libMod.ArrayPattern_]
  }
  
  inline def AssignmentPattern_(
    left: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_ | TSAsExpression | TSTypeAssertion | TSNonNullExpression,
    right: Expression
  ): typings.babelTypes.libMod.AssignmentPattern_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[typings.babelTypes.libMod.AssignmentPattern_]
  }
  
  inline def Identifier_(name: String): typings.babelTypes.libMod.Identifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.babelTypes.libMod.Identifier_]
  }
  
  inline def ObjectPattern_(properties: js.Array[RestElement_ | ObjectProperty_]): typings.babelTypes.libMod.ObjectPattern_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectPattern_]
  }
  
  inline def RestElement_(argument: LVal): typings.babelTypes.libMod.RestElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[typings.babelTypes.libMod.RestElement_]
  }
  
  inline def TSAsExpression(expression: Expression, typeAnnotation: TSType): typings.babelTypes.libMod.TSAsExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSAsExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSAsExpression]
  }
  
  inline def TSNonNullExpression(expression: Expression): typings.babelTypes.libMod.TSNonNullExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNonNullExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSNonNullExpression]
  }
  
  inline def TSTypeAssertion(expression: Expression, typeAnnotation: TSType): typings.babelTypes.libMod.TSTypeAssertion = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeAssertion")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeAssertion]
  }
}
