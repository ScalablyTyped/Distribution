package typings.chartJs.anon

import typings.chartJs.chartJsBooleans.`true`
import typings.chartJs.mod.ChartMeta
import typings.chartJs.mod.ChartType
import typings.chartJs.mod.UpdateMode
import typings.chartJs.typesBasicMod.AnyObject
import typings.chartJs.typesElementMod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index extends StObject {
  
  var cancelable: `true`
  
  var index: Double
  
  var meta: ChartMeta[Element[AnyObject, AnyObject], Element[AnyObject, AnyObject], ChartType]
  
  var mode: UpdateMode
}
object Index {
  
  inline def apply(
    index: Double,
    meta: ChartMeta[Element[AnyObject, AnyObject], Element[AnyObject, AnyObject], ChartType],
    mode: UpdateMode
  ): Index = {
    val __obj = js.Dynamic.literal(cancelable = true, index = index.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
    
    inline def setCancelable(value: `true`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: ChartMeta[Element[AnyObject, AnyObject], Element[AnyObject, AnyObject], ChartType]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMode(value: UpdateMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
