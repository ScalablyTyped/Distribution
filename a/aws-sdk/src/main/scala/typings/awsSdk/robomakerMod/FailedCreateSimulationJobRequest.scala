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
  def apply(
    failedAt: FailedAt = null,
    failureCode: SimulationJobErrorCode = null,
    failureReason: GenericString = null,
    request: SimulationJobRequest = null
  ): FailedCreateSimulationJobRequest = {
    val __obj = js.Dynamic.literal()
    if (failedAt != null) __obj.updateDynamic("failedAt")(failedAt.asInstanceOf[js.Any])
    if (failureCode != null) __obj.updateDynamic("failureCode")(failureCode.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedCreateSimulationJobRequest]
  }
}

