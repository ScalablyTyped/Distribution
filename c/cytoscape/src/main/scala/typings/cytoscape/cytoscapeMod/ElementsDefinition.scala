package typings.cytoscape.cytoscapeMod

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
    val __obj = js.Dynamic.literal(edges = edges, nodes = nodes)
  
    __obj.asInstanceOf[ElementsDefinition]
  }
}

