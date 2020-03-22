package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.selector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectorNode
  extends BaseNode
     with AnySelectorNode {
  var nodes: js.Array[SelectorNodeType]
  var `type`: selector
}

object SelectorNode {
  @scala.inline
  def apply(
    nodes: js.Array[SelectorNodeType],
    `type`: selector,
    after: String = null,
    before: String = null,
    name: String = null
  ): SelectorNode = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNode]
  }
}

