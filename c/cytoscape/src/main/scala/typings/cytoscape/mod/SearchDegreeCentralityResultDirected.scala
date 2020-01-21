package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchDegreeCentralityResultDirected extends js.Object {
  /* the indegree centrality of the root node */
  var indegree: Double
  /* the outdegree centrality of the root node */
  var outdegree: Double
}

object SearchDegreeCentralityResultDirected {
  @scala.inline
  def apply(indegree: Double, outdegree: Double): SearchDegreeCentralityResultDirected = {
    val __obj = js.Dynamic.literal(indegree = indegree.asInstanceOf[js.Any], outdegree = outdegree.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchDegreeCentralityResultDirected]
  }
}

