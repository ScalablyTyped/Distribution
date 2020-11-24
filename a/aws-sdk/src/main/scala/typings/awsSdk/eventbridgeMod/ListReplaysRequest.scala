package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReplaysRequest extends js.Object {
  
  /**
    * The ARN of the event source associated with the replay.
    */
  var EventSourceArn: js.UndefOr[Arn] = js.native
  
  /**
    * The maximum number of replays to retrieve.
    */
  var Limit: js.UndefOr[LimitMax100] = js.native
  
  /**
    * A name prefix to filter the replays returned. Only replays with name that match the prefix are returned.
    */
  var NamePrefix: js.UndefOr[ReplayName] = js.native
  
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.eventbridgeMod.NextToken] = js.native
  
  /**
    * The state of the replay.
    */
  var State: js.UndefOr[ReplayState] = js.native
}
object ListReplaysRequest {
  
  @scala.inline
  def apply(): ListReplaysRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReplaysRequest]
  }
  
  @scala.inline
  implicit class ListReplaysRequestOps[Self <: ListReplaysRequest] (val x: Self) extends AnyVal {
    
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
    def setEventSourceArn(value: Arn): Self = this.set("EventSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventSourceArn: Self = this.set("EventSourceArn", js.undefined)
    
    @scala.inline
    def setLimit(value: LimitMax100): Self = this.set("Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    
    @scala.inline
    def setNamePrefix(value: ReplayName): Self = this.set("NamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamePrefix: Self = this.set("NamePrefix", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setState(value: ReplayState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
