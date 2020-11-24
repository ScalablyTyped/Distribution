package typings.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSpeechSynthesisTaskInput extends js.Object {
  
  /**
    * The Amazon Polly generated identifier for a speech synthesis task.
    */
  var TaskId: typings.awsSdk.pollyMod.TaskId = js.native
}
object GetSpeechSynthesisTaskInput {
  
  @scala.inline
  def apply(TaskId: TaskId): GetSpeechSynthesisTaskInput = {
    val __obj = js.Dynamic.literal(TaskId = TaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSpeechSynthesisTaskInput]
  }
  
  @scala.inline
  implicit class GetSpeechSynthesisTaskInputOps[Self <: GetSpeechSynthesisTaskInput] (val x: Self) extends AnyVal {
    
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
    def setTaskId(value: TaskId): Self = this.set("TaskId", value.asInstanceOf[js.Any])
  }
}
