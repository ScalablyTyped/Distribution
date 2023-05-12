package typings.chartJs.anon

import typings.chartJs.distTypesIndexMod.DoughnutMetaExtensions
import typings.chartJs.distTypesIndexMod.PieMetaExtensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in chart.js.chart.js/dist/types/index.ChartType ]: chart.js.chart.js/dist/types/index.ChartTypeRegistry[key]['metaExtensions']} */
trait keyinChartTypeChartTypeRe extends StObject {
  
  var doughnut: DoughnutMetaExtensions
  
  var pie: PieMetaExtensions
}
object keyinChartTypeChartTypeRe {
  
  inline def apply(doughnut: DoughnutMetaExtensions, pie: PieMetaExtensions): keyinChartTypeChartTypeRe = {
    val __obj = js.Dynamic.literal(doughnut = doughnut.asInstanceOf[js.Any], pie = pie.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinChartTypeChartTypeRe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: keyinChartTypeChartTypeRe] (val x: Self) extends AnyVal {
    
    inline def setDoughnut(value: DoughnutMetaExtensions): Self = StObject.set(x, "doughnut", value.asInstanceOf[js.Any])
    
    inline def setPie(value: PieMetaExtensions): Self = StObject.set(x, "pie", value.asInstanceOf[js.Any])
  }
}
