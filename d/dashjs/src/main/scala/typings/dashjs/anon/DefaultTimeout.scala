package typings.dashjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultTimeout extends StObject {
  
  var defaultTimeout: js.UndefOr[Double] = js.undefined
  
  var lowLatencyTimeout: js.UndefOr[Double] = js.undefined
  
  var scheduleWhilePaused: js.UndefOr[Boolean] = js.undefined
}
object DefaultTimeout {
  
  inline def apply(): DefaultTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultTimeout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultTimeout] (val x: Self) extends AnyVal {
    
    inline def setDefaultTimeout(value: Double): Self = StObject.set(x, "defaultTimeout", value.asInstanceOf[js.Any])
    
    inline def setDefaultTimeoutUndefined: Self = StObject.set(x, "defaultTimeout", js.undefined)
    
    inline def setLowLatencyTimeout(value: Double): Self = StObject.set(x, "lowLatencyTimeout", value.asInstanceOf[js.Any])
    
    inline def setLowLatencyTimeoutUndefined: Self = StObject.set(x, "lowLatencyTimeout", js.undefined)
    
    inline def setScheduleWhilePaused(value: Boolean): Self = StObject.set(x, "scheduleWhilePaused", value.asInstanceOf[js.Any])
    
    inline def setScheduleWhilePausedUndefined: Self = StObject.set(x, "scheduleWhilePaused", js.undefined)
  }
}
