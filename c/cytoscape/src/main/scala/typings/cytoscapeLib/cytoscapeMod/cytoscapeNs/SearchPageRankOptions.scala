package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

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
  var dampingFactor: js.UndefOr[scala.Double] = js.undefined
  /** Maximum number of iterations to perform. */
  var iterations: js.UndefOr[scala.Double] = js.undefined
  /** Numeric parameter that represents the required precision. */
  var precision: js.UndefOr[scala.Double] = js.undefined
}

object SearchPageRankOptions {
  @scala.inline
  def apply(
    dampingFactor: scala.Int | scala.Double = null,
    iterations: scala.Int | scala.Double = null,
    precision: scala.Int | scala.Double = null
  ): SearchPageRankOptions = {
    val __obj = js.Dynamic.literal()
    if (dampingFactor != null) __obj.updateDynamic("dampingFactor")(dampingFactor.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPageRankOptions]
  }
}

