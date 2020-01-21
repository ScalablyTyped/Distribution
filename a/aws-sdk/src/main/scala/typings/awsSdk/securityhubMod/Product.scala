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
  def apply(
    ProductArn: NonEmptyString,
    ActivationUrl: NonEmptyString = null,
    Categories: CategoryList = null,
    CompanyName: NonEmptyString = null,
    Description: NonEmptyString = null,
    MarketplaceUrl: NonEmptyString = null,
    ProductName: NonEmptyString = null,
    ProductSubscriptionResourcePolicy: NonEmptyString = null
  ): Product = {
    val __obj = js.Dynamic.literal(ProductArn = ProductArn.asInstanceOf[js.Any])
    if (ActivationUrl != null) __obj.updateDynamic("ActivationUrl")(ActivationUrl.asInstanceOf[js.Any])
    if (Categories != null) __obj.updateDynamic("Categories")(Categories.asInstanceOf[js.Any])
    if (CompanyName != null) __obj.updateDynamic("CompanyName")(CompanyName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (MarketplaceUrl != null) __obj.updateDynamic("MarketplaceUrl")(MarketplaceUrl.asInstanceOf[js.Any])
    if (ProductName != null) __obj.updateDynamic("ProductName")(ProductName.asInstanceOf[js.Any])
    if (ProductSubscriptionResourcePolicy != null) __obj.updateDynamic("ProductSubscriptionResourcePolicy")(ProductSubscriptionResourcePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
}

