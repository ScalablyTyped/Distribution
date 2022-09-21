package typings.chartJs.anon

import typings.chartJs.basicMod.AnyObject
import typings.chartJs.chartJsBooleans.`false`
import typings.chartJs.elementMod.Element
import typings.chartJs.mod.ChartMeta
import typings.chartJs.mod.ChartType
import typings.chartJs.mod.UpdateMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Meta extends StObject {
  
  var cancelable: `false`
  
  var index: Double
  
  var meta: ChartMeta[Element[AnyObject, AnyObject], Element[AnyObject, AnyObject], ChartType]
  
  var mode: UpdateMode
}
object Meta {
  
  inline def apply(
    index: Double,
    meta: ChartMeta[Element[AnyObject, AnyObject], Element[AnyObject, AnyObject], ChartType],
    mode: UpdateMode
  ): Meta = {
    val __obj = js.Dynamic.literal(cancelable = false, index = index.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  
  extension [Self <: Meta](x: Self) {
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: ChartMeta[Element[AnyObject, AnyObject], Element[AnyObject, AnyObject], ChartType]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMode(value: UpdateMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
