package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchFirstOptions extends js.Object {
  /**
    * A boolean indicating whether the algorithm should only go along edges from source to target (default false).
    */
  var directed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The root nodes (selector or collection) to start the search from.
    */
  var roots: Selector | CollectionArgument
  /**
    * A handler function that is called when a node is visited in the search.
    */
  var visit: js.UndefOr[SearchVisitFunction] = js.undefined
}

