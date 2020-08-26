package typings.cytoscape.mod

import typings.cytoscape.mod.Css.Edge
import typings.cytoscape.mod.Css.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#cy.style
  */
@js.native
trait StylesheetCSS extends Stylesheet {
  var css: Node | Edge | typings.cytoscape.mod.Css.Core = js.native
  var selector: String = js.native
}

object StylesheetCSS {
  @scala.inline
  def apply(css: Node | Edge | typings.cytoscape.mod.Css.Core, selector: String): StylesheetCSS = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylesheetCSS]
  }
  @scala.inline
  implicit class StylesheetCSSOps[Self <: StylesheetCSS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCss(value: Node | Edge | typings.cytoscape.mod.Css.Core): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
  }
  
}

