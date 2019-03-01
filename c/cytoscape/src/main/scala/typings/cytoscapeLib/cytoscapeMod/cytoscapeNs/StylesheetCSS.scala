package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#cy.style
  */
trait StylesheetCSS extends Stylesheet {
  var css: cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.Node | cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.Edge
  var selector: java.lang.String
}

object StylesheetCSS {
  @scala.inline
  def apply(
    css: cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.Node | cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.Edge,
    selector: java.lang.String
  ): StylesheetCSS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[StylesheetCSS]
  }
}

