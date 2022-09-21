package typings.chartJs.anon

import typings.chartJs.mod.BarControllerDatasetOptions
import typings.chartJs.mod.BubbleControllerDatasetOptions
import typings.chartJs.mod.DoughnutControllerDatasetOptions
import typings.chartJs.mod.FillerControllerDatasetOptions
import typings.chartJs.mod.LineControllerDatasetOptions
import typings.chartJs.mod.PieControllerDatasetOptions
import typings.chartJs.mod.PolarAreaControllerDatasetOptions
import typings.chartJs.mod.RadarControllerDatasetOptions
import typings.chartJs.mod.ScatterControllerDatasetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in chart.js.chart.js.ChartType ]: chart.js.chart.js.ChartTypeRegistry[key]['datasetOptions']} */
trait keyinChartTypeChartTypeReBar extends StObject {
  
  var bar: BarControllerDatasetOptions
  
  var bubble: BubbleControllerDatasetOptions
  
  var doughnut: DoughnutControllerDatasetOptions
  
  var line: LineControllerDatasetOptions & FillerControllerDatasetOptions
  
  var pie: PieControllerDatasetOptions
  
  var polarArea: PolarAreaControllerDatasetOptions
  
  var radar: RadarControllerDatasetOptions & FillerControllerDatasetOptions
  
  var scatter: ScatterControllerDatasetOptions
}
object keyinChartTypeChartTypeReBar {
  
  inline def apply(
    bar: BarControllerDatasetOptions,
    bubble: BubbleControllerDatasetOptions,
    doughnut: DoughnutControllerDatasetOptions,
    line: LineControllerDatasetOptions & FillerControllerDatasetOptions,
    pie: PieControllerDatasetOptions,
    polarArea: PolarAreaControllerDatasetOptions,
    radar: RadarControllerDatasetOptions & FillerControllerDatasetOptions,
    scatter: ScatterControllerDatasetOptions
  ): keyinChartTypeChartTypeReBar = {
    val __obj = js.Dynamic.literal(bar = bar.asInstanceOf[js.Any], bubble = bubble.asInstanceOf[js.Any], doughnut = doughnut.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], pie = pie.asInstanceOf[js.Any], polarArea = polarArea.asInstanceOf[js.Any], radar = radar.asInstanceOf[js.Any], scatter = scatter.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinChartTypeChartTypeReBar]
  }
  
  extension [Self <: keyinChartTypeChartTypeReBar](x: Self) {
    
    inline def setBar(value: BarControllerDatasetOptions): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBubble(value: BubbleControllerDatasetOptions): Self = StObject.set(x, "bubble", value.asInstanceOf[js.Any])
    
    inline def setDoughnut(value: DoughnutControllerDatasetOptions): Self = StObject.set(x, "doughnut", value.asInstanceOf[js.Any])
    
    inline def setLine(value: LineControllerDatasetOptions & FillerControllerDatasetOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setPie(value: PieControllerDatasetOptions): Self = StObject.set(x, "pie", value.asInstanceOf[js.Any])
    
    inline def setPolarArea(value: PolarAreaControllerDatasetOptions): Self = StObject.set(x, "polarArea", value.asInstanceOf[js.Any])
    
    inline def setRadar(value: RadarControllerDatasetOptions & FillerControllerDatasetOptions): Self = StObject.set(x, "radar", value.asInstanceOf[js.Any])
    
    inline def setScatter(value: ScatterControllerDatasetOptions): Self = StObject.set(x, "scatter", value.asInstanceOf[js.Any])
  }
}
