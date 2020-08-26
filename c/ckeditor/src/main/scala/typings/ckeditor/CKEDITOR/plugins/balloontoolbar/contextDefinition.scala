package typings.ckeditor.CKEDITOR.plugins.balloontoolbar

import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.dom.elementPath
import typings.ckeditor.CKEDITOR.dom.selection
import typings.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait contextDefinition extends js.Object {
  var cssSelector: js.UndefOr[String] = js.native
  var priority: js.UndefOr[Double] = js.native
  var refresh: js.UndefOr[
    js.Function3[/* editor */ editor, /* path */ elementPath, /* selection */ selection, element]
  ] = js.native
  var widgets: js.UndefOr[js.Array[String] | String] = js.native
}

object contextDefinition {
  @scala.inline
  def apply(): contextDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[contextDefinition]
  }
  @scala.inline
  implicit class contextDefinitionOps[Self <: contextDefinition] (val x: Self) extends AnyVal {
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
    def setCssSelector(value: String): Self = this.set("cssSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssSelector: Self = this.set("cssSelector", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setRefresh(value: (/* editor */ editor, /* path */ elementPath, /* selection */ selection) => element): Self = this.set("refresh", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
    @scala.inline
    def setWidgetsVarargs(value: String*): Self = this.set("widgets", js.Array(value :_*))
    @scala.inline
    def setWidgets(value: js.Array[String] | String): Self = this.set("widgets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidgets: Self = this.set("widgets", js.undefined)
  }
  
}

