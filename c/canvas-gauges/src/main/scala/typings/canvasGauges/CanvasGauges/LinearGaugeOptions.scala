package typings.canvasGauges.CanvasGauges

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
    animationDuration: js.UndefOr[Double] = js.undefined,
    animationRule: String | AnimationRule = null,
    barBeginCircle: js.UndefOr[Double] = js.undefined,
    barLength: js.UndefOr[Double] = js.undefined,
    barProgress: js.UndefOr[Boolean] = js.undefined,
    barShadow: js.UndefOr[Double] = js.undefined,
    barStrokeWidth: js.UndefOr[Double] = js.undefined,
    barWidth: js.UndefOr[Double] = js.undefined,
    borderInnerWidth: js.UndefOr[Double] = js.undefined,
    borderMiddleWidth: js.UndefOr[Double] = js.undefined,
    borderOuterWidth: js.UndefOr[Double] = js.undefined,
    borderRadius: js.UndefOr[Double] = js.undefined,
    borderShadowWidth: js.UndefOr[Double] = js.undefined,
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
    fontNumbersSize: js.UndefOr[Double] = js.undefined,
    fontNumbersStyle: FontStyle = null,
    fontNumbersWeight: FontWeight = null,
    fontTitle: String = null,
    fontTitleSize: js.UndefOr[Double] = js.undefined,
    fontTitleStyle: FontStyle = null,
    fontTitleWeight: FontWeight = null,
    fontUnits: String = null,
    fontUnitsSize: js.UndefOr[Double] = js.undefined,
    fontUnitsStyle: FontStyle = null,
    fontUnitsWeight: FontWeight = null,
    fontValue: String = null,
    fontValueSize: js.UndefOr[Double] = js.undefined,
    fontValueStyle: FontStyle = null,
    fontValueWeight: FontWeight = null,
    height: js.UndefOr[Double] = js.undefined,
    highlights: js.Array[Highlight] = null,
    highlightsWidth: js.UndefOr[Double] = js.undefined,
    listeners: EventListeners = null,
    majorTicks: MajorTicks = null,
    majorTicksDec: js.UndefOr[Double] = js.undefined,
    majorTicksInt: js.UndefOr[Double] = js.undefined,
    maxValue: js.UndefOr[Double] = js.undefined,
    minValue: js.UndefOr[Double] = js.undefined,
    minorTicks: js.UndefOr[Double] = js.undefined,
    needle: js.UndefOr[Boolean] = js.undefined,
    needleEnd: js.UndefOr[Double] = js.undefined,
    needleShadow: js.UndefOr[Boolean] = js.undefined,
    needleSide: String = null,
    needleStart: js.UndefOr[Double] = js.undefined,
    needleType: String = null,
    needleWidth: js.UndefOr[Double] = js.undefined,
    numberSide: String = null,
    numbersMargin: js.UndefOr[Double] = js.undefined,
    strokeTicks: js.UndefOr[Boolean] = js.undefined,
    tickSide: String = null,
    ticksPadding: js.UndefOr[Double] = js.undefined,
    ticksWidth: js.UndefOr[Double] = js.undefined,
    ticksWidthMinor: js.UndefOr[Double] = js.undefined,
    title: String | Boolean = null,
    units: String | Boolean = null,
    value: js.UndefOr[Double] = js.undefined,
    valueBox: js.UndefOr[Boolean] = js.undefined,
    valueBoxBorderRadius: js.UndefOr[Double] = js.undefined,
    valueBoxStroke: js.UndefOr[Double] = js.undefined,
    valueBoxWidth: js.UndefOr[Double] = js.undefined,
    valueDec: js.UndefOr[Double] = js.undefined,
    valueInt: js.UndefOr[Double] = js.undefined,
    valueText: String = null,
    valueTextShadow: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): LinearGaugeOptions = {
    val __obj = js.Dynamic.literal(renderTo = renderTo.asInstanceOf[js.Any])
    if (!js.isUndefined(animateOnInit)) __obj.updateDynamic("animateOnInit")(animateOnInit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animatedValue)) __obj.updateDynamic("animatedValue")(animatedValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (animationRule != null) __obj.updateDynamic("animationRule")(animationRule.asInstanceOf[js.Any])
    if (!js.isUndefined(barBeginCircle)) __obj.updateDynamic("barBeginCircle")(barBeginCircle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(barLength)) __obj.updateDynamic("barLength")(barLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(barProgress)) __obj.updateDynamic("barProgress")(barProgress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(barShadow)) __obj.updateDynamic("barShadow")(barShadow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(barStrokeWidth)) __obj.updateDynamic("barStrokeWidth")(barStrokeWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(barWidth)) __obj.updateDynamic("barWidth")(barWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderInnerWidth)) __obj.updateDynamic("borderInnerWidth")(borderInnerWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderMiddleWidth)) __obj.updateDynamic("borderMiddleWidth")(borderMiddleWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderOuterWidth)) __obj.updateDynamic("borderOuterWidth")(borderOuterWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRadius)) __obj.updateDynamic("borderRadius")(borderRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderShadowWidth)) __obj.updateDynamic("borderShadowWidth")(borderShadowWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borders)) __obj.updateDynamic("borders")(borders.get.asInstanceOf[js.Any])
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
    if (!js.isUndefined(exactTicks)) __obj.updateDynamic("exactTicks")(exactTicks.get.asInstanceOf[js.Any])
    if (fontNumbers != null) __obj.updateDynamic("fontNumbers")(fontNumbers.asInstanceOf[js.Any])
    if (!js.isUndefined(fontNumbersSize)) __obj.updateDynamic("fontNumbersSize")(fontNumbersSize.get.asInstanceOf[js.Any])
    if (fontNumbersStyle != null) __obj.updateDynamic("fontNumbersStyle")(fontNumbersStyle.asInstanceOf[js.Any])
    if (fontNumbersWeight != null) __obj.updateDynamic("fontNumbersWeight")(fontNumbersWeight.asInstanceOf[js.Any])
    if (fontTitle != null) __obj.updateDynamic("fontTitle")(fontTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(fontTitleSize)) __obj.updateDynamic("fontTitleSize")(fontTitleSize.get.asInstanceOf[js.Any])
    if (fontTitleStyle != null) __obj.updateDynamic("fontTitleStyle")(fontTitleStyle.asInstanceOf[js.Any])
    if (fontTitleWeight != null) __obj.updateDynamic("fontTitleWeight")(fontTitleWeight.asInstanceOf[js.Any])
    if (fontUnits != null) __obj.updateDynamic("fontUnits")(fontUnits.asInstanceOf[js.Any])
    if (!js.isUndefined(fontUnitsSize)) __obj.updateDynamic("fontUnitsSize")(fontUnitsSize.get.asInstanceOf[js.Any])
    if (fontUnitsStyle != null) __obj.updateDynamic("fontUnitsStyle")(fontUnitsStyle.asInstanceOf[js.Any])
    if (fontUnitsWeight != null) __obj.updateDynamic("fontUnitsWeight")(fontUnitsWeight.asInstanceOf[js.Any])
    if (fontValue != null) __obj.updateDynamic("fontValue")(fontValue.asInstanceOf[js.Any])
    if (!js.isUndefined(fontValueSize)) __obj.updateDynamic("fontValueSize")(fontValueSize.get.asInstanceOf[js.Any])
    if (fontValueStyle != null) __obj.updateDynamic("fontValueStyle")(fontValueStyle.asInstanceOf[js.Any])
    if (fontValueWeight != null) __obj.updateDynamic("fontValueWeight")(fontValueWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (highlights != null) __obj.updateDynamic("highlights")(highlights.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightsWidth)) __obj.updateDynamic("highlightsWidth")(highlightsWidth.get.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (majorTicks != null) __obj.updateDynamic("majorTicks")(majorTicks.asInstanceOf[js.Any])
    if (!js.isUndefined(majorTicksDec)) __obj.updateDynamic("majorTicksDec")(majorTicksDec.get.asInstanceOf[js.Any])
    if (!js.isUndefined(majorTicksInt)) __obj.updateDynamic("majorTicksInt")(majorTicksInt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTicks)) __obj.updateDynamic("minorTicks")(minorTicks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(needle)) __obj.updateDynamic("needle")(needle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(needleEnd)) __obj.updateDynamic("needleEnd")(needleEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(needleShadow)) __obj.updateDynamic("needleShadow")(needleShadow.get.asInstanceOf[js.Any])
    if (needleSide != null) __obj.updateDynamic("needleSide")(needleSide.asInstanceOf[js.Any])
    if (!js.isUndefined(needleStart)) __obj.updateDynamic("needleStart")(needleStart.get.asInstanceOf[js.Any])
    if (needleType != null) __obj.updateDynamic("needleType")(needleType.asInstanceOf[js.Any])
    if (!js.isUndefined(needleWidth)) __obj.updateDynamic("needleWidth")(needleWidth.get.asInstanceOf[js.Any])
    if (numberSide != null) __obj.updateDynamic("numberSide")(numberSide.asInstanceOf[js.Any])
    if (!js.isUndefined(numbersMargin)) __obj.updateDynamic("numbersMargin")(numbersMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeTicks)) __obj.updateDynamic("strokeTicks")(strokeTicks.get.asInstanceOf[js.Any])
    if (tickSide != null) __obj.updateDynamic("tickSide")(tickSide.asInstanceOf[js.Any])
    if (!js.isUndefined(ticksPadding)) __obj.updateDynamic("ticksPadding")(ticksPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ticksWidth)) __obj.updateDynamic("ticksWidth")(ticksWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ticksWidthMinor)) __obj.updateDynamic("ticksWidthMinor")(ticksWidthMinor.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valueBox)) __obj.updateDynamic("valueBox")(valueBox.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valueBoxBorderRadius)) __obj.updateDynamic("valueBoxBorderRadius")(valueBoxBorderRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valueBoxStroke)) __obj.updateDynamic("valueBoxStroke")(valueBoxStroke.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valueBoxWidth)) __obj.updateDynamic("valueBoxWidth")(valueBoxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valueDec)) __obj.updateDynamic("valueDec")(valueDec.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valueInt)) __obj.updateDynamic("valueInt")(valueInt.get.asInstanceOf[js.Any])
    if (valueText != null) __obj.updateDynamic("valueText")(valueText.asInstanceOf[js.Any])
    if (!js.isUndefined(valueTextShadow)) __obj.updateDynamic("valueTextShadow")(valueTextShadow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGaugeOptions]
  }
}

