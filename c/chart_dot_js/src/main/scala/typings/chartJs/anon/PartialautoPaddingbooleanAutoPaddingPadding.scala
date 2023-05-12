package typings.chartJs.anon

import typings.chartJs.chartJsStrings.scatter
import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesGeometricMod.Padding
import typings.chartJs.distTypesIndexMod.ScriptableContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  autoPadding :boolean,   padding :chart.js.chart.js/dist/types/index.Scriptable<chart.js.chart.js/dist/types/geometric.Padding, chart.js.chart.js/dist/types/index.ScriptableContext<'scatter'>>}> */
trait PartialautoPaddingbooleanAutoPaddingPadding extends StObject {
  
  var autoPadding: js.UndefOr[Boolean] = js.undefined
  
  var padding: js.UndefOr[
    typings.chartJs.distTypesIndexMod.Scriptable[Padding, ScriptableContext[scatter]]
  ] = js.undefined
}
object PartialautoPaddingbooleanAutoPaddingPadding {
  
  inline def apply(): PartialautoPaddingbooleanAutoPaddingPadding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialautoPaddingbooleanAutoPaddingPadding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialautoPaddingbooleanAutoPaddingPadding] (val x: Self) extends AnyVal {
    
    inline def setAutoPadding(value: Boolean): Self = StObject.set(x, "autoPadding", value.asInstanceOf[js.Any])
    
    inline def setAutoPaddingUndefined: Self = StObject.set(x, "autoPadding", js.undefined)
    
    inline def setPadding(value: typings.chartJs.distTypesIndexMod.Scriptable[Padding, ScriptableContext[scatter]]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingFunction2(value: (ScriptableContext[scatter], /* options */ AnyObject) => js.UndefOr[Padding]): Self = StObject.set(x, "padding", js.Any.fromFunction2(value))
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
