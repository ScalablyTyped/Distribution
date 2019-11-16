package typings.cytoscape.cytoscapeMod.Css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These properties specify the gradient colouration of an edge's line:
  *
  * https://js.cytoscape.org/#style/gradient
  */
trait Gradient extends js.Object {
  /**
    * The colours of the gradient stops.
    */
  var `line-gradient-stop-colours`: js.UndefOr[js.Array[PropertyValueEdge[Colour]]] = js.undefined
  /**
    * The positions of the gradient stops.
    * If not specified (or invalid), the stops will divide equally.
    */
  var `line-gradient-stop-positions`: js.UndefOr[js.Array[PropertyValueEdge[Double]]] = js.undefined
}

object Gradient {
  @scala.inline
  def apply(
    `line-gradient-stop-colours`: js.Array[PropertyValueEdge[Colour]] = null,
    `line-gradient-stop-positions`: js.Array[PropertyValueEdge[Double]] = null
  ): Gradient = {
    val __obj = js.Dynamic.literal()
    if (`line-gradient-stop-colours` != null) __obj.updateDynamic("line-gradient-stop-colours")(`line-gradient-stop-colours`)
    if (`line-gradient-stop-positions` != null) __obj.updateDynamic("line-gradient-stop-positions")(`line-gradient-stop-positions`)
    __obj.asInstanceOf[Gradient]
  }
}

