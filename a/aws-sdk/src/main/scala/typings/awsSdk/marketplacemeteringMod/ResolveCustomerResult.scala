package typings.awsSdk.marketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveCustomerResult extends js.Object {
  /**
    * The CustomerIdentifier is used to identify an individual customer in your application. Calls to BatchMeterUsage require CustomerIdentifiers for each UsageRecord.
    */
  var CustomerIdentifier: js.UndefOr[typings.awsSdk.marketplacemeteringMod.CustomerIdentifier] = js.native
  /**
    * The product code is returned to confirm that the buyer is registering for your product. Subsequent BatchMeterUsage calls should be made using this product code.
    */
  var ProductCode: js.UndefOr[typings.awsSdk.marketplacemeteringMod.ProductCode] = js.native
}

object ResolveCustomerResult {
  @scala.inline
  def apply(): ResolveCustomerResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveCustomerResult]
  }
  @scala.inline
  implicit class ResolveCustomerResultOps[Self <: ResolveCustomerResult] (val x: Self) extends AnyVal {
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
    def setCustomerIdentifier(value: CustomerIdentifier): Self = this.set("CustomerIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerIdentifier: Self = this.set("CustomerIdentifier", js.undefined)
    @scala.inline
    def setProductCode(value: ProductCode): Self = this.set("ProductCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductCode: Self = this.set("ProductCode", js.undefined)
  }
  
}

