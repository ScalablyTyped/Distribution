package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutLogEventsResponse extends js.Object {
  
  /**
    * The next sequence token.
    */
  var nextSequenceToken: js.UndefOr[SequenceToken] = js.native
  
  /**
    * The rejected events.
    */
  var rejectedLogEventsInfo: js.UndefOr[RejectedLogEventsInfo] = js.native
}
object PutLogEventsResponse {
  
  @scala.inline
  def apply(): PutLogEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutLogEventsResponse]
  }
  
  @scala.inline
  implicit class PutLogEventsResponseOps[Self <: PutLogEventsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextSequenceToken(value: SequenceToken): Self = this.set("nextSequenceToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextSequenceToken: Self = this.set("nextSequenceToken", js.undefined)
    
    @scala.inline
    def setRejectedLogEventsInfo(value: RejectedLogEventsInfo): Self = this.set("rejectedLogEventsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectedLogEventsInfo: Self = this.set("rejectedLogEventsInfo", js.undefined)
  }
}
