package typings.chartJs.anon

import typings.chartJs.distTypesIndexMod.BarControllerDatasetOptions
import typings.chartJs.distTypesIndexMod.BubbleControllerDatasetOptions
import typings.chartJs.distTypesIndexMod.DoughnutControllerDatasetOptions
import typings.chartJs.distTypesIndexMod.FillerControllerDatasetOptions
import typings.chartJs.distTypesIndexMod.LineControllerDatasetOptions
import typings.chartJs.distTypesIndexMod.PieControllerDatasetOptions
import typings.chartJs.distTypesIndexMod.PolarAreaControllerDatasetOptions
import typings.chartJs.distTypesIndexMod.RadarControllerDatasetOptions
import typings.chartJs.distTypesIndexMod.ScatterControllerDatasetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in chart.js.chart.js/dist/types/index.ChartType ]: chart.js.chart.js/dist/types/index.ChartTypeRegistry[key]['datasetOptions']} */
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: keyinChartTypeChartTypeReBar] (val x: Self) extends AnyVal {
    
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
