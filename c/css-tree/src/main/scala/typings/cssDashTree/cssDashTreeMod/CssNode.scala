package typings.cssDashTree.cssDashTreeMod

import typings.cssDashTree.cssDashTreeStrings.Function
import typings.cssDashTree.cssDashTreeStrings.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cssDashTree.cssDashTreeMod.AnPlusB
  - typings.cssDashTree.cssDashTreeMod.Atrule
  - typings.cssDashTree.cssDashTreeMod.AtrulePrelude
  - typings.cssDashTree.cssDashTreeMod.AttributeSelector
  - typings.cssDashTree.cssDashTreeMod.Block
  - typings.cssDashTree.cssDashTreeMod.Brackets
  - typings.cssDashTree.cssDashTreeMod.CDC
  - typings.cssDashTree.cssDashTreeMod.CDO
  - typings.cssDashTree.cssDashTreeMod.ClassSelector
  - typings.cssDashTree.cssDashTreeMod.Combinator
  - typings.cssDashTree.cssDashTreeMod.Comment
  - typings.cssDashTree.cssDashTreeMod.Declaration
  - typings.cssDashTree.cssDashTreeMod.DeclarationList
  - typings.cssDashTree.cssDashTreeMod.Dimension
  - typings.cssDashTree.cssDashTreeMod.FunctionNode
  - typings.cssDashTree.cssDashTreeMod.HexColor
  - typings.cssDashTree.cssDashTreeMod.IdSelector
  - typings.cssDashTree.cssDashTreeMod.Identifier
  - typings.cssDashTree.cssDashTreeMod.MediaFeature
  - typings.cssDashTree.cssDashTreeMod.MediaQuery
  - typings.cssDashTree.cssDashTreeMod.MediaQueryList
  - typings.cssDashTree.cssDashTreeMod.Nth
  - typings.cssDashTree.cssDashTreeMod.NumberNode
  - typings.cssDashTree.cssDashTreeMod.Operator
  - typings.cssDashTree.cssDashTreeMod.Parentheses
  - typings.cssDashTree.cssDashTreeMod.Percentage
  - typings.cssDashTree.cssDashTreeMod.PseudoClassSelector
  - typings.cssDashTree.cssDashTreeMod.PseudoElementSelector
  - typings.cssDashTree.cssDashTreeMod.Ratio
  - typings.cssDashTree.cssDashTreeMod.Raw
  - typings.cssDashTree.cssDashTreeMod.Rule
  - typings.cssDashTree.cssDashTreeMod.Selector
  - typings.cssDashTree.cssDashTreeMod.SelectorList
  - typings.cssDashTree.cssDashTreeMod.StringNode
  - typings.cssDashTree.cssDashTreeMod.StyleSheet
  - typings.cssDashTree.cssDashTreeMod.TypeSelector
  - typings.cssDashTree.cssDashTreeMod.UnicodeRange
  - typings.cssDashTree.cssDashTreeMod.Url
  - typings.cssDashTree.cssDashTreeMod.Value
  - typings.cssDashTree.cssDashTreeMod.WhiteSpace
*/
trait CssNode extends js.Object

object CssNode {
  @scala.inline
  def FunctionNode(children: List[CssNode], name: String, `type`: Function, loc: CssLocation = null): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def PseudoElementSelector(
    name: String,
    `type`: typings.cssDashTree.cssDashTreeStrings.PseudoElementSelector,
    children: List[CssNode] = null,
    loc: CssLocation = null
  ): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def CDO(`type`: typings.cssDashTree.cssDashTreeStrings.CDO, loc: CssLocation = null): CssNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Raw(`type`: typings.cssDashTree.cssDashTreeStrings.Raw, value: String, loc: CssLocation = null): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def StyleSheet(
    children: List[CssNode],
    `type`: typings.cssDashTree.cssDashTreeStrings.StyleSheet,
    loc: CssLocation = null
  ): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Parentheses(
    children: List[CssNode],
    `type`: typings.cssDashTree.cssDashTreeStrings.Parentheses,
    loc: CssLocation = null
  ): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Brackets(
    children: List[CssNode],
    `type`: typings.cssDashTree.cssDashTreeStrings.Brackets,
    loc: CssLocation = null
  ): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Ratio(
    left: String,
    right: String,
    `type`: typings.cssDashTree.cssDashTreeStrings.Ratio,
    loc: CssLocation = null
  ): CssNode = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Value(
    children: List[CssNode],
    `type`: typings.cssDashTree.cssDashTreeStrings.Value,
    loc: CssLocation = null
  ): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def AtrulePrelude(
    children: List[CssNode],
    `type`: typings.cssDashTree.cssDashTreeStrings.AtrulePrelude,
    loc: CssLocation = null
  ): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def IdSelector(name: String, `type`: typings.cssDashTree.cssDashTreeStrings.IdSelector, loc: CssLocation = null): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Percentage(`type`: typings.cssDashTree.cssDashTreeStrings.Percentage, value: String, loc: CssLocation = null): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Combinator(name: String, `type`: typings.cssDashTree.cssDashTreeStrings.Combinator, loc: CssLocation = null): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def TypeSelector(name: String, `type`: typings.cssDashTree.cssDashTreeStrings.TypeSelector, loc: CssLocation = null): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def SelectorList(
    children: List[CssNode],
    `type`: typings.cssDashTree.cssDashTreeStrings.SelectorList,
    loc: CssLocation = null
  ): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Selector(
    children: List[CssNode],
    `type`: typings.cssDashTree.cssDashTreeStrings.Selector,
    loc: CssLocation = null
  ): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def AnPlusB(
    `type`: typings.cssDashTree.cssDashTreeStrings.AnPlusB,
    a: String = null,
    b: String = null,
    loc: CssLocation = null
  ): CssNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    if (b != null) __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def AttributeSelector(
    name: Identifier,
    `type`: typings.cssDashTree.cssDashTreeStrings.AttributeSelector,
    flags: String = null,
    loc: CssLocation = null,
    matcher: String = null,
    value: StringNode | Identifier = null
  ): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (matcher != null) __obj.updateDynamic("matcher")(matcher.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Dimension(
    `type`: typings.cssDashTree.cssDashTreeStrings.Dimension,
    unit: String,
    value: String,
    loc: CssLocation = null
  ): CssNode = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Block(
    children: List[CssNode],
    `type`: typings.cssDashTree.cssDashTreeStrings.Block,
    loc: CssLocation = null
  ): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def UnicodeRange(
    `type`: typings.cssDashTree.cssDashTreeStrings.UnicodeRange,
    value: String,
    loc: CssLocation = null
  ): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def NumberNode(`type`: Number, value: String, loc: CssLocation = null): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def PseudoClassSelector(
    name: String,
    `type`: typings.cssDashTree.cssDashTreeStrings.PseudoClassSelector,
    children: List[CssNode] = null,
    loc: CssLocation = null
  ): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def ClassSelector(
    name: String,
    `type`: typings.cssDashTree.cssDashTreeStrings.ClassSelector,
    loc: CssLocation = null
  ): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Comment(`type`: typings.cssDashTree.cssDashTreeStrings.Comment, value: String, loc: CssLocation = null): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def CDC(`type`: typings.cssDashTree.cssDashTreeStrings.CDC, loc: CssLocation = null): CssNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def StringNode(`type`: typings.cssDashTree.cssDashTreeStrings.String, value: String, loc: CssLocation = null): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Url(
    `type`: typings.cssDashTree.cssDashTreeStrings.Url,
    value: StringNode | Raw,
    loc: CssLocation = null
  ): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def MediaFeature(
    name: String,
    `type`: typings.cssDashTree.cssDashTreeStrings.MediaFeature,
    loc: CssLocation = null,
    value: Identifier | NumberNode | Dimension | Ratio = null
  ): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def HexColor(`type`: typings.cssDashTree.cssDashTreeStrings.HexColor, value: String, loc: CssLocation = null): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Nth(
    nth: AnPlusB | Identifier,
    `type`: typings.cssDashTree.cssDashTreeStrings.Nth,
    loc: CssLocation = null,
    selector: SelectorList = null
  ): CssNode = {
    val __obj = js.Dynamic.literal(nth = nth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Atrule(
    name: String,
    `type`: typings.cssDashTree.cssDashTreeStrings.Atrule,
    block: Block = null,
    loc: CssLocation = null,
    prelude: AtrulePrelude | Raw = null
  ): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (prelude != null) __obj.updateDynamic("prelude")(prelude.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Rule(
    block: Block,
    prelude: SelectorList | Raw,
    `type`: typings.cssDashTree.cssDashTreeStrings.Rule,
    loc: CssLocation = null
  ): CssNode = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], prelude = prelude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Declaration(
    important: Boolean | String,
    property: String,
    `type`: typings.cssDashTree.cssDashTreeStrings.Declaration,
    value: Value | Raw,
    loc: CssLocation = null
  ): CssNode = {
    val __obj = js.Dynamic.literal(important = important.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def MediaQueryList(
    children: List[CssNode],
    `type`: typings.cssDashTree.cssDashTreeStrings.MediaQueryList,
    loc: CssLocation = null
  ): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def MediaQuery(
    children: List[CssNode],
    `type`: typings.cssDashTree.cssDashTreeStrings.MediaQuery,
    loc: CssLocation = null
  ): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Operator(`type`: typings.cssDashTree.cssDashTreeStrings.Operator, value: String, loc: CssLocation = null): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def WhiteSpace(`type`: typings.cssDashTree.cssDashTreeStrings.WhiteSpace, value: String, loc: CssLocation = null): CssNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def Identifier(name: String, `type`: typings.cssDashTree.cssDashTreeStrings.Identifier, loc: CssLocation = null): CssNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
  @scala.inline
  def DeclarationList(
    children: List[CssNode],
    `type`: typings.cssDashTree.cssDashTreeStrings.DeclarationList,
    loc: CssLocation = null
  ): CssNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNode]
  }
}

