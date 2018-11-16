package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * http://js.cytoscape.org/#eles.aStar
     */

trait SearchAStarOptions extends js.Object {
  var directed: js.UndefOr[scala.Boolean] = js.undefined
  var goal: Selector | CollectionArgument
  var heuristic: js.UndefOr[js.Function1[/* node */ NodeCollection, scala.Double]] = js.undefined
  var root: Selector | CollectionArgument
  var weight: js.UndefOr[WeightFn] = js.undefined
}

