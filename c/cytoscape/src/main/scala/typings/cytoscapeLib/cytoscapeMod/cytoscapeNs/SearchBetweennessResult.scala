package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.betweennessCentrality
  */
trait SearchBetweennessResult extends js.Object {
  /** returns the betweenness centrality of the specified node */
  def betweenness(node: NodeSingular): scala.Double
  def betweennessNormalised(node: NodeSingular): scala.Double
  /** returns the normalised betweenness centrality of the specified node */
  def betweennessNormalized(node: NodeSingular): scala.Double
}

