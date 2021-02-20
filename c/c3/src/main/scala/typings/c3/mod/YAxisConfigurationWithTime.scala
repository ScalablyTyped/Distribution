package typings.c3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YAxisConfigurationWithTime extends YAxisConfiguration {
  
  @JSName("tick")
  var tick_YAxisConfigurationWithTime: js.UndefOr[YTickConfigurationWithTime] = js.native
}
object YAxisConfigurationWithTime {
  
  @scala.inline
  def apply(): YAxisConfigurationWithTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YAxisConfigurationWithTime]
  }
  
  @scala.inline
  implicit class YAxisConfigurationWithTimeMutableBuilder[Self <: YAxisConfigurationWithTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTick(value: YTickConfigurationWithTime): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
  }
}
