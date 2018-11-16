package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * http://js.cytoscape.org/#eles.floydWarshall
     */
@js.native
trait SearchFloydWarshallOptions extends js.Object {
  var directed: js.UndefOr[scala.Boolean] = js.native
  @JSName("weight")
  var weight_Original: WeightFn = js.native
  def weight(edge: EdgeCollection): scala.Double = js.native
}

