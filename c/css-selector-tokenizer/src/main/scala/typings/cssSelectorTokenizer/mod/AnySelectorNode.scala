package typings.cssSelectorTokenizer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.cssSelectorTokenizer.mod.SelectorsNode
  - typings.cssSelectorTokenizer.mod.SelectorNode
  - typings.cssSelectorTokenizer.mod.SelectorNodeType
*/
trait AnySelectorNode extends StObject
object AnySelectorNode {
  
  @scala.inline
  def AttributeNode(content: String): typings.cssSelectorTokenizer.mod.AttributeNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("attribute")
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.AttributeNode]
  }
  
  @scala.inline
  def ClassNode(name: String): typings.cssSelectorTokenizer.mod.ClassNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("class")
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.ClassNode]
  }
  
  @scala.inline
  def CommentNode(content: String): typings.cssSelectorTokenizer.mod.CommentNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("comment")
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.CommentNode]
  }
  
  @scala.inline
  def ElementNode(name: String): typings.cssSelectorTokenizer.mod.ElementNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.ElementNode]
  }
  
  @scala.inline
  def IdNode(name: String): typings.cssSelectorTokenizer.mod.IdNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("id")
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.IdNode]
  }
  
  @scala.inline
  def InvalidNode(value: String): typings.cssSelectorTokenizer.mod.InvalidNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("invalid")
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.InvalidNode]
  }
  
  @scala.inline
  def NestedPseudoClassNode(name: String, nodes: js.Array[SelectorNode]): typings.cssSelectorTokenizer.mod.NestedPseudoClassNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("nested-pseudo-class")
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.NestedPseudoClassNode]
  }
  
  @scala.inline
  def OperatorNode(operator: String): typings.cssSelectorTokenizer.mod.OperatorNode = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("operator")
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.OperatorNode]
  }
  
  @scala.inline
  def PseudoClassNode(name: String): typings.cssSelectorTokenizer.mod.PseudoClassNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pseudo-class")
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.PseudoClassNode]
  }
  
  @scala.inline
  def PseudoElementNode(name: String): typings.cssSelectorTokenizer.mod.PseudoElementNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pseudo-element")
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.PseudoElementNode]
  }
  
  @scala.inline
  def SelectorNode(nodes: js.Array[SelectorNodeType]): typings.cssSelectorTokenizer.mod.SelectorNode = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("selector")
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.SelectorNode]
  }
  
  @scala.inline
  def SelectorsNode(nodes: js.Array[SelectorNode]): typings.cssSelectorTokenizer.mod.SelectorsNode = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("selectors")
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.SelectorsNode]
  }
  
  @scala.inline
  def SpacingNode(value: String): typings.cssSelectorTokenizer.mod.SpacingNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("spacing")
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.SpacingNode]
  }
  
  @scala.inline
  def UniversalNode(): typings.cssSelectorTokenizer.mod.UniversalNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("universal")
    __obj.asInstanceOf[typings.cssSelectorTokenizer.mod.UniversalNode]
  }
}
