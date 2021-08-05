package typings.chartist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPieChartClasses extends StObject {
  
  var chartDonut: js.UndefOr[String] = js.undefined
  
  var chartPie: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var series: js.UndefOr[String] = js.undefined
  
  var sliceDonut: js.UndefOr[String] = js.undefined
  
  var slicePie: js.UndefOr[String] = js.undefined
}
object IPieChartClasses {
  
  inline def apply(): IPieChartClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPieChartClasses]
  }
  
  extension [Self <: IPieChartClasses](x: Self) {
    
    inline def setChartDonut(value: String): Self = StObject.set(x, "chartDonut", value.asInstanceOf[js.Any])
    
    inline def setChartDonutUndefined: Self = StObject.set(x, "chartDonut", js.undefined)
    
    inline def setChartPie(value: String): Self = StObject.set(x, "chartPie", value.asInstanceOf[js.Any])
    
    inline def setChartPieUndefined: Self = StObject.set(x, "chartPie", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSliceDonut(value: String): Self = StObject.set(x, "sliceDonut", value.asInstanceOf[js.Any])
    
    inline def setSliceDonutUndefined: Self = StObject.set(x, "sliceDonut", js.undefined)
    
    inline def setSlicePie(value: String): Self = StObject.set(x, "slicePie", value.asInstanceOf[js.Any])
    
    inline def setSlicePieUndefined: Self = StObject.set(x, "slicePie", js.undefined)
  }
}
