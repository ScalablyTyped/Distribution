package typings.cytoscape.mod

import typings.cytoscape.mod.Css.Edge
import typings.cytoscape.mod.Css.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get the entry point to modify the visual style of the graph after initialisation.
  * http://js.cytoscape.org/#core/style
  */
trait ElementStylesheetStyle extends StylesheetStyle {
  def json(): js.Any
}

object ElementStylesheetStyle {
  @scala.inline
  def apply(json: () => js.Any, selector: String, style: Node | Edge | typings.cytoscape.mod.Css.Core): ElementStylesheetStyle = {
    val __obj = js.Dynamic.literal(json = js.Any.fromFunction0(json), selector = selector.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementStylesheetStyle]
  }
}

