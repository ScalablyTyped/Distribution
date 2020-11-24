package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemediationExecutionStatus extends js.Object {
  
  /**
    * Start time when the remediation was executed.
    */
  var InvocationTime: js.UndefOr[Date] = js.native
  
  /**
    * The time when the remediation execution was last updated.
    */
  var LastUpdatedTime: js.UndefOr[Date] = js.native
  
  var ResourceKey: js.UndefOr[typings.awsSdk.configserviceMod.ResourceKey] = js.native
  
  /**
    * ENUM of the values.
    */
  var State: js.UndefOr[RemediationExecutionState] = js.native
  
  /**
    * Details of every step.
    */
  var StepDetails: js.UndefOr[RemediationExecutionSteps] = js.native
}
object RemediationExecutionStatus {
  
  @scala.inline
  def apply(): RemediationExecutionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemediationExecutionStatus]
  }
  
  @scala.inline
  implicit class RemediationExecutionStatusOps[Self <: RemediationExecutionStatus] (val x: Self) extends AnyVal {
    
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
    def setInvocationTime(value: Date): Self = this.set("InvocationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvocationTime: Self = this.set("InvocationTime", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: Date): Self = this.set("LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setResourceKey(value: ResourceKey): Self = this.set("ResourceKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceKey: Self = this.set("ResourceKey", js.undefined)
    
    @scala.inline
    def setState(value: RemediationExecutionState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setStepDetailsVarargs(value: RemediationExecutionStep*): Self = this.set("StepDetails", js.Array(value :_*))
    
    @scala.inline
    def setStepDetails(value: RemediationExecutionSteps): Self = this.set("StepDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepDetails: Self = this.set("StepDetails", js.undefined)
  }
}
