package typings.chartJs.distTypesIndexMod

import typings.chartJs.anon.CoreChartOptionsbarElemen
import typings.chartJs.anon.CoreChartOptionsdoughnutE
import typings.chartJs.anon.CoreChartOptionslineEleme
import typings.chartJs.anon.CoreChartOptionspieElemen
import typings.chartJs.anon.CoreChartOptionspolarArea
import typings.chartJs.anon.CoreChartOptionsradarElem
import typings.chartJs.anon.CoreChartOptionsscatterEl
import typings.chartJs.anon.DatasetChartOptionsChartT
import typings.chartJs.chartJsStrings.bubble
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in chart.js.chart.js/dist/types/index.ChartType ]: chart.js.chart.js/dist/types/index.CoreChartOptions<key> & chart.js.chart.js/dist/types/index.ElementChartOptions<key> & chart.js.chart.js/dist/types/index.PluginChartOptions<key> & chart.js.chart.js/dist/types/index.DatasetChartOptions<chart.js.chart.js/dist/types/index.ChartType> & chart.js.chart.js/dist/types/index.ScaleChartOptions<key> & chart.js.chart.js/dist/types/index.ChartTypeRegistry[key]['chartOptions']} */
trait Overrides extends StObject {
  
  var bar: CoreChartOptionsbarElemen
  
  var bubble: CoreChartOptions[typings.chartJs.chartJsStrings.bubble] & ElementChartOptions[typings.chartJs.chartJsStrings.bubble] & PluginChartOptions[typings.chartJs.chartJsStrings.bubble] & DatasetChartOptionsChartT & ScaleChartOptions[typings.chartJs.chartJsStrings.bubble] & Any
  
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
    bubble: CoreChartOptions[bubble] & ElementChartOptions[bubble] & PluginChartOptions[bubble] & DatasetChartOptionsChartT & ScaleChartOptions[bubble] & Any,
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Overrides] (val x: Self) extends AnyVal {
    
    inline def setBar(value: CoreChartOptionsbarElemen): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBubble(
      value: CoreChartOptions[bubble] & ElementChartOptions[bubble] & PluginChartOptions[bubble] & DatasetChartOptionsChartT & ScaleChartOptions[bubble] & Any
    ): Self = StObject.set(x, "bubble", value.asInstanceOf[js.Any])
    
    inline def setDoughnut(value: CoreChartOptionsdoughnutE): Self = StObject.set(x, "doughnut", value.asInstanceOf[js.Any])
    
    inline def setLine(value: CoreChartOptionslineEleme): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setPie(value: CoreChartOptionspieElemen): Self = StObject.set(x, "pie", value.asInstanceOf[js.Any])
    
    inline def setPolarArea(value: CoreChartOptionspolarArea): Self = StObject.set(x, "polarArea", value.asInstanceOf[js.Any])
    
    inline def setRadar(value: CoreChartOptionsradarElem): Self = StObject.set(x, "radar", value.asInstanceOf[js.Any])
    
    inline def setScatter(value: CoreChartOptionsscatterEl): Self = StObject.set(x, "scatter", value.asInstanceOf[js.Any])
  }
}
