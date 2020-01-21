package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProductInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The description of the product.
    */
  var Description: js.UndefOr[ProductViewShortDescription] = js.native
  /**
    * The distributor of the product.
    */
  var Distributor: js.UndefOr[ProductViewOwner] = js.native
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: typings.awsSdk.servicecatalogMod.IdempotencyToken = js.native
  /**
    * The name of the product.
    */
  var Name: ProductViewName = js.native
  /**
    * The owner of the product.
    */
  var Owner: ProductViewOwner = js.native
  /**
    * The type of product.
    */
  var ProductType: typings.awsSdk.servicecatalogMod.ProductType = js.native
  /**
    * The configuration of the provisioning artifact.
    */
  var ProvisioningArtifactParameters: ProvisioningArtifactProperties = js.native
  /**
    * The support information about the product.
    */
  var SupportDescription: js.UndefOr[typings.awsSdk.servicecatalogMod.SupportDescription] = js.native
  /**
    * The contact email for product support.
    */
  var SupportEmail: js.UndefOr[typings.awsSdk.servicecatalogMod.SupportEmail] = js.native
  /**
    * The contact URL for product support.
    */
  var SupportUrl: js.UndefOr[typings.awsSdk.servicecatalogMod.SupportUrl] = js.native
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[AddTags] = js.native
}

object CreateProductInput {
  @scala.inline
  def apply(
    IdempotencyToken: IdempotencyToken,
    Name: ProductViewName,
    Owner: ProductViewOwner,
    ProductType: ProductType,
    ProvisioningArtifactParameters: ProvisioningArtifactProperties,
    AcceptLanguage: AcceptLanguage = null,
    Description: ProductViewShortDescription = null,
    Distributor: ProductViewOwner = null,
    SupportDescription: SupportDescription = null,
    SupportEmail: SupportEmail = null,
    SupportUrl: SupportUrl = null,
    Tags: AddTags = null
  ): CreateProductInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Owner = Owner.asInstanceOf[js.Any], ProductType = ProductType.asInstanceOf[js.Any], ProvisioningArtifactParameters = ProvisioningArtifactParameters.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Distributor != null) __obj.updateDynamic("Distributor")(Distributor.asInstanceOf[js.Any])
    if (SupportDescription != null) __obj.updateDynamic("SupportDescription")(SupportDescription.asInstanceOf[js.Any])
    if (SupportEmail != null) __obj.updateDynamic("SupportEmail")(SupportEmail.asInstanceOf[js.Any])
    if (SupportUrl != null) __obj.updateDynamic("SupportUrl")(SupportUrl.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProductInput]
  }
}

