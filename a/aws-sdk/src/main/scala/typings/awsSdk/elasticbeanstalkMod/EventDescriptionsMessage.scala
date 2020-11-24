package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventDescriptionsMessage extends js.Object {
  
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
  implicit class EventDescriptionsMessageOps[Self <: EventDescriptionsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventsVarargs(value: EventDescription*): Self = this.set("Events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: EventDescriptionList): Self = this.set("Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("Events", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
