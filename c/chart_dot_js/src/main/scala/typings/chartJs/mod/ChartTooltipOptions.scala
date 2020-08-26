package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartTooltipOptions extends js.Object {
  var backgroundColor: js.UndefOr[ChartColor] = js.native
  var bodyAlign: js.UndefOr[TextAlignment] = js.native
  var bodyFontColor: js.UndefOr[ChartColor] = js.native
  var bodyFontFamily: js.UndefOr[String] = js.native
  var bodyFontSize: js.UndefOr[Double] = js.native
  var bodyFontStyle: js.UndefOr[String] = js.native
  var bodySpacing: js.UndefOr[Double] = js.native
  var borderColor: js.UndefOr[ChartColor] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var callbacks: js.UndefOr[ChartTooltipCallback] = js.native
  var caretPadding: js.UndefOr[Double] = js.native
  var caretSize: js.UndefOr[Double] = js.native
  var cornerRadius: js.UndefOr[Double] = js.native
  var custom: js.UndefOr[js.Function1[/* tooltipModel */ ChartTooltipModel, Unit]] = js.native
  var displayColors: js.UndefOr[Boolean] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[js.Function2[/* item */ ChartTooltipItem, /* data */ ChartData, Boolean]] = js.native
  var footerAlign: js.UndefOr[TextAlignment] = js.native
  var footerFontColor: js.UndefOr[ChartColor] = js.native
  var footerFontFamily: js.UndefOr[String] = js.native
  var footerFontSize: js.UndefOr[Double] = js.native
  var footerFontStyle: js.UndefOr[String] = js.native
  var footerMarginTop: js.UndefOr[Double] = js.native
  var footerSpacing: js.UndefOr[Double] = js.native
  var intersect: js.UndefOr[Boolean] = js.native
  var itemSort: js.UndefOr[
    js.Function3[
      /* itemA */ ChartTooltipItem, 
      /* itemB */ ChartTooltipItem, 
      /* data */ js.UndefOr[ChartData], 
      Double
    ]
  ] = js.native
  var mode: js.UndefOr[InteractionMode] = js.native
  var multiKeyBackground: js.UndefOr[String] = js.native
  var position: js.UndefOr[String] = js.native
  var titleAlign: js.UndefOr[TextAlignment] = js.native
  var titleFontColor: js.UndefOr[ChartColor] = js.native
  var titleFontFamily: js.UndefOr[String] = js.native
  var titleFontSize: js.UndefOr[Double] = js.native
  var titleFontStyle: js.UndefOr[String] = js.native
  var titleMarginBottom: js.UndefOr[Double] = js.native
  var titleSpacing: js.UndefOr[Double] = js.native
  var xPadding: js.UndefOr[Double] = js.native
  var yPadding: js.UndefOr[Double] = js.native
}

object ChartTooltipOptions {
  @scala.inline
  def apply(): ChartTooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTooltipOptions]
  }
  @scala.inline
  implicit class ChartTooltipOptionsOps[Self <: ChartTooltipOptions] (val x: Self) extends AnyVal {
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
    def setBackgroundColorVarargs(value: String*): Self = this.set("backgroundColor", js.Array(value :_*))
    @scala.inline
    def setBackgroundColor(value: ChartColor): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBodyAlign(value: TextAlignment): Self = this.set("bodyAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyAlign: Self = this.set("bodyAlign", js.undefined)
    @scala.inline
    def setBodyFontColorVarargs(value: String*): Self = this.set("bodyFontColor", js.Array(value :_*))
    @scala.inline
    def setBodyFontColor(value: ChartColor): Self = this.set("bodyFontColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyFontColor: Self = this.set("bodyFontColor", js.undefined)
    @scala.inline
    def setBodyFontFamily(value: String): Self = this.set("bodyFontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyFontFamily: Self = this.set("bodyFontFamily", js.undefined)
    @scala.inline
    def setBodyFontSize(value: Double): Self = this.set("bodyFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyFontSize: Self = this.set("bodyFontSize", js.undefined)
    @scala.inline
    def setBodyFontStyle(value: String): Self = this.set("bodyFontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyFontStyle: Self = this.set("bodyFontStyle", js.undefined)
    @scala.inline
    def setBodySpacing(value: Double): Self = this.set("bodySpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodySpacing: Self = this.set("bodySpacing", js.undefined)
    @scala.inline
    def setBorderColorVarargs(value: String*): Self = this.set("borderColor", js.Array(value :_*))
    @scala.inline
    def setBorderColor(value: ChartColor): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setCallbacks(value: ChartTooltipCallback): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbacks: Self = this.set("callbacks", js.undefined)
    @scala.inline
    def setCaretPadding(value: Double): Self = this.set("caretPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaretPadding: Self = this.set("caretPadding", js.undefined)
    @scala.inline
    def setCaretSize(value: Double): Self = this.set("caretSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaretSize: Self = this.set("caretSize", js.undefined)
    @scala.inline
    def setCornerRadius(value: Double): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    @scala.inline
    def setCustom(value: /* tooltipModel */ ChartTooltipModel => Unit): Self = this.set("custom", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setDisplayColors(value: Boolean): Self = this.set("displayColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayColors: Self = this.set("displayColors", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFilter(value: (/* item */ ChartTooltipItem, /* data */ ChartData) => Boolean): Self = this.set("filter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFooterAlign(value: TextAlignment): Self = this.set("footerAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterAlign: Self = this.set("footerAlign", js.undefined)
    @scala.inline
    def setFooterFontColorVarargs(value: String*): Self = this.set("footerFontColor", js.Array(value :_*))
    @scala.inline
    def setFooterFontColor(value: ChartColor): Self = this.set("footerFontColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterFontColor: Self = this.set("footerFontColor", js.undefined)
    @scala.inline
    def setFooterFontFamily(value: String): Self = this.set("footerFontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterFontFamily: Self = this.set("footerFontFamily", js.undefined)
    @scala.inline
    def setFooterFontSize(value: Double): Self = this.set("footerFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterFontSize: Self = this.set("footerFontSize", js.undefined)
    @scala.inline
    def setFooterFontStyle(value: String): Self = this.set("footerFontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterFontStyle: Self = this.set("footerFontStyle", js.undefined)
    @scala.inline
    def setFooterMarginTop(value: Double): Self = this.set("footerMarginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterMarginTop: Self = this.set("footerMarginTop", js.undefined)
    @scala.inline
    def setFooterSpacing(value: Double): Self = this.set("footerSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterSpacing: Self = this.set("footerSpacing", js.undefined)
    @scala.inline
    def setIntersect(value: Boolean): Self = this.set("intersect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntersect: Self = this.set("intersect", js.undefined)
    @scala.inline
    def setItemSort(
      value: (/* itemA */ ChartTooltipItem, /* itemB */ ChartTooltipItem, /* data */ js.UndefOr[ChartData]) => Double
    ): Self = this.set("itemSort", js.Any.fromFunction3(value))
    @scala.inline
    def deleteItemSort: Self = this.set("itemSort", js.undefined)
    @scala.inline
    def setMode(value: InteractionMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setMultiKeyBackground(value: String): Self = this.set("multiKeyBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiKeyBackground: Self = this.set("multiKeyBackground", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setTitleAlign(value: TextAlignment): Self = this.set("titleAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleAlign: Self = this.set("titleAlign", js.undefined)
    @scala.inline
    def setTitleFontColorVarargs(value: String*): Self = this.set("titleFontColor", js.Array(value :_*))
    @scala.inline
    def setTitleFontColor(value: ChartColor): Self = this.set("titleFontColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleFontColor: Self = this.set("titleFontColor", js.undefined)
    @scala.inline
    def setTitleFontFamily(value: String): Self = this.set("titleFontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleFontFamily: Self = this.set("titleFontFamily", js.undefined)
    @scala.inline
    def setTitleFontSize(value: Double): Self = this.set("titleFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleFontSize: Self = this.set("titleFontSize", js.undefined)
    @scala.inline
    def setTitleFontStyle(value: String): Self = this.set("titleFontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleFontStyle: Self = this.set("titleFontStyle", js.undefined)
    @scala.inline
    def setTitleMarginBottom(value: Double): Self = this.set("titleMarginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleMarginBottom: Self = this.set("titleMarginBottom", js.undefined)
    @scala.inline
    def setTitleSpacing(value: Double): Self = this.set("titleSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleSpacing: Self = this.set("titleSpacing", js.undefined)
    @scala.inline
    def setXPadding(value: Double): Self = this.set("xPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXPadding: Self = this.set("xPadding", js.undefined)
    @scala.inline
    def setYPadding(value: Double): Self = this.set("yPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYPadding: Self = this.set("yPadding", js.undefined)
  }
  
}

