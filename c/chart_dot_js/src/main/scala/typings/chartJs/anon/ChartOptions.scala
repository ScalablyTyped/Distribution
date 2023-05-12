package typings.chartJs.anon

import typings.chartJs.chartJsStrings.category
import typings.chartJs.chartJsStrings.linear
import typings.chartJs.chartJsStrings.logarithmic
import typings.chartJs.chartJsStrings.time
import typings.chartJs.chartJsStrings.timeseries
import typings.chartJs.distTypesIndexMod.BarControllerChartOptions
import typings.chartJs.distTypesIndexMod.BarControllerDatasetOptions
import typings.chartJs.distTypesIndexMod.BarParsedData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartOptions extends StObject {
  
  var chartOptions: BarControllerChartOptions
  
  var datasetOptions: BarControllerDatasetOptions
  
  var defaultDataPoint: Double | (js.Tuple2[Double, Double]) | Null
  
  var parsedDataType: BarParsedData
  
  var scales: linear | logarithmic | category | time | timeseries
}
object ChartOptions {
  
  inline def apply(
    chartOptions: BarControllerChartOptions,
    datasetOptions: BarControllerDatasetOptions,
    parsedDataType: BarParsedData,
    scales: linear | logarithmic | category | time | timeseries
  ): ChartOptions = {
    val __obj = js.Dynamic.literal(chartOptions = chartOptions.asInstanceOf[js.Any], datasetOptions = datasetOptions.asInstanceOf[js.Any], parsedDataType = parsedDataType.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any], defaultDataPoint = null)
    __obj.asInstanceOf[ChartOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartOptions] (val x: Self) extends AnyVal {
    
    inline def setChartOptions(value: BarControllerChartOptions): Self = StObject.set(x, "chartOptions", value.asInstanceOf[js.Any])
    
    inline def setDatasetOptions(value: BarControllerDatasetOptions): Self = StObject.set(x, "datasetOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultDataPoint(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "defaultDataPoint", value.asInstanceOf[js.Any])
    
    inline def setDefaultDataPointNull: Self = StObject.set(x, "defaultDataPoint", null)
    
    inline def setParsedDataType(value: BarParsedData): Self = StObject.set(x, "parsedDataType", value.asInstanceOf[js.Any])
    
    inline def setScales(value: linear | logarithmic | category | time | timeseries): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
  }
}
