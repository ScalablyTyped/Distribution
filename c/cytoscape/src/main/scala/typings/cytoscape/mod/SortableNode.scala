package typings.cytoscape.mod

import typings.cytoscape.anon.Weight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableNode extends js.Object {
  var data: Weight
}

object SortableNode {
  @scala.inline
  def apply(data: Weight): SortableNode = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableNode]
  }
}

