package typings.chartJs.distChunksHelpersDotcoreMod

import typings.chartJs.anon.CoreChartOptionsbarElemen
import typings.chartJs.anon.CoreChartOptionsdoughnutE
import typings.chartJs.anon.CoreChartOptionslineEleme
import typings.chartJs.anon.CoreChartOptionspieElemen
import typings.chartJs.anon.CoreChartOptionspolarArea
import typings.chartJs.anon.CoreChartOptionsradarElem
import typings.chartJs.anon.CoreChartOptionsscatterEl
import typings.chartJs.anon.DatasetChartOptionsChartT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in chart.js.chart.js/dist/chunks/helpers.core.ChartType ]: chart.js.chart.js/dist/chunks/helpers.core.CoreChartOptions<key> & chart.js.chart.js/dist/chunks/helpers.core.ElementChartOptions<key> & chart.js.chart.js/dist/chunks/helpers.core.PluginChartOptions<key> & chart.js.chart.js/dist/chunks/helpers.core.DatasetChartOptions<chart.js.chart.js/dist/chunks/helpers.core.ChartType> & chart.js.chart.js/dist/chunks/helpers.core.ScaleChartOptions<key> & chart.js.chart.js/dist/chunks/helpers.core.ChartTypeRegistry[key]['chartOptions']} */
trait Overrides extends StObject {
  
  var bar: CoreChartOptionsbarElemen
  
  var bubble: CoreChartOptions["bubble"] & ElementChartOptions["bubble"] & PluginChartOptions["bubble"] & DatasetChartOptionsChartT & ScaleChartOptions["bubble"] & Any
  
  var doughnut: CoreChartOptionsdoughnutE
  
  var line: CoreChartOptionslineEleme
  
  var pie: CoreChartOptionspieElemen
  
  var polarArea: CoreChartOptionspolarArea
  
  var radar: CoreChartOptionsradarElem
  
  var scatter: CoreChartOptionsscatterEl
}
object Overrides {
  
  inline def apply(
    bar: CoreChartOptionsbarElemen,
    bubble: CoreChartOptions["bubble"] & ElementChartOptions["bubble"] & PluginChartOptions["bubble"] & DatasetChartOptionsChartT & ScaleChartOptions["bubble"] & Any,
    doughnut: CoreChartOptionsdoughnutE,
    line: CoreChartOptionslineEleme,
    pie: CoreChartOptionspieElemen,
    polarArea: CoreChartOptionspolarArea,
    radar: CoreChartOptionsradarElem,
    scatter: CoreChartOptionsscatterEl
  ): Overrides = {
    val __obj = js.Dynamic.literal(bar = bar.asInstanceOf[js.Any], bubble = bubble.asInstanceOf[js.Any], doughnut = doughnut.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], pie = pie.asInstanceOf[js.Any], polarArea = polarArea.asInstanceOf[js.Any], radar = radar.asInstanceOf[js.Any], scatter = scatter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overrides]
  }
  
  extension [Self <: Overrides](x: Self) {
    
    inline def setBar(value: CoreChartOptionsbarElemen): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBubble(
      value: CoreChartOptions["bubble"] & ElementChartOptions["bubble"] & PluginChartOptions["bubble"] & DatasetChartOptionsChartT & ScaleChartOptions["bubble"] & Any
    ): Self = StObject.set(x, "bubble", value.asInstanceOf[js.Any])
    
    inline def setDoughnut(value: CoreChartOptionsdoughnutE): Self = StObject.set(x, "doughnut", value.asInstanceOf[js.Any])
    
    inline def setLine(value: CoreChartOptionslineEleme): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setPie(value: CoreChartOptionspieElemen): Self = StObject.set(x, "pie", value.asInstanceOf[js.Any])
    
    inline def setPolarArea(value: CoreChartOptionspolarArea): Self = StObject.set(x, "polarArea", value.asInstanceOf[js.Any])
    
    inline def setRadar(value: CoreChartOptionsradarElem): Self = StObject.set(x, "radar", value.asInstanceOf[js.Any])
    
    inline def setScatter(value: CoreChartOptionsscatterEl): Self = StObject.set(x, "scatter", value.asInstanceOf[js.Any])
  }
}
