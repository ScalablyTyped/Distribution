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
*/
trait PatternLike
  extends StObject
     with _Node
object PatternLike {
  
  @scala.inline
  def ArrayPattern_(elements: js.Array[Null | PatternLike]): typings.babelTypes.mod.ArrayPattern_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[typings.babelTypes.mod.ArrayPattern_]
  }
  
  @scala.inline
  def AssignmentPattern_(left: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_, right: Expression): typings.babelTypes.mod.AssignmentPattern_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[typings.babelTypes.mod.AssignmentPattern_]
  }
  
  @scala.inline
  def Identifier_(name: String): typings.babelTypes.mod.Identifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.babelTypes.mod.Identifier_]
  }
  
  @scala.inline
  def ObjectPattern_(properties: js.Array[RestElement_ | ObjectProperty_]): typings.babelTypes.mod.ObjectPattern_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[typings.babelTypes.mod.ObjectPattern_]
  }
  
  @scala.inline
  def RestElement_(argument: LVal): typings.babelTypes.mod.RestElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[typings.babelTypes.mod.RestElement_]
  }
}
