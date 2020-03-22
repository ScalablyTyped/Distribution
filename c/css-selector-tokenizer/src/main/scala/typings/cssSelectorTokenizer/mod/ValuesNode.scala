package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValuesNode
  extends BaseNode
     with AnyValueNode {
  var nodes: js.Array[ValueNode]
  var `type`: values
}

object ValuesNode {
  @scala.inline
  def apply(
    nodes: js.Array[ValueNode],
    `type`: values,
    after: String = null,
    before: String = null,
    name: String = null
  ): ValuesNode = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValuesNode]
  }
}

