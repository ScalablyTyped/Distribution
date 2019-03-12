package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedTickOptions extends js.Object {
  var autoSkip: js.UndefOr[scala.Boolean] = js.undefined
  var autoSkipPadding: js.UndefOr[scala.Double] = js.undefined
  var backdropColor: js.UndefOr[ChartColor] = js.undefined
  var backdropPaddingX: js.UndefOr[scala.Double] = js.undefined
  var backdropPaddingY: js.UndefOr[scala.Double] = js.undefined
  var beginAtZero: js.UndefOr[scala.Boolean] = js.undefined
  var callback: js.UndefOr[
    js.Function3[
      /* value */ js.Any, 
      /* index */ js.Any, 
      /* values */ js.Any, 
      java.lang.String | scala.Double
    ]
  ] = js.undefined
  var display: js.UndefOr[scala.Boolean] = js.undefined
  var fontColor: js.UndefOr[ChartColor] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  var labelOffset: js.UndefOr[scala.Double] = js.undefined
  var lineHeight: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[js.Any] = js.undefined
  var maxRotation: js.UndefOr[scala.Double] = js.undefined
  var maxTicksLimit: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[js.Any] = js.undefined
  var minRotation: js.UndefOr[scala.Double] = js.undefined
  var mirror: js.UndefOr[scala.Boolean] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var showLabelBackdrop: js.UndefOr[scala.Boolean] = js.undefined
  var source: js.UndefOr[
    chartDotJsLib.chartDotJsLibStrings.auto | chartDotJsLib.chartDotJsLibStrings.data | chartDotJsLib.chartDotJsLibStrings.labels
  ] = js.undefined
  var stepSize: js.UndefOr[scala.Double] = js.undefined
  var suggestedMax: js.UndefOr[scala.Double] = js.undefined
  var suggestedMin: js.UndefOr[scala.Double] = js.undefined
}

object NestedTickOptions {
  @scala.inline
  def apply(
    autoSkip: js.UndefOr[scala.Boolean] = js.undefined,
    autoSkipPadding: scala.Int | scala.Double = null,
    backdropColor: ChartColor = null,
    backdropPaddingX: scala.Int | scala.Double = null,
    backdropPaddingY: scala.Int | scala.Double = null,
    beginAtZero: js.UndefOr[scala.Boolean] = js.undefined,
    callback: (/* value */ js.Any, /* index */ js.Any, /* values */ js.Any) => java.lang.String | scala.Double = null,
    display: js.UndefOr[scala.Boolean] = js.undefined,
    fontColor: ChartColor = null,
    fontFamily: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    fontStyle: java.lang.String = null,
    labelOffset: scala.Int | scala.Double = null,
    lineHeight: scala.Int | scala.Double = null,
    max: js.Any = null,
    maxRotation: scala.Int | scala.Double = null,
    maxTicksLimit: scala.Int | scala.Double = null,
    min: js.Any = null,
    minRotation: scala.Int | scala.Double = null,
    mirror: js.UndefOr[scala.Boolean] = js.undefined,
    padding: scala.Int | scala.Double = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    showLabelBackdrop: js.UndefOr[scala.Boolean] = js.undefined,
    source: chartDotJsLib.chartDotJsLibStrings.auto | chartDotJsLib.chartDotJsLibStrings.data | chartDotJsLib.chartDotJsLibStrings.labels = null,
    stepSize: scala.Int | scala.Double = null,
    suggestedMax: scala.Int | scala.Double = null,
    suggestedMin: scala.Int | scala.Double = null
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

