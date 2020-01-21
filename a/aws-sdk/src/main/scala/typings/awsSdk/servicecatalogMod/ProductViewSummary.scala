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
  def apply(
    Distributor: ProductViewDistributor = null,
    HasDefaultPath: js.UndefOr[Boolean] = js.undefined,
    Id: Id = null,
    Name: ProductViewName = null,
    Owner: ProductViewOwner = null,
    ProductId: Id = null,
    ShortDescription: ProductViewShortDescription = null,
    SupportDescription: SupportDescription = null,
    SupportEmail: SupportEmail = null,
    SupportUrl: SupportUrl = null,
    Type: ProductType = null
  ): ProductViewSummary = {
    val __obj = js.Dynamic.literal()
    if (Distributor != null) __obj.updateDynamic("Distributor")(Distributor.asInstanceOf[js.Any])
    if (!js.isUndefined(HasDefaultPath)) __obj.updateDynamic("HasDefaultPath")(HasDefaultPath.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (ProductId != null) __obj.updateDynamic("ProductId")(ProductId.asInstanceOf[js.Any])
    if (ShortDescription != null) __obj.updateDynamic("ShortDescription")(ShortDescription.asInstanceOf[js.Any])
    if (SupportDescription != null) __obj.updateDynamic("SupportDescription")(SupportDescription.asInstanceOf[js.Any])
    if (SupportEmail != null) __obj.updateDynamic("SupportEmail")(SupportEmail.asInstanceOf[js.Any])
    if (SupportUrl != null) __obj.updateDynamic("SupportUrl")(SupportUrl.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductViewSummary]
  }
}

