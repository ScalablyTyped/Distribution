package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#style/visibility
  */
trait Visibility extends js.Object {
  /**
    * Whether to display the element; may be element for displayed or none for not displayed.
    * Note that a "display: none" bezier edge does not take up space in its bundle.
    */
  var display: cytoscapeLib.cytoscapeLibStrings.none | cytoscapeLib.cytoscapeLibStrings.displayed
  /**
    * The opacity of the element, ranging from 0 to 1.
    * Note that the opacity of a compound node parent affects the effective opacity of its children.
    */
  var opacity: scala.Double
  /**
    * Whether the element is visible; may be visible or hidden.
    * Note that a "visibility : hidden" bezier edge still takes up space in its bundle.
    */
  var visibility: cytoscapeLib.cytoscapeLibStrings.none | cytoscapeLib.cytoscapeLibStrings.visible
  /**
    * An integer value that affects the relative draw order of elements.
    * In general, an element with a higher "z-index" will be drawn on top of an element with a lower "z-index".
    * Note that edges are under nodes despite "z-index", except when necessary for compound nodes.
    */
  var `z-index`: scala.Double
}

object Visibility {
  @scala.inline
  def apply(
    display: cytoscapeLib.cytoscapeLibStrings.none | cytoscapeLib.cytoscapeLibStrings.displayed,
    opacity: scala.Double,
    visibility: cytoscapeLib.cytoscapeLibStrings.none | cytoscapeLib.cytoscapeLibStrings.visible,
    `z-index`: scala.Double
  ): Visibility = {
    val __obj = js.Dynamic.literal(`z-index` = `z-index`)
    __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    __obj.updateDynamic("opacity")(opacity)
    __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visibility]
  }
}

