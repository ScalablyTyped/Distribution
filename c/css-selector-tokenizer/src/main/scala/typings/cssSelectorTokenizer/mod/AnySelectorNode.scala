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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cssSelectorTokenizer.mod.SelectorsNode
  - typings.cssSelectorTokenizer.mod.SelectorNode
  - typings.cssSelectorTokenizer.mod.SelectorNodeType
*/
trait AnySelectorNode extends js.Object

object AnySelectorNode {
  @scala.inline
  def PseudoElementNode(name: String, `type`: `pseudo-element`, after: String = null, before: String = null): AnySelectorNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySelectorNode]
  }
  @scala.inline
  def NestedPseudoClassNode(
    name: String,
    nodes: js.Array[SelectorNode],
    `type`: `nested-pseudo-class`,
    after: String = null,
    before: String = null
  ): AnySelectorNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySelectorNode]
  }
  @scala.inline
  def OperatorNode(
    operator: String,
    `type`: operator,
    after: String = null,
    before: String = null,
    name: String = null
  ): AnySelectorNode = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySelectorNode]
  }
  @scala.inline
  def SelectorNode(
    nodes: js.Array[SelectorNodeType],
    `type`: selector,
    after: String = null,
    before: String = null,
    name: String = null
  ): AnySelectorNode = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySelectorNode]
  }
  @scala.inline
  def SpacingNode(`type`: spacing, value: String, after: String = null, before: String = null, name: String = null): AnySelectorNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySelectorNode]
  }
  @scala.inline
  def ClassNode(name: String, `type`: `class`, after: String = null, before: String = null): AnySelectorNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySelectorNode]
  }
  @scala.inline
  def ElementNode(
    name: String,
    `type`: element,
    after: String = null,
    before: String = null,
    namespace: String = null
  ): AnySelectorNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySelectorNode]
  }
  @scala.inline
  def AttributeNode(
    content: String,
    `type`: attribute,
    after: String = null,
    before: String = null,
    name: String = null
  ): AnySelectorNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySelectorNode]
  }
  @scala.inline
  def PseudoClassNode(
    name: String,
    `type`: `pseudo-class`,
    after: String = null,
    before: String = null,
    content: String = null
  ): AnySelectorNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySelectorNode]
  }
  @scala.inline
  def InvalidNode(`type`: invalid, value: String, after: String = null, before: String = null, name: String = null): AnySelectorNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySelectorNode]
  }
  @scala.inline
  def CommentNode(content: String, `type`: comment, after: String = null, before: String = null, name: String = null): AnySelectorNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySelectorNode]
  }
  @scala.inline
  def UniversalNode(
    `type`: universal,
    after: String = null,
    before: String = null,
    name: String = null,
    namespace: String = null
  ): AnySelectorNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySelectorNode]
  }
  @scala.inline
  def SelectorsNode(
    nodes: js.Array[SelectorNode],
    `type`: selectors,
    after: String = null,
    before: String = null,
    name: String = null
  ): AnySelectorNode = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySelectorNode]
  }
  @scala.inline
  def IdNode(name: String, `type`: id, after: String = null, before: String = null): AnySelectorNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySelectorNode]
  }
}

