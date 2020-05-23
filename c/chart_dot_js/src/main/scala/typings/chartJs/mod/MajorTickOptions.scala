package typings.chartJs.mod

import typings.chartJs.chartJsStrings.auto
import typings.chartJs.chartJsStrings.data
import typings.chartJs.chartJsStrings.labels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MajorTickOptions extends NestedTickOptions {
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object MajorTickOptions {
  @scala.inline
  def apply(
    autoSkip: js.UndefOr[Boolean] = js.undefined,
    autoSkipPadding: js.UndefOr[Double] = js.undefined,
    backdropColor: ChartColor = null,
    backdropPaddingX: js.UndefOr[Double] = js.undefined,
    backdropPaddingY: js.UndefOr[Double] = js.undefined,
    beginAtZero: js.UndefOr[Boolean] = js.undefined,
    callback: (/* value */ Double | String, /* index */ Double, /* values */ js.Array[Double | String]) => js.UndefOr[String | Double | Null] = null,
    display: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fontColor: ChartColor = null,
    fontFamily: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    fontStyle: String = null,
    labelOffset: js.UndefOr[Double] = js.undefined,
    lineHeight: js.UndefOr[Double] = js.undefined,
    max: js.Any = null,
    maxRotation: js.UndefOr[Double] = js.undefined,
    maxTicksLimit: js.UndefOr[Double] = js.undefined,
    min: js.Any = null,
    minRotation: js.UndefOr[Double] = js.undefined,
    mirror: js.UndefOr[Boolean] = js.undefined,
    padding: js.UndefOr[Double] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    sampleSize: js.UndefOr[Double] = js.undefined,
    showLabelBackdrop: js.UndefOr[Boolean] = js.undefined,
    source: auto | data | labels = null,
    stepSize: js.UndefOr[Double] = js.undefined,
    suggestedMax: js.UndefOr[Double] = js.undefined,
    suggestedMin: js.UndefOr[Double] = js.undefined
  ): MajorTickOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSkip)) __obj.updateDynamic("autoSkip")(autoSkip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSkipPadding)) __obj.updateDynamic("autoSkipPadding")(autoSkipPadding.get.asInstanceOf[js.Any])
    if (backdropColor != null) __obj.updateDynamic("backdropColor")(backdropColor.asInstanceOf[js.Any])
    if (!js.isUndefined(backdropPaddingX)) __obj.updateDynamic("backdropPaddingX")(backdropPaddingX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(backdropPaddingY)) __obj.updateDynamic("backdropPaddingY")(backdropPaddingY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(beginAtZero)) __obj.updateDynamic("beginAtZero")(beginAtZero.get.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction3(callback))
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (fontColor != null) __obj.updateDynamic("fontColor")(fontColor.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(labelOffset)) __obj.updateDynamic("labelOffset")(labelOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineHeight)) __obj.updateDynamic("lineHeight")(lineHeight.get.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRotation)) __obj.updateDynamic("maxRotation")(maxRotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTicksLimit)) __obj.updateDynamic("maxTicksLimit")(maxTicksLimit.get.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(minRotation)) __obj.updateDynamic("minRotation")(minRotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mirror)) __obj.updateDynamic("mirror")(mirror.get.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleSize)) __obj.updateDynamic("sampleSize")(sampleSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabelBackdrop)) __obj.updateDynamic("showLabelBackdrop")(showLabelBackdrop.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(stepSize)) __obj.updateDynamic("stepSize")(stepSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suggestedMax)) __obj.updateDynamic("suggestedMax")(suggestedMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suggestedMin)) __obj.updateDynamic("suggestedMin")(suggestedMin.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MajorTickOptions]
  }
}

