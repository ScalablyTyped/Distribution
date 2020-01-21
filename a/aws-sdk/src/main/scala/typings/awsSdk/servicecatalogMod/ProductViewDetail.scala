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
  def apply(
    CreatedTime: CreatedTime = null,
    ProductARN: ResourceARN = null,
    ProductViewSummary: ProductViewSummary = null,
    Status: Status = null
  ): ProductViewDetail = {
    val __obj = js.Dynamic.literal()
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (ProductARN != null) __obj.updateDynamic("ProductARN")(ProductARN.asInstanceOf[js.Any])
    if (ProductViewSummary != null) __obj.updateDynamic("ProductViewSummary")(ProductViewSummary.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductViewDetail]
  }
}

