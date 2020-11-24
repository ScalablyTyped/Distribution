package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanProvisionedProductsOutput extends js.Object {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  
  /**
    * Information about the provisioned products.
    */
  var ProvisionedProducts: js.UndefOr[ProvisionedProductDetails] = js.native
}
object ScanProvisionedProductsOutput {
  
  @scala.inline
  def apply(): ScanProvisionedProductsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanProvisionedProductsOutput]
  }
  
  @scala.inline
  implicit class ScanProvisionedProductsOutputOps[Self <: ScanProvisionedProductsOutput] (val x: Self) extends AnyVal {
    
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
    def setProvisionedProductsVarargs(value: ProvisionedProductDetail*): Self = this.set("ProvisionedProducts", js.Array(value :_*))
    
    @scala.inline
    def setProvisionedProducts(value: ProvisionedProductDetails): Self = this.set("ProvisionedProducts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedProducts: Self = this.set("ProvisionedProducts", js.undefined)
  }
}
