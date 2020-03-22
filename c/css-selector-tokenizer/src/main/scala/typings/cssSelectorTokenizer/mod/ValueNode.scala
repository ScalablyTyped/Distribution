package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueNode
  extends BaseNode
     with AnyValueNode {
  var nodes: js.Array[ValueNodeType]
  var `type`: value
}

object ValueNode {
  @scala.inline
  def apply(
    nodes: js.Array[ValueNodeType],
    `type`: value,
    after: String = null,
    before: String = null,
    name: String = null
  ): ValueNode = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
}

