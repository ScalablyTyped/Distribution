package typings.cytoscape.mod

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
  def apply(degree: NodeSingular => js.Any): SearchDegreeCentralityNormalizedResultUndirected = {
    val __obj = js.Dynamic.literal(degree = js.Any.fromFunction1(degree))
  
    __obj.asInstanceOf[SearchDegreeCentralityNormalizedResultUndirected]
  }
}

