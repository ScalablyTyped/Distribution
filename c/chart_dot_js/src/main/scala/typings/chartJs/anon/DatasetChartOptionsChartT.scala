package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined chart.js.chart.js/dist/chunks/helpers.core.DatasetChartOptions<chart.js.chart.js/dist/chunks/helpers.core.ChartType> */
trait DatasetChartOptionsChartT extends StObject {
  
  var bar: Datasets
  
  var bubble: DatasetsBubbleControllerDatasetOptions
  
  var doughnut: DatasetsDoughnutControllerDatasetOptions
  
  var line: `1`
  
  var pie: DatasetsPieControllerDatasetOptions
  
  var polarArea: DatasetsPolarAreaControllerDatasetOptions
  
  var radar: `0`
  
  var scatter: DatasetsScatterControllerDatasetOptions
}
object DatasetChartOptionsChartT {
  
  inline def apply(
    bar: Datasets,
    bubble: DatasetsBubbleControllerDatasetOptions,
    doughnut: DatasetsDoughnutControllerDatasetOptions,
    line: `1`,
    pie: DatasetsPieControllerDatasetOptions,
    polarArea: DatasetsPolarAreaControllerDatasetOptions,
    radar: `0`,
    scatter: DatasetsScatterControllerDatasetOptions
  ): DatasetChartOptionsChartT = {
    val __obj = js.Dynamic.literal(bar = bar.asInstanceOf[js.Any], bubble = bubble.asInstanceOf[js.Any], doughnut = doughnut.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], pie = pie.asInstanceOf[js.Any], polarArea = polarArea.asInstanceOf[js.Any], radar = radar.asInstanceOf[js.Any], scatter = scatter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetChartOptionsChartT]
  }
  
  extension [Self <: DatasetChartOptionsChartT](x: Self) {
    
    inline def setBar(value: Datasets): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBubble(value: DatasetsBubbleControllerDatasetOptions): Self = StObject.set(x, "bubble", value.asInstanceOf[js.Any])
    
    inline def setDoughnut(value: DatasetsDoughnutControllerDatasetOptions): Self = StObject.set(x, "doughnut", value.asInstanceOf[js.Any])
    
    inline def setLine(value: `1`): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setPie(value: DatasetsPieControllerDatasetOptions): Self = StObject.set(x, "pie", value.asInstanceOf[js.Any])
    
    inline def setPolarArea(value: DatasetsPolarAreaControllerDatasetOptions): Self = StObject.set(x, "polarArea", value.asInstanceOf[js.Any])
    
    inline def setRadar(value: `0`): Self = StObject.set(x, "radar", value.asInstanceOf[js.Any])
    
    inline def setScatter(value: DatasetsScatterControllerDatasetOptions): Self = StObject.set(x, "scatter", value.asInstanceOf[js.Any])
  }
}
