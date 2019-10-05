package typings.cytoscape.cytoscapeMod

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
    dampingFactor: Int | Double = null,
    iterations: Int | Double = null,
    precision: Int | Double = null
  ): SearchPageRankOptions = {
    val __obj = js.Dynamic.literal()
    if (dampingFactor != null) __obj.updateDynamic("dampingFactor")(dampingFactor.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPageRankOptions]
  }
}

