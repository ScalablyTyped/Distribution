package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementsDefinition extends js.Object {
  var edges: js.Array[EdgeDefinition]
  var nodes: js.Array[NodeDefinition]
}

object ElementsDefinition {
  @scala.inline
  def apply(edges: js.Array[EdgeDefinition], nodes: js.Array[NodeDefinition]): ElementsDefinition = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ElementsDefinition]
  }
}

