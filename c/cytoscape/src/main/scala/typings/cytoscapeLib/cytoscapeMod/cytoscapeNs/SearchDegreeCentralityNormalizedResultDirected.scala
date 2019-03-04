package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchDegreeCentralityNormalizedResultDirected extends js.Object {
  /** the normalised indegree centrality of the specified node */
  def indegree(node: NodeSingular): js.Any
  /** the normalised outdegree centrality of the specified node */
  def outdegree(node: NodeSingular): js.Any
}

object SearchDegreeCentralityNormalizedResultDirected {
  @scala.inline
  def apply(indegree: js.Function1[NodeSingular, js.Any], outdegree: js.Function1[NodeSingular, js.Any]): SearchDegreeCentralityNormalizedResultDirected = {
    val __obj = js.Dynamic.literal(indegree = indegree, outdegree = outdegree)
  
    __obj.asInstanceOf[SearchDegreeCentralityNormalizedResultDirected]
  }
}

