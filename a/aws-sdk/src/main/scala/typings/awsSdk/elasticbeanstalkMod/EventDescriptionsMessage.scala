package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventDescriptionsMessage extends StObject {
  
  /**
    *  A list of EventDescription. 
    */
  var Events: js.UndefOr[EventDescriptionList] = js.native
  
  /**
    *  If returned, this indicates that there are more results to obtain. Use this token in the next DescribeEvents call to get the next batch of events. 
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object EventDescriptionsMessage {
  
  @scala.inline
  def apply(): EventDescriptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDescriptionsMessage]
  }
  
  @scala.inline
  implicit class EventDescriptionsMessageMutableBuilder[Self <: EventDescriptionsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: EventDescriptionList): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: EventDescription*): Self = StObject.set(x, "Events", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
