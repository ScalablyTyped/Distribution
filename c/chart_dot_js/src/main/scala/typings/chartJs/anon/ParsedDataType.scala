package typings.chartJs.anon

import typings.chartJs.chartJsStrings.category
import typings.chartJs.chartJsStrings.linear
import typings.chartJs.chartJsStrings.logarithmic
import typings.chartJs.chartJsStrings.time
import typings.chartJs.chartJsStrings.timeseries
import typings.chartJs.distTypesIndexMod.PieControllerChartOptions
import typings.chartJs.distTypesIndexMod.PieControllerDatasetOptions
import typings.chartJs.distTypesIndexMod.PieDataPoint
import typings.chartJs.distTypesIndexMod.PieMetaExtensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedDataType extends StObject {
  
  var chartOptions: PieControllerChartOptions
  
  var datasetOptions: PieControllerDatasetOptions
  
  var defaultDataPoint: PieDataPoint
  
  var metaExtensions: PieMetaExtensions
  
  var parsedDataType: Double
  
  var scales: linear | logarithmic | category | time | timeseries
}
object ParsedDataType {
  
  inline def apply(
    chartOptions: PieControllerChartOptions,
    datasetOptions: PieControllerDatasetOptions,
    defaultDataPoint: PieDataPoint,
    metaExtensions: PieMetaExtensions,
    parsedDataType: Double,
    scales: linear | logarithmic | category | time | timeseries
  ): ParsedDataType = {
    val __obj = js.Dynamic.literal(chartOptions = chartOptions.asInstanceOf[js.Any], datasetOptions = datasetOptions.asInstanceOf[js.Any], defaultDataPoint = defaultDataPoint.asInstanceOf[js.Any], metaExtensions = metaExtensions.asInstanceOf[js.Any], parsedDataType = parsedDataType.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedDataType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParsedDataType] (val x: Self) extends AnyVal {
    
    inline def setChartOptions(value: PieControllerChartOptions): Self = StObject.set(x, "chartOptions", value.asInstanceOf[js.Any])
    
    inline def setDatasetOptions(value: PieControllerDatasetOptions): Self = StObject.set(x, "datasetOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultDataPoint(value: PieDataPoint): Self = StObject.set(x, "defaultDataPoint", value.asInstanceOf[js.Any])
    
    inline def setMetaExtensions(value: PieMetaExtensions): Self = StObject.set(x, "metaExtensions", value.asInstanceOf[js.Any])
    
    inline def setParsedDataType(value: Double): Self = StObject.set(x, "parsedDataType", value.asInstanceOf[js.Any])
    
    inline def setScales(value: linear | logarithmic | category | time | timeseries): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
  }
}
