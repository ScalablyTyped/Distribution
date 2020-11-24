package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLogEventsResponse extends js.Object {
  
  /**
    * The events.
    */
  var events: js.UndefOr[OutputLogEvents] = js.native
  
  /**
    * The token for the next set of items in the backward direction. The token expires after 24 hours. This token is never null. If you have reached the end of the stream, it returns the same token you passed in.
    */
  var nextBackwardToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The token for the next set of items in the forward direction. The token expires after 24 hours. If you have reached the end of the stream, it returns the same token you passed in.
    */
  var nextForwardToken: js.UndefOr[NextToken] = js.native
}
object GetLogEventsResponse {
  
  @scala.inline
  def apply(): GetLogEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLogEventsResponse]
  }
  
  @scala.inline
  implicit class GetLogEventsResponseOps[Self <: GetLogEventsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventsVarargs(value: OutputLogEvent*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: OutputLogEvents): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setNextBackwardToken(value: NextToken): Self = this.set("nextBackwardToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextBackwardToken: Self = this.set("nextBackwardToken", js.undefined)
    
    @scala.inline
    def setNextForwardToken(value: NextToken): Self = this.set("nextForwardToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextForwardToken: Self = this.set("nextForwardToken", js.undefined)
  }
}
