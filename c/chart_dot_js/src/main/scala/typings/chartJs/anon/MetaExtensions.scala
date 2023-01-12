package typings.chartJs.anon

import typings.chartJs.chartJsStrings.category
import typings.chartJs.chartJsStrings.linear
import typings.chartJs.chartJsStrings.logarithmic
import typings.chartJs.chartJsStrings.time
import typings.chartJs.chartJsStrings.timeseries
import typings.chartJs.mod.BubbleControllerDatasetOptions
import typings.chartJs.mod.BubbleDataPoint
import typings.chartJs.mod.BubbleParsedData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaExtensions extends StObject {
  
  var chartOptions: Any
  
  var datasetOptions: BubbleControllerDatasetOptions
  
  var defaultDataPoint: BubbleDataPoint
  
  var parsedDataType: BubbleParsedData
  
  var scales: linear | logarithmic | category | time | timeseries
}
object MetaExtensions {
  
  inline def apply(
    chartOptions: Any,
    datasetOptions: BubbleControllerDatasetOptions,
    defaultDataPoint: BubbleDataPoint,
    parsedDataType: BubbleParsedData,
    scales: linear | logarithmic | category | time | timeseries
  ): MetaExtensions = {
    val __obj = js.Dynamic.literal(chartOptions = chartOptions.asInstanceOf[js.Any], datasetOptions = datasetOptions.asInstanceOf[js.Any], defaultDataPoint = defaultDataPoint.asInstanceOf[js.Any], parsedDataType = parsedDataType.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaExtensions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetaExtensions] (val x: Self) extends AnyVal {
    
    inline def setChartOptions(value: Any): Self = StObject.set(x, "chartOptions", value.asInstanceOf[js.Any])
    
    inline def setDatasetOptions(value: BubbleControllerDatasetOptions): Self = StObject.set(x, "datasetOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultDataPoint(value: BubbleDataPoint): Self = StObject.set(x, "defaultDataPoint", value.asInstanceOf[js.Any])
    
    inline def setParsedDataType(value: BubbleParsedData): Self = StObject.set(x, "parsedDataType", value.asInstanceOf[js.Any])
    
    inline def setScales(value: linear | logarithmic | category | time | timeseries): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
  }
}
