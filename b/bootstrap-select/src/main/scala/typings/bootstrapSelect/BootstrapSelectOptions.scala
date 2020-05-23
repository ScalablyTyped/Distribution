package typings.bootstrapSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapSelectOptions extends js.Object {
  var actionsBox: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[String | Boolean] = js.undefined
  var countSelectedText: js.UndefOr[String | js.Function] = js.undefined
  var deselectAllText: js.UndefOr[String] = js.undefined
  var dropdownAlignRight: js.UndefOr[String | Boolean] = js.undefined
  var dropupAuto: js.UndefOr[Boolean] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var hideDisabled: js.UndefOr[Boolean] = js.undefined
  var iconBase: js.UndefOr[String] = js.undefined
  var liveSearch: js.UndefOr[Boolean] = js.undefined
  var liveSearchNormalize: js.UndefOr[Boolean] = js.undefined
  var liveSearchPlaceholder: js.UndefOr[String] = js.undefined
  var liveSearchStyle: js.UndefOr[String] = js.undefined
  var maxOptions: js.UndefOr[Double | Boolean] = js.undefined
  var maxOptionsText: js.UndefOr[String | js.Array[_] | js.Function] = js.undefined
  var mobile: js.UndefOr[Boolean] = js.undefined
  var multipleSeparator: js.UndefOr[String] = js.undefined
  var noneSelectedText: js.UndefOr[String] = js.undefined
  var selectAllText: js.UndefOr[String] = js.undefined
  var selectOnTab: js.UndefOr[Boolean] = js.undefined
  var selectedTextFormat: js.UndefOr[String] = js.undefined
  var showContent: js.UndefOr[Boolean] = js.undefined
  var showIcon: js.UndefOr[Boolean] = js.undefined
  var showSubtext: js.UndefOr[Boolean] = js.undefined
  var showTick: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[String | Double | Boolean] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var tickIcon: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String | Boolean] = js.undefined
}

object BootstrapSelectOptions {
  @scala.inline
  def apply(
    actionsBox: js.UndefOr[Boolean] = js.undefined,
    container: String | Boolean = null,
    countSelectedText: String | js.Function = null,
    deselectAllText: String = null,
    dropdownAlignRight: String | Boolean = null,
    dropupAuto: js.UndefOr[Boolean] = js.undefined,
    header: String = null,
    hideDisabled: js.UndefOr[Boolean] = js.undefined,
    iconBase: String = null,
    liveSearch: js.UndefOr[Boolean] = js.undefined,
    liveSearchNormalize: js.UndefOr[Boolean] = js.undefined,
    liveSearchPlaceholder: String = null,
    liveSearchStyle: String = null,
    maxOptions: Double | Boolean = null,
    maxOptionsText: String | js.Array[_] | js.Function = null,
    mobile: js.UndefOr[Boolean] = js.undefined,
    multipleSeparator: String = null,
    noneSelectedText: String = null,
    selectAllText: String = null,
    selectOnTab: js.UndefOr[Boolean] = js.undefined,
    selectedTextFormat: String = null,
    showContent: js.UndefOr[Boolean] = js.undefined,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    showSubtext: js.UndefOr[Boolean] = js.undefined,
    showTick: js.UndefOr[Boolean] = js.undefined,
    size: String | Double | Boolean = null,
    style: String = null,
    tickIcon: String = null,
    title: String = null,
    width: String | Boolean = null
  ): BootstrapSelectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actionsBox)) __obj.updateDynamic("actionsBox")(actionsBox.get.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (countSelectedText != null) __obj.updateDynamic("countSelectedText")(countSelectedText.asInstanceOf[js.Any])
    if (deselectAllText != null) __obj.updateDynamic("deselectAllText")(deselectAllText.asInstanceOf[js.Any])
    if (dropdownAlignRight != null) __obj.updateDynamic("dropdownAlignRight")(dropdownAlignRight.asInstanceOf[js.Any])
    if (!js.isUndefined(dropupAuto)) __obj.updateDynamic("dropupAuto")(dropupAuto.get.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDisabled)) __obj.updateDynamic("hideDisabled")(hideDisabled.get.asInstanceOf[js.Any])
    if (iconBase != null) __obj.updateDynamic("iconBase")(iconBase.asInstanceOf[js.Any])
    if (!js.isUndefined(liveSearch)) __obj.updateDynamic("liveSearch")(liveSearch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(liveSearchNormalize)) __obj.updateDynamic("liveSearchNormalize")(liveSearchNormalize.get.asInstanceOf[js.Any])
    if (liveSearchPlaceholder != null) __obj.updateDynamic("liveSearchPlaceholder")(liveSearchPlaceholder.asInstanceOf[js.Any])
    if (liveSearchStyle != null) __obj.updateDynamic("liveSearchStyle")(liveSearchStyle.asInstanceOf[js.Any])
    if (maxOptions != null) __obj.updateDynamic("maxOptions")(maxOptions.asInstanceOf[js.Any])
    if (maxOptionsText != null) __obj.updateDynamic("maxOptionsText")(maxOptionsText.asInstanceOf[js.Any])
    if (!js.isUndefined(mobile)) __obj.updateDynamic("mobile")(mobile.get.asInstanceOf[js.Any])
    if (multipleSeparator != null) __obj.updateDynamic("multipleSeparator")(multipleSeparator.asInstanceOf[js.Any])
    if (noneSelectedText != null) __obj.updateDynamic("noneSelectedText")(noneSelectedText.asInstanceOf[js.Any])
    if (selectAllText != null) __obj.updateDynamic("selectAllText")(selectAllText.asInstanceOf[js.Any])
    if (!js.isUndefined(selectOnTab)) __obj.updateDynamic("selectOnTab")(selectOnTab.get.asInstanceOf[js.Any])
    if (selectedTextFormat != null) __obj.updateDynamic("selectedTextFormat")(selectedTextFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(showContent)) __obj.updateDynamic("showContent")(showContent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSubtext)) __obj.updateDynamic("showSubtext")(showSubtext.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTick)) __obj.updateDynamic("showTick")(showTick.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tickIcon != null) __obj.updateDynamic("tickIcon")(tickIcon.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapSelectOptions]
  }
}

