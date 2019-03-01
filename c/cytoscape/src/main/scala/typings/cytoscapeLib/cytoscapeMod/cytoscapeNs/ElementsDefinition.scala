package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("edges")(edges)
    __obj.updateDynamic("nodes")(nodes)
    __obj.asInstanceOf[ElementsDefinition]
  }
}

