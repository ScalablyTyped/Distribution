package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanaryRunStatus extends StObject {
  
  /**
    * The current state of the run.
    */
  var State: js.UndefOr[CanaryRunState] = js.undefined
  
  /**
    * If run of the canary failed, this field contains the reason for the error.
    */
  var StateReason: js.UndefOr[String] = js.undefined
  
  /**
    * If this value is CANARY_FAILURE, an exception occurred in the canary code. If this value is EXECUTION_FAILURE, an exception occurred in CloudWatch Synthetics.
    */
  var StateReasonCode: js.UndefOr[CanaryRunStateReasonCode] = js.undefined
}
object CanaryRunStatus {
  
  @scala.inline
  def apply(): CanaryRunStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanaryRunStatus]
  }
  
  @scala.inline
  implicit class CanaryRunStatusMutableBuilder[Self <: CanaryRunStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: CanaryRunState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReason(value: String): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReasonCode(value: CanaryRunStateReasonCode): Self = StObject.set(x, "StateReasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReasonCodeUndefined: Self = StObject.set(x, "StateReasonCode", js.undefined)
    
    @scala.inline
    def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
