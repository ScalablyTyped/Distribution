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

