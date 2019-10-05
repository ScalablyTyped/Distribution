package typings.cytoscape.cytoscapeMod.Css

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
  var `overlay-color`: Colour
  /**
    * The opacity of the overlay.
    */
  var `overlay-opacity`: Double
  /**
    * The area outside of the element within which the overlay is shown.
    */
  var `overlay-padding`: Double
}

object Overlay {
  @scala.inline
  def apply(`overlay-color`: Colour, `overlay-opacity`: Double, `overlay-padding`: Double): Overlay = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("overlay-color")(`overlay-color`)
    __obj.updateDynamic("overlay-opacity")(`overlay-opacity`)
    __obj.updateDynamic("overlay-padding")(`overlay-padding`)
    __obj.asInstanceOf[Overlay]
  }
}

