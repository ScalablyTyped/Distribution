package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTaskExecutionRequest extends js.Object {
  
  var Options: typings.awsSdk.datasyncMod.Options = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the specific task execution that is being updated. 
    */
  var TaskExecutionArn: typings.awsSdk.datasyncMod.TaskExecutionArn = js.native
}
object UpdateTaskExecutionRequest {
  
  @scala.inline
  def apply(Options: Options, TaskExecutionArn: TaskExecutionArn): UpdateTaskExecutionRequest = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], TaskExecutionArn = TaskExecutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTaskExecutionRequest]
  }
  
  @scala.inline
  implicit class UpdateTaskExecutionRequestOps[Self <: UpdateTaskExecutionRequest] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: Options): Self = this.set("Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskExecutionArn(value: TaskExecutionArn): Self = this.set("TaskExecutionArn", value.asInstanceOf[js.Any])
  }
}
