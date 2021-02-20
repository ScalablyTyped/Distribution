package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.`class`
import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.`nested-pseudo-class`
import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.`pseudo-class`
import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.`pseudo-element`
import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.attribute
import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.comment
import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.element
import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.id
import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.invalid
import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.operator
import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.selector
import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.selectors
import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.spacing
import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.universal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.cssSelectorTokenizer.mod.SelectorsNode
  - typings.cssSelectorTokenizer.mod.SelectorNode
  - typings.cssSelectorTokenizer.mod.SelectorNodeType
*/
trait AnySelectorNode extends StObject
object AnySelectorNode {
  
  @scala.inline
  def AttributeNode(content: String, `type`: attribute): typings.cssSelectorTokenizer.mod.AttributeNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.AttributeNode]
  }
  
  @scala.inline
  def ClassNode(name: String, `type`: `class`): typings.cssSelectorTokenizer.mod.ClassNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.ClassNode]
  }
  
  @scala.inline
  def CommentNode(content: String, `type`: comment): typings.cssSelectorTokenizer.mod.CommentNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.CommentNode]
  }
  
  @scala.inline
  def ElementNode(name: String, `type`: element): typings.cssSelectorTokenizer.mod.ElementNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.ElementNode]
  }
  
  @scala.inline
  def IdNode(name: String, `type`: id): typings.cssSelectorTokenizer.mod.IdNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.IdNode]
  }
  
  @scala.inline
  def InvalidNode(`type`: invalid, value: String): typings.cssSelectorTokenizer.mod.InvalidNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.InvalidNode]
  }
  
  @scala.inline
  def NestedPseudoClassNode(name: String, nodes: js.Array[SelectorNode], `type`: `nested-pseudo-class`): typings.cssSelectorTokenizer.mod.NestedPseudoClassNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.NestedPseudoClassNode]
  }
  
  @scala.inline
  def OperatorNode(operator: String, `type`: operator): typings.cssSelectorTokenizer.mod.OperatorNode = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.OperatorNode]
  }
  
  @scala.inline
  def PseudoClassNode(name: String, `type`: `pseudo-class`): typings.cssSelectorTokenizer.mod.PseudoClassNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.PseudoClassNode]
  }
  
  @scala.inline
  def PseudoElementNode(name: String, `type`: `pseudo-element`): typings.cssSelectorTokenizer.mod.PseudoElementNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.PseudoElementNode]
  }
  
  @scala.inline
  def SelectorNode(nodes: js.Array[SelectorNodeType], `type`: selector): typings.cssSelectorTokenizer.mod.SelectorNode = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.SelectorNode]
  }
  
  @scala.inline
  def SelectorsNode(nodes: js.Array[SelectorNode], `type`: selectors): typings.cssSelectorTokenizer.mod.SelectorsNode = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.SelectorsNode]
  }
  
  @scala.inline
  def SpacingNode(`type`: spacing, value: String): typings.cssSelectorTokenizer.mod.SpacingNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.SpacingNode]
  }
  
  @scala.inline
  def UniversalNode(`type`: universal): typings.cssSelectorTokenizer.mod.UniversalNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.UniversalNode]
  }
}
