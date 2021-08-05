package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinearScale
  extends StObject
     with ChartScales {
  
  @JSName("ticks")
  var ticks_LinearScale: js.UndefOr[LinearTickOptions] = js.undefined
}
object LinearScale {
  
  inline def apply(): LinearScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearScale]
  }
  
  extension [Self <: LinearScale](x: Self) {
    
    inline def setTicks(value: LinearTickOptions): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
  }
}
