package typings
package atCkeditorCkeditor5DashEngineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RenderUIElements extends js.Object {
  var renderUIElements: js.UndefOr[scala.Boolean] = js.undefined
  var rootName: js.UndefOr[scala.Boolean] = js.undefined
  var showAttributeElementId: js.UndefOr[scala.Boolean] = js.undefined
  var showPriority: js.UndefOr[scala.Boolean] = js.undefined
  var showType: js.UndefOr[scala.Boolean] = js.undefined
  var withoutSelection: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_RenderUIElements {
  @scala.inline
  def apply(
    renderUIElements: js.UndefOr[scala.Boolean] = js.undefined,
    rootName: js.UndefOr[scala.Boolean] = js.undefined,
    showAttributeElementId: js.UndefOr[scala.Boolean] = js.undefined,
    showPriority: js.UndefOr[scala.Boolean] = js.undefined,
    showType: js.UndefOr[scala.Boolean] = js.undefined,
    withoutSelection: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_RenderUIElements = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(renderUIElements)) __obj.updateDynamic("renderUIElements")(renderUIElements)
    if (!js.isUndefined(rootName)) __obj.updateDynamic("rootName")(rootName)
    if (!js.isUndefined(showAttributeElementId)) __obj.updateDynamic("showAttributeElementId")(showAttributeElementId)
    if (!js.isUndefined(showPriority)) __obj.updateDynamic("showPriority")(showPriority)
    if (!js.isUndefined(showType)) __obj.updateDynamic("showType")(showType)
    if (!js.isUndefined(withoutSelection)) __obj.updateDynamic("withoutSelection")(withoutSelection)
    __obj.asInstanceOf[Anon_RenderUIElements]
  }
}

