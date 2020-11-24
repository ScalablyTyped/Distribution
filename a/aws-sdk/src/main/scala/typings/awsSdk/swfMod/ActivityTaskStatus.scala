package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityTaskStatus extends js.Object {
  
  /**
    * Set to true if cancellation of the task is requested.
    */
  var cancelRequested: Canceled = js.native
}
object ActivityTaskStatus {
  
  @scala.inline
  def apply(cancelRequested: Canceled): ActivityTaskStatus = {
    val __obj = js.Dynamic.literal(cancelRequested = cancelRequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTaskStatus]
  }
  
  @scala.inline
  implicit class ActivityTaskStatusOps[Self <: ActivityTaskStatus] (val x: Self) extends AnyVal {
    
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
    def setCancelRequested(value: Canceled): Self = this.set("cancelRequested", value.asInstanceOf[js.Any])
  }
}
