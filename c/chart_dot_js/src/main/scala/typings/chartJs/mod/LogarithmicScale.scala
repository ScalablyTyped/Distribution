package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogarithmicScale extends ChartScales {
  
  @JSName("ticks")
  var ticks_LogarithmicScale: js.UndefOr[LogarithmicTickOptions] = js.native
}
object LogarithmicScale {
  
  @scala.inline
  def apply(): LogarithmicScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogarithmicScale]
  }
  
  @scala.inline
  implicit class LogarithmicScaleMutableBuilder[Self <: LogarithmicScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTicks(value: LogarithmicTickOptions): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
  }
}
