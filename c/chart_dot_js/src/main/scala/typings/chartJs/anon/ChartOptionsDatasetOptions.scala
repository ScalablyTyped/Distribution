package typings.chartJs.anon

import typings.chartJs.chartJsStrings.radialLinear
import typings.chartJs.mod.PolarAreaControllerChartOptions
import typings.chartJs.mod.PolarAreaControllerDatasetOptions
import typings.chartJs.mod.RadialParsedData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartOptionsDatasetOptions extends StObject {
  
  var chartOptions: PolarAreaControllerChartOptions
  
  var datasetOptions: PolarAreaControllerDatasetOptions
  
  var defaultDataPoint: Double
  
  var parsedDataType: RadialParsedData
  
  var scales: radialLinear
}
object ChartOptionsDatasetOptions {
  
  inline def apply(
    chartOptions: PolarAreaControllerChartOptions,
    datasetOptions: PolarAreaControllerDatasetOptions,
    defaultDataPoint: Double,
    parsedDataType: RadialParsedData
  ): ChartOptionsDatasetOptions = {
    val __obj = js.Dynamic.literal(chartOptions = chartOptions.asInstanceOf[js.Any], datasetOptions = datasetOptions.asInstanceOf[js.Any], defaultDataPoint = defaultDataPoint.asInstanceOf[js.Any], parsedDataType = parsedDataType.asInstanceOf[js.Any], scales = "radialLinear")
    __obj.asInstanceOf[ChartOptionsDatasetOptions]
  }
  
  extension [Self <: ChartOptionsDatasetOptions](x: Self) {
    
    inline def setChartOptions(value: PolarAreaControllerChartOptions): Self = StObject.set(x, "chartOptions", value.asInstanceOf[js.Any])
    
    inline def setDatasetOptions(value: PolarAreaControllerDatasetOptions): Self = StObject.set(x, "datasetOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultDataPoint(value: Double): Self = StObject.set(x, "defaultDataPoint", value.asInstanceOf[js.Any])
    
    inline def setParsedDataType(value: RadialParsedData): Self = StObject.set(x, "parsedDataType", value.asInstanceOf[js.Any])
    
    inline def setScales(value: radialLinear): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
  }
}
