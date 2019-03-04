package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.degreeCentralityNormalized
  */
trait SearchDegreeCentralityNormalizedResultUndirected extends js.Object {
  /** the normalised degree centrality of the specified node */
  def degree(node: NodeSingular): js.Any
}

object SearchDegreeCentralityNormalizedResultUndirected {
  @scala.inline
  def apply(degree: js.Function1[NodeSingular, js.Any]): SearchDegreeCentralityNormalizedResultUndirected = {
    val __obj = js.Dynamic.literal(degree = degree)
  
    __obj.asInstanceOf[SearchDegreeCentralityNormalizedResultUndirected]
  }
}

