package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementStylesheetCSS extends StylesheetCSS {
  def json(): js.Any
}

object ElementStylesheetCSS {
  @scala.inline
  def apply(
    css: cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.Node | cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.Edge,
    json: js.Function0[js.Any],
    selector: java.lang.String
  ): ElementStylesheetCSS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    __obj.updateDynamic("json")(json)
    __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[ElementStylesheetCSS]
  }
}

