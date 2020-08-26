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
  def apply(): BatchPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPolicy]
  }
  @scala.inline
  implicit class BatchPolicyOps[Self <: BatchPolicy] (val x: Self) extends AnyVal {
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
    def setMaxConcurrency(value: MaxConcurrency): Self = this.set("maxConcurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConcurrency: Self = this.set("maxConcurrency", js.undefined)
    @scala.inline
    def setTimeoutInSeconds(value: BatchTimeoutInSeconds): Self = this.set("timeoutInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutInSeconds: Self = this.set("timeoutInSeconds", js.undefined)
  }
  
}

