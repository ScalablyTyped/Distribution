package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

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
  def apply(
    json: js.Function0[js.Any],
    selector: java.lang.String,
    style: cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.Node | cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.Edge
  ): ElementStylesheetStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("json")(json)
    __obj.updateDynamic("selector")(selector)
    __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementStylesheetStyle]
  }
}

