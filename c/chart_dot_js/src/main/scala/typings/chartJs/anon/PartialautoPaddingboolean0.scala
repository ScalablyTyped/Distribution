package typings.chartJs.anon

import typings.chartJs.chartJsStrings.pie
import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesGeometricMod.Padding
import typings.chartJs.distTypesIndexMod.ScriptableContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  autoPadding :boolean,   padding :chart.js.chart.js/dist/types/index.Scriptable<chart.js.chart.js/dist/types/geometric.Padding, chart.js.chart.js/dist/types/index.ScriptableContext<'pie'>>}> */
trait PartialautoPaddingboolean0 extends StObject {
  
  var autoPadding: js.UndefOr[Boolean] = js.undefined
  
  var padding: js.UndefOr[typings.chartJs.distTypesIndexMod.Scriptable[Padding, ScriptableContext[pie]]] = js.undefined
}
object PartialautoPaddingboolean0 {
  
  inline def apply(): PartialautoPaddingboolean0 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialautoPaddingboolean0]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialautoPaddingboolean0] (val x: Self) extends AnyVal {
    
    inline def setAutoPadding(value: Boolean): Self = StObject.set(x, "autoPadding", value.asInstanceOf[js.Any])
    
    inline def setAutoPaddingUndefined: Self = StObject.set(x, "autoPadding", js.undefined)
    
    inline def setPadding(value: typings.chartJs.distTypesIndexMod.Scriptable[Padding, ScriptableContext[pie]]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingFunction2(value: (ScriptableContext[pie], /* options */ AnyObject) => js.UndefOr[Padding]): Self = StObject.set(x, "padding", js.Any.fromFunction2(value))
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
