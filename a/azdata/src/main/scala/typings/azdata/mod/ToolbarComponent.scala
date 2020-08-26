package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarComponent extends js.Object {
  var component: Component = js.native
  var title: js.UndefOr[String] = js.native
  var toolbarSeparatorAfter: js.UndefOr[Boolean] = js.native
}

object ToolbarComponent {
  @scala.inline
  def apply(component: Component): ToolbarComponent = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarComponent]
  }
  @scala.inline
  implicit class ToolbarComponentOps[Self <: ToolbarComponent] (val x: Self) extends AnyVal {
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
    def setComponent(value: Component): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setToolbarSeparatorAfter(value: Boolean): Self = this.set("toolbarSeparatorAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbarSeparatorAfter: Self = this.set("toolbarSeparatorAfter", js.undefined)
  }
  
}

