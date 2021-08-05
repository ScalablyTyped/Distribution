package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogarithmicScale
  extends StObject
     with ChartScales {
  
  @JSName("ticks")
  var ticks_LogarithmicScale: js.UndefOr[LogarithmicTickOptions] = js.undefined
}
object LogarithmicScale {
  
  inline def apply(): LogarithmicScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogarithmicScale]
  }
  
  extension [Self <: LogarithmicScale](x: Self) {
    
    inline def setTicks(value: LogarithmicTickOptions): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
  }
}
