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
  
  inline def apply(): ListEventBusesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventBusesResponse]
  }
  
  extension [Self <: ListEventBusesResponse](x: Self) {
    
    inline def setEventBuses(value: EventBusList): Self = StObject.set(x, "EventBuses", value.asInstanceOf[js.Any])
    
    inline def setEventBusesUndefined: Self = StObject.set(x, "EventBuses", js.undefined)
    
    inline def setEventBusesVarargs(value: EventBus*): Self = StObject.set(x, "EventBuses", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
