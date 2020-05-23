package typings.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderUIElements extends js.Object {
  var renderUIElements: js.UndefOr[Boolean] = js.undefined
  var rootName: js.UndefOr[Boolean] = js.undefined
  var showAttributeElementId: js.UndefOr[Boolean] = js.undefined
  var showPriority: js.UndefOr[Boolean] = js.undefined
  var showType: js.UndefOr[Boolean] = js.undefined
  var withoutSelection: js.UndefOr[Boolean] = js.undefined
}

object RenderUIElements {
  @scala.inline
  def apply(
    renderUIElements: js.UndefOr[Boolean] = js.undefined,
    rootName: js.UndefOr[Boolean] = js.undefined,
    showAttributeElementId: js.UndefOr[Boolean] = js.undefined,
    showPriority: js.UndefOr[Boolean] = js.undefined,
    showType: js.UndefOr[Boolean] = js.undefined,
    withoutSelection: js.UndefOr[Boolean] = js.undefined
  ): RenderUIElements = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(renderUIElements)) __obj.updateDynamic("renderUIElements")(renderUIElements.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rootName)) __obj.updateDynamic("rootName")(rootName.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showAttributeElementId)) __obj.updateDynamic("showAttributeElementId")(showAttributeElementId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showPriority)) __obj.updateDynamic("showPriority")(showPriority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showType)) __obj.updateDynamic("showType")(showType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutSelection)) __obj.updateDynamic("withoutSelection")(withoutSelection.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderUIElements]
  }
}

