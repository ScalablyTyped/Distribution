package typings.cytoscape.cytoscapeMod.Css

import typings.cytoscape.cytoscapeStrings.displayed
import typings.cytoscape.cytoscapeStrings.none
import typings.cytoscape.cytoscapeStrings.visible
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
  var display: none | displayed
  /**
    * The opacity of the element, ranging from 0 to 1.
    * Note that the opacity of a compound node parent affects the effective opacity of its children.
    */
  var opacity: Double
  /**
    * Whether the element is visible; may be visible or hidden.
    * Note that a "visibility : hidden" bezier edge still takes up space in its bundle.
    */
  var visibility: none | visible
  /**
    * An integer value that affects the relative draw order of elements.
    * In general, an element with a higher "z-index" will be drawn on top of an element with a lower "z-index".
    * Note that edges are under nodes despite "z-index", except when necessary for compound nodes.
    */
  var `z-index`: Double
}

object Visibility {
  @scala.inline
  def apply(display: none | displayed, opacity: Double, visibility: none | visible, `z-index`: Double): Visibility = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], opacity = opacity, visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("z-index")(`z-index`)
    __obj.asInstanceOf[Visibility]
  }
}

