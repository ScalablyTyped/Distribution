package typings.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgnoreRoot extends js.Object {
  var ignoreRoot: js.UndefOr[Boolean] = js.undefined
  var renderUIElements: js.UndefOr[Boolean] = js.undefined
  var sameSelectionCharacters: js.UndefOr[Boolean] = js.undefined
  var showAttributeElementId: js.UndefOr[Boolean] = js.undefined
  var showPriority: js.UndefOr[Boolean] = js.undefined
  var showType: js.UndefOr[Boolean] = js.undefined
}

object IgnoreRoot {
  @scala.inline
  def apply(
    ignoreRoot: js.UndefOr[Boolean] = js.undefined,
    renderUIElements: js.UndefOr[Boolean] = js.undefined,
    sameSelectionCharacters: js.UndefOr[Boolean] = js.undefined,
    showAttributeElementId: js.UndefOr[Boolean] = js.undefined,
    showPriority: js.UndefOr[Boolean] = js.undefined,
    showType: js.UndefOr[Boolean] = js.undefined
  ): IgnoreRoot = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreRoot)) __obj.updateDynamic("ignoreRoot")(ignoreRoot.get.asInstanceOf[js.Any])
    if (!js.isUndefined(renderUIElements)) __obj.updateDynamic("renderUIElements")(renderUIElements.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sameSelectionCharacters)) __obj.updateDynamic("sameSelectionCharacters")(sameSelectionCharacters.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showAttributeElementId)) __obj.updateDynamic("showAttributeElementId")(showAttributeElementId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showPriority)) __obj.updateDynamic("showPriority")(showPriority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showType)) __obj.updateDynamic("showType")(showType.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreRoot]
  }
}

