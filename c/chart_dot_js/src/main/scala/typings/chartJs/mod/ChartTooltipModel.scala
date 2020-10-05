package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartTooltipModel extends js.Object {
  var _bodyAlign: String = js.native
  var _bodyFontFamily: String = js.native
  var _bodyFontStyle: String = js.native
  var _footerAlign: String = js.native
  var _footerFontFamily: String = js.native
  var _footerFontStyle: String = js.native
  var _titleAlign: String = js.native
  var _titleFontFamily: String = js.native
  var _titleFontStyle: String = js.native
  var afterBody: js.Array[String] = js.native
  var backgroundColor: String = js.native
  var beforeBody: js.Array[String] = js.native
  var body: js.Array[ChartTooltipModelBody] = js.native
  var bodyFontColor: String = js.native
  var bodyFontSize: Double = js.native
  var bodySpacing: Double = js.native
  var borderColor: String = js.native
  var borderWidth: Double = js.native
  var caretPadding: Double = js.native
  var caretSize: Double = js.native
  var caretX: Double = js.native
  var caretY: Double = js.native
  var cornerRadius: Double = js.native
  var dataPoints: js.Array[ChartTooltipItem] = js.native
  var displayColors: Boolean = js.native
  var footer: js.Array[String] = js.native
  var footerFontColor: String = js.native
  var footerFontSize: Double = js.native
  var footerMarginTop: Double = js.native
  var footerSpacing: Double = js.native
  var height: Double = js.native
  var labelColors: js.Array[String] = js.native
  var labelTextColors: js.Array[String] = js.native
  var legendColorBackground: String = js.native
  var opacity: Double = js.native
  var title: js.Array[String] = js.native
  var titleFontColor: String = js.native
  var titleFontSize: Double = js.native
  var titleMarginBottom: Double = js.native
  var titleSpacing: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var xAlign: String = js.native
  var xPadding: Double = js.native
  var y: Double = js.native
  var yAlign: String = js.native
  var yPadding: Double = js.native
}

object ChartTooltipModel {
  @scala.inline
  def apply(
    _bodyAlign: String,
    _bodyFontFamily: String,
    _bodyFontStyle: String,
    _footerAlign: String,
    _footerFontFamily: String,
    _footerFontStyle: String,
    _titleAlign: String,
    _titleFontFamily: String,
    _titleFontStyle: String,
    afterBody: js.Array[String],
    backgroundColor: String,
    beforeBody: js.Array[String],
    body: js.Array[ChartTooltipModelBody],
    bodyFontColor: String,
    bodyFontSize: Double,
    bodySpacing: Double,
    borderColor: String,
    borderWidth: Double,
    caretPadding: Double,
    caretSize: Double,
    caretX: Double,
    caretY: Double,
    cornerRadius: Double,
    dataPoints: js.Array[ChartTooltipItem],
    displayColors: Boolean,
    footer: js.Array[String],
    footerFontColor: String,
    footerFontSize: Double,
    footerMarginTop: Double,
    footerSpacing: Double,
    height: Double,
    labelColors: js.Array[String],
    labelTextColors: js.Array[String],
    legendColorBackground: String,
    opacity: Double,
    title: js.Array[String],
    titleFontColor: String,
    titleFontSize: Double,
    titleMarginBottom: Double,
    titleSpacing: Double,
    width: Double,
    x: Double,
    xAlign: String,
    xPadding: Double,
    y: Double,
    yAlign: String,
    yPadding: Double
  ): ChartTooltipModel = {
    val __obj = js.Dynamic.literal(_bodyAlign = _bodyAlign.asInstanceOf[js.Any], _bodyFontFamily = _bodyFontFamily.asInstanceOf[js.Any], _bodyFontStyle = _bodyFontStyle.asInstanceOf[js.Any], _footerAlign = _footerAlign.asInstanceOf[js.Any], _footerFontFamily = _footerFontFamily.asInstanceOf[js.Any], _footerFontStyle = _footerFontStyle.asInstanceOf[js.Any], _titleAlign = _titleAlign.asInstanceOf[js.Any], _titleFontFamily = _titleFontFamily.asInstanceOf[js.Any], _titleFontStyle = _titleFontStyle.asInstanceOf[js.Any], afterBody = afterBody.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], beforeBody = beforeBody.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], bodyFontColor = bodyFontColor.asInstanceOf[js.Any], bodyFontSize = bodyFontSize.asInstanceOf[js.Any], bodySpacing = bodySpacing.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], caretPadding = caretPadding.asInstanceOf[js.Any], caretSize = caretSize.asInstanceOf[js.Any], caretX = caretX.asInstanceOf[js.Any], caretY = caretY.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], dataPoints = dataPoints.asInstanceOf[js.Any], displayColors = displayColors.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], footerFontColor = footerFontColor.asInstanceOf[js.Any], footerFontSize = footerFontSize.asInstanceOf[js.Any], footerMarginTop = footerMarginTop.asInstanceOf[js.Any], footerSpacing = footerSpacing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], labelColors = labelColors.asInstanceOf[js.Any], labelTextColors = labelTextColors.asInstanceOf[js.Any], legendColorBackground = legendColorBackground.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleFontColor = titleFontColor.asInstanceOf[js.Any], titleFontSize = titleFontSize.asInstanceOf[js.Any], titleMarginBottom = titleMarginBottom.asInstanceOf[js.Any], titleSpacing = titleSpacing.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xAlign = xAlign.asInstanceOf[js.Any], xPadding = xPadding.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yAlign = yAlign.asInstanceOf[js.Any], yPadding = yPadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTooltipModel]
  }
  @scala.inline
  implicit class ChartTooltipModelOps[Self <: ChartTooltipModel] (val x: Self) extends AnyVal {
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
    def set_bodyAlign(value: String): Self = this.set("_bodyAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def set_bodyFontFamily(value: String): Self = this.set("_bodyFontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def set_bodyFontStyle(value: String): Self = this.set("_bodyFontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def set_footerAlign(value: String): Self = this.set("_footerAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def set_footerFontFamily(value: String): Self = this.set("_footerFontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def set_footerFontStyle(value: String): Self = this.set("_footerFontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def set_titleAlign(value: String): Self = this.set("_titleAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def set_titleFontFamily(value: String): Self = this.set("_titleFontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def set_titleFontStyle(value: String): Self = this.set("_titleFontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setAfterBodyVarargs(value: String*): Self = this.set("afterBody", js.Array(value :_*))
    @scala.inline
    def setAfterBody(value: js.Array[String]): Self = this.set("afterBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeBodyVarargs(value: String*): Self = this.set("beforeBody", js.Array(value :_*))
    @scala.inline
    def setBeforeBody(value: js.Array[String]): Self = this.set("beforeBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyVarargs(value: ChartTooltipModelBody*): Self = this.set("body", js.Array(value :_*))
    @scala.inline
    def setBody(value: js.Array[ChartTooltipModelBody]): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyFontColor(value: String): Self = this.set("bodyFontColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyFontSize(value: Double): Self = this.set("bodyFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodySpacing(value: Double): Self = this.set("bodySpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaretPadding(value: Double): Self = this.set("caretPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaretSize(value: Double): Self = this.set("caretSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaretX(value: Double): Self = this.set("caretX", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaretY(value: Double): Self = this.set("caretY", value.asInstanceOf[js.Any])
    @scala.inline
    def setCornerRadius(value: Double): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataPointsVarargs(value: ChartTooltipItem*): Self = this.set("dataPoints", js.Array(value :_*))
    @scala.inline
    def setDataPoints(value: js.Array[ChartTooltipItem]): Self = this.set("dataPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayColors(value: Boolean): Self = this.set("displayColors", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooterVarargs(value: String*): Self = this.set("footer", js.Array(value :_*))
    @scala.inline
    def setFooter(value: js.Array[String]): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooterFontColor(value: String): Self = this.set("footerFontColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooterFontSize(value: Double): Self = this.set("footerFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooterMarginTop(value: Double): Self = this.set("footerMarginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooterSpacing(value: Double): Self = this.set("footerSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelColorsVarargs(value: String*): Self = this.set("labelColors", js.Array(value :_*))
    @scala.inline
    def setLabelColors(value: js.Array[String]): Self = this.set("labelColors", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelTextColorsVarargs(value: String*): Self = this.set("labelTextColors", js.Array(value :_*))
    @scala.inline
    def setLabelTextColors(value: js.Array[String]): Self = this.set("labelTextColors", value.asInstanceOf[js.Any])
    @scala.inline
    def setLegendColorBackground(value: String): Self = this.set("legendColorBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleVarargs(value: String*): Self = this.set("title", js.Array(value :_*))
    @scala.inline
    def setTitle(value: js.Array[String]): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleFontColor(value: String): Self = this.set("titleFontColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleFontSize(value: Double): Self = this.set("titleFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleMarginBottom(value: Double): Self = this.set("titleMarginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleSpacing(value: Double): Self = this.set("titleSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setXAlign(value: String): Self = this.set("xAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def setXPadding(value: Double): Self = this.set("xPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setYAlign(value: String): Self = this.set("yAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def setYPadding(value: Double): Self = this.set("yPadding", value.asInstanceOf[js.Any])
  }
  
}

