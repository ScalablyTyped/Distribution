package typings.canvasGauges.CanvasGauges

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericOptions extends js.Object {
  var animateOnInit: js.UndefOr[Boolean] = js.native
  var animatedValue: js.UndefOr[Boolean] = js.native
  var animation: js.UndefOr[Boolean] = js.native
  var animationDuration: js.UndefOr[Double] = js.native
  var animationRule: js.UndefOr[String | AnimationRule] = js.native
  var barProgress: js.UndefOr[Boolean] = js.native
  var barShadow: js.UndefOr[Double] = js.native
  var barStrokeWidth: js.UndefOr[Double] = js.native
  var barWidth: js.UndefOr[Double] = js.native
  var borderInnerWidth: js.UndefOr[Double] = js.native
  var borderMiddleWidth: js.UndefOr[Double] = js.native
  var borderOuterWidth: js.UndefOr[Double] = js.native
  var borderShadowWidth: js.UndefOr[Double] = js.native
  var borders: js.UndefOr[Boolean] = js.native
  var colorBar: js.UndefOr[String] = js.native
  var colorBarProgress: js.UndefOr[String] = js.native
  var colorBarShadow: js.UndefOr[String] = js.native
  var colorBarStroke: js.UndefOr[String] = js.native
  var colorBorderInner: js.UndefOr[String] = js.native
  var colorBorderInnerEnd: js.UndefOr[String] = js.native
  var colorBorderMiddle: js.UndefOr[String] = js.native
  var colorBorderMiddleEnd: js.UndefOr[String] = js.native
  var colorBorderOuter: js.UndefOr[String] = js.native
  var colorBorderOuterEnd: js.UndefOr[String] = js.native
  var colorBorderShadow: js.UndefOr[String] = js.native
  var colorMajorTicks: js.UndefOr[String] = js.native
  var colorMinorTicks: js.UndefOr[String] = js.native
  var colorNeedle: js.UndefOr[String] = js.native
  var colorNeedleEnd: js.UndefOr[String] = js.native
  var colorNeedleShadowDown: js.UndefOr[String] = js.native
  var colorNeedleShadowUp: js.UndefOr[String] = js.native
  var colorNumbers: js.UndefOr[String] = js.native
  var colorPlate: js.UndefOr[String] = js.native
  var colorPlateEnd: js.UndefOr[String] = js.native
  var colorTitle: js.UndefOr[String] = js.native
  var colorUnits: js.UndefOr[String] = js.native
  var colorValueBoxBackground: js.UndefOr[String] = js.native
  var colorValueBoxRect: js.UndefOr[String] = js.native
  var colorValueBoxRectEnd: js.UndefOr[String] = js.native
  var colorValueBoxShadow: js.UndefOr[String] = js.native
  var colorValueText: js.UndefOr[String] = js.native
  var colorValueTextShadow: js.UndefOr[String] = js.native
  var exactTicks: js.UndefOr[Boolean] = js.native
  var fontNumbers: js.UndefOr[String] = js.native
  var fontNumbersSize: js.UndefOr[Double] = js.native
  var fontNumbersStyle: js.UndefOr[FontStyle] = js.native
  var fontNumbersWeight: js.UndefOr[FontWeight] = js.native
  var fontTitle: js.UndefOr[String] = js.native
  var fontTitleSize: js.UndefOr[Double] = js.native
  var fontTitleStyle: js.UndefOr[FontStyle] = js.native
  var fontTitleWeight: js.UndefOr[FontWeight] = js.native
  var fontUnits: js.UndefOr[String] = js.native
  var fontUnitsSize: js.UndefOr[Double] = js.native
  var fontUnitsStyle: js.UndefOr[FontStyle] = js.native
  var fontUnitsWeight: js.UndefOr[FontWeight] = js.native
  var fontValue: js.UndefOr[String] = js.native
  var fontValueSize: js.UndefOr[Double] = js.native
  var fontValueStyle: js.UndefOr[FontStyle] = js.native
  var fontValueWeight: js.UndefOr[FontWeight] = js.native
  var height: js.UndefOr[Double] = js.native
  var highlights: js.UndefOr[js.Array[Highlight]] = js.native
  var highlightsWidth: js.UndefOr[Double] = js.native
  var listeners: js.UndefOr[EventListeners] = js.native
  var majorTicks: js.UndefOr[MajorTicks] = js.native
  var majorTicksDec: js.UndefOr[Double] = js.native
  var majorTicksInt: js.UndefOr[Double] = js.native
  var maxValue: js.UndefOr[Double] = js.native
  var minValue: js.UndefOr[Double] = js.native
  var minorTicks: js.UndefOr[Double] = js.native
  var needle: js.UndefOr[Boolean] = js.native
  var needleEnd: js.UndefOr[Double] = js.native
  var needleShadow: js.UndefOr[Boolean] = js.native
  var needleStart: js.UndefOr[Double] = js.native
  var needleType: js.UndefOr[String] = js.native
  var needleWidth: js.UndefOr[Double] = js.native
  var numbersMargin: js.UndefOr[Double] = js.native
  var renderTo: RenderTarget = js.native
  var strokeTicks: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String | Boolean] = js.native
  var units: js.UndefOr[String | Boolean] = js.native
  var value: js.UndefOr[Double] = js.native
  var valueBox: js.UndefOr[Boolean] = js.native
  var valueBoxBorderRadius: js.UndefOr[Double] = js.native
  var valueBoxStroke: js.UndefOr[Double] = js.native
  var valueBoxWidth: js.UndefOr[Double] = js.native
  var valueDec: js.UndefOr[Double] = js.native
  var valueInt: js.UndefOr[Double] = js.native
  var valueText: js.UndefOr[String] = js.native
  var valueTextShadow: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object GenericOptions {
  @scala.inline
  def apply(renderTo: RenderTarget): GenericOptions = {
    val __obj = js.Dynamic.literal(renderTo = renderTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericOptions]
  }
  @scala.inline
  implicit class GenericOptionsOps[Self <: GenericOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRenderTo(value: RenderTarget): Self = this.set("renderTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimateOnInit(value: Boolean): Self = this.set("animateOnInit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateOnInit: Self = this.set("animateOnInit", js.undefined)
    @scala.inline
    def setAnimatedValue(value: Boolean): Self = this.set("animatedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimatedValue: Self = this.set("animatedValue", js.undefined)
    @scala.inline
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setAnimationRuleFunction1(value: /* percent */ Double => Double): Self = this.set("animationRule", js.Any.fromFunction1(value))
    @scala.inline
    def setAnimationRule(value: String | AnimationRule): Self = this.set("animationRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationRule: Self = this.set("animationRule", js.undefined)
    @scala.inline
    def setBarProgress(value: Boolean): Self = this.set("barProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarProgress: Self = this.set("barProgress", js.undefined)
    @scala.inline
    def setBarShadow(value: Double): Self = this.set("barShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarShadow: Self = this.set("barShadow", js.undefined)
    @scala.inline
    def setBarStrokeWidth(value: Double): Self = this.set("barStrokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarStrokeWidth: Self = this.set("barStrokeWidth", js.undefined)
    @scala.inline
    def setBarWidth(value: Double): Self = this.set("barWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarWidth: Self = this.set("barWidth", js.undefined)
    @scala.inline
    def setBorderInnerWidth(value: Double): Self = this.set("borderInnerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderInnerWidth: Self = this.set("borderInnerWidth", js.undefined)
    @scala.inline
    def setBorderMiddleWidth(value: Double): Self = this.set("borderMiddleWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderMiddleWidth: Self = this.set("borderMiddleWidth", js.undefined)
    @scala.inline
    def setBorderOuterWidth(value: Double): Self = this.set("borderOuterWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderOuterWidth: Self = this.set("borderOuterWidth", js.undefined)
    @scala.inline
    def setBorderShadowWidth(value: Double): Self = this.set("borderShadowWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderShadowWidth: Self = this.set("borderShadowWidth", js.undefined)
    @scala.inline
    def setBorders(value: Boolean): Self = this.set("borders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorders: Self = this.set("borders", js.undefined)
    @scala.inline
    def setColorBar(value: String): Self = this.set("colorBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorBar: Self = this.set("colorBar", js.undefined)
    @scala.inline
    def setColorBarProgress(value: String): Self = this.set("colorBarProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorBarProgress: Self = this.set("colorBarProgress", js.undefined)
    @scala.inline
    def setColorBarShadow(value: String): Self = this.set("colorBarShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorBarShadow: Self = this.set("colorBarShadow", js.undefined)
    @scala.inline
    def setColorBarStroke(value: String): Self = this.set("colorBarStroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorBarStroke: Self = this.set("colorBarStroke", js.undefined)
    @scala.inline
    def setColorBorderInner(value: String): Self = this.set("colorBorderInner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorBorderInner: Self = this.set("colorBorderInner", js.undefined)
    @scala.inline
    def setColorBorderInnerEnd(value: String): Self = this.set("colorBorderInnerEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorBorderInnerEnd: Self = this.set("colorBorderInnerEnd", js.undefined)
    @scala.inline
    def setColorBorderMiddle(value: String): Self = this.set("colorBorderMiddle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorBorderMiddle: Self = this.set("colorBorderMiddle", js.undefined)
    @scala.inline
    def setColorBorderMiddleEnd(value: String): Self = this.set("colorBorderMiddleEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorBorderMiddleEnd: Self = this.set("colorBorderMiddleEnd", js.undefined)
    @scala.inline
    def setColorBorderOuter(value: String): Self = this.set("colorBorderOuter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorBorderOuter: Self = this.set("colorBorderOuter", js.undefined)
    @scala.inline
    def setColorBorderOuterEnd(value: String): Self = this.set("colorBorderOuterEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorBorderOuterEnd: Self = this.set("colorBorderOuterEnd", js.undefined)
    @scala.inline
    def setColorBorderShadow(value: String): Self = this.set("colorBorderShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorBorderShadow: Self = this.set("colorBorderShadow", js.undefined)
    @scala.inline
    def setColorMajorTicks(value: String): Self = this.set("colorMajorTicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorMajorTicks: Self = this.set("colorMajorTicks", js.undefined)
    @scala.inline
    def setColorMinorTicks(value: String): Self = this.set("colorMinorTicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorMinorTicks: Self = this.set("colorMinorTicks", js.undefined)
    @scala.inline
    def setColorNeedle(value: String): Self = this.set("colorNeedle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorNeedle: Self = this.set("colorNeedle", js.undefined)
    @scala.inline
    def setColorNeedleEnd(value: String): Self = this.set("colorNeedleEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorNeedleEnd: Self = this.set("colorNeedleEnd", js.undefined)
    @scala.inline
    def setColorNeedleShadowDown(value: String): Self = this.set("colorNeedleShadowDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorNeedleShadowDown: Self = this.set("colorNeedleShadowDown", js.undefined)
    @scala.inline
    def setColorNeedleShadowUp(value: String): Self = this.set("colorNeedleShadowUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorNeedleShadowUp: Self = this.set("colorNeedleShadowUp", js.undefined)
    @scala.inline
    def setColorNumbers(value: String): Self = this.set("colorNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorNumbers: Self = this.set("colorNumbers", js.undefined)
    @scala.inline
    def setColorPlate(value: String): Self = this.set("colorPlate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorPlate: Self = this.set("colorPlate", js.undefined)
    @scala.inline
    def setColorPlateEnd(value: String): Self = this.set("colorPlateEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorPlateEnd: Self = this.set("colorPlateEnd", js.undefined)
    @scala.inline
    def setColorTitle(value: String): Self = this.set("colorTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorTitle: Self = this.set("colorTitle", js.undefined)
    @scala.inline
    def setColorUnits(value: String): Self = this.set("colorUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorUnits: Self = this.set("colorUnits", js.undefined)
    @scala.inline
    def setColorValueBoxBackground(value: String): Self = this.set("colorValueBoxBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorValueBoxBackground: Self = this.set("colorValueBoxBackground", js.undefined)
    @scala.inline
    def setColorValueBoxRect(value: String): Self = this.set("colorValueBoxRect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorValueBoxRect: Self = this.set("colorValueBoxRect", js.undefined)
    @scala.inline
    def setColorValueBoxRectEnd(value: String): Self = this.set("colorValueBoxRectEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorValueBoxRectEnd: Self = this.set("colorValueBoxRectEnd", js.undefined)
    @scala.inline
    def setColorValueBoxShadow(value: String): Self = this.set("colorValueBoxShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorValueBoxShadow: Self = this.set("colorValueBoxShadow", js.undefined)
    @scala.inline
    def setColorValueText(value: String): Self = this.set("colorValueText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorValueText: Self = this.set("colorValueText", js.undefined)
    @scala.inline
    def setColorValueTextShadow(value: String): Self = this.set("colorValueTextShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorValueTextShadow: Self = this.set("colorValueTextShadow", js.undefined)
    @scala.inline
    def setExactTicks(value: Boolean): Self = this.set("exactTicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExactTicks: Self = this.set("exactTicks", js.undefined)
    @scala.inline
    def setFontNumbers(value: String): Self = this.set("fontNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontNumbers: Self = this.set("fontNumbers", js.undefined)
    @scala.inline
    def setFontNumbersSize(value: Double): Self = this.set("fontNumbersSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontNumbersSize: Self = this.set("fontNumbersSize", js.undefined)
    @scala.inline
    def setFontNumbersStyle(value: FontStyle): Self = this.set("fontNumbersStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontNumbersStyle: Self = this.set("fontNumbersStyle", js.undefined)
    @scala.inline
    def setFontNumbersWeight(value: FontWeight): Self = this.set("fontNumbersWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontNumbersWeight: Self = this.set("fontNumbersWeight", js.undefined)
    @scala.inline
    def setFontTitle(value: String): Self = this.set("fontTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontTitle: Self = this.set("fontTitle", js.undefined)
    @scala.inline
    def setFontTitleSize(value: Double): Self = this.set("fontTitleSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontTitleSize: Self = this.set("fontTitleSize", js.undefined)
    @scala.inline
    def setFontTitleStyle(value: FontStyle): Self = this.set("fontTitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontTitleStyle: Self = this.set("fontTitleStyle", js.undefined)
    @scala.inline
    def setFontTitleWeight(value: FontWeight): Self = this.set("fontTitleWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontTitleWeight: Self = this.set("fontTitleWeight", js.undefined)
    @scala.inline
    def setFontUnits(value: String): Self = this.set("fontUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontUnits: Self = this.set("fontUnits", js.undefined)
    @scala.inline
    def setFontUnitsSize(value: Double): Self = this.set("fontUnitsSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontUnitsSize: Self = this.set("fontUnitsSize", js.undefined)
    @scala.inline
    def setFontUnitsStyle(value: FontStyle): Self = this.set("fontUnitsStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontUnitsStyle: Self = this.set("fontUnitsStyle", js.undefined)
    @scala.inline
    def setFontUnitsWeight(value: FontWeight): Self = this.set("fontUnitsWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontUnitsWeight: Self = this.set("fontUnitsWeight", js.undefined)
    @scala.inline
    def setFontValue(value: String): Self = this.set("fontValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontValue: Self = this.set("fontValue", js.undefined)
    @scala.inline
    def setFontValueSize(value: Double): Self = this.set("fontValueSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontValueSize: Self = this.set("fontValueSize", js.undefined)
    @scala.inline
    def setFontValueStyle(value: FontStyle): Self = this.set("fontValueStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontValueStyle: Self = this.set("fontValueStyle", js.undefined)
    @scala.inline
    def setFontValueWeight(value: FontWeight): Self = this.set("fontValueWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontValueWeight: Self = this.set("fontValueWeight", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHighlightsVarargs(value: Highlight*): Self = this.set("highlights", js.Array(value :_*))
    @scala.inline
    def setHighlights(value: js.Array[Highlight]): Self = this.set("highlights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlights: Self = this.set("highlights", js.undefined)
    @scala.inline
    def setHighlightsWidth(value: Double): Self = this.set("highlightsWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightsWidth: Self = this.set("highlightsWidth", js.undefined)
    @scala.inline
    def setListeners(value: EventListeners): Self = this.set("listeners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListeners: Self = this.set("listeners", js.undefined)
    @scala.inline
    def setMajorTicksVarargs(value: (Double | String)*): Self = this.set("majorTicks", js.Array(value :_*))
    @scala.inline
    def setMajorTicks(value: MajorTicks): Self = this.set("majorTicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorTicks: Self = this.set("majorTicks", js.undefined)
    @scala.inline
    def setMajorTicksDec(value: Double): Self = this.set("majorTicksDec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorTicksDec: Self = this.set("majorTicksDec", js.undefined)
    @scala.inline
    def setMajorTicksInt(value: Double): Self = this.set("majorTicksInt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorTicksInt: Self = this.set("majorTicksInt", js.undefined)
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    @scala.inline
    def setMinorTicks(value: Double): Self = this.set("minorTicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorTicks: Self = this.set("minorTicks", js.undefined)
    @scala.inline
    def setNeedle(value: Boolean): Self = this.set("needle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedle: Self = this.set("needle", js.undefined)
    @scala.inline
    def setNeedleEnd(value: Double): Self = this.set("needleEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleEnd: Self = this.set("needleEnd", js.undefined)
    @scala.inline
    def setNeedleShadow(value: Boolean): Self = this.set("needleShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleShadow: Self = this.set("needleShadow", js.undefined)
    @scala.inline
    def setNeedleStart(value: Double): Self = this.set("needleStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleStart: Self = this.set("needleStart", js.undefined)
    @scala.inline
    def setNeedleType(value: String): Self = this.set("needleType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleType: Self = this.set("needleType", js.undefined)
    @scala.inline
    def setNeedleWidth(value: Double): Self = this.set("needleWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleWidth: Self = this.set("needleWidth", js.undefined)
    @scala.inline
    def setNumbersMargin(value: Double): Self = this.set("numbersMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumbersMargin: Self = this.set("numbersMargin", js.undefined)
    @scala.inline
    def setStrokeTicks(value: Boolean): Self = this.set("strokeTicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeTicks: Self = this.set("strokeTicks", js.undefined)
    @scala.inline
    def setTitle(value: String | Boolean): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUnits(value: String | Boolean): Self = this.set("units", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueBox(value: Boolean): Self = this.set("valueBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueBox: Self = this.set("valueBox", js.undefined)
    @scala.inline
    def setValueBoxBorderRadius(value: Double): Self = this.set("valueBoxBorderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueBoxBorderRadius: Self = this.set("valueBoxBorderRadius", js.undefined)
    @scala.inline
    def setValueBoxStroke(value: Double): Self = this.set("valueBoxStroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueBoxStroke: Self = this.set("valueBoxStroke", js.undefined)
    @scala.inline
    def setValueBoxWidth(value: Double): Self = this.set("valueBoxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueBoxWidth: Self = this.set("valueBoxWidth", js.undefined)
    @scala.inline
    def setValueDec(value: Double): Self = this.set("valueDec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueDec: Self = this.set("valueDec", js.undefined)
    @scala.inline
    def setValueInt(value: Double): Self = this.set("valueInt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueInt: Self = this.set("valueInt", js.undefined)
    @scala.inline
    def setValueText(value: String): Self = this.set("valueText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueText: Self = this.set("valueText", js.undefined)
    @scala.inline
    def setValueTextShadow(value: Boolean): Self = this.set("valueTextShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueTextShadow: Self = this.set("valueTextShadow", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

