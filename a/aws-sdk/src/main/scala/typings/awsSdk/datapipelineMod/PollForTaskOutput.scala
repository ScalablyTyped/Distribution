package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PollForTaskOutput extends js.Object {
  
  /**
    * The information needed to complete the task that is being assigned to the task runner. One of the fields returned in this object is taskId, which contains an identifier for the task being assigned. The calling task runner uses taskId in subsequent calls to ReportTaskProgress and SetTaskStatus.
    */
  var taskObject: js.UndefOr[TaskObject] = js.native
}
object PollForTaskOutput {
  
  @scala.inline
  def apply(): PollForTaskOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollForTaskOutput]
  }
  
  @scala.inline
  implicit class PollForTaskOutputOps[Self <: PollForTaskOutput] (val x: Self) extends AnyVal {
    
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
    def setTaskObject(value: TaskObject): Self = this.set("taskObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskObject: Self = this.set("taskObject", js.undefined)
  }
}
