package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelReplayRequest extends js.Object {
  
  /**
    * The name of the replay to cancel.
    */
  var ReplayName: typings.awsSdk.cloudwatcheventsMod.ReplayName = js.native
}
object CancelReplayRequest {
  
  @scala.inline
  def apply(ReplayName: ReplayName): CancelReplayRequest = {
    val __obj = js.Dynamic.literal(ReplayName = ReplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelReplayRequest]
  }
  
  @scala.inline
  implicit class CancelReplayRequestOps[Self <: CancelReplayRequest] (val x: Self) extends AnyVal {
    
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
    def setReplayName(value: ReplayName): Self = this.set("ReplayName", value.asInstanceOf[js.Any])
  }
}
