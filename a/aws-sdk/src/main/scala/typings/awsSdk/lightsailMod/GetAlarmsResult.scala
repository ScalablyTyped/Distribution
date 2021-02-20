package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAlarmsResult extends StObject {
  
  /**
    * An array of objects that describe the alarms.
    */
  var alarms: js.UndefOr[AlarmsList] = js.native
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetAlarms request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GetAlarmsResult {
  
  @scala.inline
  def apply(): GetAlarmsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAlarmsResult]
  }
  
  @scala.inline
  implicit class GetAlarmsResultMutableBuilder[Self <: GetAlarmsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlarms(value: AlarmsList): Self = StObject.set(x, "alarms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmsUndefined: Self = StObject.set(x, "alarms", js.undefined)
    
    @scala.inline
    def setAlarmsVarargs(value: Alarm*): Self = StObject.set(x, "alarms", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
