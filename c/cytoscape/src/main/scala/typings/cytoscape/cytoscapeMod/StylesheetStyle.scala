package typings.cytoscape.cytoscapeMod

import typings.cytoscape.cytoscapeMod.Css.Edge
import typings.cytoscape.cytoscapeMod.Css.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylesheetStyle extends Stylesheet {
  var selector: String
  var style: Node | Edge
}

object StylesheetStyle {
  @scala.inline
  def apply(selector: String, style: Node | Edge): StylesheetStyle = {
    val __obj = js.Dynamic.literal(selector = selector, style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StylesheetStyle]
  }
}

