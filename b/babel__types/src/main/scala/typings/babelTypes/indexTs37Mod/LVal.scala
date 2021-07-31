package typings.babelTypes.indexTs37Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.indexTs37Mod.Identifier_
  - typings.babelTypes.indexTs37Mod.MemberExpression_
  - typings.babelTypes.indexTs37Mod.RestElement_
  - typings.babelTypes.indexTs37Mod.AssignmentPattern_
  - typings.babelTypes.indexTs37Mod.ArrayPattern_
  - typings.babelTypes.indexTs37Mod.ObjectPattern_
  - typings.babelTypes.indexTs37Mod.TSParameterProperty_
*/
trait LVal
  extends StObject
     with _Node
object LVal {
  
  @scala.inline
  def ArrayPattern_(elements: js.Array[Null | PatternLike]): typings.babelTypes.indexTs37Mod.ArrayPattern_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ArrayPattern_]
  }
  
  @scala.inline
  def AssignmentPattern_(left: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_, right: Expression): typings.babelTypes.indexTs37Mod.AssignmentPattern_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.AssignmentPattern_]
  }
  
  @scala.inline
  def Identifier_(name: String): typings.babelTypes.indexTs37Mod.Identifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.Identifier_]
  }
  
  @scala.inline
  def MemberExpression_(computed: Boolean, `object`: Expression, property: Expression | Identifier_ | PrivateName_): typings.babelTypes.indexTs37Mod.MemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.MemberExpression_]
  }
  
  @scala.inline
  def ObjectPattern_(properties: js.Array[RestElement_ | ObjectProperty_]): typings.babelTypes.indexTs37Mod.ObjectPattern_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ObjectPattern_]
  }
  
  @scala.inline
  def RestElement_(argument: LVal): typings.babelTypes.indexTs37Mod.RestElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.RestElement_]
  }
  
  @scala.inline
  def TSParameterProperty_(parameter: Identifier_ | AssignmentPattern_): typings.babelTypes.indexTs37Mod.TSParameterProperty_ = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any], accessibility = null, end = null, innerComments = null, leadingComments = null, loc = null, readonly = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSParameterProperty")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.TSParameterProperty_]
  }
}
