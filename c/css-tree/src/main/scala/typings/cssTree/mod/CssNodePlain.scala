package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Function
import typings.cssTree.cssTreeStrings.Number
import typings.cssTree.cssTreeStrings.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cssTree.mod.AnPlusB
  - typings.cssTree.mod.AtrulePlain
  - typings.cssTree.mod.AtrulePreludePlain
  - typings.cssTree.mod.AttributeSelector
  - typings.cssTree.mod.BlockPlain
  - typings.cssTree.mod.BracketsPlain
  - typings.cssTree.mod.CDC
  - typings.cssTree.mod.CDO
  - typings.cssTree.mod.ClassSelector
  - typings.cssTree.mod.Combinator
  - typings.cssTree.mod.Comment
  - typings.cssTree.mod.DeclarationPlain
  - typings.cssTree.mod.DeclarationListPlain
  - typings.cssTree.mod.Dimension
  - typings.cssTree.mod.FunctionNodePlain
  - typings.cssTree.mod.HexColor
  - typings.cssTree.mod.IdSelector
  - typings.cssTree.mod.Identifier
  - typings.cssTree.mod.MediaFeature
  - typings.cssTree.mod.MediaQueryPlain
  - typings.cssTree.mod.MediaQueryListPlain
  - typings.cssTree.mod.NthPlain
  - typings.cssTree.mod.NumberNode
  - typings.cssTree.mod.Operator
  - typings.cssTree.mod.ParenthesesPlain
  - typings.cssTree.mod.Percentage
  - typings.cssTree.mod.PseudoClassSelectorPlain
  - typings.cssTree.mod.PseudoElementSelectorPlain
  - typings.cssTree.mod.Ratio
  - typings.cssTree.mod.Raw
  - typings.cssTree.mod.RulePlain
  - typings.cssTree.mod.SelectorPlain
  - typings.cssTree.mod.SelectorListPlain
  - typings.cssTree.mod.StringNode
  - typings.cssTree.mod.StyleSheetPlain
  - typings.cssTree.mod.TypeSelector
  - typings.cssTree.mod.UnicodeRange
  - typings.cssTree.mod.Url
  - typings.cssTree.mod.ValuePlain
  - typings.cssTree.mod.WhiteSpace
*/
trait CssNodePlain extends js.Object

object CssNodePlain {
  @scala.inline
  def StringNode(`type`: String, value: java.lang.String): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def AttributeSelector(name: Identifier, `type`: typings.cssTree.cssTreeStrings.AttributeSelector): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def BlockPlain(children: js.Array[CssNodePlain], `type`: typings.cssTree.cssTreeStrings.Block): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def CDC(`type`: typings.cssTree.cssTreeStrings.CDC): CssNodePlain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def WhiteSpace(`type`: typings.cssTree.cssTreeStrings.WhiteSpace, value: java.lang.String): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Ratio(left: java.lang.String, right: java.lang.String, `type`: typings.cssTree.cssTreeStrings.Ratio): CssNodePlain = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def NumberNode(`type`: Number, value: java.lang.String): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def CDO(`type`: typings.cssTree.cssTreeStrings.CDO): CssNodePlain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def TypeSelector(name: java.lang.String, `type`: typings.cssTree.cssTreeStrings.TypeSelector): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def ValuePlain(children: js.Array[CssNodePlain], `type`: typings.cssTree.cssTreeStrings.Value): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def AnPlusB(`type`: typings.cssTree.cssTreeStrings.AnPlusB): CssNodePlain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def DeclarationPlain(
    important: Boolean | java.lang.String,
    property: java.lang.String,
    `type`: typings.cssTree.cssTreeStrings.Declaration,
    value: ValuePlain | Raw
  ): CssNodePlain = {
    val __obj = js.Dynamic.literal(important = important.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def AtrulePlain(name: java.lang.String, `type`: typings.cssTree.cssTreeStrings.Atrule): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def ParenthesesPlain(children: js.Array[CssNodePlain], `type`: typings.cssTree.cssTreeStrings.Parentheses): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def SelectorListPlain(children: js.Array[CssNodePlain], `type`: typings.cssTree.cssTreeStrings.SelectorList): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def UnicodeRange(`type`: typings.cssTree.cssTreeStrings.UnicodeRange, value: java.lang.String): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def RulePlain(block: BlockPlain, prelude: SelectorListPlain | Raw, `type`: typings.cssTree.cssTreeStrings.Rule): CssNodePlain = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], prelude = prelude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def PseudoClassSelectorPlain(name: java.lang.String, `type`: typings.cssTree.cssTreeStrings.PseudoClassSelector): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def AtrulePreludePlain(children: js.Array[CssNodePlain], `type`: typings.cssTree.cssTreeStrings.AtrulePrelude): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Operator(`type`: typings.cssTree.cssTreeStrings.Operator, value: java.lang.String): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Percentage(`type`: typings.cssTree.cssTreeStrings.Percentage, value: java.lang.String): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Combinator(name: java.lang.String, `type`: typings.cssTree.cssTreeStrings.Combinator): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Raw(`type`: typings.cssTree.cssTreeStrings.Raw, value: java.lang.String): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def DeclarationListPlain(children: js.Array[CssNodePlain], `type`: typings.cssTree.cssTreeStrings.DeclarationList): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Url(`type`: typings.cssTree.cssTreeStrings.Url, value: StringNode | Raw): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Identifier(name: java.lang.String, `type`: typings.cssTree.cssTreeStrings.Identifier): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def IdSelector(name: java.lang.String, `type`: typings.cssTree.cssTreeStrings.IdSelector): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def MediaQueryPlain(children: js.Array[CssNodePlain], `type`: typings.cssTree.cssTreeStrings.MediaQuery): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def StyleSheetPlain(children: js.Array[CssNodePlain], `type`: typings.cssTree.cssTreeStrings.StyleSheet): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def ClassSelector(name: java.lang.String, `type`: typings.cssTree.cssTreeStrings.ClassSelector): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def FunctionNodePlain(children: js.Array[CssNodePlain], name: java.lang.String, `type`: Function): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def MediaFeature(name: java.lang.String, `type`: typings.cssTree.cssTreeStrings.MediaFeature): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def BracketsPlain(children: js.Array[CssNodePlain], `type`: typings.cssTree.cssTreeStrings.Brackets): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def HexColor(`type`: typings.cssTree.cssTreeStrings.HexColor, value: java.lang.String): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Comment(`type`: typings.cssTree.cssTreeStrings.Comment, value: java.lang.String): CssNodePlain = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def NthPlain(nth: AnPlusB | Identifier, `type`: typings.cssTree.cssTreeStrings.Nth): CssNodePlain = {
    val __obj = js.Dynamic.literal(nth = nth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def SelectorPlain(children: js.Array[CssNodePlain], `type`: typings.cssTree.cssTreeStrings.Selector): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def Dimension(`type`: typings.cssTree.cssTreeStrings.Dimension, unit: java.lang.String, value: java.lang.String): CssNodePlain = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def MediaQueryListPlain(children: js.Array[CssNodePlain], `type`: typings.cssTree.cssTreeStrings.MediaQueryList): CssNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
  @scala.inline
  def PseudoElementSelectorPlain(name: java.lang.String, `type`: typings.cssTree.cssTreeStrings.PseudoElementSelector): CssNodePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodePlain]
  }
}

