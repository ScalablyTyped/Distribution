package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutProvisionedConcurrencyConfigResponse extends js.Object {
  /**
    * The amount of provisioned concurrency allocated.
    */
  var AllocatedProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger] = js.native
  /**
    * The amount of provisioned concurrency available.
    */
  var AvailableProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger] = js.native
  /**
    * The date and time that a user last updated the configuration, in ISO 8601 format.
    */
  var LastModified: js.UndefOr[Timestamp] = js.native
  /**
    * The amount of provisioned concurrency requested.
    */
  var RequestedProvisionedConcurrentExecutions: js.UndefOr[PositiveInteger] = js.native
  /**
    * The status of the allocation process.
    */
  var Status: js.UndefOr[ProvisionedConcurrencyStatusEnum] = js.native
  /**
    * For failed allocations, the reason that provisioned concurrency could not be allocated.
    */
  var StatusReason: js.UndefOr[String] = js.native
}

object PutProvisionedConcurrencyConfigResponse {
  @scala.inline
  def apply(): PutProvisionedConcurrencyConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutProvisionedConcurrencyConfigResponse]
  }
  @scala.inline
  implicit class PutProvisionedConcurrencyConfigResponseOps[Self <: PutProvisionedConcurrencyConfigResponse] (val x: Self) extends AnyVal {
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
    def setAllocatedProvisionedConcurrentExecutions(value: NonNegativeInteger): Self = this.set("AllocatedProvisionedConcurrentExecutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocatedProvisionedConcurrentExecutions: Self = this.set("AllocatedProvisionedConcurrentExecutions", js.undefined)
    @scala.inline
    def setAvailableProvisionedConcurrentExecutions(value: NonNegativeInteger): Self = this.set("AvailableProvisionedConcurrentExecutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailableProvisionedConcurrentExecutions: Self = this.set("AvailableProvisionedConcurrentExecutions", js.undefined)
    @scala.inline
    def setLastModified(value: Timestamp): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
    @scala.inline
    def setRequestedProvisionedConcurrentExecutions(value: PositiveInteger): Self = this.set("RequestedProvisionedConcurrentExecutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestedProvisionedConcurrentExecutions: Self = this.set("RequestedProvisionedConcurrentExecutions", js.undefined)
    @scala.inline
    def setStatus(value: ProvisionedConcurrencyStatusEnum): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setStatusReason(value: String): Self = this.set("StatusReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusReason: Self = this.set("StatusReason", js.undefined)
  }
  
}

