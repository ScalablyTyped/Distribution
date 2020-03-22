package typings.azdata

import typings.azdata.mod.Component
import typings.azdata.mod.FormItemLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined azdata.azdata.FormComponent & {  layout ? :azdata.azdata.FormItemLayout} */
trait FormComponentlayoutFormIt extends js.Object {
  var actions: js.UndefOr[js.Array[Component]] = js.undefined
  var component: Component
  var layout: js.UndefOr[FormItemLayout] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var title: String
}

object FormComponentlayoutFormIt {
  @scala.inline
  def apply(
    component: Component,
    title: String,
    actions: js.Array[Component] = null,
    layout: FormItemLayout = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): FormComponentlayoutFormIt = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormComponentlayoutFormIt]
  }
}

