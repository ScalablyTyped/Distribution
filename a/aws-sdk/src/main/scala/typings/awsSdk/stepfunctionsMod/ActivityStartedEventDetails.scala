package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityStartedEventDetails extends js.Object {
  
  /**
    * The name of the worker that the task is assigned to. These names are provided by the workers when calling GetActivityTask.
    */
  var workerName: js.UndefOr[Identity] = js.native
}
object ActivityStartedEventDetails {
  
  @scala.inline
  def apply(): ActivityStartedEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityStartedEventDetails]
  }
  
  @scala.inline
  implicit class ActivityStartedEventDetailsOps[Self <: ActivityStartedEventDetails] (val x: Self) extends AnyVal {
    
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
    def setWorkerName(value: Identity): Self = this.set("workerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerName: Self = this.set("workerName", js.undefined)
  }
}
