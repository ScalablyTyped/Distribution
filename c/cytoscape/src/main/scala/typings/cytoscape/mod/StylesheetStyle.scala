package typings.cytoscape.mod

import typings.cytoscape.mod.Css.Edge
import typings.cytoscape.mod.Css.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylesheetStyle extends Stylesheet {
  var selector: String
  var style: Node | Edge | typings.cytoscape.mod.Css.Core
}

object StylesheetStyle {
  @scala.inline
  def apply(selector: String, style: Node | Edge | typings.cytoscape.mod.Css.Core): StylesheetStyle = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylesheetStyle]
  }
}

