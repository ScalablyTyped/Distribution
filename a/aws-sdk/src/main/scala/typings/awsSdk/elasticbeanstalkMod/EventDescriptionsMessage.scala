package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventDescriptionsMessage extends StObject {
  
  /**
    *  A list of EventDescription. 
    */
  var Events: js.UndefOr[EventDescriptionList] = js.undefined
  
  /**
    *  If returned, this indicates that there are more results to obtain. Use this token in the next DescribeEvents call to get the next batch of events. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object EventDescriptionsMessage {
  
  inline def apply(): EventDescriptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDescriptionsMessage]
  }
  
  extension [Self <: EventDescriptionsMessage](x: Self) {
    
    inline def setEvents(value: EventDescriptionList): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    inline def setEventsVarargs(value: EventDescription*): Self = StObject.set(x, "Events", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
