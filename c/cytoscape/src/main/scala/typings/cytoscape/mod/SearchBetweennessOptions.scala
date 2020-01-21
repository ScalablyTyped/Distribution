package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.closenessCentralityNormalized
  * trivial
  */
/**
  * http://js.cytoscape.org/#eles.betweennessCentrality
  */
trait SearchBetweennessOptions extends js.Object {
  /**
    * A boolean indicating whether the directed indegree and outdegree centrality is calculated (true) or
    * whether the undirected centrality is calculated (false, default).
    */
  var directed: js.UndefOr[Boolean] = js.undefined
  /**  A function that returns the weight for the edge. */
  var weight: js.UndefOr[js.Function1[/* edge */ EdgeSingular, Double]] = js.undefined
}

object SearchBetweennessOptions {
  @scala.inline
  def apply(directed: js.UndefOr[Boolean] = js.undefined, weight: /* edge */ EdgeSingular => Double = null): SearchBetweennessOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(directed)) __obj.updateDynamic("directed")(directed.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(js.Any.fromFunction1(weight))
    __obj.asInstanceOf[SearchBetweennessOptions]
  }
}

