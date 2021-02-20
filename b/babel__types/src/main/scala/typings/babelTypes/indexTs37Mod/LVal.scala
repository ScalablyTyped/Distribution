package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ArrayPattern
import typings.babelTypes.babelTypesStrings.AssignmentPattern
import typings.babelTypes.babelTypesStrings.Identifier
import typings.babelTypes.babelTypesStrings.MemberExpression
import typings.babelTypes.babelTypesStrings.ObjectPattern
import typings.babelTypes.babelTypesStrings.RestElement
import typings.babelTypes.babelTypesStrings.TSParameterProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
trait LVal extends _Node
object LVal {
  
  @scala.inline
  def ArrayPattern_(elements: js.Array[Null | PatternLike], `type`: ArrayPattern): typings.babelTypes.indexTs37Mod.ArrayPattern_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ArrayPattern_]
  }
  
  @scala.inline
  def AssignmentPattern_(
    left: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_,
    right: Expression,
    `type`: AssignmentPattern
  ): typings.babelTypes.indexTs37Mod.AssignmentPattern_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.AssignmentPattern_]
  }
  
  @scala.inline
  def Identifier_(name: String, `type`: Identifier): typings.babelTypes.indexTs37Mod.Identifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.Identifier_]
  }
  
  @scala.inline
  def MemberExpression_(
    computed: Boolean,
    `object`: Expression,
    property: Expression | Identifier_ | PrivateName_,
    `type`: MemberExpression
  ): typings.babelTypes.indexTs37Mod.MemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.MemberExpression_]
  }
  
  @scala.inline
  def ObjectPattern_(properties: js.Array[RestElement_ | ObjectProperty_], `type`: ObjectPattern): typings.babelTypes.indexTs37Mod.ObjectPattern_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ObjectPattern_]
  }
  
  @scala.inline
  def RestElement_(argument: LVal, `type`: RestElement): typings.babelTypes.indexTs37Mod.RestElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.RestElement_]
  }
  
  @scala.inline
  def TSParameterProperty_(parameter: Identifier_ | AssignmentPattern_, `type`: TSParameterProperty): typings.babelTypes.indexTs37Mod.TSParameterProperty_ = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.TSParameterProperty_]
  }
}
