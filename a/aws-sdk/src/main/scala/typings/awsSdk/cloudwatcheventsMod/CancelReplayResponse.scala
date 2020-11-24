package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelReplayResponse extends js.Object {
  
  /**
    * The ARN of the replay to cancel.
    */
  var ReplayArn: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.ReplayArn] = js.native
  
  /**
    * The current state of the replay.
    */
  var State: js.UndefOr[ReplayState] = js.native
  
  /**
    * The reason that the replay is in the current state.
    */
  var StateReason: js.UndefOr[ReplayStateReason] = js.native
}
object CancelReplayResponse {
  
  @scala.inline
  def apply(): CancelReplayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelReplayResponse]
  }
  
  @scala.inline
  implicit class CancelReplayResponseOps[Self <: CancelReplayResponse] (val x: Self) extends AnyVal {
    
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
    def setReplayArn(value: ReplayArn): Self = this.set("ReplayArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplayArn: Self = this.set("ReplayArn", js.undefined)
    
    @scala.inline
    def setState(value: ReplayState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setStateReason(value: ReplayStateReason): Self = this.set("StateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateReason: Self = this.set("StateReason", js.undefined)
  }
}
