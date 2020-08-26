package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductViewSummary extends js.Object {
  /**
    * The distributor of the product. Contact the product administrator for the significance of this value.
    */
  var Distributor: js.UndefOr[ProductViewDistributor] = js.native
  /**
    * Indicates whether the product has a default path. If the product does not have a default path, call ListLaunchPaths to disambiguate between paths. Otherwise, ListLaunchPaths is not required, and the output of ProductViewSummary can be used directly with DescribeProvisioningParameters.
    */
  var HasDefaultPath: js.UndefOr[typings.awsSdk.servicecatalogMod.HasDefaultPath] = js.native
  /**
    * The product view identifier.
    */
  var Id: js.UndefOr[typings.awsSdk.servicecatalogMod.Id] = js.native
  /**
    * The name of the product.
    */
  var Name: js.UndefOr[ProductViewName] = js.native
  /**
    * The owner of the product. Contact the product administrator for the significance of this value.
    */
  var Owner: js.UndefOr[ProductViewOwner] = js.native
  /**
    * The product identifier.
    */
  var ProductId: js.UndefOr[Id] = js.native
  /**
    * Short description of the product.
    */
  var ShortDescription: js.UndefOr[ProductViewShortDescription] = js.native
  /**
    * The description of the support for this Product.
    */
  var SupportDescription: js.UndefOr[typings.awsSdk.servicecatalogMod.SupportDescription] = js.native
  /**
    * The email contact information to obtain support for this Product.
    */
  var SupportEmail: js.UndefOr[typings.awsSdk.servicecatalogMod.SupportEmail] = js.native
  /**
    * The URL information to obtain support for this Product.
    */
  var SupportUrl: js.UndefOr[typings.awsSdk.servicecatalogMod.SupportUrl] = js.native
  /**
    * The product type. Contact the product administrator for the significance of this value. If this value is MARKETPLACE, the product was created by AWS Marketplace.
    */
  var Type: js.UndefOr[ProductType] = js.native
}

object ProductViewSummary {
  @scala.inline
  def apply(): ProductViewSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductViewSummary]
  }
  @scala.inline
  implicit class ProductViewSummaryOps[Self <: ProductViewSummary] (val x: Self) extends AnyVal {
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
    def setDistributor(value: ProductViewDistributor): Self = this.set("Distributor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistributor: Self = this.set("Distributor", js.undefined)
    @scala.inline
    def setHasDefaultPath(value: HasDefaultPath): Self = this.set("HasDefaultPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasDefaultPath: Self = this.set("HasDefaultPath", js.undefined)
    @scala.inline
    def setId(value: Id): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setName(value: ProductViewName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setOwner(value: ProductViewOwner): Self = this.set("Owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
    @scala.inline
    def setProductId(value: Id): Self = this.set("ProductId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("ProductId", js.undefined)
    @scala.inline
    def setShortDescription(value: ProductViewShortDescription): Self = this.set("ShortDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortDescription: Self = this.set("ShortDescription", js.undefined)
    @scala.inline
    def setSupportDescription(value: SupportDescription): Self = this.set("SupportDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportDescription: Self = this.set("SupportDescription", js.undefined)
    @scala.inline
    def setSupportEmail(value: SupportEmail): Self = this.set("SupportEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportEmail: Self = this.set("SupportEmail", js.undefined)
    @scala.inline
    def setSupportUrl(value: SupportUrl): Self = this.set("SupportUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportUrl: Self = this.set("SupportUrl", js.undefined)
    @scala.inline
    def setType(value: ProductType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

