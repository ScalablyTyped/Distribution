package typings.cytoscape.cytoscapeMod

import typings.cytoscape.cytoscapeMod.Css.Edge
import typings.cytoscape.cytoscapeMod.Css.Node
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
  def apply(json: () => js.Any, selector: String, style: Node | Edge): ElementStylesheetStyle = {
    val __obj = js.Dynamic.literal(json = js.Any.fromFunction0(json), selector = selector, style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ElementStylesheetStyle]
  }
}

