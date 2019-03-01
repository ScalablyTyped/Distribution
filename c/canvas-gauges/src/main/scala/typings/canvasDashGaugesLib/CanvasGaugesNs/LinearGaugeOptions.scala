package typings
package canvasDashGaugesLib.CanvasGaugesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGaugeOptions extends GenericOptions {
  var barBeginCircle: js.UndefOr[scala.Double] = js.undefined
  var barLength: js.UndefOr[scala.Double] = js.undefined
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
  var colorBarEnd: js.UndefOr[java.lang.String] = js.undefined
  var colorBarProgressEnd: js.UndefOr[java.lang.String] = js.undefined
  var needleSide: js.UndefOr[java.lang.String] = js.undefined
  var numberSide: js.UndefOr[java.lang.String] = js.undefined
  var tickSide: js.UndefOr[java.lang.String] = js.undefined
  var ticksPadding: js.UndefOr[scala.Double] = js.undefined
  var ticksWidth: js.UndefOr[scala.Double] = js.undefined
  var ticksWidthMinor: js.UndefOr[scala.Double] = js.undefined
}

object LinearGaugeOptions {
  @scala.inline
  def apply(
    renderTo: RenderTarget,
    animateOnInit: js.UndefOr[scala.Boolean] = js.undefined,
    animatedValue: js.UndefOr[scala.Boolean] = js.undefined,
    animation: js.UndefOr[scala.Boolean] = js.undefined,
    animationDuration: scala.Int | scala.Double = null,
    animationRule: java.lang.String | AnimationRule = null,
    barBeginCircle: scala.Int | scala.Double = null,
    barLength: scala.Int | scala.Double = null,
    barProgress: js.UndefOr[scala.Boolean] = js.undefined,
    barShadow: scala.Int | scala.Double = null,
    barStrokeWidth: scala.Int | scala.Double = null,
    barWidth: scala.Int | scala.Double = null,
    borderInnerWidth: scala.Int | scala.Double = null,
    borderMiddleWidth: scala.Int | scala.Double = null,
    borderOuterWidth: scala.Int | scala.Double = null,
    borderRadius: scala.Int | scala.Double = null,
    borderShadowWidth: scala.Int | scala.Double = null,
    borders: js.UndefOr[scala.Boolean] = js.undefined,
    colorBar: java.lang.String = null,
    colorBarEnd: java.lang.String = null,
    colorBarProgress: java.lang.String = null,
    colorBarProgressEnd: java.lang.String = null,
    colorBarShadow: java.lang.String = null,
    colorBarStroke: java.lang.String = null,
    colorBorderInner: java.lang.String = null,
    colorBorderInnerEnd: java.lang.String = null,
    colorBorderMiddle: java.lang.String = null,
    colorBorderMiddleEnd: java.lang.String = null,
    colorBorderOuter: java.lang.String = null,
    colorBorderOuterEnd: java.lang.String = null,
    colorBorderShadow: java.lang.String = null,
    colorMajorTicks: java.lang.String = null,
    colorMinorTicks: java.lang.String = null,
    colorNeedle: java.lang.String = null,
    colorNeedleEnd: java.lang.String = null,
    colorNeedleShadowDown: java.lang.String = null,
    colorNeedleShadowUp: java.lang.String = null,
    colorNumbers: java.lang.String = null,
    colorPlate: java.lang.String = null,
    colorPlateEnd: java.lang.String = null,
    colorTitle: java.lang.String = null,
    colorUnits: java.lang.String = null,
    colorValueBoxBackground: java.lang.String = null,
    colorValueBoxRect: java.lang.String = null,
    colorValueBoxRectEnd: java.lang.String = null,
    colorValueBoxShadow: java.lang.String = null,
    colorValueText: java.lang.String = null,
    colorValueTextShadow: java.lang.String = null,
    exactTicks: js.UndefOr[scala.Boolean] = js.undefined,
    fontNumbers: java.lang.String = null,
    fontNumbersSize: scala.Int | scala.Double = null,
    fontNumbersStyle: FontStyle = null,
    fontNumbersWeight: FontWeight = null,
    fontTitle: java.lang.String = null,
    fontTitleSize: scala.Int | scala.Double = null,
    fontTitleStyle: FontStyle = null,
    fontTitleWeight: FontWeight = null,
    fontUnits: java.lang.String = null,
    fontUnitsSize: scala.Int | scala.Double = null,
    fontUnitsStyle: FontStyle = null,
    fontUnitsWeight: FontWeight = null,
    fontValue: java.lang.String = null,
    fontValueSize: scala.Int | scala.Double = null,
    fontValueStyle: FontStyle = null,
    fontValueWeight: FontWeight = null,
    height: scala.Int | scala.Double = null,
    highlights: js.Array[Highlight] = null,
    highlightsWidth: scala.Int | scala.Double = null,
    listeners: EventListeners = null,
    majorTicks: MajorTicks = null,
    majorTicksDec: scala.Int | scala.Double = null,
    majorTicksInt: scala.Int | scala.Double = null,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    minorTicks: scala.Int | scala.Double = null,
    needle: js.UndefOr[scala.Boolean] = js.undefined,
    needleEnd: scala.Int | scala.Double = null,
    needleShadow: js.UndefOr[scala.Boolean] = js.undefined,
    needleSide: java.lang.String = null,
    needleStart: scala.Int | scala.Double = null,
    needleType: java.lang.String = null,
    needleWidth: scala.Int | scala.Double = null,
    numberSide: java.lang.String = null,
    numbersMargin: scala.Int | scala.Double = null,
    strokeTicks: js.UndefOr[scala.Boolean] = js.undefined,
    tickSide: java.lang.String = null,
    ticksPadding: scala.Int | scala.Double = null,
    ticksWidth: scala.Int | scala.Double = null,
    ticksWidthMinor: scala.Int | scala.Double = null,
    title: java.lang.String | scala.Boolean = null,
    units: java.lang.String | scala.Boolean = null,
    value: scala.Int | scala.Double = null,
    valueBox: js.UndefOr[scala.Boolean] = js.undefined,
    valueBoxBorderRadius: scala.Int | scala.Double = null,
    valueBoxStroke: scala.Int | scala.Double = null,
    valueBoxWidth: scala.Int | scala.Double = null,
    valueDec: scala.Int | scala.Double = null,
    valueInt: scala.Int | scala.Double = null,
    valueText: java.lang.String = null,
    valueTextShadow: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): LinearGaugeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderTo")(renderTo.asInstanceOf[js.Any])
    if (!js.isUndefined(animateOnInit)) __obj.updateDynamic("animateOnInit")(animateOnInit)
    if (!js.isUndefined(animatedValue)) __obj.updateDynamic("animatedValue")(animatedValue)
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationRule != null) __obj.updateDynamic("animationRule")(animationRule.asInstanceOf[js.Any])
    if (barBeginCircle != null) __obj.updateDynamic("barBeginCircle")(barBeginCircle.asInstanceOf[js.Any])
    if (barLength != null) __obj.updateDynamic("barLength")(barLength.asInstanceOf[js.Any])
    if (!js.isUndefined(barProgress)) __obj.updateDynamic("barProgress")(barProgress)
    if (barShadow != null) __obj.updateDynamic("barShadow")(barShadow.asInstanceOf[js.Any])
    if (barStrokeWidth != null) __obj.updateDynamic("barStrokeWidth")(barStrokeWidth.asInstanceOf[js.Any])
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (borderInnerWidth != null) __obj.updateDynamic("borderInnerWidth")(borderInnerWidth.asInstanceOf[js.Any])
    if (borderMiddleWidth != null) __obj.updateDynamic("borderMiddleWidth")(borderMiddleWidth.asInstanceOf[js.Any])
    if (borderOuterWidth != null) __obj.updateDynamic("borderOuterWidth")(borderOuterWidth.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderShadowWidth != null) __obj.updateDynamic("borderShadowWidth")(borderShadowWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(borders)) __obj.updateDynamic("borders")(borders)
    if (colorBar != null) __obj.updateDynamic("colorBar")(colorBar)
    if (colorBarEnd != null) __obj.updateDynamic("colorBarEnd")(colorBarEnd)
    if (colorBarProgress != null) __obj.updateDynamic("colorBarProgress")(colorBarProgress)
    if (colorBarProgressEnd != null) __obj.updateDynamic("colorBarProgressEnd")(colorBarProgressEnd)
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
    if (majorTicks != null) __obj.updateDynamic("majorTicks")(majorTicks.asInstanceOf[js.Any])
    if (majorTicksDec != null) __obj.updateDynamic("majorTicksDec")(majorTicksDec.asInstanceOf[js.Any])
    if (majorTicksInt != null) __obj.updateDynamic("majorTicksInt")(majorTicksInt.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (minorTicks != null) __obj.updateDynamic("minorTicks")(minorTicks.asInstanceOf[js.Any])
    if (!js.isUndefined(needle)) __obj.updateDynamic("needle")(needle)
    if (needleEnd != null) __obj.updateDynamic("needleEnd")(needleEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(needleShadow)) __obj.updateDynamic("needleShadow")(needleShadow)
    if (needleSide != null) __obj.updateDynamic("needleSide")(needleSide)
    if (needleStart != null) __obj.updateDynamic("needleStart")(needleStart.asInstanceOf[js.Any])
    if (needleType != null) __obj.updateDynamic("needleType")(needleType)
    if (needleWidth != null) __obj.updateDynamic("needleWidth")(needleWidth.asInstanceOf[js.Any])
    if (numberSide != null) __obj.updateDynamic("numberSide")(numberSide)
    if (numbersMargin != null) __obj.updateDynamic("numbersMargin")(numbersMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeTicks)) __obj.updateDynamic("strokeTicks")(strokeTicks)
    if (tickSide != null) __obj.updateDynamic("tickSide")(tickSide)
    if (ticksPadding != null) __obj.updateDynamic("ticksPadding")(ticksPadding.asInstanceOf[js.Any])
    if (ticksWidth != null) __obj.updateDynamic("ticksWidth")(ticksWidth.asInstanceOf[js.Any])
    if (ticksWidthMinor != null) __obj.updateDynamic("ticksWidthMinor")(ticksWidthMinor.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[LinearGaugeOptions]
  }
}

