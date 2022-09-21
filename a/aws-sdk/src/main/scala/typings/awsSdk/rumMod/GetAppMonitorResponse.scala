package typings.awsSdk.rumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppMonitorResponse extends StObject {
  
  /**
    * A structure containing all the configuration information for the app monitor.
    */
  var AppMonitor: js.UndefOr[typings.awsSdk.rumMod.AppMonitor] = js.undefined
}
object GetAppMonitorResponse {
  
  inline def apply(): GetAppMonitorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppMonitorResponse]
  }
  
  extension [Self <: GetAppMonitorResponse](x: Self) {
    
    inline def setAppMonitor(value: AppMonitor): Self = StObject.set(x, "AppMonitor", value.asInstanceOf[js.Any])
    
    inline def setAppMonitorUndefined: Self = StObject.set(x, "AppMonitor", js.undefined)
  }
}
