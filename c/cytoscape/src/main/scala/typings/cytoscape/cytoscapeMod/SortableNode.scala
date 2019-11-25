package typings.cytoscape.cytoscapeMod

import typings.cytoscape.Anon_Weight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableNode extends js.Object {
  var data: Anon_Weight
}

object SortableNode {
  @scala.inline
  def apply(data: Anon_Weight): SortableNode = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SortableNode]
  }
}

