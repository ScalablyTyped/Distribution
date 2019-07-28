package typings.chartDotJs.chartDotJsMod

import typings.chartDotJs.chartDotJsStrings.auto
import typings.chartDotJs.chartDotJsStrings.data
import typings.chartDotJs.chartDotJsStrings.labels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedTickOptions extends js.Object {
  var autoSkip: js.UndefOr[Boolean] = js.undefined
  var autoSkipPadding: js.UndefOr[Double] = js.undefined
  var backdropColor: js.UndefOr[ChartColor] = js.undefined
  var backdropPaddingX: js.UndefOr[Double] = js.undefined
  var backdropPaddingY: js.UndefOr[Double] = js.undefined
  var beginAtZero: js.UndefOr[Boolean] = js.undefined
  var callback: js.UndefOr[
    js.Function3[/* value */ js.Any, /* index */ js.Any, /* values */ js.Any, String | Double]
  ] = js.undefined
  var display: js.UndefOr[Boolean] = js.undefined
  var fontColor: js.UndefOr[ChartColor] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontStyle: js.UndefOr[String] = js.undefined
  var labelOffset: js.UndefOr[Double] = js.undefined
  var lineHeight: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[js.Any] = js.undefined
  var maxRotation: js.UndefOr[Double] = js.undefined
  var maxTicksLimit: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[js.Any] = js.undefined
  var minRotation: js.UndefOr[Double] = js.undefined
  var mirror: js.UndefOr[Boolean] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var showLabelBackdrop: js.UndefOr[Boolean] = js.undefined
  var source: js.UndefOr[auto | data | labels] = js.undefined
  var stepSize: js.UndefOr[Double] = js.undefined
  var suggestedMax: js.UndefOr[Double] = js.undefined
  var suggestedMin: js.UndefOr[Double] = js.undefined
}

object NestedTickOptions {
  @scala.inline
  def apply(
    autoSkip: js.UndefOr[Boolean] = js.undefined,
    autoSkipPadding: Int | Double = null,
    backdropColor: ChartColor = null,
    backdropPaddingX: Int | Double = null,
    backdropPaddingY: Int | Double = null,
    beginAtZero: js.UndefOr[Boolean] = js.undefined,
    callback: (/* value */ js.Any, /* index */ js.Any, /* values */ js.Any) => String | Double = null,
    display: js.UndefOr[Boolean] = js.undefined,
    fontColor: ChartColor = null,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    fontStyle: String = null,
    labelOffset: Int | Double = null,
    lineHeight: Int | Double = null,
    max: js.Any = null,
    maxRotation: Int | Double = null,
    maxTicksLimit: Int | Double = null,
    min: js.Any = null,
    minRotation: Int | Double = null,
    mirror: js.UndefOr[Boolean] = js.undefined,
    padding: Int | Double = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    showLabelBackdrop: js.UndefOr[Boolean] = js.undefined,
    source: auto | data | labels = null,
    stepSize: Int | Double = null,
    suggestedMax: Int | Double = null,
    suggestedMin: Int | Double = null
  ): NestedTickOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSkip)) __obj.updateDynamic("autoSkip")(autoSkip)
    if (autoSkipPadding != null) __obj.updateDynamic("autoSkipPadding")(autoSkipPadding.asInstanceOf[js.Any])
    if (backdropColor != null) __obj.updateDynamic("backdropColor")(backdropColor.asInstanceOf[js.Any])
    if (backdropPaddingX != null) __obj.updateDynamic("backdropPaddingX")(backdropPaddingX.asInstanceOf[js.Any])
    if (backdropPaddingY != null) __obj.updateDynamic("backdropPaddingY")(backdropPaddingY.asInstanceOf[js.Any])
    if (!js.isUndefined(beginAtZero)) __obj.updateDynamic("beginAtZero")(beginAtZero)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction3(callback))
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display)
    if (fontColor != null) __obj.updateDynamic("fontColor")(fontColor.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (labelOffset != null) __obj.updateDynamic("labelOffset")(labelOffset.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max)
    if (maxRotation != null) __obj.updateDynamic("maxRotation")(maxRotation.asInstanceOf[js.Any])
    if (maxTicksLimit != null) __obj.updateDynamic("maxTicksLimit")(maxTicksLimit.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min)
    if (minRotation != null) __obj.updateDynamic("minRotation")(minRotation.asInstanceOf[js.Any])
    if (!js.isUndefined(mirror)) __obj.updateDynamic("mirror")(mirror)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (!js.isUndefined(showLabelBackdrop)) __obj.updateDynamic("showLabelBackdrop")(showLabelBackdrop)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (stepSize != null) __obj.updateDynamic("stepSize")(stepSize.asInstanceOf[js.Any])
    if (suggestedMax != null) __obj.updateDynamic("suggestedMax")(suggestedMax.asInstanceOf[js.Any])
    if (suggestedMin != null) __obj.updateDynamic("suggestedMin")(suggestedMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedTickOptions]
  }
}

