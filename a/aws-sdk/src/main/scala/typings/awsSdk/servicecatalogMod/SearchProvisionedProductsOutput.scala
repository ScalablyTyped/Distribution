package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchProvisionedProductsOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * Information about the provisioned products.
    */
  var ProvisionedProducts: js.UndefOr[ProvisionedProductAttributes] = js.native
  /**
    * The number of provisioned products found.
    */
  var TotalResultsCount: js.UndefOr[typings.awsSdk.servicecatalogMod.TotalResultsCount] = js.native
}

object SearchProvisionedProductsOutput {
  @scala.inline
  def apply(): SearchProvisionedProductsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProvisionedProductsOutput]
  }
  @scala.inline
  implicit class SearchProvisionedProductsOutputOps[Self <: SearchProvisionedProductsOutput] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: PageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
    @scala.inline
    def setProvisionedProductsVarargs(value: ProvisionedProductAttribute*): Self = this.set("ProvisionedProducts", js.Array(value :_*))
    @scala.inline
    def setProvisionedProducts(value: ProvisionedProductAttributes): Self = this.set("ProvisionedProducts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedProducts: Self = this.set("ProvisionedProducts", js.undefined)
    @scala.inline
    def setTotalResultsCount(value: TotalResultsCount): Self = this.set("TotalResultsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalResultsCount: Self = this.set("TotalResultsCount", js.undefined)
  }
  
}

