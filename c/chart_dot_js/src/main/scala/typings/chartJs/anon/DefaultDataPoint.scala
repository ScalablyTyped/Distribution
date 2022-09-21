package typings.chartJs.anon

import typings.chartJs.chartJsStrings.category
import typings.chartJs.chartJsStrings.linear
import typings.chartJs.chartJsStrings.logarithmic
import typings.chartJs.chartJsStrings.time
import typings.chartJs.chartJsStrings.timeseries
import typings.chartJs.mod.CartesianParsedData
import typings.chartJs.mod.ScatterControllerChartOptions
import typings.chartJs.mod.ScatterControllerDatasetOptions
import typings.chartJs.mod.ScatterDataPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultDataPoint extends StObject {
  
  var chartOptions: ScatterControllerChartOptions
  
  var datasetOptions: ScatterControllerDatasetOptions
  
  var defaultDataPoint: ScatterDataPoint | Double | Null
  
  var parsedDataType: CartesianParsedData
  
  var scales: linear | logarithmic | category | time | timeseries
}
object DefaultDataPoint {
  
  inline def apply(
    chartOptions: ScatterControllerChartOptions,
    datasetOptions: ScatterControllerDatasetOptions,
    parsedDataType: CartesianParsedData,
    scales: linear | logarithmic | category | time | timeseries
  ): DefaultDataPoint = {
    val __obj = js.Dynamic.literal(chartOptions = chartOptions.asInstanceOf[js.Any], datasetOptions = datasetOptions.asInstanceOf[js.Any], parsedDataType = parsedDataType.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any], defaultDataPoint = null)
    __obj.asInstanceOf[DefaultDataPoint]
  }
  
  extension [Self <: DefaultDataPoint](x: Self) {
    
    inline def setChartOptions(value: ScatterControllerChartOptions): Self = StObject.set(x, "chartOptions", value.asInstanceOf[js.Any])
    
    inline def setDatasetOptions(value: ScatterControllerDatasetOptions): Self = StObject.set(x, "datasetOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultDataPoint(value: ScatterDataPoint | Double): Self = StObject.set(x, "defaultDataPoint", value.asInstanceOf[js.Any])
    
    inline def setDefaultDataPointNull: Self = StObject.set(x, "defaultDataPoint", null)
    
    inline def setParsedDataType(value: CartesianParsedData): Self = StObject.set(x, "parsedDataType", value.asInstanceOf[js.Any])
    
    inline def setScales(value: linear | logarithmic | category | time | timeseries): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
  }
}
