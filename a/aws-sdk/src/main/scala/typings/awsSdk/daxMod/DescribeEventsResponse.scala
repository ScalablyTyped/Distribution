package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventsResponse extends StObject {
  
  /**
    * An array of events. Each element in the array represents one event.
    */
  var Events: js.UndefOr[EventList] = js.undefined
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeEventsResponse {
  
  inline def apply(): DescribeEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventsResponse]
  }
  
  extension [Self <: DescribeEventsResponse](x: Self) {
    
    inline def setEvents(value: EventList): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "Events", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
