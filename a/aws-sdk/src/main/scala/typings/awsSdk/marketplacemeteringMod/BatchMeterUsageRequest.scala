package typings.awsSdk.marketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchMeterUsageRequest extends js.Object {
  /**
    * Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the same as the one used during the publishing of a new product.
    */
  var ProductCode: typings.awsSdk.marketplacemeteringMod.ProductCode = js.native
  /**
    * The set of UsageRecords to submit. BatchMeterUsage accepts up to 25 UsageRecords at a time.
    */
  var UsageRecords: UsageRecordList = js.native
}

object BatchMeterUsageRequest {
  @scala.inline
  def apply(ProductCode: ProductCode, UsageRecords: UsageRecordList): BatchMeterUsageRequest = {
    val __obj = js.Dynamic.literal(ProductCode = ProductCode.asInstanceOf[js.Any], UsageRecords = UsageRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchMeterUsageRequest]
  }
  @scala.inline
  implicit class BatchMeterUsageRequestOps[Self <: BatchMeterUsageRequest] (val x: Self) extends AnyVal {
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
    def setProductCode(value: ProductCode): Self = this.set("ProductCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsageRecordsVarargs(value: UsageRecord*): Self = this.set("UsageRecords", js.Array(value :_*))
    @scala.inline
    def setUsageRecords(value: UsageRecordList): Self = this.set("UsageRecords", value.asInstanceOf[js.Any])
  }
  
}

