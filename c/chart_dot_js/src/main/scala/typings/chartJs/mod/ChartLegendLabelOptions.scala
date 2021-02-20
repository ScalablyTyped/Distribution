package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartLegendLabelOptions extends StObject {
  
  var boxWidth: js.UndefOr[Double] = js.native
  
  var filter: js.UndefOr[js.Function2[/* legendItem */ ChartLegendLabelItem, /* data */ ChartData, _]] = js.native
  
  var fontColor: js.UndefOr[ChartColor] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var fontStyle: js.UndefOr[String] = js.native
  
  var generateLabels: js.UndefOr[
    js.Function1[/* chart */ typings.chartJs.mod.Chart, js.Array[ChartLegendLabelItem]]
  ] = js.native
  
  var padding: js.UndefOr[Double] = js.native
  
  var usePointStyle: js.UndefOr[Boolean] = js.native
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
    def setFilter(value: (/* legendItem */ ChartLegendLabelItem, /* data */ ChartData) => _): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
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
    def setGenerateLabels(value: /* chart */ typings.chartJs.mod.Chart => js.Array[ChartLegendLabelItem]): Self = StObject.set(x, "generateLabels", js.Any.fromFunction1(value))
    
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
