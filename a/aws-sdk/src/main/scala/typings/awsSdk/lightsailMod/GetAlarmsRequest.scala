package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAlarmsRequest extends StObject {
  
  /**
    * The name of the alarm. Specify an alarm name to return information about a specific alarm.
    */
  var alarmName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The name of the Lightsail resource being monitored by the alarm. Specify a monitored resource name to return information about all alarms for a specific resource.
    */
  var monitoredResourceName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetAlarms request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object GetAlarmsRequest {
  
  inline def apply(): GetAlarmsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAlarmsRequest]
  }
  
  extension [Self <: GetAlarmsRequest](x: Self) {
    
    inline def setAlarmName(value: ResourceName): Self = StObject.set(x, "alarmName", value.asInstanceOf[js.Any])
    
    inline def setAlarmNameUndefined: Self = StObject.set(x, "alarmName", js.undefined)
    
    inline def setMonitoredResourceName(value: ResourceName): Self = StObject.set(x, "monitoredResourceName", value.asInstanceOf[js.Any])
    
    inline def setMonitoredResourceNameUndefined: Self = StObject.set(x, "monitoredResourceName", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
