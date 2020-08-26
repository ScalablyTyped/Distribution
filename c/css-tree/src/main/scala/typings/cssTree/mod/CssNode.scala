package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Function
import typings.cssTree.cssTreeStrings.Number
import typings.cssTree.cssTreeStrings.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cssTree.mod.AnPlusB
  - typings.cssTree.mod.Atrule
  - typings.cssTree.mod.AtrulePrelude
  - typings.cssTree.mod.AttributeSelector
  - typings.cssTree.mod.Block
  - typings.cssTree.mod.Brackets
  - typings.cssTree.mod.CDC
  - typings.cssTree.mod.CDO
  - typings.cssTree.mod.ClassSelector
  - typings.cssTree.mod.Combinator
  - typings.cssTree.mod.Comment
  - typings.cssTree.mod.Declaration
  - typings.cssTree.mod.DeclarationList
  - typings.cssTree.mod.Dimension
  - typings.cssTree.mod.FunctionNode
  - typings.cssTree.mod.HexColor
  - typings.cssTree.mod.IdSelector
  - typings.cssTree.mod.Identifier
  - typings.cssTree.mod.MediaFeature
  - typings.cssTree.mod.MediaQuery
  - typings.cssTree.mod.MediaQueryList
  - typings.cssTree.mod.Nth
  - typings.cssTree.mod.NumberNode
  - typings.cssTree.mod.Operator
  - typings.cssTree.mod.Parentheses
  - typings.cssTree.mod.Percentage
  - typings.cssTree.mod.PseudoClassSelector
  - typings.cssTree.mod.PseudoElementSelector
  - typings.cssTree.mod.Ratio
  - typings.cssTree.mod.Raw
  - typings.cssTree.mod.Rule
  - typings.cssTree.mod.Selector
  - typings.cssTree.mod.SelectorList
  - typings.cssTree.mod.StringNode
  - typings.cssTree.mod.StyleSheet
  - typings.cssTree.mod.TypeSelector
  - typings.cssTree.mod.UnicodeRange
  - typings.cssTree.mod.Url
  - typings.cssTree.mod.Value
  - typings.cssTree.mod.WhiteSpace
*/
trait CssNode extends js.Object

object CssNode {
  @scala.inline
  def StringNode(`type`: String, value: java.lang.String): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def AttributeSelector(name: Identifier, `type`: typings.cssTree.cssTreeStrings.AttributeSelector): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def SelectorList(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.SelectorList): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Selector(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.Selector): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def CDC(`type`: typings.cssTree.cssTreeStrings.CDC): CssNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def WhiteSpace(`type`: typings.cssTree.cssTreeStrings.WhiteSpace, value: java.lang.String): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Ratio(left: java.lang.String, right: java.lang.String, `type`: typings.cssTree.cssTreeStrings.Ratio): CssNode = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def StyleSheet(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.StyleSheet): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Brackets(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.Brackets): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def DeclarationList(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.DeclarationList): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def NumberNode(`type`: Number, value: java.lang.String): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def CDO(`type`: typings.cssTree.cssTreeStrings.CDO): CssNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def PseudoClassSelector(name: java.lang.String, `type`: typings.cssTree.cssTreeStrings.PseudoClassSelector): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def TypeSelector(name: java.lang.String, `type`: typings.cssTree.cssTreeStrings.TypeSelector): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def AnPlusB(`type`: typings.cssTree.cssTreeStrings.AnPlusB): CssNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Value(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.Value): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def MediaQuery(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.MediaQuery): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def UnicodeRange(`type`: typings.cssTree.cssTreeStrings.UnicodeRange, value: java.lang.String): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Parentheses(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.Parentheses): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Operator(`type`: typings.cssTree.cssTreeStrings.Operator, value: java.lang.String): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Percentage(`type`: typings.cssTree.cssTreeStrings.Percentage, value: java.lang.String): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Combinator(name: java.lang.String, `type`: typings.cssTree.cssTreeStrings.Combinator): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Raw(`type`: typings.cssTree.cssTreeStrings.Raw, value: java.lang.String): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def FunctionNode(children: List[CssNode], name: java.lang.String, `type`: Function): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Url(`type`: typings.cssTree.cssTreeStrings.Url, value: StringNode | Raw): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Identifier(name: java.lang.String, `type`: typings.cssTree.cssTreeStrings.Identifier): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Nth(nth: AnPlusB | Identifier, `type`: typings.cssTree.cssTreeStrings.Nth): CssNode = {
    val __obj = js.Dynamic.literal(nth = nth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def IdSelector(name: java.lang.String, `type`: typings.cssTree.cssTreeStrings.IdSelector): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def AtrulePrelude(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.AtrulePrelude): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def ClassSelector(name: java.lang.String, `type`: typings.cssTree.cssTreeStrings.ClassSelector): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Declaration(
    important: Boolean | java.lang.String,
    property: java.lang.String,
    `type`: typings.cssTree.cssTreeStrings.Declaration,
    value: Value | Raw
  ): CssNode = {
    val __obj = js.Dynamic.literal(important = important.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def PseudoElementSelector(name: java.lang.String, `type`: typings.cssTree.cssTreeStrings.PseudoElementSelector): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def MediaFeature(name: java.lang.String, `type`: typings.cssTree.cssTreeStrings.MediaFeature): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def HexColor(`type`: typings.cssTree.cssTreeStrings.HexColor, value: java.lang.String): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Comment(`type`: typings.cssTree.cssTreeStrings.Comment, value: java.lang.String): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Atrule(name: java.lang.String, `type`: typings.cssTree.cssTreeStrings.Atrule): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Dimension(`type`: typings.cssTree.cssTreeStrings.Dimension, unit: java.lang.String, value: java.lang.String): CssNode = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Block(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.Block): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Rule(block: Block, prelude: SelectorList | Raw, `type`: typings.cssTree.cssTreeStrings.Rule): CssNode = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], prelude = prelude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def MediaQueryList(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.MediaQueryList): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
}

