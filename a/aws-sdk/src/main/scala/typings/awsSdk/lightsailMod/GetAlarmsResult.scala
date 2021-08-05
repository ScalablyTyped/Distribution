package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAlarmsResult extends StObject {
  
  /**
    * An array of objects that describe the alarms.
    */
  var alarms: js.UndefOr[AlarmsList] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetAlarms request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GetAlarmsResult {
  
  inline def apply(): GetAlarmsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAlarmsResult]
  }
  
  extension [Self <: GetAlarmsResult](x: Self) {
    
    inline def setAlarms(value: AlarmsList): Self = StObject.set(x, "alarms", value.asInstanceOf[js.Any])
    
    inline def setAlarmsUndefined: Self = StObject.set(x, "alarms", js.undefined)
    
    inline def setAlarmsVarargs(value: Alarm*): Self = StObject.set(x, "alarms", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
