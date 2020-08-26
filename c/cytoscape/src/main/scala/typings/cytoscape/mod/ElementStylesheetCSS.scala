package typings.cytoscape.mod

import typings.cytoscape.mod.Css.Edge
import typings.cytoscape.mod.Css.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementStylesheetCSS extends StylesheetCSS {
  def json(): js.Any = js.native
}

object ElementStylesheetCSS {
  @scala.inline
  def apply(css: Node | Edge | typings.cytoscape.mod.Css.Core, json: () => js.Any, selector: String): ElementStylesheetCSS = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementStylesheetCSS]
  }
  @scala.inline
  implicit class ElementStylesheetCSSOps[Self <: ElementStylesheetCSS] (val x: Self) extends AnyVal {
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
    def setJson(value: () => js.Any): Self = this.set("json", js.Any.fromFunction0(value))
  }
  
}

