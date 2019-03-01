package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs

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
  var `overlay-opacity`: scala.Double
  /**
    * The area outside of the element within which the overlay is shown.
    */
  var `overlay-padding`: scala.Double
}

object Overlay {
  @scala.inline
  def apply(`overlay-color`: Colour, `overlay-opacity`: scala.Double, `overlay-padding`: scala.Double): Overlay = {
    val __obj = js.Dynamic.literal(`overlay-color` = `overlay-color`, `overlay-opacity` = `overlay-opacity`, `overlay-padding` = `overlay-padding`)
  
    __obj.asInstanceOf[Overlay]
  }
}

