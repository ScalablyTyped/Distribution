package typings.canvasDashGauges.CanvasGaugesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericOptions extends js.Object {
  var animateOnInit: js.UndefOr[Boolean] = js.undefined
  var animatedValue: js.UndefOr[Boolean] = js.undefined
  var animation: js.UndefOr[Boolean] = js.undefined
  var animationDuration: js.UndefOr[Double] = js.undefined
  var animationRule: js.UndefOr[String | AnimationRule] = js.undefined
  var barProgress: js.UndefOr[Boolean] = js.undefined
  var barShadow: js.UndefOr[Double] = js.undefined
  var barStrokeWidth: js.UndefOr[Double] = js.undefined
  var barWidth: js.UndefOr[Double] = js.undefined
  var borderInnerWidth: js.UndefOr[Double] = js.undefined
  var borderMiddleWidth: js.UndefOr[Double] = js.undefined
  var borderOuterWidth: js.UndefOr[Double] = js.undefined
  var borderShadowWidth: js.UndefOr[Double] = js.undefined
  var borders: js.UndefOr[Boolean] = js.undefined
  var colorBar: js.UndefOr[String] = js.undefined
  var colorBarProgress: js.UndefOr[String] = js.undefined
  var colorBarShadow: js.UndefOr[String] = js.undefined
  var colorBarStroke: js.UndefOr[String] = js.undefined
  var colorBorderInner: js.UndefOr[String] = js.undefined
  var colorBorderInnerEnd: js.UndefOr[String] = js.undefined
  var colorBorderMiddle: js.UndefOr[String] = js.undefined
  var colorBorderMiddleEnd: js.UndefOr[String] = js.undefined
  var colorBorderOuter: js.UndefOr[String] = js.undefined
  var colorBorderOuterEnd: js.UndefOr[String] = js.undefined
  var colorBorderShadow: js.UndefOr[String] = js.undefined
  var colorMajorTicks: js.UndefOr[String] = js.undefined
  var colorMinorTicks: js.UndefOr[String] = js.undefined
  var colorNeedle: js.UndefOr[String] = js.undefined
  var colorNeedleEnd: js.UndefOr[String] = js.undefined
  var colorNeedleShadowDown: js.UndefOr[String] = js.undefined
  var colorNeedleShadowUp: js.UndefOr[String] = js.undefined
  var colorNumbers: js.UndefOr[String] = js.undefined
  var colorPlate: js.UndefOr[String] = js.undefined
  var colorPlateEnd: js.UndefOr[String] = js.undefined
  var colorTitle: js.UndefOr[String] = js.undefined
  var colorUnits: js.UndefOr[String] = js.undefined
  var colorValueBoxBackground: js.UndefOr[String] = js.undefined
  var colorValueBoxRect: js.UndefOr[String] = js.undefined
  var colorValueBoxRectEnd: js.UndefOr[String] = js.undefined
  var colorValueBoxShadow: js.UndefOr[String] = js.undefined
  var colorValueText: js.UndefOr[String] = js.undefined
  var colorValueTextShadow: js.UndefOr[String] = js.undefined
  var exactTicks: js.UndefOr[Boolean] = js.undefined
  var fontNumbers: js.UndefOr[String] = js.undefined
  var fontNumbersSize: js.UndefOr[Double] = js.undefined
  var fontNumbersStyle: js.UndefOr[FontStyle] = js.undefined
  var fontNumbersWeight: js.UndefOr[FontWeight] = js.undefined
  var fontTitle: js.UndefOr[String] = js.undefined
  var fontTitleSize: js.UndefOr[Double] = js.undefined
  var fontTitleStyle: js.UndefOr[FontStyle] = js.undefined
  var fontTitleWeight: js.UndefOr[FontWeight] = js.undefined
  var fontUnits: js.UndefOr[String] = js.undefined
  var fontUnitsSize: js.UndefOr[Double] = js.undefined
  var fontUnitsStyle: js.UndefOr[FontStyle] = js.undefined
  var fontUnitsWeight: js.UndefOr[FontWeight] = js.undefined
  var fontValue: js.UndefOr[String] = js.undefined
  var fontValueSize: js.UndefOr[Double] = js.undefined
  var fontValueStyle: js.UndefOr[FontStyle] = js.undefined
  var fontValueWeight: js.UndefOr[FontWeight] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var highlights: js.UndefOr[js.Array[Highlight]] = js.undefined
  var highlightsWidth: js.UndefOr[Double] = js.undefined
  var listeners: js.UndefOr[EventListeners] = js.undefined
  var majorTicks: js.UndefOr[MajorTicks] = js.undefined
  var majorTicksDec: js.UndefOr[Double] = js.undefined
  var majorTicksInt: js.UndefOr[Double] = js.undefined
  var maxValue: js.UndefOr[Double] = js.undefined
  var minValue: js.UndefOr[Double] = js.undefined
  var minorTicks: js.UndefOr[Double] = js.undefined
  var needle: js.UndefOr[Boolean] = js.undefined
  var needleEnd: js.UndefOr[Double] = js.undefined
  var needleShadow: js.UndefOr[Boolean] = js.undefined
  var needleStart: js.UndefOr[Double] = js.undefined
  var needleType: js.UndefOr[String] = js.undefined
  var needleWidth: js.UndefOr[Double] = js.undefined
  var numbersMargin: js.UndefOr[Double] = js.undefined
  var renderTo: RenderTarget
  var strokeTicks: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String | Boolean] = js.undefined
  var units: js.UndefOr[String | Boolean] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var valueBox: js.UndefOr[Boolean] = js.undefined
  var valueBoxBorderRadius: js.UndefOr[Double] = js.undefined
  var valueBoxStroke: js.UndefOr[Double] = js.undefined
  var valueBoxWidth: js.UndefOr[Double] = js.undefined
  var valueDec: js.UndefOr[Double] = js.undefined
  var valueInt: js.UndefOr[Double] = js.undefined
  var valueText: js.UndefOr[String] = js.undefined
  var valueTextShadow: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object GenericOptions {
  @scala.inline
  def apply(
    renderTo: RenderTarget,
    animateOnInit: js.UndefOr[Boolean] = js.undefined,
    animatedValue: js.UndefOr[Boolean] = js.undefined,
    animation: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationRule: String | AnimationRule = null,
    barProgress: js.UndefOr[Boolean] = js.undefined,
    barShadow: Int | Double = null,
    barStrokeWidth: Int | Double = null,
    barWidth: Int | Double = null,
    borderInnerWidth: Int | Double = null,
    borderMiddleWidth: Int | Double = null,
    borderOuterWidth: Int | Double = null,
    borderShadowWidth: Int | Double = null,
    borders: js.UndefOr[Boolean] = js.undefined,
    colorBar: String = null,
    colorBarProgress: String = null,
    colorBarShadow: String = null,
    colorBarStroke: String = null,
    colorBorderInner: String = null,
    colorBorderInnerEnd: String = null,
    colorBorderMiddle: String = null,
    colorBorderMiddleEnd: String = null,
    colorBorderOuter: String = null,
    colorBorderOuterEnd: String = null,
    colorBorderShadow: String = null,
    colorMajorTicks: String = null,
    colorMinorTicks: String = null,
    colorNeedle: String = null,
    colorNeedleEnd: String = null,
    colorNeedleShadowDown: String = null,
    colorNeedleShadowUp: String = null,
    colorNumbers: String = null,
    colorPlate: String = null,
    colorPlateEnd: String = null,
    colorTitle: String = null,
    colorUnits: String = null,
    colorValueBoxBackground: String = null,
    colorValueBoxRect: String = null,
    colorValueBoxRectEnd: String = null,
    colorValueBoxShadow: String = null,
    colorValueText: String = null,
    colorValueTextShadow: String = null,
    exactTicks: js.UndefOr[Boolean] = js.undefined,
    fontNumbers: String = null,
    fontNumbersSize: Int | Double = null,
    fontNumbersStyle: FontStyle = null,
    fontNumbersWeight: FontWeight = null,
    fontTitle: String = null,
    fontTitleSize: Int | Double = null,
    fontTitleStyle: FontStyle = null,
    fontTitleWeight: FontWeight = null,
    fontUnits: String = null,
    fontUnitsSize: Int | Double = null,
    fontUnitsStyle: FontStyle = null,
    fontUnitsWeight: FontWeight = null,
    fontValue: String = null,
    fontValueSize: Int | Double = null,
    fontValueStyle: FontStyle = null,
    fontValueWeight: FontWeight = null,
    height: Int | Double = null,
    highlights: js.Array[Highlight] = null,
    highlightsWidth: Int | Double = null,
    listeners: EventListeners = null,
    majorTicks: MajorTicks = null,
    majorTicksDec: Int | Double = null,
    majorTicksInt: Int | Double = null,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    minorTicks: Int | Double = null,
    needle: js.UndefOr[Boolean] = js.undefined,
    needleEnd: Int | Double = null,
    needleShadow: js.UndefOr[Boolean] = js.undefined,
    needleStart: Int | Double = null,
    needleType: String = null,
    needleWidth: Int | Double = null,
    numbersMargin: Int | Double = null,
    strokeTicks: js.UndefOr[Boolean] = js.undefined,
    title: String | Boolean = null,
    units: String | Boolean = null,
    value: Int | Double = null,
    valueBox: js.UndefOr[Boolean] = js.undefined,
    valueBoxBorderRadius: Int | Double = null,
    valueBoxStroke: Int | Double = null,
    valueBoxWidth: Int | Double = null,
    valueDec: Int | Double = null,
    valueInt: Int | Double = null,
    valueText: String = null,
    valueTextShadow: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): GenericOptions = {
    val __obj = js.Dynamic.literal(renderTo = renderTo.asInstanceOf[js.Any])
    if (!js.isUndefined(animateOnInit)) __obj.updateDynamic("animateOnInit")(animateOnInit)
    if (!js.isUndefined(animatedValue)) __obj.updateDynamic("animatedValue")(animatedValue)
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationRule != null) __obj.updateDynamic("animationRule")(animationRule.asInstanceOf[js.Any])
    if (!js.isUndefined(barProgress)) __obj.updateDynamic("barProgress")(barProgress)
    if (barShadow != null) __obj.updateDynamic("barShadow")(barShadow.asInstanceOf[js.Any])
    if (barStrokeWidth != null) __obj.updateDynamic("barStrokeWidth")(barStrokeWidth.asInstanceOf[js.Any])
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (borderInnerWidth != null) __obj.updateDynamic("borderInnerWidth")(borderInnerWidth.asInstanceOf[js.Any])
    if (borderMiddleWidth != null) __obj.updateDynamic("borderMiddleWidth")(borderMiddleWidth.asInstanceOf[js.Any])
    if (borderOuterWidth != null) __obj.updateDynamic("borderOuterWidth")(borderOuterWidth.asInstanceOf[js.Any])
    if (borderShadowWidth != null) __obj.updateDynamic("borderShadowWidth")(borderShadowWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(borders)) __obj.updateDynamic("borders")(borders)
    if (colorBar != null) __obj.updateDynamic("colorBar")(colorBar)
    if (colorBarProgress != null) __obj.updateDynamic("colorBarProgress")(colorBarProgress)
    if (colorBarShadow != null) __obj.updateDynamic("colorBarShadow")(colorBarShadow)
    if (colorBarStroke != null) __obj.updateDynamic("colorBarStroke")(colorBarStroke)
    if (colorBorderInner != null) __obj.updateDynamic("colorBorderInner")(colorBorderInner)
    if (colorBorderInnerEnd != null) __obj.updateDynamic("colorBorderInnerEnd")(colorBorderInnerEnd)
    if (colorBorderMiddle != null) __obj.updateDynamic("colorBorderMiddle")(colorBorderMiddle)
    if (colorBorderMiddleEnd != null) __obj.updateDynamic("colorBorderMiddleEnd")(colorBorderMiddleEnd)
    if (colorBorderOuter != null) __obj.updateDynamic("colorBorderOuter")(colorBorderOuter)
    if (colorBorderOuterEnd != null) __obj.updateDynamic("colorBorderOuterEnd")(colorBorderOuterEnd)
    if (colorBorderShadow != null) __obj.updateDynamic("colorBorderShadow")(colorBorderShadow)
    if (colorMajorTicks != null) __obj.updateDynamic("colorMajorTicks")(colorMajorTicks)
    if (colorMinorTicks != null) __obj.updateDynamic("colorMinorTicks")(colorMinorTicks)
    if (colorNeedle != null) __obj.updateDynamic("colorNeedle")(colorNeedle)
    if (colorNeedleEnd != null) __obj.updateDynamic("colorNeedleEnd")(colorNeedleEnd)
    if (colorNeedleShadowDown != null) __obj.updateDynamic("colorNeedleShadowDown")(colorNeedleShadowDown)
    if (colorNeedleShadowUp != null) __obj.updateDynamic("colorNeedleShadowUp")(colorNeedleShadowUp)
    if (colorNumbers != null) __obj.updateDynamic("colorNumbers")(colorNumbers)
    if (colorPlate != null) __obj.updateDynamic("colorPlate")(colorPlate)
    if (colorPlateEnd != null) __obj.updateDynamic("colorPlateEnd")(colorPlateEnd)
    if (colorTitle != null) __obj.updateDynamic("colorTitle")(colorTitle)
    if (colorUnits != null) __obj.updateDynamic("colorUnits")(colorUnits)
    if (colorValueBoxBackground != null) __obj.updateDynamic("colorValueBoxBackground")(colorValueBoxBackground)
    if (colorValueBoxRect != null) __obj.updateDynamic("colorValueBoxRect")(colorValueBoxRect)
    if (colorValueBoxRectEnd != null) __obj.updateDynamic("colorValueBoxRectEnd")(colorValueBoxRectEnd)
    if (colorValueBoxShadow != null) __obj.updateDynamic("colorValueBoxShadow")(colorValueBoxShadow)
    if (colorValueText != null) __obj.updateDynamic("colorValueText")(colorValueText)
    if (colorValueTextShadow != null) __obj.updateDynamic("colorValueTextShadow")(colorValueTextShadow)
    if (!js.isUndefined(exactTicks)) __obj.updateDynamic("exactTicks")(exactTicks)
    if (fontNumbers != null) __obj.updateDynamic("fontNumbers")(fontNumbers)
    if (fontNumbersSize != null) __obj.updateDynamic("fontNumbersSize")(fontNumbersSize.asInstanceOf[js.Any])
    if (fontNumbersStyle != null) __obj.updateDynamic("fontNumbersStyle")(fontNumbersStyle)
    if (fontNumbersWeight != null) __obj.updateDynamic("fontNumbersWeight")(fontNumbersWeight)
    if (fontTitle != null) __obj.updateDynamic("fontTitle")(fontTitle)
    if (fontTitleSize != null) __obj.updateDynamic("fontTitleSize")(fontTitleSize.asInstanceOf[js.Any])
    if (fontTitleStyle != null) __obj.updateDynamic("fontTitleStyle")(fontTitleStyle)
    if (fontTitleWeight != null) __obj.updateDynamic("fontTitleWeight")(fontTitleWeight)
    if (fontUnits != null) __obj.updateDynamic("fontUnits")(fontUnits)
    if (fontUnitsSize != null) __obj.updateDynamic("fontUnitsSize")(fontUnitsSize.asInstanceOf[js.Any])
    if (fontUnitsStyle != null) __obj.updateDynamic("fontUnitsStyle")(fontUnitsStyle)
    if (fontUnitsWeight != null) __obj.updateDynamic("fontUnitsWeight")(fontUnitsWeight)
    if (fontValue != null) __obj.updateDynamic("fontValue")(fontValue)
    if (fontValueSize != null) __obj.updateDynamic("fontValueSize")(fontValueSize.asInstanceOf[js.Any])
    if (fontValueStyle != null) __obj.updateDynamic("fontValueStyle")(fontValueStyle)
    if (fontValueWeight != null) __obj.updateDynamic("fontValueWeight")(fontValueWeight)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (highlights != null) __obj.updateDynamic("highlights")(highlights)
    if (highlightsWidth != null) __obj.updateDynamic("highlightsWidth")(highlightsWidth.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (majorTicks != null) __obj.updateDynamic("majorTicks")(majorTicks)
    if (majorTicksDec != null) __obj.updateDynamic("majorTicksDec")(majorTicksDec.asInstanceOf[js.Any])
    if (majorTicksInt != null) __obj.updateDynamic("majorTicksInt")(majorTicksInt.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (minorTicks != null) __obj.updateDynamic("minorTicks")(minorTicks.asInstanceOf[js.Any])
    if (!js.isUndefined(needle)) __obj.updateDynamic("needle")(needle)
    if (needleEnd != null) __obj.updateDynamic("needleEnd")(needleEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(needleShadow)) __obj.updateDynamic("needleShadow")(needleShadow)
    if (needleStart != null) __obj.updateDynamic("needleStart")(needleStart.asInstanceOf[js.Any])
    if (needleType != null) __obj.updateDynamic("needleType")(needleType)
    if (needleWidth != null) __obj.updateDynamic("needleWidth")(needleWidth.asInstanceOf[js.Any])
    if (numbersMargin != null) __obj.updateDynamic("numbersMargin")(numbersMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeTicks)) __obj.updateDynamic("strokeTicks")(strokeTicks)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(valueBox)) __obj.updateDynamic("valueBox")(valueBox)
    if (valueBoxBorderRadius != null) __obj.updateDynamic("valueBoxBorderRadius")(valueBoxBorderRadius.asInstanceOf[js.Any])
    if (valueBoxStroke != null) __obj.updateDynamic("valueBoxStroke")(valueBoxStroke.asInstanceOf[js.Any])
    if (valueBoxWidth != null) __obj.updateDynamic("valueBoxWidth")(valueBoxWidth.asInstanceOf[js.Any])
    if (valueDec != null) __obj.updateDynamic("valueDec")(valueDec.asInstanceOf[js.Any])
    if (valueInt != null) __obj.updateDynamic("valueInt")(valueInt.asInstanceOf[js.Any])
    if (valueText != null) __obj.updateDynamic("valueText")(valueText)
    if (!js.isUndefined(valueTextShadow)) __obj.updateDynamic("valueTextShadow")(valueTextShadow)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericOptions]
  }
}

