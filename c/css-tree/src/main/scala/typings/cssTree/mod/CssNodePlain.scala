package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait CssNodePlain extends StObject
object CssNodePlain {
  
  @scala.inline
  def AnPlusB(): typings.cssTree.mod.AnPlusB = {
    val __obj = js.Dynamic.literal(a = null, b = null)
    __obj.updateDynamic("type")("AnPlusB")
    __obj.asInstanceOf[typings.cssTree.mod.AnPlusB]
  }
  
  @scala.inline
  def AtrulePlain(name: String): typings.cssTree.mod.AtrulePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], block = null, prelude = null)
    __obj.updateDynamic("type")("Atrule")
    __obj.asInstanceOf[typings.cssTree.mod.AtrulePlain]
  }
  
  @scala.inline
  def AtrulePreludePlain(children: js.Array[CssNodePlain]): typings.cssTree.mod.AtrulePreludePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AtrulePrelude")
    __obj.asInstanceOf[typings.cssTree.mod.AtrulePreludePlain]
  }
  
  @scala.inline
  def AttributeSelector(name: Identifier): typings.cssTree.mod.AttributeSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], flags = null, matcher = null, value = null)
    __obj.updateDynamic("type")("AttributeSelector")
    __obj.asInstanceOf[typings.cssTree.mod.AttributeSelector]
  }
  
  @scala.inline
  def BlockPlain(children: js.Array[CssNodePlain]): typings.cssTree.mod.BlockPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Block")
    __obj.asInstanceOf[typings.cssTree.mod.BlockPlain]
  }
  
  @scala.inline
  def BracketsPlain(children: js.Array[CssNodePlain]): typings.cssTree.mod.BracketsPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Brackets")
    __obj.asInstanceOf[typings.cssTree.mod.BracketsPlain]
  }
  
  @scala.inline
  def CDC(): typings.cssTree.mod.CDC = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CDC")
    __obj.asInstanceOf[typings.cssTree.mod.CDC]
  }
  
  @scala.inline
  def CDO(): typings.cssTree.mod.CDO = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CDO")
    __obj.asInstanceOf[typings.cssTree.mod.CDO]
  }
  
  @scala.inline
  def ClassSelector(name: String): typings.cssTree.mod.ClassSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassSelector")
    __obj.asInstanceOf[typings.cssTree.mod.ClassSelector]
  }
  
  @scala.inline
  def Combinator(name: String): typings.cssTree.mod.Combinator = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Combinator")
    __obj.asInstanceOf[typings.cssTree.mod.Combinator]
  }
  
  @scala.inline
  def Comment(value: String): typings.cssTree.mod.Comment = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Comment")
    __obj.asInstanceOf[typings.cssTree.mod.Comment]
  }
  
  @scala.inline
  def DeclarationListPlain(children: js.Array[CssNodePlain]): typings.cssTree.mod.DeclarationListPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclarationList")
    __obj.asInstanceOf[typings.cssTree.mod.DeclarationListPlain]
  }
  
  @scala.inline
  def DeclarationPlain(important: Boolean | String, property: String, value: ValuePlain | Raw): typings.cssTree.mod.DeclarationPlain = {
    val __obj = js.Dynamic.literal(important = important.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Declaration")
    __obj.asInstanceOf[typings.cssTree.mod.DeclarationPlain]
  }
  
  @scala.inline
  def Dimension(unit: String, value: String): typings.cssTree.mod.Dimension = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Dimension")
    __obj.asInstanceOf[typings.cssTree.mod.Dimension]
  }
  
  @scala.inline
  def FunctionNodePlain(children: js.Array[CssNodePlain], name: String): typings.cssTree.mod.FunctionNodePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Function")
    __obj.asInstanceOf[typings.cssTree.mod.FunctionNodePlain]
  }
  
  @scala.inline
  def HexColor(value: String): typings.cssTree.mod.HexColor = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("HexColor")
    __obj.asInstanceOf[typings.cssTree.mod.HexColor]
  }
  
  @scala.inline
  def IdSelector(name: String): typings.cssTree.mod.IdSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IdSelector")
    __obj.asInstanceOf[typings.cssTree.mod.IdSelector]
  }
  
  @scala.inline
  def Identifier(name: String): typings.cssTree.mod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.cssTree.mod.Identifier]
  }
  
  @scala.inline
  def MediaFeature(name: String): typings.cssTree.mod.MediaFeature = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = null)
    __obj.updateDynamic("type")("MediaFeature")
    __obj.asInstanceOf[typings.cssTree.mod.MediaFeature]
  }
  
  @scala.inline
  def MediaQueryListPlain(children: js.Array[CssNodePlain]): typings.cssTree.mod.MediaQueryListPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MediaQueryList")
    __obj.asInstanceOf[typings.cssTree.mod.MediaQueryListPlain]
  }
  
  @scala.inline
  def MediaQueryPlain(children: js.Array[CssNodePlain]): typings.cssTree.mod.MediaQueryPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MediaQuery")
    __obj.asInstanceOf[typings.cssTree.mod.MediaQueryPlain]
  }
  
  @scala.inline
  def NthPlain(nth: AnPlusB | Identifier): typings.cssTree.mod.NthPlain = {
    val __obj = js.Dynamic.literal(nth = nth.asInstanceOf[js.Any], selector = null)
    __obj.updateDynamic("type")("Nth")
    __obj.asInstanceOf[typings.cssTree.mod.NthPlain]
  }
  
  @scala.inline
  def NumberNode(value: String): typings.cssTree.mod.NumberNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Number")
    __obj.asInstanceOf[typings.cssTree.mod.NumberNode]
  }
  
  @scala.inline
  def Operator(value: String): typings.cssTree.mod.Operator = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Operator")
    __obj.asInstanceOf[typings.cssTree.mod.Operator]
  }
  
  @scala.inline
  def ParenthesesPlain(children: js.Array[CssNodePlain]): typings.cssTree.mod.ParenthesesPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Parentheses")
    __obj.asInstanceOf[typings.cssTree.mod.ParenthesesPlain]
  }
  
  @scala.inline
  def Percentage(value: String): typings.cssTree.mod.Percentage = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Percentage")
    __obj.asInstanceOf[typings.cssTree.mod.Percentage]
  }
  
  @scala.inline
  def PseudoClassSelectorPlain(name: String): typings.cssTree.mod.PseudoClassSelectorPlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], children = null)
    __obj.updateDynamic("type")("PseudoClassSelector")
    __obj.asInstanceOf[typings.cssTree.mod.PseudoClassSelectorPlain]
  }
  
  @scala.inline
  def PseudoElementSelectorPlain(name: String): typings.cssTree.mod.PseudoElementSelectorPlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], children = null)
    __obj.updateDynamic("type")("PseudoElementSelector")
    __obj.asInstanceOf[typings.cssTree.mod.PseudoElementSelectorPlain]
  }
  
  @scala.inline
  def Ratio(left: String, right: String): typings.cssTree.mod.Ratio = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Ratio")
    __obj.asInstanceOf[typings.cssTree.mod.Ratio]
  }
  
  @scala.inline
  def Raw(value: String): typings.cssTree.mod.Raw = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Raw")
    __obj.asInstanceOf[typings.cssTree.mod.Raw]
  }
  
  @scala.inline
  def RulePlain(block: BlockPlain, prelude: SelectorListPlain | Raw): typings.cssTree.mod.RulePlain = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], prelude = prelude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Rule")
    __obj.asInstanceOf[typings.cssTree.mod.RulePlain]
  }
  
  @scala.inline
  def SelectorListPlain(children: js.Array[CssNodePlain]): typings.cssTree.mod.SelectorListPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SelectorList")
    __obj.asInstanceOf[typings.cssTree.mod.SelectorListPlain]
  }
  
  @scala.inline
  def SelectorPlain(children: js.Array[CssNodePlain]): typings.cssTree.mod.SelectorPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Selector")
    __obj.asInstanceOf[typings.cssTree.mod.SelectorPlain]
  }
  
  @scala.inline
  def StringNode(value: String): typings.cssTree.mod.StringNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("String")
    __obj.asInstanceOf[typings.cssTree.mod.StringNode]
  }
  
  @scala.inline
  def StyleSheetPlain(children: js.Array[CssNodePlain]): typings.cssTree.mod.StyleSheetPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StyleSheet")
    __obj.asInstanceOf[typings.cssTree.mod.StyleSheetPlain]
  }
  
  @scala.inline
  def TypeSelector(name: String): typings.cssTree.mod.TypeSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeSelector")
    __obj.asInstanceOf[typings.cssTree.mod.TypeSelector]
  }
  
  @scala.inline
  def UnicodeRange(value: String): typings.cssTree.mod.UnicodeRange = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnicodeRange")
    __obj.asInstanceOf[typings.cssTree.mod.UnicodeRange]
  }
  
  @scala.inline
  def Url(value: StringNode | Raw): typings.cssTree.mod.Url = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Url")
    __obj.asInstanceOf[typings.cssTree.mod.Url]
  }
  
  @scala.inline
  def ValuePlain(children: js.Array[CssNodePlain]): typings.cssTree.mod.ValuePlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Value")
    __obj.asInstanceOf[typings.cssTree.mod.ValuePlain]
  }
  
  @scala.inline
  def WhiteSpace(value: String): typings.cssTree.mod.WhiteSpace = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WhiteSpace")
    __obj.asInstanceOf[typings.cssTree.mod.WhiteSpace]
  }
}
