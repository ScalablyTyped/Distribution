package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedCreateSimulationJobRequest extends js.Object {
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
  implicit class FailedCreateSimulationJobRequestOps[Self <: FailedCreateSimulationJobRequest] (val x: Self) extends AnyVal {
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
    def setFailedAt(value: FailedAt): Self = this.set("failedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedAt: Self = this.set("failedAt", js.undefined)
    @scala.inline
    def setFailureCode(value: SimulationJobErrorCode): Self = this.set("failureCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureCode: Self = this.set("failureCode", js.undefined)
    @scala.inline
    def setFailureReason(value: GenericString): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    @scala.inline
    def setRequest(value: SimulationJobRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
  }
  
}

