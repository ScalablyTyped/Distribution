package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormComponent extends js.Object {
  var actions: js.UndefOr[js.Array[Component]] = js.undefined
  var component: Component
  var required: js.UndefOr[Boolean] = js.undefined
  var title: String
}

object FormComponent {
  @scala.inline
  def apply(
    component: Component,
    title: String,
    actions: js.Array[Component] = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): FormComponent = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormComponent]
  }
}

