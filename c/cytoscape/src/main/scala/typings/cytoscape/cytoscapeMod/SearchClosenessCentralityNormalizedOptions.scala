package typings.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.closenessCentrality
  * trivial
  */
/**
  * http://js.cytoscape.org/#eles.closenessCentralityNormalized
  */
/**
  * http://js.cytoscape.org/#eles.closenessCentralityNormalized
  */
trait SearchClosenessCentralityNormalizedOptions extends js.Object {
  var directed: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean indicating whether the algorithm calculates the
    * harmonic mean (true, default) or the arithmetic mean (false) of distances.
    * The harmonic mean is very useful for graphs that are not strongly connected.
    */
  var harmonic: js.UndefOr[Boolean] = js.undefined
  /**  A function that returns the weight for the edge. */
  var weight: js.UndefOr[js.Function1[/* edge */ EdgeSingular, Double]] = js.undefined
}

object SearchClosenessCentralityNormalizedOptions {
  @scala.inline
  def apply(
    directed: js.UndefOr[Boolean] = js.undefined,
    harmonic: js.UndefOr[Boolean] = js.undefined,
    weight: /* edge */ EdgeSingular => Double = null
  ): SearchClosenessCentralityNormalizedOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(directed)) __obj.updateDynamic("directed")(directed)
    if (!js.isUndefined(harmonic)) __obj.updateDynamic("harmonic")(harmonic)
    if (weight != null) __obj.updateDynamic("weight")(js.Any.fromFunction1(weight))
    __obj.asInstanceOf[SearchClosenessCentralityNormalizedOptions]
  }
}

