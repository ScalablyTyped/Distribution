package typings.atCkeditorCkeditor5DashEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RenderUIElements extends js.Object {
  var renderUIElements: js.UndefOr[Boolean] = js.undefined
  var rootName: js.UndefOr[Boolean] = js.undefined
  var showAttributeElementId: js.UndefOr[Boolean] = js.undefined
  var showPriority: js.UndefOr[Boolean] = js.undefined
  var showType: js.UndefOr[Boolean] = js.undefined
  var withoutSelection: js.UndefOr[Boolean] = js.undefined
}

object Anon_RenderUIElements {
  @scala.inline
  def apply(
    renderUIElements: js.UndefOr[Boolean] = js.undefined,
    rootName: js.UndefOr[Boolean] = js.undefined,
    showAttributeElementId: js.UndefOr[Boolean] = js.undefined,
    showPriority: js.UndefOr[Boolean] = js.undefined,
    showType: js.UndefOr[Boolean] = js.undefined,
    withoutSelection: js.UndefOr[Boolean] = js.undefined
  ): Anon_RenderUIElements = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(renderUIElements)) __obj.updateDynamic("renderUIElements")(renderUIElements.asInstanceOf[js.Any])
    if (!js.isUndefined(rootName)) __obj.updateDynamic("rootName")(rootName.asInstanceOf[js.Any])
    if (!js.isUndefined(showAttributeElementId)) __obj.updateDynamic("showAttributeElementId")(showAttributeElementId.asInstanceOf[js.Any])
    if (!js.isUndefined(showPriority)) __obj.updateDynamic("showPriority")(showPriority.asInstanceOf[js.Any])
    if (!js.isUndefined(showType)) __obj.updateDynamic("showType")(showType.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutSelection)) __obj.updateDynamic("withoutSelection")(withoutSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RenderUIElements]
  }
}

