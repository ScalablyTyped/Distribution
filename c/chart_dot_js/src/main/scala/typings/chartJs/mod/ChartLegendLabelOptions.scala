package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartLegendLabelOptions extends StObject {
  
  var boxWidth: js.UndefOr[Double] = js.undefined
  
  var filter: js.UndefOr[
    js.Function2[/* legendItem */ ChartLegendLabelItem, /* data */ ChartData, js.Any]
  ] = js.undefined
  
  var fontColor: js.UndefOr[ChartColor] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var fontStyle: js.UndefOr[String] = js.undefined
  
  var generateLabels: js.UndefOr[js.Function1[/* chart */ Chart, js.Array[ChartLegendLabelItem]]] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var usePointStyle: js.UndefOr[Boolean] = js.undefined
}
object ChartLegendLabelOptions {
  
  @scala.inline
  def apply(): ChartLegendLabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendLabelOptions]
  }
  
  @scala.inline
  implicit class ChartLegendLabelOptionsMutableBuilder[Self <: ChartLegendLabelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoxWidth(value: Double): Self = StObject.set(x, "boxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxWidthUndefined: Self = StObject.set(x, "boxWidth", js.undefined)
    
    @scala.inline
    def setFilter(value: (/* legendItem */ ChartLegendLabelItem, /* data */ ChartData) => js.Any): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFontColor(value: ChartColor): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    @scala.inline
    def setFontColorVarargs(value: String*): Self = StObject.set(x, "fontColor", js.Array(value :_*))
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setGenerateLabels(value: /* chart */ Chart => js.Array[ChartLegendLabelItem]): Self = StObject.set(x, "generateLabels", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGenerateLabelsUndefined: Self = StObject.set(x, "generateLabels", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setUsePointStyle(value: Boolean): Self = StObject.set(x, "usePointStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePointStyleUndefined: Self = StObject.set(x, "usePointStyle", js.undefined)
  }
}
