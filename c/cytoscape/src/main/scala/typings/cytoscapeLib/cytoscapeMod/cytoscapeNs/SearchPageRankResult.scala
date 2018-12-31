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

