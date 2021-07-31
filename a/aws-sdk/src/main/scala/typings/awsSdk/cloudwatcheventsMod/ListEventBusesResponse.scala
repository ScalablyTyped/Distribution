package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventBusesResponse extends StObject {
  
  /**
    * This list of event buses.
    */
  var EventBuses: js.UndefOr[EventBusList] = js.undefined
  
  /**
    * A token you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.NextToken] = js.undefined
}
object ListEventBusesResponse {
  
  @scala.inline
  def apply(): ListEventBusesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventBusesResponse]
  }
  
  @scala.inline
  implicit class ListEventBusesResponseMutableBuilder[Self <: ListEventBusesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventBuses(value: EventBusList): Self = StObject.set(x, "EventBuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventBusesUndefined: Self = StObject.set(x, "EventBuses", js.undefined)
    
    @scala.inline
    def setEventBusesVarargs(value: EventBus*): Self = StObject.set(x, "EventBuses", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
