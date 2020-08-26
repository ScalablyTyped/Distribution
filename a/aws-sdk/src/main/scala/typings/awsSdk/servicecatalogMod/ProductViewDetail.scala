package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductViewDetail extends js.Object {
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[typings.awsSdk.servicecatalogMod.CreatedTime] = js.native
  /**
    * The ARN of the product.
    */
  var ProductARN: js.UndefOr[ResourceARN] = js.native
  /**
    * Summary information about the product view.
    */
  var ProductViewSummary: js.UndefOr[typings.awsSdk.servicecatalogMod.ProductViewSummary] = js.native
  /**
    * The status of the product.    AVAILABLE - The product is ready for use.    CREATING - Product creation has started; the product is not ready for use.    FAILED - An action failed.  
    */
  var Status: js.UndefOr[typings.awsSdk.servicecatalogMod.Status] = js.native
}

object ProductViewDetail {
  @scala.inline
  def apply(): ProductViewDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductViewDetail]
  }
  @scala.inline
  implicit class ProductViewDetailOps[Self <: ProductViewDetail] (val x: Self) extends AnyVal {
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
    def setCreatedTime(value: CreatedTime): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    @scala.inline
    def setProductARN(value: ResourceARN): Self = this.set("ProductARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductARN: Self = this.set("ProductARN", js.undefined)
    @scala.inline
    def setProductViewSummary(value: ProductViewSummary): Self = this.set("ProductViewSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductViewSummary: Self = this.set("ProductViewSummary", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

