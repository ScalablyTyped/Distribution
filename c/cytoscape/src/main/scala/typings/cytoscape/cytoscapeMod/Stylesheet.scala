package typings.cytoscape.cytoscapeMod

import typings.cytoscape.cytoscapeMod.Css.Edge
import typings.cytoscape.cytoscapeMod.Css.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#cy.style
  */
/* Rewritten from type alias, can be one of: 
  - typings.cytoscape.cytoscapeMod.StylesheetStyle
  - typings.cytoscape.cytoscapeMod.StylesheetCSS
*/
trait Stylesheet extends js.Object

object Stylesheet {
  @scala.inline
  def StylesheetStyle(selector: String, style: Node | Edge | typings.cytoscape.cytoscapeMod.Css.Core): Stylesheet = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Stylesheet]
  }
  @scala.inline
  def StylesheetCSS(css: Node | Edge | typings.cytoscape.cytoscapeMod.Css.Core, selector: String): Stylesheet = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Stylesheet]
  }
}

