package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepDetail extends js.Object {
  
  /**
    * The description of the step status.
    */
  var ExecutionStatusDetail: StepExecutionStatusDetail = js.native
  
  /**
    * The step configuration.
    */
  var StepConfig: typings.awsSdk.emrMod.StepConfig = js.native
}
object StepDetail {
  
  @scala.inline
  def apply(ExecutionStatusDetail: StepExecutionStatusDetail, StepConfig: StepConfig): StepDetail = {
    val __obj = js.Dynamic.literal(ExecutionStatusDetail = ExecutionStatusDetail.asInstanceOf[js.Any], StepConfig = StepConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepDetail]
  }
  
  @scala.inline
  implicit class StepDetailOps[Self <: StepDetail] (val x: Self) extends AnyVal {
    
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
    def setExecutionStatusDetail(value: StepExecutionStatusDetail): Self = this.set("ExecutionStatusDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepConfig(value: StepConfig): Self = this.set("StepConfig", value.asInstanceOf[js.Any])
  }
}
