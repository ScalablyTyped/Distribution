package typings.cytoscape.mod

import typings.cytoscape.mod.Css.Edge
import typings.cytoscape.mod.Css.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementStylesheetCSS extends StylesheetCSS {
  def json(): js.Any
}

object ElementStylesheetCSS {
  @scala.inline
  def apply(css: Node | Edge | typings.cytoscape.mod.Css.Core, json: () => js.Any, selector: String): ElementStylesheetCSS = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), selector = selector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ElementStylesheetCSS]
  }
}

