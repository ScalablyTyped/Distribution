package typings.cytoscape.cytoscapeMod

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
  def apply(indegree: NodeSingular => js.Any, outdegree: NodeSingular => js.Any): SearchDegreeCentralityNormalizedResultDirected = {
    val __obj = js.Dynamic.literal(indegree = js.Any.fromFunction1(indegree), outdegree = js.Any.fromFunction1(outdegree))
  
    __obj.asInstanceOf[SearchDegreeCentralityNormalizedResultDirected]
  }
}

