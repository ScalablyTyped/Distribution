package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.Identifier_
  - typings.babelTypes.mod.MemberExpression_
  - typings.babelTypes.mod.RestElement_
  - typings.babelTypes.mod.AssignmentPattern_
  - typings.babelTypes.mod.ArrayPattern_
  - typings.babelTypes.mod.ObjectPattern_
  - typings.babelTypes.mod.TSParameterProperty_
*/
trait LVal
  extends StObject
     with _Node
object LVal {
  
  inline def ArrayPattern_(elements: js.Array[Null | PatternLike]): typings.babelTypes.mod.ArrayPattern_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[typings.babelTypes.mod.ArrayPattern_]
  }
  
  inline def AssignmentPattern_(left: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_, right: Expression): typings.babelTypes.mod.AssignmentPattern_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[typings.babelTypes.mod.AssignmentPattern_]
  }
  
  inline def Identifier_(name: String): typings.babelTypes.mod.Identifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.babelTypes.mod.Identifier_]
  }
  
  inline def MemberExpression_(computed: Boolean, `object`: Expression, property: Expression | Identifier_ | PrivateName_): typings.babelTypes.mod.MemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.MemberExpression_]
  }
  
  inline def ObjectPattern_(properties: js.Array[RestElement_ | ObjectProperty_]): typings.babelTypes.mod.ObjectPattern_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[typings.babelTypes.mod.ObjectPattern_]
  }
  
  inline def RestElement_(argument: LVal): typings.babelTypes.mod.RestElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[typings.babelTypes.mod.RestElement_]
  }
  
  inline def TSParameterProperty_(parameter: Identifier_ | AssignmentPattern_): typings.babelTypes.mod.TSParameterProperty_ = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any], accessibility = null, end = null, innerComments = null, leadingComments = null, loc = null, readonly = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSParameterProperty")
    __obj.asInstanceOf[typings.babelTypes.mod.TSParameterProperty_]
  }
}
