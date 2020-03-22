package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectorsNode
  extends BaseNode
     with AnySelectorNode {
  var nodes: js.Array[SelectorNode]
  var `type`: selectors
}

object SelectorsNode {
  @scala.inline
  def apply(
    nodes: js.Array[SelectorNode],
    `type`: selectors,
    after: String = null,
    before: String = null,
    name: String = null
  ): SelectorsNode = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorsNode]
  }
}

