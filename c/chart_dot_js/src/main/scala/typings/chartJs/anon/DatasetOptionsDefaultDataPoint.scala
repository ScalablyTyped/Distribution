package typings.chartJs.anon

import typings.chartJs.distChunksHelpersDotcoreMod.FillerControllerDatasetOptions
import typings.chartJs.distChunksHelpersDotcoreMod.RadarControllerChartOptions
import typings.chartJs.distChunksHelpersDotcoreMod.RadarControllerDatasetOptions
import typings.chartJs.distChunksHelpersDotcoreMod.RadialParsedData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetOptionsDefaultDataPoint extends StObject {
  
  var chartOptions: RadarControllerChartOptions
  
  var datasetOptions: RadarControllerDatasetOptions & FillerControllerDatasetOptions
  
  var defaultDataPoint: Double | Null
  
  var parsedDataType: RadialParsedData
  
  var scales: "radialLinear"
}
object DatasetOptionsDefaultDataPoint {
  
  inline def apply(
    chartOptions: RadarControllerChartOptions,
    datasetOptions: RadarControllerDatasetOptions & FillerControllerDatasetOptions,
    parsedDataType: RadialParsedData
  ): DatasetOptionsDefaultDataPoint = {
    val __obj = js.Dynamic.literal(chartOptions = chartOptions.asInstanceOf[js.Any], datasetOptions = datasetOptions.asInstanceOf[js.Any], parsedDataType = parsedDataType.asInstanceOf[js.Any], scales = "radialLinear", defaultDataPoint = null)
    __obj.asInstanceOf[DatasetOptionsDefaultDataPoint]
  }
  
  extension [Self <: DatasetOptionsDefaultDataPoint](x: Self) {
    
    inline def setChartOptions(value: RadarControllerChartOptions): Self = StObject.set(x, "chartOptions", value.asInstanceOf[js.Any])
    
    inline def setDatasetOptions(value: RadarControllerDatasetOptions & FillerControllerDatasetOptions): Self = StObject.set(x, "datasetOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultDataPoint(value: Double): Self = StObject.set(x, "defaultDataPoint", value.asInstanceOf[js.Any])
    
    inline def setDefaultDataPointNull: Self = StObject.set(x, "defaultDataPoint", null)
    
    inline def setParsedDataType(value: RadialParsedData): Self = StObject.set(x, "parsedDataType", value.asInstanceOf[js.Any])
    
    inline def setScales(value: "radialLinear"): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
  }
}
