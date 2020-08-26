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
  def apply(): ListEnabledProductsForImportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnabledProductsForImportResponse]
  }
  @scala.inline
  implicit class ListEnabledProductsForImportResponseOps[Self <: ListEnabledProductsForImportResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setProductSubscriptionsVarargs(value: NonEmptyString*): Self = this.set("ProductSubscriptions", js.Array(value :_*))
    @scala.inline
    def setProductSubscriptions(value: ProductSubscriptionArnList): Self = this.set("ProductSubscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductSubscriptions: Self = this.set("ProductSubscriptions", js.undefined)
  }
  
}

