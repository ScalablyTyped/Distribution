package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetEventsOutput extends StObject {
  
  /**
    * A collection of objects containing event log entries for the specified fleet.
    */
  var Events: js.UndefOr[EventList] = js.undefined
  
  /**
    * Token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object DescribeFleetEventsOutput {
  
  inline def apply(): DescribeFleetEventsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetEventsOutput]
  }
  
  extension [Self <: DescribeFleetEventsOutput](x: Self) {
    
    inline def setEvents(value: EventList): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "Events", js.Array(value :_*))
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
