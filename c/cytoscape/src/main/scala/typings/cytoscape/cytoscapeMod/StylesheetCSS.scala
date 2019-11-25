package typings.cytoscape.cytoscapeMod

import typings.cytoscape.cytoscapeMod.Css.Edge
import typings.cytoscape.cytoscapeMod.Css.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#cy.style
  */
trait StylesheetCSS extends Stylesheet {
  var css: Node | Edge | typings.cytoscape.cytoscapeMod.Css.Core
  var selector: String
}

object StylesheetCSS {
  @scala.inline
  def apply(css: Node | Edge | typings.cytoscape.cytoscapeMod.Css.Core, selector: String): StylesheetCSS = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StylesheetCSS]
  }
}

