package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.pageRank
  */
trait SearchPageRankResult extends js.Object {
  /** function that computes the rank of a given node (either object or selector string) */
  def rank(node: NodeCollection): scala.Double
}

object SearchPageRankResult {
  @scala.inline
  def apply(rank: js.Function1[NodeCollection, scala.Double]): SearchPageRankResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rank")(rank)
    __obj.asInstanceOf[SearchPageRankResult]
  }
}

