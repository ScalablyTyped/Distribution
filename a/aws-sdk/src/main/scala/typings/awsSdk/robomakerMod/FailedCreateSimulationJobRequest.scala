package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailedCreateSimulationJobRequest extends StObject {
  
  /**
    * The time, in milliseconds since the epoch, when the simulation job batch failed.
    */
  var failedAt: js.UndefOr[FailedAt] = js.native
  
  /**
    * The failure code.
    */
  var failureCode: js.UndefOr[SimulationJobErrorCode] = js.native
  
  /**
    * The failure reason of the simulation job request.
    */
  var failureReason: js.UndefOr[GenericString] = js.native
  
  /**
    * The simulation job request.
    */
  var request: js.UndefOr[SimulationJobRequest] = js.native
}
object FailedCreateSimulationJobRequest {
  
  @scala.inline
  def apply(): FailedCreateSimulationJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedCreateSimulationJobRequest]
  }
  
  @scala.inline
  implicit class FailedCreateSimulationJobRequestMutableBuilder[Self <: FailedCreateSimulationJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedAt(value: FailedAt): Self = StObject.set(x, "failedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedAtUndefined: Self = StObject.set(x, "failedAt", js.undefined)
    
    @scala.inline
    def setFailureCode(value: SimulationJobErrorCode): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    @scala.inline
    def setFailureReason(value: GenericString): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    @scala.inline
    def setRequest(value: SimulationJobRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
