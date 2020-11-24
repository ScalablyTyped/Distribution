package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterOperationStep extends js.Object {
  
  /**
    * 
    Information about the step and its status.
    
    */
  var StepInfo: js.UndefOr[ClusterOperationStepInfo] = js.native
  
  /**
    * 
    The name of the step.
    
    */
  var StepName: js.UndefOr[string] = js.native
}
object ClusterOperationStep {
  
  @scala.inline
  def apply(): ClusterOperationStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterOperationStep]
  }
  
  @scala.inline
  implicit class ClusterOperationStepOps[Self <: ClusterOperationStep] (val x: Self) extends AnyVal {
    
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
    def setStepInfo(value: ClusterOperationStepInfo): Self = this.set("StepInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepInfo: Self = this.set("StepInfo", js.undefined)
    
    @scala.inline
    def setStepName(value: string): Self = this.set("StepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepName: Self = this.set("StepName", js.undefined)
  }
}
