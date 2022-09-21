package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPieChartSeriesTypes extends StObject {
  
  /**
    * An object that defines configuration properties for chart series.
    */
  var CommonPieChartSeries: js.UndefOr[dxPieChartSeriesTypesCommonPieChartSeries] = js.undefined
  
  /**
    * An object defining a series of the doughnut type.
    */
  var DoughnutSeries: js.UndefOr[Any] = js.undefined
  
  /**
    * An object defining a series of the pie type.
    */
  var PieSeries: js.UndefOr[Any] = js.undefined
}
object dxPieChartSeriesTypes {
  
  inline def apply(): dxPieChartSeriesTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPieChartSeriesTypes]
  }
  
  extension [Self <: dxPieChartSeriesTypes](x: Self) {
    
    inline def setCommonPieChartSeries(value: dxPieChartSeriesTypesCommonPieChartSeries): Self = StObject.set(x, "CommonPieChartSeries", value.asInstanceOf[js.Any])
    
    inline def setCommonPieChartSeriesUndefined: Self = StObject.set(x, "CommonPieChartSeries", js.undefined)
    
    inline def setDoughnutSeries(value: Any): Self = StObject.set(x, "DoughnutSeries", value.asInstanceOf[js.Any])
    
    inline def setDoughnutSeriesUndefined: Self = StObject.set(x, "DoughnutSeries", js.undefined)
    
    inline def setPieSeries(value: Any): Self = StObject.set(x, "PieSeries", value.asInstanceOf[js.Any])
    
    inline def setPieSeriesUndefined: Self = StObject.set(x, "PieSeries", js.undefined)
  }
}
