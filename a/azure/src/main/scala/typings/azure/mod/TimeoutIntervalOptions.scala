package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeoutIntervalOptions extends StObject {
  
  var locationMode: js.UndefOr[String] = js.native
  
  var maximumExecutionTimeInMs: js.UndefOr[Double] = js.native
  
  var timeoutIntervalInMs: js.UndefOr[Double] = js.native
}
object TimeoutIntervalOptions {
  
  @scala.inline
  def apply(): TimeoutIntervalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeoutIntervalOptions]
  }
  
  @scala.inline
  implicit class TimeoutIntervalOptionsMutableBuilder[Self <: TimeoutIntervalOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocationMode(value: String): Self = StObject.set(x, "locationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationModeUndefined: Self = StObject.set(x, "locationMode", js.undefined)
    
    @scala.inline
    def setMaximumExecutionTimeInMs(value: Double): Self = StObject.set(x, "maximumExecutionTimeInMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumExecutionTimeInMsUndefined: Self = StObject.set(x, "maximumExecutionTimeInMs", js.undefined)
    
    @scala.inline
    def setTimeoutIntervalInMs(value: Double): Self = StObject.set(x, "timeoutIntervalInMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutIntervalInMsUndefined: Self = StObject.set(x, "timeoutIntervalInMs", js.undefined)
  }
}
