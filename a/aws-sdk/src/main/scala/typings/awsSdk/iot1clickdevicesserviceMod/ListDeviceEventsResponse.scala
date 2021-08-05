package typings.awsSdk.iot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeviceEventsResponse extends StObject {
  
  /**
    * An array of zero or more elements describing the event(s) associated with the
    device.
    */
  var Events: js.UndefOr[listOfDeviceEvent] = js.undefined
  
  /**
    * The token to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListDeviceEventsResponse {
  
  inline def apply(): ListDeviceEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeviceEventsResponse]
  }
  
  extension [Self <: ListDeviceEventsResponse](x: Self) {
    
    inline def setEvents(value: listOfDeviceEvent): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    inline def setEventsVarargs(value: DeviceEvent*): Self = StObject.set(x, "Events", js.Array(value :_*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
