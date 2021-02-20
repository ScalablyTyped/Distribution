package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Function
import typings.cssTree.cssTreeStrings.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait CssNode extends StObject
object CssNode {
  
  @scala.inline
  def AnPlusB(`type`: typings.cssTree.cssTreeStrings.AnPlusB): typings.cssTree.mod.AnPlusB = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.AnPlusB]
  }
  
  @scala.inline
  def Atrule(name: String, `type`: typings.cssTree.cssTreeStrings.Atrule): typings.cssTree.mod.Atrule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.Atrule]
  }
  
  @scala.inline
  def AtrulePrelude(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.AtrulePrelude): typings.cssTree.mod.AtrulePrelude = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.AtrulePrelude]
  }
  
  @scala.inline
  def AttributeSelector(name: Identifier, `type`: typings.cssTree.cssTreeStrings.AttributeSelector): typings.cssTree.mod.AttributeSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.AttributeSelector]
  }
  
  @scala.inline
  def Block(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.Block): typings.cssTree.mod.Block = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.Block]
  }
  
  @scala.inline
  def Brackets(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.Brackets): typings.cssTree.mod.Brackets = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.Brackets]
  }
  
  @scala.inline
  def CDC(`type`: typings.cssTree.cssTreeStrings.CDC): typings.cssTree.mod.CDC = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.CDC]
  }
  
  @scala.inline
  def CDO(`type`: typings.cssTree.cssTreeStrings.CDO): typings.cssTree.mod.CDO = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.CDO]
  }
  
  @scala.inline
  def ClassSelector(name: String, `type`: typings.cssTree.cssTreeStrings.ClassSelector): typings.cssTree.mod.ClassSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.ClassSelector]
  }
  
  @scala.inline
  def Combinator(name: String, `type`: typings.cssTree.cssTreeStrings.Combinator): typings.cssTree.mod.Combinator = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.Combinator]
  }
  
  @scala.inline
  def Comment(`type`: typings.cssTree.cssTreeStrings.Comment, value: String): typings.cssTree.mod.Comment = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.Comment]
  }
  
  @scala.inline
  def Declaration(
    important: Boolean | String,
    property: String,
    `type`: typings.cssTree.cssTreeStrings.Declaration,
    value: Value | Raw
  ): typings.cssTree.mod.Declaration = {
    val __obj = js.Dynamic.literal(important = important.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.Declaration]
  }
  
  @scala.inline
  def DeclarationList(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.DeclarationList): typings.cssTree.mod.DeclarationList = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.DeclarationList]
  }
  
  @scala.inline
  def Dimension(`type`: typings.cssTree.cssTreeStrings.Dimension, unit: String, value: String): typings.cssTree.mod.Dimension = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.Dimension]
  }
  
  @scala.inline
  def FunctionNode(children: List[CssNode], name: String, `type`: Function): typings.cssTree.mod.FunctionNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.FunctionNode]
  }
  
  @scala.inline
  def HexColor(`type`: typings.cssTree.cssTreeStrings.HexColor, value: String): typings.cssTree.mod.HexColor = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.HexColor]
  }
  
  @scala.inline
  def IdSelector(name: String, `type`: typings.cssTree.cssTreeStrings.IdSelector): typings.cssTree.mod.IdSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.IdSelector]
  }
  
  @scala.inline
  def Identifier(name: String, `type`: typings.cssTree.cssTreeStrings.Identifier): typings.cssTree.mod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.Identifier]
  }
  
  @scala.inline
  def MediaFeature(name: String, `type`: typings.cssTree.cssTreeStrings.MediaFeature): typings.cssTree.mod.MediaFeature = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.MediaFeature]
  }
  
  @scala.inline
  def MediaQuery(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.MediaQuery): typings.cssTree.mod.MediaQuery = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.MediaQuery]
  }
  
  @scala.inline
  def MediaQueryList(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.MediaQueryList): typings.cssTree.mod.MediaQueryList = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.MediaQueryList]
  }
  
  @scala.inline
  def Nth(nth: AnPlusB | Identifier, `type`: typings.cssTree.cssTreeStrings.Nth): typings.cssTree.mod.Nth = {
    val __obj = js.Dynamic.literal(nth = nth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.Nth]
  }
  
  @scala.inline
  def NumberNode(`type`: Number, value: String): typings.cssTree.mod.NumberNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.NumberNode]
  }
  
  @scala.inline
  def Operator(`type`: typings.cssTree.cssTreeStrings.Operator, value: String): typings.cssTree.mod.Operator = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.Operator]
  }
  
  @scala.inline
  def Parentheses(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.Parentheses): typings.cssTree.mod.Parentheses = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.Parentheses]
  }
  
  @scala.inline
  def Percentage(`type`: typings.cssTree.cssTreeStrings.Percentage, value: String): typings.cssTree.mod.Percentage = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.Percentage]
  }
  
  @scala.inline
  def PseudoClassSelector(name: String, `type`: typings.cssTree.cssTreeStrings.PseudoClassSelector): typings.cssTree.mod.PseudoClassSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.PseudoClassSelector]
  }
  
  @scala.inline
  def PseudoElementSelector(name: String, `type`: typings.cssTree.cssTreeStrings.PseudoElementSelector): typings.cssTree.mod.PseudoElementSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.PseudoElementSelector]
  }
  
  @scala.inline
  def Ratio(left: String, right: String, `type`: typings.cssTree.cssTreeStrings.Ratio): typings.cssTree.mod.Ratio = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.Ratio]
  }
  
  @scala.inline
  def Raw(`type`: typings.cssTree.cssTreeStrings.Raw, value: String): typings.cssTree.mod.Raw = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.Raw]
  }
  
  @scala.inline
  def Rule(block: Block, prelude: SelectorList | Raw, `type`: typings.cssTree.cssTreeStrings.Rule): typings.cssTree.mod.Rule = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], prelude = prelude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.Rule]
  }
  
  @scala.inline
  def Selector(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.Selector): typings.cssTree.mod.Selector = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.Selector]
  }
  
  @scala.inline
  def SelectorList(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.SelectorList): typings.cssTree.mod.SelectorList = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.SelectorList]
  }
  
  @scala.inline
  def StringNode(`type`: typings.cssTree.cssTreeStrings.String, value: String): typings.cssTree.mod.StringNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.StringNode]
  }
  
  @scala.inline
  def StyleSheet(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.StyleSheet): typings.cssTree.mod.StyleSheet = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.StyleSheet]
  }
  
  @scala.inline
  def TypeSelector(name: String, `type`: typings.cssTree.cssTreeStrings.TypeSelector): typings.cssTree.mod.TypeSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.TypeSelector]
  }
  
  @scala.inline
  def UnicodeRange(`type`: typings.cssTree.cssTreeStrings.UnicodeRange, value: String): typings.cssTree.mod.UnicodeRange = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.UnicodeRange]
  }
  
  @scala.inline
  def Url(`type`: typings.cssTree.cssTreeStrings.Url, value: StringNode | Raw): typings.cssTree.mod.Url = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.Url]
  }
  
  @scala.inline
  def Value(children: List[CssNode], `type`: typings.cssTree.cssTreeStrings.Value): typings.cssTree.mod.Value = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.Value]
  }
  
  @scala.inline
  def WhiteSpace(`type`: typings.cssTree.cssTreeStrings.WhiteSpace, value: String): typings.cssTree.mod.WhiteSpace = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssTree.mod.WhiteSpace]
  }
}
