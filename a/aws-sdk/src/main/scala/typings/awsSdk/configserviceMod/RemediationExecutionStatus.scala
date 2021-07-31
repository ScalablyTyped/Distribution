package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemediationExecutionStatus extends StObject {
  
  /**
    * Start time when the remediation was executed.
    */
  var InvocationTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The time when the remediation execution was last updated.
    */
  var LastUpdatedTime: js.UndefOr[Date] = js.undefined
  
  var ResourceKey: js.UndefOr[typings.awsSdk.configserviceMod.ResourceKey] = js.undefined
  
  /**
    * ENUM of the values.
    */
  var State: js.UndefOr[RemediationExecutionState] = js.undefined
  
  /**
    * Details of every step.
    */
  var StepDetails: js.UndefOr[RemediationExecutionSteps] = js.undefined
}
object RemediationExecutionStatus {
  
  @scala.inline
  def apply(): RemediationExecutionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemediationExecutionStatus]
  }
  
  @scala.inline
  implicit class RemediationExecutionStatusMutableBuilder[Self <: RemediationExecutionStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvocationTime(value: Date): Self = StObject.set(x, "InvocationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationTimeUndefined: Self = StObject.set(x, "InvocationTime", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setResourceKey(value: ResourceKey): Self = StObject.set(x, "ResourceKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceKeyUndefined: Self = StObject.set(x, "ResourceKey", js.undefined)
    
    @scala.inline
    def setState(value: RemediationExecutionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setStepDetails(value: RemediationExecutionSteps): Self = StObject.set(x, "StepDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepDetailsUndefined: Self = StObject.set(x, "StepDetails", js.undefined)
    
    @scala.inline
    def setStepDetailsVarargs(value: RemediationExecutionStep*): Self = StObject.set(x, "StepDetails", js.Array(value :_*))
  }
}
