package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPolicy extends js.Object {
  /**
    * The number of active simulation jobs create as part of the batch that can be in an active state at the same time.  Active states include: Pending,Preparing, Running, Restarting, RunningFailed and Terminating. All other states are terminal states. 
    */
  var maxConcurrency: js.UndefOr[MaxConcurrency] = js.native
  /**
    * The amount of time, in seconds, to wait for the batch to complete.  If a batch times out, and there are pending requests that were failing due to an internal failure (like InternalServiceError), they will be moved to the failed list and the batch status will be Failed. If the pending requests were failing for any other reason, the failed pending requests will be moved to the failed list and the batch status will be TimedOut. 
    */
  var timeoutInSeconds: js.UndefOr[BatchTimeoutInSeconds] = js.native
}

object BatchPolicy {
  @scala.inline
  def apply(
    maxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined,
    timeoutInSeconds: js.UndefOr[BatchTimeoutInSeconds] = js.undefined
  ): BatchPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxConcurrency)) __obj.updateDynamic("maxConcurrency")(maxConcurrency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutInSeconds)) __obj.updateDynamic("timeoutInSeconds")(timeoutInSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPolicy]
  }
}

