package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.`nested-item`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedItemNode
  extends ValueNodeType
     with BaseNode {
  @JSName("name")
  var name_NestedItemNode: String
  var nodes: js.Array[ValueNode]
  var `type`: `nested-item`
}

object NestedItemNode {
  @scala.inline
  def apply(
    name: String,
    nodes: js.Array[ValueNode],
    `type`: `nested-item`,
    after: String = null,
    before: String = null
  ): NestedItemNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedItemNode]
  }
}

