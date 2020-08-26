package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.`nested-item`
import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.comment
import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.invalid
import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.item
import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.string
import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cssSelectorTokenizer.mod.ItemNode
  - typings.cssSelectorTokenizer.mod.NestedItemNode
  - typings.cssSelectorTokenizer.mod.StringNode
  - typings.cssSelectorTokenizer.mod.CommentNode
  - typings.cssSelectorTokenizer.mod.UrlNode
  - typings.cssSelectorTokenizer.mod.InvalidNode
*/
trait ValueNodeType extends AnyValueNode

object ValueNodeType {
  @scala.inline
  def NestedItemNode(name: String, nodes: js.Array[ValueNode], `type`: `nested-item`): ValueNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNodeType]
  }
  @scala.inline
  def StringNode(stringType: String, `type`: string, value: String): ValueNodeType = {
    val __obj = js.Dynamic.literal(stringType = stringType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNodeType]
  }
  @scala.inline
  def InvalidNode(`type`: invalid, value: String): ValueNodeType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNodeType]
  }
  @scala.inline
  def CommentNode(content: String, `type`: comment): ValueNodeType = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNodeType]
  }
  @scala.inline
  def UrlNode(`type`: url, url: String): ValueNodeType = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNodeType]
  }
  @scala.inline
  def ItemNode(name: String, `type`: item): ValueNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNodeType]
  }
}

