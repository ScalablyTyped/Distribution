package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.kruskal
  * trivial so implemented in the function
  */
/**
  * http://js.cytoscape.org/#eles.pageRank
  */
trait SearchPageRankOptions extends js.Object {
  /** Numeric parameter for the algorithm. */
  var dampingFactor: js.UndefOr[Double] = js.undefined
  /** Maximum number of iterations to perform. */
  var iterations: js.UndefOr[Double] = js.undefined
  /** Numeric parameter that represents the required precision. */
  var precision: js.UndefOr[Double] = js.undefined
}

object SearchPageRankOptions {
  @scala.inline
  def apply(
    dampingFactor: js.UndefOr[Double] = js.undefined,
    iterations: js.UndefOr[Double] = js.undefined,
    precision: js.UndefOr[Double] = js.undefined
  ): SearchPageRankOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dampingFactor)) __obj.updateDynamic("dampingFactor")(dampingFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iterations)) __obj.updateDynamic("iterations")(iterations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPageRankOptions]
  }
}

