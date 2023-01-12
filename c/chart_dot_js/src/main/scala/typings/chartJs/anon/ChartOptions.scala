package typings.chartJs.anon

import typings.chartJs.chartJsStrings.category
import typings.chartJs.chartJsStrings.linear
import typings.chartJs.chartJsStrings.logarithmic
import typings.chartJs.chartJsStrings.time
import typings.chartJs.chartJsStrings.timeseries
import typings.chartJs.mod.BarControllerChartOptions
import typings.chartJs.mod.BarControllerDatasetOptions
import typings.chartJs.mod.BarParsedData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartOptions extends StObject {
  
  var chartOptions: BarControllerChartOptions
  
  var datasetOptions: BarControllerDatasetOptions
  
  var defaultDataPoint: Double
  
  var parsedDataType: BarParsedData
  
  var scales: linear | logarithmic | category | time | timeseries
}
object ChartOptions {
  
  inline def apply(
    chartOptions: BarControllerChartOptions,
    datasetOptions: BarControllerDatasetOptions,
    defaultDataPoint: Double,
    parsedDataType: BarParsedData,
    scales: linear | logarithmic | category | time | timeseries
  ): ChartOptions = {
    val __obj = js.Dynamic.literal(chartOptions = chartOptions.asInstanceOf[js.Any], datasetOptions = datasetOptions.asInstanceOf[js.Any], defaultDataPoint = defaultDataPoint.asInstanceOf[js.Any], parsedDataType = parsedDataType.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartOptions] (val x: Self) extends AnyVal {
    
    inline def setChartOptions(value: BarControllerChartOptions): Self = StObject.set(x, "chartOptions", value.asInstanceOf[js.Any])
    
    inline def setDatasetOptions(value: BarControllerDatasetOptions): Self = StObject.set(x, "datasetOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultDataPoint(value: Double): Self = StObject.set(x, "defaultDataPoint", value.asInstanceOf[js.Any])
    
    inline def setParsedDataType(value: BarParsedData): Self = StObject.set(x, "parsedDataType", value.asInstanceOf[js.Any])
    
    inline def setScales(value: linear | logarithmic | category | time | timeseries): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
  }
}
