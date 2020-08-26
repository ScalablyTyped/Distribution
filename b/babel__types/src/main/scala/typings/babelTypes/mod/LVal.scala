package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ArrayPattern
import typings.babelTypes.babelTypesStrings.AssignmentPattern
import typings.babelTypes.babelTypesStrings.Identifier
import typings.babelTypes.babelTypesStrings.MemberExpression
import typings.babelTypes.babelTypesStrings.ObjectPattern
import typings.babelTypes.babelTypesStrings.RestElement
import typings.babelTypes.babelTypesStrings.TSParameterProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.Identifier_
  - typings.babelTypes.mod.MemberExpression_
  - typings.babelTypes.mod.RestElement_
  - typings.babelTypes.mod.AssignmentPattern_
  - typings.babelTypes.mod.ArrayPattern_
  - typings.babelTypes.mod.ObjectPattern_
  - typings.babelTypes.mod.TSParameterProperty_
*/
trait LVal extends _Node

object LVal {
  @scala.inline
  def RestElement_(argument: LVal, `type`: RestElement): LVal = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LVal]
  }
  @scala.inline
  def MemberExpression_(
    computed: Boolean,
    `object`: Expression,
    property: Expression | Identifier_ | PrivateName_,
    `type`: MemberExpression
  ): LVal = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LVal]
  }
  @scala.inline
  def TSParameterProperty_(parameter: Identifier_ | AssignmentPattern_, `type`: TSParameterProperty): LVal = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LVal]
  }
  @scala.inline
  def ObjectPattern_(properties: js.Array[RestElement_ | ObjectProperty_], `type`: ObjectPattern): LVal = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LVal]
  }
  @scala.inline
  def AssignmentPattern_(
    left: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_,
    right: Expression,
    `type`: AssignmentPattern
  ): LVal = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LVal]
  }
  @scala.inline
  def Identifier_(name: String, `type`: Identifier): LVal = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LVal]
  }
  @scala.inline
  def ArrayPattern_(elements: js.Array[Null | PatternLike], `type`: ArrayPattern): LVal = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LVal]
  }
}

