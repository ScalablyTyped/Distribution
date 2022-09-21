package typings.chartJs.anon

import typings.chartJs.basicMod.AnyObject
import typings.chartJs.chartJsStrings.bar
import typings.chartJs.mod.Scriptable
import typings.chartJs.mod.ScriptableContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  autoPadding :boolean,   padding :chart.js.chart.js.Scriptable<number | std.Partial<chart.js.chart.js/types/geometric.ChartArea>, chart.js.chart.js.ScriptableContext<'bar'>>}> */
trait PartialautoPaddingboolean extends StObject {
  
  var autoPadding: js.UndefOr[Boolean] = js.undefined
  
  var padding: js.UndefOr[Scriptable[Double | PartialChartArea, ScriptableContext[bar]]] = js.undefined
}
object PartialautoPaddingboolean {
  
  inline def apply(): PartialautoPaddingboolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialautoPaddingboolean]
  }
  
  extension [Self <: PartialautoPaddingboolean](x: Self) {
    
    inline def setAutoPadding(value: Boolean): Self = StObject.set(x, "autoPadding", value.asInstanceOf[js.Any])
    
    inline def setAutoPaddingUndefined: Self = StObject.set(x, "autoPadding", js.undefined)
    
    inline def setPadding(value: Scriptable[Double | PartialChartArea, ScriptableContext[bar]]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingFunction2(value: (ScriptableContext[bar], /* options */ AnyObject) => js.UndefOr[Double | PartialChartArea]): Self = StObject.set(x, "padding", js.Any.fromFunction2(value))
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
