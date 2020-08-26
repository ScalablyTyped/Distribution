package typings.azdata.anon

import typings.azdata.mod.Component
import typings.azdata.mod.FormItemLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined azdata.azdata.FormComponent & {  layout :azdata.azdata.FormItemLayout | undefined} */
@js.native
trait FormComponentlayoutFormIt extends js.Object {
  var actions: js.UndefOr[js.Array[Component]] = js.native
  var component: Component = js.native
  var layout: js.UndefOr[FormItemLayout] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var title: String = js.native
}

object FormComponentlayoutFormIt {
  @scala.inline
  def apply(component: Component, title: String): FormComponentlayoutFormIt = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormComponentlayoutFormIt]
  }
  @scala.inline
  implicit class FormComponentlayoutFormItOps[Self <: FormComponentlayoutFormIt] (val x: Self) extends AnyVal {
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
    def setActionsVarargs(value: Component*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[Component]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setLayout(value: FormItemLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
  
}

