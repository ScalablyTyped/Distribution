package typings.awsSdk.iot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDeviceEventsResponse extends StObject {
  
  /**
    * An array of zero or more elements describing the event(s) associated with the
    device.
    */
  var Events: js.UndefOr[listOfDeviceEvent] = js.native
  
  /**
    * The token to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListDeviceEventsResponse {
  
  @scala.inline
  def apply(): ListDeviceEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeviceEventsResponse]
  }
  
  @scala.inline
  implicit class ListDeviceEventsResponseMutableBuilder[Self <: ListDeviceEventsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: listOfDeviceEvent): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: DeviceEvent*): Self = StObject.set(x, "Events", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
