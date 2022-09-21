package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventsResponse extends StObject {
  
  /**
    *  A list of the requested events. 
    */
  var Events: typings.awsSdk.devopsguruMod.Events
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[UuidNextToken] = js.undefined
}
object ListEventsResponse {
  
  inline def apply(Events: Events): ListEventsResponse = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventsResponse]
  }
  
  extension [Self <: ListEventsResponse](x: Self) {
    
    inline def setEvents(value: Events): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "Events", js.Array(value*))
    
    inline def setNextToken(value: UuidNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
