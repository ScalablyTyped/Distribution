package typings.cytoscape.mod.Css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These properties allow for the creation of overlays on top of nodes or edges,
  * and are often used in the :active state.
  * http://js.cytoscape.org/#style/overlay
  */
trait Overlay extends js.Object {
  /**
    * The colour of the overlay.
    */
  var `overlay-color`: PropertyValueEdge[Colour]
  /**
    * The opacity of the overlay.
    */
  var `overlay-opacity`: PropertyValueEdge[Double]
  /**
    * The area outside of the element within which the overlay is shown.
    */
  var `overlay-padding`: PropertyValueEdge[Double | String]
}

object Overlay {
  @scala.inline
  def apply(
    `overlay-color`: PropertyValueEdge[Colour],
    `overlay-opacity`: PropertyValueEdge[Double],
    `overlay-padding`: PropertyValueEdge[Double | String]
  ): Overlay = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("overlay-color")(`overlay-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("overlay-opacity")(`overlay-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("overlay-padding")(`overlay-padding`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overlay]
  }
}

