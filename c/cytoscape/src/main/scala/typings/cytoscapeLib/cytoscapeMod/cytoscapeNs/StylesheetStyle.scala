package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylesheetStyle extends Stylesheet {
  var selector: java.lang.String
  var style: cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.Node | cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.Edge
}

object StylesheetStyle {
  @scala.inline
  def apply(
    selector: java.lang.String,
    style: cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.Node | cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.Edge
  ): StylesheetStyle = {
    val __obj = js.Dynamic.literal(selector = selector, style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StylesheetStyle]
  }
}

