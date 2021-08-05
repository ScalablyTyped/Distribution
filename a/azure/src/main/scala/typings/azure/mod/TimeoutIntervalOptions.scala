package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeoutIntervalOptions extends StObject {
  
  var locationMode: js.UndefOr[String] = js.undefined
  
  var maximumExecutionTimeInMs: js.UndefOr[Double] = js.undefined
  
  var timeoutIntervalInMs: js.UndefOr[Double] = js.undefined
}
object TimeoutIntervalOptions {
  
  inline def apply(): TimeoutIntervalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeoutIntervalOptions]
  }
  
  extension [Self <: TimeoutIntervalOptions](x: Self) {
    
    inline def setLocationMode(value: String): Self = StObject.set(x, "locationMode", value.asInstanceOf[js.Any])
    
    inline def setLocationModeUndefined: Self = StObject.set(x, "locationMode", js.undefined)
    
    inline def setMaximumExecutionTimeInMs(value: Double): Self = StObject.set(x, "maximumExecutionTimeInMs", value.asInstanceOf[js.Any])
    
    inline def setMaximumExecutionTimeInMsUndefined: Self = StObject.set(x, "maximumExecutionTimeInMs", js.undefined)
    
    inline def setTimeoutIntervalInMs(value: Double): Self = StObject.set(x, "timeoutIntervalInMs", value.asInstanceOf[js.Any])
    
    inline def setTimeoutIntervalInMsUndefined: Self = StObject.set(x, "timeoutIntervalInMs", js.undefined)
  }
}
