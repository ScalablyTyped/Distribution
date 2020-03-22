package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.`nested-pseudo-class`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedPseudoClassNode
  extends SelectorNodeType
     with BaseNode {
  @JSName("name")
  var name_NestedPseudoClassNode: String
  var nodes: js.Array[SelectorNode]
  var `type`: `nested-pseudo-class`
}

object NestedPseudoClassNode {
  @scala.inline
  def apply(
    name: String,
    nodes: js.Array[SelectorNode],
    `type`: `nested-pseudo-class`,
    after: String = null,
    before: String = null
  ): NestedPseudoClassNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedPseudoClassNode]
  }
}

