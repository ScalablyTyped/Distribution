package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionTrigger extends js.Object {
  
  /**
    * Detail related to the event that started a pipeline execution, such as the webhook ARN of the webhook that triggered the pipeline execution or the user ARN for a user-initiated start-pipeline-execution CLI command.
    */
  var triggerDetail: js.UndefOr[TriggerDetail] = js.native
  
  /**
    * The type of change-detection method, command, or user interaction that started a pipeline execution.
    */
  var triggerType: js.UndefOr[TriggerType] = js.native
}
object ExecutionTrigger {
  
  @scala.inline
  def apply(): ExecutionTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionTrigger]
  }
  
  @scala.inline
  implicit class ExecutionTriggerOps[Self <: ExecutionTrigger] (val x: Self) extends AnyVal {
    
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
    def setTriggerDetail(value: TriggerDetail): Self = this.set("triggerDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerDetail: Self = this.set("triggerDetail", js.undefined)
    
    @scala.inline
    def setTriggerType(value: TriggerType): Self = this.set("triggerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerType: Self = this.set("triggerType", js.undefined)
  }
}
