package typings
package cytoscapeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cut extends js.Object {
  var cut: cytoscapeLib.cytoscapeMod.cytoscapeNs.EdgeCollection
  var partitionFirst: cytoscapeLib.cytoscapeMod.cytoscapeNs.NodeCollection
  var partitionSecond: cytoscapeLib.cytoscapeMod.cytoscapeNs.NodeCollection
}

object Anon_Cut {
  @scala.inline
  def apply(
    cut: cytoscapeLib.cytoscapeMod.cytoscapeNs.EdgeCollection,
    partitionFirst: cytoscapeLib.cytoscapeMod.cytoscapeNs.NodeCollection,
    partitionSecond: cytoscapeLib.cytoscapeMod.cytoscapeNs.NodeCollection
  ): Anon_Cut = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cut")(cut)
    __obj.updateDynamic("partitionFirst")(partitionFirst)
    __obj.updateDynamic("partitionSecond")(partitionSecond)
    __obj.asInstanceOf[Anon_Cut]
  }
}

