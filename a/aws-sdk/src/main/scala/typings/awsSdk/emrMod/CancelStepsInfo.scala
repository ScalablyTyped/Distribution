package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelStepsInfo extends StObject {
  
  /**
    * The reason for the failure if the CancelSteps request fails.
    */
  var Reason: js.UndefOr[String] = js.native
  
  /**
    * The status of a CancelSteps Request. The value may be SUBMITTED or FAILED.
    */
  var Status: js.UndefOr[CancelStepsRequestStatus] = js.native
  
  /**
    * The encrypted StepId of a step.
    */
  var StepId: js.UndefOr[typings.awsSdk.emrMod.StepId] = js.native
}
object CancelStepsInfo {
  
  @scala.inline
  def apply(): CancelStepsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelStepsInfo]
  }
  
  @scala.inline
  implicit class CancelStepsInfoMutableBuilder[Self <: CancelStepsInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
    
    @scala.inline
    def setStatus(value: CancelStepsRequestStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setStepId(value: StepId): Self = StObject.set(x, "StepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepIdUndefined: Self = StObject.set(x, "StepId", js.undefined)
  }
}
