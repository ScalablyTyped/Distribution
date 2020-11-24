package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetActivityTaskOutput extends js.Object {
  
  /**
    * The string that contains the JSON input data for the task. Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.
    */
  var input: js.UndefOr[SensitiveDataJobInput] = js.native
  
  /**
    * A token that identifies the scheduled task. This token must be copied and included in subsequent calls to SendTaskHeartbeat, SendTaskSuccess or SendTaskFailure in order to report the progress or completion of the task.
    */
  var taskToken: js.UndefOr[TaskToken] = js.native
}
object GetActivityTaskOutput {
  
  @scala.inline
  def apply(): GetActivityTaskOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetActivityTaskOutput]
  }
  
  @scala.inline
  implicit class GetActivityTaskOutputOps[Self <: GetActivityTaskOutput] (val x: Self) extends AnyVal {
    
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
    def setInput(value: SensitiveDataJobInput): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setTaskToken(value: TaskToken): Self = this.set("taskToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskToken: Self = this.set("taskToken", js.undefined)
  }
}
