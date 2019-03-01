package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.closenessCentrality
  */
trait SearchClosenessCentralityOptions extends js.Object {
  /**
    * A boolean indicating whether the directed indegree and outdegree centrality is calculated (true) or
    * whether the undirected centrality is calculated (false, default).
    */
  var directed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean indicating whether the algorithm calculates the
    * harmonic mean (true, default) or the arithmetic mean (false) of distances.
    * The harmonic mean is very useful for graphs that are not strongly connected.
    */
  var harmonic: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The root node (selector or collection) for which the
    * centrality calculation is made.
    */
  var root: NodeSingular | Selector
  /**  A function that returns the weight for the edge. */
  var weight: js.UndefOr[js.Function1[/* edge */ EdgeSingular, scala.Double]] = js.undefined
}

object SearchClosenessCentralityOptions {
  @scala.inline
  def apply(
    root: NodeSingular | Selector,
    directed: js.UndefOr[scala.Boolean] = js.undefined,
    harmonic: js.UndefOr[scala.Boolean] = js.undefined,
    weight: js.Function1[/* edge */ EdgeSingular, scala.Double] = null
  ): SearchClosenessCentralityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(directed)) __obj.updateDynamic("directed")(directed)
    if (!js.isUndefined(harmonic)) __obj.updateDynamic("harmonic")(harmonic)
    if (weight != null) __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[SearchClosenessCentralityOptions]
  }
}

