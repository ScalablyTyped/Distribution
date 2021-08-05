package typings.c3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YAxisConfigurationWithTime
  extends StObject
     with YAxisConfiguration {
  
  @JSName("tick")
  var tick_YAxisConfigurationWithTime: js.UndefOr[YTickConfigurationWithTime] = js.undefined
}
object YAxisConfigurationWithTime {
  
  inline def apply(): YAxisConfigurationWithTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YAxisConfigurationWithTime]
  }
  
  extension [Self <: YAxisConfigurationWithTime](x: Self) {
    
    inline def setTick(value: YTickConfigurationWithTime): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    inline def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
  }
}
