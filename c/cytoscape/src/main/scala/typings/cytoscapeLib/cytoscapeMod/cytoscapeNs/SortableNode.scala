package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableNode extends js.Object {
  var data: cytoscapeLib.Anon_Weight
}

object SortableNode {
  @scala.inline
  def apply(data: cytoscapeLib.Anon_Weight): SortableNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[SortableNode]
  }
}

