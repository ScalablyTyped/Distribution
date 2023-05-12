package typings.chartJs.anon

import typings.chartJs.chartJsStrings.category
import typings.chartJs.chartJsStrings.linear
import typings.chartJs.chartJsStrings.logarithmic
import typings.chartJs.chartJsStrings.time
import typings.chartJs.chartJsStrings.timeseries
import typings.chartJs.distTypesIndexMod.DoughnutControllerChartOptions
import typings.chartJs.distTypesIndexMod.DoughnutControllerDatasetOptions
import typings.chartJs.distTypesIndexMod.DoughnutDataPoint
import typings.chartJs.distTypesIndexMod.DoughnutMetaExtensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scales extends StObject {
  
  var chartOptions: DoughnutControllerChartOptions
  
  var datasetOptions: DoughnutControllerDatasetOptions
  
  var defaultDataPoint: DoughnutDataPoint
  
  var metaExtensions: DoughnutMetaExtensions
  
  var parsedDataType: Double
  
  var scales: linear | logarithmic | category | time | timeseries
}
object Scales {
  
  inline def apply(
    chartOptions: DoughnutControllerChartOptions,
    datasetOptions: DoughnutControllerDatasetOptions,
    defaultDataPoint: DoughnutDataPoint,
    metaExtensions: DoughnutMetaExtensions,
    parsedDataType: Double,
    scales: linear | logarithmic | category | time | timeseries
  ): Scales = {
    val __obj = js.Dynamic.literal(chartOptions = chartOptions.asInstanceOf[js.Any], datasetOptions = datasetOptions.asInstanceOf[js.Any], defaultDataPoint = defaultDataPoint.asInstanceOf[js.Any], metaExtensions = metaExtensions.asInstanceOf[js.Any], parsedDataType = parsedDataType.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scales]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scales] (val x: Self) extends AnyVal {
    
    inline def setChartOptions(value: DoughnutControllerChartOptions): Self = StObject.set(x, "chartOptions", value.asInstanceOf[js.Any])
    
    inline def setDatasetOptions(value: DoughnutControllerDatasetOptions): Self = StObject.set(x, "datasetOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultDataPoint(value: DoughnutDataPoint): Self = StObject.set(x, "defaultDataPoint", value.asInstanceOf[js.Any])
    
    inline def setMetaExtensions(value: DoughnutMetaExtensions): Self = StObject.set(x, "metaExtensions", value.asInstanceOf[js.Any])
    
    inline def setParsedDataType(value: Double): Self = StObject.set(x, "parsedDataType", value.asInstanceOf[js.Any])
    
    inline def setScales(value: linear | logarithmic | category | time | timeseries): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
  }
}
