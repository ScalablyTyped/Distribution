package typings.chartJs.anon

import typings.chartJs.distChunksHelpersDotcoreMod.AnyObject
import typings.chartJs.distChunksHelpersDotcoreMod.Padding
import typings.chartJs.distChunksHelpersDotcoreMod.Scriptable
import typings.chartJs.distChunksHelpersDotcoreMod.ScriptableContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  autoPadding :boolean,   padding :chart.js.chart.js/dist/chunks/helpers.core.Scriptable<chart.js.chart.js/dist/chunks/helpers.core.Padding, chart.js.chart.js/dist/chunks/helpers.core.ScriptableContext<'doughnut'>>}> */
trait PartialautoPaddingbooleanAutoPadding extends StObject {
  
  var autoPadding: js.UndefOr[Boolean] = js.undefined
  
  var padding: js.UndefOr[Scriptable[Padding, ScriptableContext["doughnut"]]] = js.undefined
}
object PartialautoPaddingbooleanAutoPadding {
  
  inline def apply(): PartialautoPaddingbooleanAutoPadding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialautoPaddingbooleanAutoPadding]
  }
  
  extension [Self <: PartialautoPaddingbooleanAutoPadding](x: Self) {
    
    inline def setAutoPadding(value: Boolean): Self = StObject.set(x, "autoPadding", value.asInstanceOf[js.Any])
    
    inline def setAutoPaddingUndefined: Self = StObject.set(x, "autoPadding", js.undefined)
    
    inline def setPadding(value: Scriptable[Padding, ScriptableContext["doughnut"]]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingFunction2(value: (ScriptableContext["doughnut"], /* options */ AnyObject) => js.UndefOr[Padding]): Self = StObject.set(x, "padding", js.Any.fromFunction2(value))
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
