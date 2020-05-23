package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.degreeCentralityNormalized
  */
trait SearchDegreeCentralityNormalizedOptions extends js.Object {
  /**
    * The alpha value for the centrality calculation, ranging on [0, 1].
    * With value 0 (default), disregards edge weights and solely uses
    * number of edges in the centrality calculation. With value 1,
    * disregards number of edges and solely uses the edge weights
    * in the centrality calculation.
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * A boolean indicating whether the directed indegree and outdegree centrality is calculated (true) or
    * whether the undirected centrality is calculated (false, default).
    */
  var directed: js.UndefOr[Boolean] = js.undefined
  /**  A function that returns the weight for the edge. */
  def weight(edge: EdgeSingular): Double
}

object SearchDegreeCentralityNormalizedOptions {
  @scala.inline
  def apply(
    weight: EdgeSingular => Double,
    alpha: js.UndefOr[Double] = js.undefined,
    directed: js.UndefOr[Boolean] = js.undefined
  ): SearchDegreeCentralityNormalizedOptions = {
    val __obj = js.Dynamic.literal(weight = js.Any.fromFunction1(weight))
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(directed)) __obj.updateDynamic("directed")(directed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDegreeCentralityNormalizedOptions]
  }
}

