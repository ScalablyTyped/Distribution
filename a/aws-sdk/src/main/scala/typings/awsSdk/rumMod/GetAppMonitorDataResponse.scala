package typings.awsSdk.rumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppMonitorDataResponse extends StObject {
  
  /**
    * The events that RUM collected that match your request.
    */
  var Events: js.UndefOr[EventDataList] = js.undefined
  
  /**
    * A token that you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object GetAppMonitorDataResponse {
  
  inline def apply(): GetAppMonitorDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppMonitorDataResponse]
  }
  
  extension [Self <: GetAppMonitorDataResponse](x: Self) {
    
    inline def setEvents(value: EventDataList): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    inline def setEventsVarargs(value: EventData*): Self = StObject.set(x, "Events", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
