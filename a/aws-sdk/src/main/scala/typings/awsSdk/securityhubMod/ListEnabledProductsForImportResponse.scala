package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEnabledProductsForImportResponse extends js.Object {
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
  /**
    * The list of ARNs for the resources that represent your subscriptions to products. 
    */
  var ProductSubscriptions: js.UndefOr[ProductSubscriptionArnList] = js.native
}

object ListEnabledProductsForImportResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, ProductSubscriptions: ProductSubscriptionArnList = null): ListEnabledProductsForImportResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ProductSubscriptions != null) __obj.updateDynamic("ProductSubscriptions")(ProductSubscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEnabledProductsForImportResponse]
  }
}

