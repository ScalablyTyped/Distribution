package typings.cytoscape.mod

import typings.cytoscape.AnonWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableNode extends js.Object {
  var data: AnonWeight
}

object SortableNode {
  @scala.inline
  def apply(data: AnonWeight): SortableNode = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SortableNode]
  }
}

