package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchDegreeCentralityResultDirected extends js.Object {
  /* the indegree centrality of the root node */
  var indegree: scala.Double
  /* the outdegree centrality of the root node */
  var outdegree: scala.Double
}

object SearchDegreeCentralityResultDirected {
  @scala.inline
  def apply(indegree: scala.Double, outdegree: scala.Double): SearchDegreeCentralityResultDirected = {
    val __obj = js.Dynamic.literal(indegree = indegree, outdegree = outdegree)
  
    __obj.asInstanceOf[SearchDegreeCentralityResultDirected]
  }
}

