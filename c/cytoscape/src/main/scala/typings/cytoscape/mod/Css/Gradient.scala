package typings.cytoscape.mod.Css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These properties specify the gradient colouration of an edge's line:
  *
  * https://js.cytoscape.org/#style/gradient
  */
@js.native
trait Gradient extends js.Object {
  /**
    * The colors of the gradient stops.
    */
  var `line-gradient-stop-colors`: js.UndefOr[js.Array[PropertyValueEdge[Colour]]] = js.native
  /**
    * The positions of the gradient stops.
    * If not specified (or invalid), the stops will divide equally.
    */
  var `line-gradient-stop-positions`: js.UndefOr[js.Array[PropertyValueEdge[Double]]] = js.native
}

object Gradient {
  @scala.inline
  def apply(): Gradient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gradient]
  }
  @scala.inline
  implicit class GradientOps[Self <: Gradient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setLine-gradient-stop-colorsVarargs`(value: PropertyValueEdge[Colour]*): Self = this.set("line-gradient-stop-colors", js.Array(value :_*))
    @scala.inline
    def `setLine-gradient-stop-colors`(value: js.Array[PropertyValueEdge[Colour]]): Self = this.set("line-gradient-stop-colors", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-gradient-stop-colors`: Self = this.set("line-gradient-stop-colors", js.undefined)
    @scala.inline
    def `setLine-gradient-stop-positionsVarargs`(value: PropertyValueEdge[Double]*): Self = this.set("line-gradient-stop-positions", js.Array(value :_*))
    @scala.inline
    def `setLine-gradient-stop-positions`(value: js.Array[PropertyValueEdge[Double]]): Self = this.set("line-gradient-stop-positions", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLine-gradient-stop-positions`: Self = this.set("line-gradient-stop-positions", js.undefined)
  }
  
}

