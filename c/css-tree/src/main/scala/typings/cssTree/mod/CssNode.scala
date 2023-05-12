package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  - typings.cssTree.mod.Hash
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
  - typings.cssTree.mod.Url_
  - typings.cssTree.mod.Value
  - typings.cssTree.mod.WhiteSpace
*/
trait CssNode extends StObject
object CssNode {
  
  inline def AnPlusB(): typings.cssTree.mod.AnPlusB = {
    val __obj = js.Dynamic.literal(a = null, b = null)
    __obj.updateDynamic("type")("AnPlusB")
    __obj.asInstanceOf[typings.cssTree.mod.AnPlusB]
  }
  
  inline def Atrule(name: String): typings.cssTree.mod.Atrule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], block = null, prelude = null)
    __obj.updateDynamic("type")("Atrule")
    __obj.asInstanceOf[typings.cssTree.mod.Atrule]
  }
  
  inline def AtrulePrelude(children: typings.cssTree.mod.List[CssNode]): typings.cssTree.mod.AtrulePrelude = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AtrulePrelude")
    __obj.asInstanceOf[typings.cssTree.mod.AtrulePrelude]
  }
  
  inline def AttributeSelector(name: Identifier): typings.cssTree.mod.AttributeSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], flags = null, matcher = null, value = null)
    __obj.updateDynamic("type")("AttributeSelector")
    __obj.asInstanceOf[typings.cssTree.mod.AttributeSelector]
  }
  
  inline def Block(children: typings.cssTree.mod.List[CssNode]): typings.cssTree.mod.Block = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Block")
    __obj.asInstanceOf[typings.cssTree.mod.Block]
  }
  
  inline def Brackets(children: typings.cssTree.mod.List[CssNode]): typings.cssTree.mod.Brackets = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Brackets")
    __obj.asInstanceOf[typings.cssTree.mod.Brackets]
  }
  
  inline def CDC(): typings.cssTree.mod.CDC = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CDC")
    __obj.asInstanceOf[typings.cssTree.mod.CDC]
  }
  
  inline def CDO(): typings.cssTree.mod.CDO = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CDO")
    __obj.asInstanceOf[typings.cssTree.mod.CDO]
  }
  
  inline def ClassSelector(name: String): typings.cssTree.mod.ClassSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassSelector")
    __obj.asInstanceOf[typings.cssTree.mod.ClassSelector]
  }
  
  inline def Combinator(name: String): typings.cssTree.mod.Combinator = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Combinator")
    __obj.asInstanceOf[typings.cssTree.mod.Combinator]
  }
  
  inline def Comment(value: String): typings.cssTree.mod.Comment = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Comment")
    __obj.asInstanceOf[typings.cssTree.mod.Comment]
  }
  
  inline def Declaration(important: Boolean | String, property: String, value: Value | Raw): typings.cssTree.mod.Declaration = {
    val __obj = js.Dynamic.literal(important = important.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Declaration")
    __obj.asInstanceOf[typings.cssTree.mod.Declaration]
  }
  
  inline def DeclarationList(children: typings.cssTree.mod.List[CssNode]): typings.cssTree.mod.DeclarationList = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclarationList")
    __obj.asInstanceOf[typings.cssTree.mod.DeclarationList]
  }
  
  inline def Dimension(unit: String, value: String): typings.cssTree.mod.Dimension = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Dimension")
    __obj.asInstanceOf[typings.cssTree.mod.Dimension]
  }
  
  inline def FunctionNode(children: typings.cssTree.mod.List[CssNode], name: String): typings.cssTree.mod.FunctionNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Function")
    __obj.asInstanceOf[typings.cssTree.mod.FunctionNode]
  }
  
  inline def Hash(value: String): typings.cssTree.mod.Hash = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Hash")
    __obj.asInstanceOf[typings.cssTree.mod.Hash]
  }
  
  inline def IdSelector(name: String): typings.cssTree.mod.IdSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IdSelector")
    __obj.asInstanceOf[typings.cssTree.mod.IdSelector]
  }
  
  inline def Identifier(name: String): typings.cssTree.mod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.cssTree.mod.Identifier]
  }
  
  inline def MediaFeature(name: String): typings.cssTree.mod.MediaFeature = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = null)
    __obj.updateDynamic("type")("MediaFeature")
    __obj.asInstanceOf[typings.cssTree.mod.MediaFeature]
  }
  
  inline def MediaQuery(children: typings.cssTree.mod.List[CssNode]): typings.cssTree.mod.MediaQuery = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MediaQuery")
    __obj.asInstanceOf[typings.cssTree.mod.MediaQuery]
  }
  
  inline def MediaQueryList(children: typings.cssTree.mod.List[CssNode]): typings.cssTree.mod.MediaQueryList = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MediaQueryList")
    __obj.asInstanceOf[typings.cssTree.mod.MediaQueryList]
  }
  
  inline def Nth(nth: AnPlusB | Identifier): typings.cssTree.mod.Nth = {
    val __obj = js.Dynamic.literal(nth = nth.asInstanceOf[js.Any], selector = null)
    __obj.updateDynamic("type")("Nth")
    __obj.asInstanceOf[typings.cssTree.mod.Nth]
  }
  
  inline def NumberNode(value: String): typings.cssTree.mod.NumberNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Number")
    __obj.asInstanceOf[typings.cssTree.mod.NumberNode]
  }
  
  inline def Operator(value: String): typings.cssTree.mod.Operator = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Operator")
    __obj.asInstanceOf[typings.cssTree.mod.Operator]
  }
  
  inline def Parentheses(children: typings.cssTree.mod.List[CssNode]): typings.cssTree.mod.Parentheses = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Parentheses")
    __obj.asInstanceOf[typings.cssTree.mod.Parentheses]
  }
  
  inline def Percentage(value: String): typings.cssTree.mod.Percentage = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Percentage")
    __obj.asInstanceOf[typings.cssTree.mod.Percentage]
  }
  
  inline def PseudoClassSelector(name: String): typings.cssTree.mod.PseudoClassSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], children = null)
    __obj.updateDynamic("type")("PseudoClassSelector")
    __obj.asInstanceOf[typings.cssTree.mod.PseudoClassSelector]
  }
  
  inline def PseudoElementSelector(name: String): typings.cssTree.mod.PseudoElementSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], children = null)
    __obj.updateDynamic("type")("PseudoElementSelector")
    __obj.asInstanceOf[typings.cssTree.mod.PseudoElementSelector]
  }
  
  inline def Ratio(left: String, right: String): typings.cssTree.mod.Ratio = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Ratio")
    __obj.asInstanceOf[typings.cssTree.mod.Ratio]
  }
  
  inline def Raw(value: String): typings.cssTree.mod.Raw = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Raw")
    __obj.asInstanceOf[typings.cssTree.mod.Raw]
  }
  
  inline def Rule(block: Block, prelude: SelectorList | Raw): typings.cssTree.mod.Rule = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], prelude = prelude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Rule")
    __obj.asInstanceOf[typings.cssTree.mod.Rule]
  }
  
  inline def Selector(children: typings.cssTree.mod.List[CssNode]): typings.cssTree.mod.Selector = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Selector")
    __obj.asInstanceOf[typings.cssTree.mod.Selector]
  }
  
  inline def SelectorList(children: typings.cssTree.mod.List[CssNode]): typings.cssTree.mod.SelectorList = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SelectorList")
    __obj.asInstanceOf[typings.cssTree.mod.SelectorList]
  }
  
  inline def StringNode(value: String): typings.cssTree.mod.StringNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("String")
    __obj.asInstanceOf[typings.cssTree.mod.StringNode]
  }
  
  inline def StyleSheet(children: typings.cssTree.mod.List[CssNode]): typings.cssTree.mod.StyleSheet = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StyleSheet")
    __obj.asInstanceOf[typings.cssTree.mod.StyleSheet]
  }
  
  inline def TypeSelector(name: String): typings.cssTree.mod.TypeSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeSelector")
    __obj.asInstanceOf[typings.cssTree.mod.TypeSelector]
  }
  
  inline def UnicodeRange(value: String): typings.cssTree.mod.UnicodeRange = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnicodeRange")
    __obj.asInstanceOf[typings.cssTree.mod.UnicodeRange]
  }
  
  inline def Url_(value: String): typings.cssTree.mod.Url_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Url")
    __obj.asInstanceOf[typings.cssTree.mod.Url_]
  }
  
  inline def Value(children: typings.cssTree.mod.List[CssNode]): typings.cssTree.mod.Value = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Value")
    __obj.asInstanceOf[typings.cssTree.mod.Value]
  }
  
  inline def WhiteSpace(value: String): typings.cssTree.mod.WhiteSpace = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WhiteSpace")
    __obj.asInstanceOf[typings.cssTree.mod.WhiteSpace]
  }
}
