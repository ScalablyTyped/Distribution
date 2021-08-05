package typings.chartJs.mod

import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.xy
import typings.chartJs.chartJsStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartTooltipOptions extends StObject {
  
  var axis: js.UndefOr[x | y | xy] = js.undefined
  
  var backgroundColor: js.UndefOr[ChartColor] = js.undefined
  
  var bodyAlign: js.UndefOr[TextAlignment] = js.undefined
  
  var bodyFontColor: js.UndefOr[ChartColor] = js.undefined
  
  var bodyFontFamily: js.UndefOr[String] = js.undefined
  
  var bodyFontSize: js.UndefOr[Double] = js.undefined
  
  var bodyFontStyle: js.UndefOr[String] = js.undefined
  
  var bodySpacing: js.UndefOr[Double] = js.undefined
  
  var borderColor: js.UndefOr[ChartColor] = js.undefined
  
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  var callbacks: js.UndefOr[ChartTooltipCallback] = js.undefined
  
  var caretPadding: js.UndefOr[Double] = js.undefined
  
  var caretSize: js.UndefOr[Double] = js.undefined
  
  var cornerRadius: js.UndefOr[Double] = js.undefined
  
  var custom: js.UndefOr[js.Function1[/* tooltipModel */ ChartTooltipModel, Unit]] = js.undefined
  
  var displayColors: js.UndefOr[Boolean] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var filter: js.UndefOr[js.Function2[/* item */ ChartTooltipItem, /* data */ ChartData, Boolean]] = js.undefined
  
  var footerAlign: js.UndefOr[TextAlignment] = js.undefined
  
  var footerFontColor: js.UndefOr[ChartColor] = js.undefined
  
  var footerFontFamily: js.UndefOr[String] = js.undefined
  
  var footerFontSize: js.UndefOr[Double] = js.undefined
  
  var footerFontStyle: js.UndefOr[String] = js.undefined
  
  var footerMarginTop: js.UndefOr[Double] = js.undefined
  
  var footerSpacing: js.UndefOr[Double] = js.undefined
  
  var intersect: js.UndefOr[Boolean] = js.undefined
  
  var itemSort: js.UndefOr[
    js.Function3[
      /* itemA */ ChartTooltipItem, 
      /* itemB */ ChartTooltipItem, 
      /* data */ js.UndefOr[ChartData], 
      Double
    ]
  ] = js.undefined
  
  var mode: js.UndefOr[InteractionMode] = js.undefined
  
  var multiKeyBackground: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var rtl: js.UndefOr[Boolean] = js.undefined
  
  var textDirection: js.UndefOr[String] = js.undefined
  
  var titleAlign: js.UndefOr[TextAlignment] = js.undefined
  
  var titleFontColor: js.UndefOr[ChartColor] = js.undefined
  
  var titleFontFamily: js.UndefOr[String] = js.undefined
  
  var titleFontSize: js.UndefOr[Double] = js.undefined
  
  var titleFontStyle: js.UndefOr[String] = js.undefined
  
  var titleMarginBottom: js.UndefOr[Double] = js.undefined
  
  var titleSpacing: js.UndefOr[Double] = js.undefined
  
  var xPadding: js.UndefOr[Double] = js.undefined
  
  var yPadding: js.UndefOr[Double] = js.undefined
}
object ChartTooltipOptions {
  
  inline def apply(): ChartTooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTooltipOptions]
  }
  
  extension [Self <: ChartTooltipOptions](x: Self) {
    
    inline def setAxis(value: typings.chartJs.chartJsStrings.x | y | xy): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setBackgroundColor(value: ChartColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundColorVarargs(value: String*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
    
    inline def setBodyAlign(value: TextAlignment): Self = StObject.set(x, "bodyAlign", value.asInstanceOf[js.Any])
    
    inline def setBodyAlignUndefined: Self = StObject.set(x, "bodyAlign", js.undefined)
    
    inline def setBodyFontColor(value: ChartColor): Self = StObject.set(x, "bodyFontColor", value.asInstanceOf[js.Any])
    
    inline def setBodyFontColorUndefined: Self = StObject.set(x, "bodyFontColor", js.undefined)
    
    inline def setBodyFontColorVarargs(value: String*): Self = StObject.set(x, "bodyFontColor", js.Array(value :_*))
    
    inline def setBodyFontFamily(value: String): Self = StObject.set(x, "bodyFontFamily", value.asInstanceOf[js.Any])
    
    inline def setBodyFontFamilyUndefined: Self = StObject.set(x, "bodyFontFamily", js.undefined)
    
    inline def setBodyFontSize(value: Double): Self = StObject.set(x, "bodyFontSize", value.asInstanceOf[js.Any])
    
    inline def setBodyFontSizeUndefined: Self = StObject.set(x, "bodyFontSize", js.undefined)
    
    inline def setBodyFontStyle(value: String): Self = StObject.set(x, "bodyFontStyle", value.asInstanceOf[js.Any])
    
    inline def setBodyFontStyleUndefined: Self = StObject.set(x, "bodyFontStyle", js.undefined)
    
    inline def setBodySpacing(value: Double): Self = StObject.set(x, "bodySpacing", value.asInstanceOf[js.Any])
    
    inline def setBodySpacingUndefined: Self = StObject.set(x, "bodySpacing", js.undefined)
    
    inline def setBorderColor(value: ChartColor): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderColorVarargs(value: String*): Self = StObject.set(x, "borderColor", js.Array(value :_*))
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setCallbacks(value: ChartTooltipCallback): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    
    inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
    
    inline def setCaretPadding(value: Double): Self = StObject.set(x, "caretPadding", value.asInstanceOf[js.Any])
    
    inline def setCaretPaddingUndefined: Self = StObject.set(x, "caretPadding", js.undefined)
    
    inline def setCaretSize(value: Double): Self = StObject.set(x, "caretSize", value.asInstanceOf[js.Any])
    
    inline def setCaretSizeUndefined: Self = StObject.set(x, "caretSize", js.undefined)
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setCustom(value: /* tooltipModel */ ChartTooltipModel => Unit): Self = StObject.set(x, "custom", js.Any.fromFunction1(value))
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDisplayColors(value: Boolean): Self = StObject.set(x, "displayColors", value.asInstanceOf[js.Any])
    
    inline def setDisplayColorsUndefined: Self = StObject.set(x, "displayColors", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFilter(value: (/* item */ ChartTooltipItem, /* data */ ChartData) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFooterAlign(value: TextAlignment): Self = StObject.set(x, "footerAlign", value.asInstanceOf[js.Any])
    
    inline def setFooterAlignUndefined: Self = StObject.set(x, "footerAlign", js.undefined)
    
    inline def setFooterFontColor(value: ChartColor): Self = StObject.set(x, "footerFontColor", value.asInstanceOf[js.Any])
    
    inline def setFooterFontColorUndefined: Self = StObject.set(x, "footerFontColor", js.undefined)
    
    inline def setFooterFontColorVarargs(value: String*): Self = StObject.set(x, "footerFontColor", js.Array(value :_*))
    
    inline def setFooterFontFamily(value: String): Self = StObject.set(x, "footerFontFamily", value.asInstanceOf[js.Any])
    
    inline def setFooterFontFamilyUndefined: Self = StObject.set(x, "footerFontFamily", js.undefined)
    
    inline def setFooterFontSize(value: Double): Self = StObject.set(x, "footerFontSize", value.asInstanceOf[js.Any])
    
    inline def setFooterFontSizeUndefined: Self = StObject.set(x, "footerFontSize", js.undefined)
    
    inline def setFooterFontStyle(value: String): Self = StObject.set(x, "footerFontStyle", value.asInstanceOf[js.Any])
    
    inline def setFooterFontStyleUndefined: Self = StObject.set(x, "footerFontStyle", js.undefined)
    
    inline def setFooterMarginTop(value: Double): Self = StObject.set(x, "footerMarginTop", value.asInstanceOf[js.Any])
    
    inline def setFooterMarginTopUndefined: Self = StObject.set(x, "footerMarginTop", js.undefined)
    
    inline def setFooterSpacing(value: Double): Self = StObject.set(x, "footerSpacing", value.asInstanceOf[js.Any])
    
    inline def setFooterSpacingUndefined: Self = StObject.set(x, "footerSpacing", js.undefined)
    
    inline def setIntersect(value: Boolean): Self = StObject.set(x, "intersect", value.asInstanceOf[js.Any])
    
    inline def setIntersectUndefined: Self = StObject.set(x, "intersect", js.undefined)
    
    inline def setItemSort(
      value: (/* itemA */ ChartTooltipItem, /* itemB */ ChartTooltipItem, /* data */ js.UndefOr[ChartData]) => Double
    ): Self = StObject.set(x, "itemSort", js.Any.fromFunction3(value))
    
    inline def setItemSortUndefined: Self = StObject.set(x, "itemSort", js.undefined)
    
    inline def setMode(value: InteractionMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setMultiKeyBackground(value: String): Self = StObject.set(x, "multiKeyBackground", value.asInstanceOf[js.Any])
    
    inline def setMultiKeyBackgroundUndefined: Self = StObject.set(x, "multiKeyBackground", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    inline def setTextDirection(value: String): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
    
    inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
    
    inline def setTitleAlign(value: TextAlignment): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
    
    inline def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
    
    inline def setTitleFontColor(value: ChartColor): Self = StObject.set(x, "titleFontColor", value.asInstanceOf[js.Any])
    
    inline def setTitleFontColorUndefined: Self = StObject.set(x, "titleFontColor", js.undefined)
    
    inline def setTitleFontColorVarargs(value: String*): Self = StObject.set(x, "titleFontColor", js.Array(value :_*))
    
    inline def setTitleFontFamily(value: String): Self = StObject.set(x, "titleFontFamily", value.asInstanceOf[js.Any])
    
    inline def setTitleFontFamilyUndefined: Self = StObject.set(x, "titleFontFamily", js.undefined)
    
    inline def setTitleFontSize(value: Double): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
    
    inline def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
    
    inline def setTitleFontStyle(value: String): Self = StObject.set(x, "titleFontStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleFontStyleUndefined: Self = StObject.set(x, "titleFontStyle", js.undefined)
    
    inline def setTitleMarginBottom(value: Double): Self = StObject.set(x, "titleMarginBottom", value.asInstanceOf[js.Any])
    
    inline def setTitleMarginBottomUndefined: Self = StObject.set(x, "titleMarginBottom", js.undefined)
    
    inline def setTitleSpacing(value: Double): Self = StObject.set(x, "titleSpacing", value.asInstanceOf[js.Any])
    
    inline def setTitleSpacingUndefined: Self = StObject.set(x, "titleSpacing", js.undefined)
    
    inline def setXPadding(value: Double): Self = StObject.set(x, "xPadding", value.asInstanceOf[js.Any])
    
    inline def setXPaddingUndefined: Self = StObject.set(x, "xPadding", js.undefined)
    
    inline def setYPadding(value: Double): Self = StObject.set(x, "yPadding", value.asInstanceOf[js.Any])
    
    inline def setYPaddingUndefined: Self = StObject.set(x, "yPadding", js.undefined)
  }
}
