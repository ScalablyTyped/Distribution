package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinearScale extends ChartScales {
  
  @JSName("ticks")
  var ticks_LinearScale: js.UndefOr[LinearTickOptions] = js.native
}
object LinearScale {
  
  @scala.inline
  def apply(): LinearScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearScale]
  }
  
  @scala.inline
  implicit class LinearScaleMutableBuilder[Self <: LinearScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTicks(value: LinearTickOptions): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
  }
}
