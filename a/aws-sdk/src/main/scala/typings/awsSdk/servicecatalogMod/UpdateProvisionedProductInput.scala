package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProvisionedProductInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The path identifier. This value is optional if the product has a default path, and required if the product has more than one path. You must provide the name or ID, but not both.
    */
  var PathId: js.UndefOr[Id] = js.native
  /**
    * The name of the path. You must provide the name or ID, but not both.
    */
  var PathName: js.UndefOr[PortfolioDisplayName] = js.native
  /**
    * The identifier of the product. You must provide the name or ID, but not both.
    */
  var ProductId: js.UndefOr[Id] = js.native
  /**
    * The name of the product. You must provide the name or ID, but not both.
    */
  var ProductName: js.UndefOr[ProductViewName] = js.native
  /**
    * The identifier of the provisioned product. You must provide the name or ID, but not both.
    */
  var ProvisionedProductId: js.UndefOr[Id] = js.native
  /**
    * The name of the provisioned product. You cannot specify both ProvisionedProductName and ProvisionedProductId.
    */
  var ProvisionedProductName: js.UndefOr[ProvisionedProductNameOrArn] = js.native
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.native
  /**
    * The name of the provisioning artifact. You must provide the name or ID, but not both.
    */
  var ProvisioningArtifactName: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifactName] = js.native
  /**
    * The new parameters.
    */
  var ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters] = js.native
  /**
    * An object that contains information about the provisioning preferences for a stack set.
    */
  var ProvisioningPreferences: js.UndefOr[UpdateProvisioningPreferences] = js.native
  /**
    * One or more tags. Requires the product to have RESOURCE_UPDATE constraint with TagUpdatesOnProvisionedProduct set to ALLOWED to allow tag updates.
    */
  var Tags: js.UndefOr[typings.awsSdk.servicecatalogMod.Tags] = js.native
  /**
    * The idempotency token that uniquely identifies the provisioning update request.
    */
  var UpdateToken: IdempotencyToken = js.native
}

object UpdateProvisionedProductInput {
  @scala.inline
  def apply(UpdateToken: IdempotencyToken): UpdateProvisionedProductInput = {
    val __obj = js.Dynamic.literal(UpdateToken = UpdateToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProvisionedProductInput]
  }
  @scala.inline
  implicit class UpdateProvisionedProductInputOps[Self <: UpdateProvisionedProductInput] (val x: Self) extends AnyVal {
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
    def setUpdateToken(value: IdempotencyToken): Self = this.set("UpdateToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = this.set("AcceptLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptLanguage: Self = this.set("AcceptLanguage", js.undefined)
    @scala.inline
    def setPathId(value: Id): Self = this.set("PathId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathId: Self = this.set("PathId", js.undefined)
    @scala.inline
    def setPathName(value: PortfolioDisplayName): Self = this.set("PathName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathName: Self = this.set("PathName", js.undefined)
    @scala.inline
    def setProductId(value: Id): Self = this.set("ProductId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("ProductId", js.undefined)
    @scala.inline
    def setProductName(value: ProductViewName): Self = this.set("ProductName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductName: Self = this.set("ProductName", js.undefined)
    @scala.inline
    def setProvisionedProductId(value: Id): Self = this.set("ProvisionedProductId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedProductId: Self = this.set("ProvisionedProductId", js.undefined)
    @scala.inline
    def setProvisionedProductName(value: ProvisionedProductNameOrArn): Self = this.set("ProvisionedProductName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedProductName: Self = this.set("ProvisionedProductName", js.undefined)
    @scala.inline
    def setProvisioningArtifactId(value: Id): Self = this.set("ProvisioningArtifactId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisioningArtifactId: Self = this.set("ProvisioningArtifactId", js.undefined)
    @scala.inline
    def setProvisioningArtifactName(value: ProvisioningArtifactName): Self = this.set("ProvisioningArtifactName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisioningArtifactName: Self = this.set("ProvisioningArtifactName", js.undefined)
    @scala.inline
    def setProvisioningParametersVarargs(value: UpdateProvisioningParameter*): Self = this.set("ProvisioningParameters", js.Array(value :_*))
    @scala.inline
    def setProvisioningParameters(value: UpdateProvisioningParameters): Self = this.set("ProvisioningParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisioningParameters: Self = this.set("ProvisioningParameters", js.undefined)
    @scala.inline
    def setProvisioningPreferences(value: UpdateProvisioningPreferences): Self = this.set("ProvisioningPreferences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisioningPreferences: Self = this.set("ProvisioningPreferences", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

