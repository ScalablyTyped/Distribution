package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarComponent extends js.Object {
  var component: Component
  var title: js.UndefOr[String] = js.undefined
  var toolbarSeparatorAfter: js.UndefOr[Boolean] = js.undefined
}

object ToolbarComponent {
  @scala.inline
  def apply(
    component: Component,
    title: String = null,
    toolbarSeparatorAfter: js.UndefOr[Boolean] = js.undefined
  ): ToolbarComponent = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbarSeparatorAfter)) __obj.updateDynamic("toolbarSeparatorAfter")(toolbarSeparatorAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarComponent]
  }
}

