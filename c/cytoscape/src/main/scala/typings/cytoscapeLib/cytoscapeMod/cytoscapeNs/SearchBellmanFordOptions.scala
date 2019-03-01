package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.bellmanFord
  */
trait SearchBellmanFordOptions extends js.Object {
  /**
    * Indicating whether the algorithm should only go along
    * edges from source to target (default false).
    */
  var directed: scala.Boolean
  /**
    * The root node (selector or collection) where the search starts.
    */
  var root: js.Any
  /**
    * A function that returns the positive numeric weight for this edge.
    */
  var weight: js.UndefOr[WeightFn] = js.undefined
}

object SearchBellmanFordOptions {
  @scala.inline
  def apply(directed: scala.Boolean, root: js.Any, weight: WeightFn = null): SearchBellmanFordOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("directed")(directed)
    __obj.updateDynamic("root")(root)
    if (weight != null) __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[SearchBellmanFordOptions]
  }
}

