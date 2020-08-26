package typings.awsSdk.marketplaceentitlementserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entitlement extends js.Object {
  /**
    * The customer identifier is a handle to each unique customer in an application. Customer identifiers are obtained through the ResolveCustomer operation in AWS Marketplace Metering Service.
    */
  var CustomerIdentifier: js.UndefOr[NonEmptyString] = js.native
  /**
    * The dimension for which the given entitlement applies. Dimensions represent categories of capacity in a product and are specified when the product is listed in AWS Marketplace.
    */
  var Dimension: js.UndefOr[NonEmptyString] = js.native
  /**
    * The expiration date represents the minimum date through which this entitlement is expected to remain valid. For contractual products listed on AWS Marketplace, the expiration date is the date at which the customer will renew or cancel their contract. Customers who are opting to renew their contract will still have entitlements with an expiration date.
    */
  var ExpirationDate: js.UndefOr[Timestamp] = js.native
  /**
    * The product code for which the given entitlement applies. Product codes are provided by AWS Marketplace when the product listing is created.
    */
  var ProductCode: js.UndefOr[typings.awsSdk.marketplaceentitlementserviceMod.ProductCode] = js.native
  /**
    * The EntitlementValue represents the amount of capacity that the customer is entitled to for the product.
    */
  var Value: js.UndefOr[EntitlementValue] = js.native
}

object Entitlement {
  @scala.inline
  def apply(): Entitlement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Entitlement]
  }
  @scala.inline
  implicit class EntitlementOps[Self <: Entitlement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustomerIdentifier(value: NonEmptyString): Self = this.set("CustomerIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerIdentifier: Self = this.set("CustomerIdentifier", js.undefined)
    @scala.inline
    def setDimension(value: NonEmptyString): Self = this.set("Dimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimension: Self = this.set("Dimension", js.undefined)
    @scala.inline
    def setExpirationDate(value: Timestamp): Self = this.set("ExpirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationDate: Self = this.set("ExpirationDate", js.undefined)
    @scala.inline
    def setProductCode(value: ProductCode): Self = this.set("ProductCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductCode: Self = this.set("ProductCode", js.undefined)
    @scala.inline
    def setValue(value: EntitlementValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

