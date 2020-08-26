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
    ProvisioningArtifactParameters: ProvisioningArtifactProperties
  ): CreateProductInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Owner = Owner.asInstanceOf[js.Any], ProductType = ProductType.asInstanceOf[js.Any], ProvisioningArtifactParameters = ProvisioningArtifactParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProductInput]
  }
  @scala.inline
  implicit class CreateProductInputOps[Self <: CreateProductInput] (val x: Self) extends AnyVal {
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
    def setIdempotencyToken(value: IdempotencyToken): Self = this.set("IdempotencyToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: ProductViewName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: ProductViewOwner): Self = this.set("Owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductType(value: ProductType): Self = this.set("ProductType", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvisioningArtifactParameters(value: ProvisioningArtifactProperties): Self = this.set("ProvisioningArtifactParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = this.set("AcceptLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptLanguage: Self = this.set("AcceptLanguage", js.undefined)
    @scala.inline
    def setDescription(value: ProductViewShortDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDistributor(value: ProductViewOwner): Self = this.set("Distributor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistributor: Self = this.set("Distributor", js.undefined)
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
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: AddTags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

