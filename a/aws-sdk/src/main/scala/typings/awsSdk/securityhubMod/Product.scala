package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Product extends js.Object {
  /**
    * The URL used to activate the product.
    */
  var ActivationUrl: js.UndefOr[NonEmptyString] = js.native
  /**
    * The categories assigned to the product.
    */
  var Categories: js.UndefOr[CategoryList] = js.native
  /**
    * The name of the company that provides the product.
    */
  var CompanyName: js.UndefOr[NonEmptyString] = js.native
  /**
    * A description of the product.
    */
  var Description: js.UndefOr[NonEmptyString] = js.native
  /**
    * The types of integration that the product supports. Available values are the following.    SEND_FINDINGS_TO_SECURITY_HUB - Indicates that the integration sends findings to Security Hub.    RECEIVE_FINDINGS_FROM_SECURITY_HUB - Indicates that the integration receives findings from Security Hub.  
    */
  var IntegrationTypes: js.UndefOr[IntegrationTypeList] = js.native
  /**
    * The URL for the page that contains more information about the product.
    */
  var MarketplaceUrl: js.UndefOr[NonEmptyString] = js.native
  /**
    * The ARN assigned to the product.
    */
  var ProductArn: NonEmptyString = js.native
  /**
    * The name of the product.
    */
  var ProductName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The resource policy associated with the product.
    */
  var ProductSubscriptionResourcePolicy: js.UndefOr[NonEmptyString] = js.native
}

object Product {
  @scala.inline
  def apply(ProductArn: NonEmptyString): Product = {
    val __obj = js.Dynamic.literal(ProductArn = ProductArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
  @scala.inline
  implicit class ProductOps[Self <: Product] (val x: Self) extends AnyVal {
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
    def setProductArn(value: NonEmptyString): Self = this.set("ProductArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivationUrl(value: NonEmptyString): Self = this.set("ActivationUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivationUrl: Self = this.set("ActivationUrl", js.undefined)
    @scala.inline
    def setCategoriesVarargs(value: NonEmptyString*): Self = this.set("Categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: CategoryList): Self = this.set("Categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("Categories", js.undefined)
    @scala.inline
    def setCompanyName(value: NonEmptyString): Self = this.set("CompanyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompanyName: Self = this.set("CompanyName", js.undefined)
    @scala.inline
    def setDescription(value: NonEmptyString): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setIntegrationTypesVarargs(value: IntegrationType*): Self = this.set("IntegrationTypes", js.Array(value :_*))
    @scala.inline
    def setIntegrationTypes(value: IntegrationTypeList): Self = this.set("IntegrationTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegrationTypes: Self = this.set("IntegrationTypes", js.undefined)
    @scala.inline
    def setMarketplaceUrl(value: NonEmptyString): Self = this.set("MarketplaceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarketplaceUrl: Self = this.set("MarketplaceUrl", js.undefined)
    @scala.inline
    def setProductName(value: NonEmptyString): Self = this.set("ProductName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductName: Self = this.set("ProductName", js.undefined)
    @scala.inline
    def setProductSubscriptionResourcePolicy(value: NonEmptyString): Self = this.set("ProductSubscriptionResourcePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductSubscriptionResourcePolicy: Self = this.set("ProductSubscriptionResourcePolicy", js.undefined)
  }
  
}

