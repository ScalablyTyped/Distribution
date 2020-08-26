package typings.awsSdk.marketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeterUsageRequest extends js.Object {
  /**
    * Checks whether you have the permissions required for the action, but does not make the request. If you have the permissions, the request returns DryRunOperation; otherwise, it returns UnauthorizedException. Defaults to false if not specified.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the same as the one used during the publishing of a new product.
    */
  var ProductCode: typings.awsSdk.marketplacemeteringMod.ProductCode = js.native
  /**
    * Timestamp, in UTC, for which the usage is being reported. Your application can meter usage for up to one hour in the past. Make sure the timestamp value is not before the start of the software usage.
    */
  var Timestamp: typings.awsSdk.marketplacemeteringMod.Timestamp = js.native
  /**
    * It will be one of the fcp dimension name provided during the publishing of the product.
    */
  var UsageDimension: typings.awsSdk.marketplacemeteringMod.UsageDimension = js.native
  /**
    * Consumption value for the hour. Defaults to 0 if not specified.
    */
  var UsageQuantity: js.UndefOr[typings.awsSdk.marketplacemeteringMod.UsageQuantity] = js.native
}

object MeterUsageRequest {
  @scala.inline
  def apply(ProductCode: ProductCode, Timestamp: Timestamp, UsageDimension: UsageDimension): MeterUsageRequest = {
    val __obj = js.Dynamic.literal(ProductCode = ProductCode.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any], UsageDimension = UsageDimension.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeterUsageRequest]
  }
  @scala.inline
  implicit class MeterUsageRequestOps[Self <: MeterUsageRequest] (val x: Self) extends AnyVal {
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
    def setTimestamp(value: Timestamp): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsageDimension(value: UsageDimension): Self = this.set("UsageDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setUsageQuantity(value: UsageQuantity): Self = this.set("UsageQuantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsageQuantity: Self = this.set("UsageQuantity", js.undefined)
  }
  
}

