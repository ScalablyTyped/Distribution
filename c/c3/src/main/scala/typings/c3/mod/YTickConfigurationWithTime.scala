package typings.c3.mod

import typings.c3.anon.Interval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YTickConfigurationWithTime
  extends StObject
     with YTickConfiguration {
  
  var time: js.UndefOr[Interval] = js.undefined
}
object YTickConfigurationWithTime {
  
  inline def apply(): YTickConfigurationWithTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YTickConfigurationWithTime]
  }
  
  extension [Self <: YTickConfigurationWithTime](x: Self) {
    
    inline def setTime(value: Interval): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
