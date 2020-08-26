package typings.awsSdk.marketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageRecordResult extends js.Object {
  /**
    * The MeteringRecordId is a unique identifier for this metering event.
    */
  var MeteringRecordId: js.UndefOr[String] = js.native
  /**
    * The UsageRecordResult Status indicates the status of an individual UsageRecord processed by BatchMeterUsage.    Success- The UsageRecord was accepted and honored by BatchMeterUsage.    CustomerNotSubscribed- The CustomerIdentifier specified is not subscribed to your product. The UsageRecord was not honored. Future UsageRecords for this customer will fail until the customer subscribes to your product.    DuplicateRecord- Indicates that the UsageRecord was invalid and not honored. A previously metered UsageRecord had the same customer, dimension, and time, but a different quantity.  
    */
  var Status: js.UndefOr[UsageRecordResultStatus] = js.native
  /**
    * The UsageRecord that was part of the BatchMeterUsage request.
    */
  var UsageRecord: js.UndefOr[typings.awsSdk.marketplacemeteringMod.UsageRecord] = js.native
}

object UsageRecordResult {
  @scala.inline
  def apply(): UsageRecordResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageRecordResult]
  }
  @scala.inline
  implicit class UsageRecordResultOps[Self <: UsageRecordResult] (val x: Self) extends AnyVal {
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
    def setMeteringRecordId(value: String): Self = this.set("MeteringRecordId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeteringRecordId: Self = this.set("MeteringRecordId", js.undefined)
    @scala.inline
    def setStatus(value: UsageRecordResultStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setUsageRecord(value: UsageRecord): Self = this.set("UsageRecord", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsageRecord: Self = this.set("UsageRecord", js.undefined)
  }
  
}

