package typings.canvasDashGauges.CanvasGauges

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGaugeOptions extends GenericOptions {
  var barBeginCircle: js.UndefOr[Double] = js.undefined
  var barLength: js.UndefOr[Double] = js.undefined
  var borderRadius: js.UndefOr[Double] = js.undefined
  var colorBarEnd: js.UndefOr[String] = js.undefined
  var colorBarProgressEnd: js.UndefOr[String] = js.undefined
  var needleSide: js.UndefOr[String] = js.undefined
  var numberSide: js.UndefOr[String] = js.undefined
  var tickSide: js.UndefOr[String] = js.undefined
  var ticksPadding: js.UndefOr[Double] = js.undefined
  var ticksWidth: js.UndefOr[Double] = js.undefined
  var ticksWidthMinor: js.UndefOr[Double] = js.undefined
}

object LinearGaugeOptions {
  @scala.inline
  def apply(
    renderTo: RenderTarget,
    animateOnInit: js.UndefOr[Boolean] = js.undefined,
    animatedValue: js.UndefOr[Boolean] = js.undefined,
    animation: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationRule: String | AnimationRule = null,
    barBeginCircle: Int | Double = null,
    barLength: Int | Double = null,
    barProgress: js.UndefOr[Boolean] = js.undefined,
    barShadow: Int | Double = null,
    barStrokeWidth: Int | Double = null,
    barWidth: Int | Double = null,
    borderInnerWidth: Int | Double = null,
    borderMiddleWidth: Int | Double = null,
    borderOuterWidth: Int | Double = null,
    borderRadius: Int | Double = null,
    borderShadowWidth: Int | Double = null,
    borders: js.UndefOr[Boolean] = js.undefined,
    colorBar: String = null,
    colorBarEnd: String = null,
    colorBarProgress: String = null,
    colorBarProgressEnd: String = null,
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
    needleSide: String = null,
    needleStart: Int | Double = null,
    needleType: String = null,
    needleWidth: Int | Double = null,
    numberSide: String = null,
    numbersMargin: Int | Double = null,
    strokeTicks: js.UndefOr[Boolean] = js.undefined,
    tickSide: String = null,
    ticksPadding: Int | Double = null,
    ticksWidth: Int | Double = null,
    ticksWidthMinor: Int | Double = null,
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
  ): LinearGaugeOptions = {
    val __obj = js.Dynamic.literal(renderTo = renderTo.asInstanceOf[js.Any])
    if (!js.isUndefined(animateOnInit)) __obj.updateDynamic("animateOnInit")(animateOnInit.asInstanceOf[js.Any])
    if (!js.isUndefined(animatedValue)) __obj.updateDynamic("animatedValue")(animatedValue.asInstanceOf[js.Any])
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationRule != null) __obj.updateDynamic("animationRule")(animationRule.asInstanceOf[js.Any])
    if (barBeginCircle != null) __obj.updateDynamic("barBeginCircle")(barBeginCircle.asInstanceOf[js.Any])
    if (barLength != null) __obj.updateDynamic("barLength")(barLength.asInstanceOf[js.Any])
    if (!js.isUndefined(barProgress)) __obj.updateDynamic("barProgress")(barProgress.asInstanceOf[js.Any])
    if (barShadow != null) __obj.updateDynamic("barShadow")(barShadow.asInstanceOf[js.Any])
    if (barStrokeWidth != null) __obj.updateDynamic("barStrokeWidth")(barStrokeWidth.asInstanceOf[js.Any])
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (borderInnerWidth != null) __obj.updateDynamic("borderInnerWidth")(borderInnerWidth.asInstanceOf[js.Any])
    if (borderMiddleWidth != null) __obj.updateDynamic("borderMiddleWidth")(borderMiddleWidth.asInstanceOf[js.Any])
    if (borderOuterWidth != null) __obj.updateDynamic("borderOuterWidth")(borderOuterWidth.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderShadowWidth != null) __obj.updateDynamic("borderShadowWidth")(borderShadowWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(borders)) __obj.updateDynamic("borders")(borders.asInstanceOf[js.Any])
    if (colorBar != null) __obj.updateDynamic("colorBar")(colorBar.asInstanceOf[js.Any])
    if (colorBarEnd != null) __obj.updateDynamic("colorBarEnd")(colorBarEnd.asInstanceOf[js.Any])
    if (colorBarProgress != null) __obj.updateDynamic("colorBarProgress")(colorBarProgress.asInstanceOf[js.Any])
    if (colorBarProgressEnd != null) __obj.updateDynamic("colorBarProgressEnd")(colorBarProgressEnd.asInstanceOf[js.Any])
    if (colorBarShadow != null) __obj.updateDynamic("colorBarShadow")(colorBarShadow.asInstanceOf[js.Any])
    if (colorBarStroke != null) __obj.updateDynamic("colorBarStroke")(colorBarStroke.asInstanceOf[js.Any])
    if (colorBorderInner != null) __obj.updateDynamic("colorBorderInner")(colorBorderInner.asInstanceOf[js.Any])
    if (colorBorderInnerEnd != null) __obj.updateDynamic("colorBorderInnerEnd")(colorBorderInnerEnd.asInstanceOf[js.Any])
    if (colorBorderMiddle != null) __obj.updateDynamic("colorBorderMiddle")(colorBorderMiddle.asInstanceOf[js.Any])
    if (colorBorderMiddleEnd != null) __obj.updateDynamic("colorBorderMiddleEnd")(colorBorderMiddleEnd.asInstanceOf[js.Any])
    if (colorBorderOuter != null) __obj.updateDynamic("colorBorderOuter")(colorBorderOuter.asInstanceOf[js.Any])
    if (colorBorderOuterEnd != null) __obj.updateDynamic("colorBorderOuterEnd")(colorBorderOuterEnd.asInstanceOf[js.Any])
    if (colorBorderShadow != null) __obj.updateDynamic("colorBorderShadow")(colorBorderShadow.asInstanceOf[js.Any])
    if (colorMajorTicks != null) __obj.updateDynamic("colorMajorTicks")(colorMajorTicks.asInstanceOf[js.Any])
    if (colorMinorTicks != null) __obj.updateDynamic("colorMinorTicks")(colorMinorTicks.asInstanceOf[js.Any])
    if (colorNeedle != null) __obj.updateDynamic("colorNeedle")(colorNeedle.asInstanceOf[js.Any])
    if (colorNeedleEnd != null) __obj.updateDynamic("colorNeedleEnd")(colorNeedleEnd.asInstanceOf[js.Any])
    if (colorNeedleShadowDown != null) __obj.updateDynamic("colorNeedleShadowDown")(colorNeedleShadowDown.asInstanceOf[js.Any])
    if (colorNeedleShadowUp != null) __obj.updateDynamic("colorNeedleShadowUp")(colorNeedleShadowUp.asInstanceOf[js.Any])
    if (colorNumbers != null) __obj.updateDynamic("colorNumbers")(colorNumbers.asInstanceOf[js.Any])
    if (colorPlate != null) __obj.updateDynamic("colorPlate")(colorPlate.asInstanceOf[js.Any])
    if (colorPlateEnd != null) __obj.updateDynamic("colorPlateEnd")(colorPlateEnd.asInstanceOf[js.Any])
    if (colorTitle != null) __obj.updateDynamic("colorTitle")(colorTitle.asInstanceOf[js.Any])
    if (colorUnits != null) __obj.updateDynamic("colorUnits")(colorUnits.asInstanceOf[js.Any])
    if (colorValueBoxBackground != null) __obj.updateDynamic("colorValueBoxBackground")(colorValueBoxBackground.asInstanceOf[js.Any])
    if (colorValueBoxRect != null) __obj.updateDynamic("colorValueBoxRect")(colorValueBoxRect.asInstanceOf[js.Any])
    if (colorValueBoxRectEnd != null) __obj.updateDynamic("colorValueBoxRectEnd")(colorValueBoxRectEnd.asInstanceOf[js.Any])
    if (colorValueBoxShadow != null) __obj.updateDynamic("colorValueBoxShadow")(colorValueBoxShadow.asInstanceOf[js.Any])
    if (colorValueText != null) __obj.updateDynamic("colorValueText")(colorValueText.asInstanceOf[js.Any])
    if (colorValueTextShadow != null) __obj.updateDynamic("colorValueTextShadow")(colorValueTextShadow.asInstanceOf[js.Any])
    if (!js.isUndefined(exactTicks)) __obj.updateDynamic("exactTicks")(exactTicks.asInstanceOf[js.Any])
    if (fontNumbers != null) __obj.updateDynamic("fontNumbers")(fontNumbers.asInstanceOf[js.Any])
    if (fontNumbersSize != null) __obj.updateDynamic("fontNumbersSize")(fontNumbersSize.asInstanceOf[js.Any])
    if (fontNumbersStyle != null) __obj.updateDynamic("fontNumbersStyle")(fontNumbersStyle.asInstanceOf[js.Any])
    if (fontNumbersWeight != null) __obj.updateDynamic("fontNumbersWeight")(fontNumbersWeight.asInstanceOf[js.Any])
    if (fontTitle != null) __obj.updateDynamic("fontTitle")(fontTitle.asInstanceOf[js.Any])
    if (fontTitleSize != null) __obj.updateDynamic("fontTitleSize")(fontTitleSize.asInstanceOf[js.Any])
    if (fontTitleStyle != null) __obj.updateDynamic("fontTitleStyle")(fontTitleStyle.asInstanceOf[js.Any])
    if (fontTitleWeight != null) __obj.updateDynamic("fontTitleWeight")(fontTitleWeight.asInstanceOf[js.Any])
    if (fontUnits != null) __obj.updateDynamic("fontUnits")(fontUnits.asInstanceOf[js.Any])
    if (fontUnitsSize != null) __obj.updateDynamic("fontUnitsSize")(fontUnitsSize.asInstanceOf[js.Any])
    if (fontUnitsStyle != null) __obj.updateDynamic("fontUnitsStyle")(fontUnitsStyle.asInstanceOf[js.Any])
    if (fontUnitsWeight != null) __obj.updateDynamic("fontUnitsWeight")(fontUnitsWeight.asInstanceOf[js.Any])
    if (fontValue != null) __obj.updateDynamic("fontValue")(fontValue.asInstanceOf[js.Any])
    if (fontValueSize != null) __obj.updateDynamic("fontValueSize")(fontValueSize.asInstanceOf[js.Any])
    if (fontValueStyle != null) __obj.updateDynamic("fontValueStyle")(fontValueStyle.asInstanceOf[js.Any])
    if (fontValueWeight != null) __obj.updateDynamic("fontValueWeight")(fontValueWeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (highlights != null) __obj.updateDynamic("highlights")(highlights.asInstanceOf[js.Any])
    if (highlightsWidth != null) __obj.updateDynamic("highlightsWidth")(highlightsWidth.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (majorTicks != null) __obj.updateDynamic("majorTicks")(majorTicks.asInstanceOf[js.Any])
    if (majorTicksDec != null) __obj.updateDynamic("majorTicksDec")(majorTicksDec.asInstanceOf[js.Any])
    if (majorTicksInt != null) __obj.updateDynamic("majorTicksInt")(majorTicksInt.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (minorTicks != null) __obj.updateDynamic("minorTicks")(minorTicks.asInstanceOf[js.Any])
    if (!js.isUndefined(needle)) __obj.updateDynamic("needle")(needle.asInstanceOf[js.Any])
    if (needleEnd != null) __obj.updateDynamic("needleEnd")(needleEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(needleShadow)) __obj.updateDynamic("needleShadow")(needleShadow.asInstanceOf[js.Any])
    if (needleSide != null) __obj.updateDynamic("needleSide")(needleSide.asInstanceOf[js.Any])
    if (needleStart != null) __obj.updateDynamic("needleStart")(needleStart.asInstanceOf[js.Any])
    if (needleType != null) __obj.updateDynamic("needleType")(needleType.asInstanceOf[js.Any])
    if (needleWidth != null) __obj.updateDynamic("needleWidth")(needleWidth.asInstanceOf[js.Any])
    if (numberSide != null) __obj.updateDynamic("numberSide")(numberSide.asInstanceOf[js.Any])
    if (numbersMargin != null) __obj.updateDynamic("numbersMargin")(numbersMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeTicks)) __obj.updateDynamic("strokeTicks")(strokeTicks.asInstanceOf[js.Any])
    if (tickSide != null) __obj.updateDynamic("tickSide")(tickSide.asInstanceOf[js.Any])
    if (ticksPadding != null) __obj.updateDynamic("ticksPadding")(ticksPadding.asInstanceOf[js.Any])
    if (ticksWidth != null) __obj.updateDynamic("ticksWidth")(ticksWidth.asInstanceOf[js.Any])
    if (ticksWidthMinor != null) __obj.updateDynamic("ticksWidthMinor")(ticksWidthMinor.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(valueBox)) __obj.updateDynamic("valueBox")(valueBox.asInstanceOf[js.Any])
    if (valueBoxBorderRadius != null) __obj.updateDynamic("valueBoxBorderRadius")(valueBoxBorderRadius.asInstanceOf[js.Any])
    if (valueBoxStroke != null) __obj.updateDynamic("valueBoxStroke")(valueBoxStroke.asInstanceOf[js.Any])
    if (valueBoxWidth != null) __obj.updateDynamic("valueBoxWidth")(valueBoxWidth.asInstanceOf[js.Any])
    if (valueDec != null) __obj.updateDynamic("valueDec")(valueDec.asInstanceOf[js.Any])
    if (valueInt != null) __obj.updateDynamic("valueInt")(valueInt.asInstanceOf[js.Any])
    if (valueText != null) __obj.updateDynamic("valueText")(valueText.asInstanceOf[js.Any])
    if (!js.isUndefined(valueTextShadow)) __obj.updateDynamic("valueTextShadow")(valueTextShadow.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGaugeOptions]
  }
}

