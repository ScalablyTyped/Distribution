package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionProductInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
    */
  var NotificationArns: js.UndefOr[typings.awsSdk.servicecatalogMod.NotificationArns] = js.native
  /**
    * The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use ListLaunchPaths. You must provide the name or ID, but not both.
    */
  var PathId: js.UndefOr[Id] = js.native
  /**
    * The name of the path. You must provide the name or ID, but not both.
    */
  var PathName: js.UndefOr[PortfolioDisplayName] = js.native
  /**
    * The product identifier. You must provide the name or ID, but not both.
    */
  var ProductId: js.UndefOr[Id] = js.native
  /**
    * The name of the product. You must provide the name or ID, but not both.
    */
  var ProductName: js.UndefOr[ProductViewName] = js.native
  /**
    * An idempotency token that uniquely identifies the provisioning request.
    */
  var ProvisionToken: IdempotencyToken = js.native
  /**
    * A user-friendly name for the provisioned product. This value must be unique for the AWS account and cannot be updated after the product is provisioned.
    */
  var ProvisionedProductName: typings.awsSdk.servicecatalogMod.ProvisionedProductName = js.native
  /**
    * The identifier of the provisioning artifact. You must provide the name or ID, but not both.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.native
  /**
    * The name of the provisioning artifact. You must provide the name or ID, but not both.
    */
  var ProvisioningArtifactName: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifactName] = js.native
  /**
    * Parameters specified by the administrator that are required for provisioning the product.
    */
  var ProvisioningParameters: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningParameters] = js.native
  /**
    * An object that contains information about the provisioning preferences for a stack set.
    */
  var ProvisioningPreferences: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningPreferences] = js.native
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[typings.awsSdk.servicecatalogMod.Tags] = js.native
}

object ProvisionProductInput {
  @scala.inline
  def apply(ProvisionToken: IdempotencyToken, ProvisionedProductName: ProvisionedProductName): ProvisionProductInput = {
    val __obj = js.Dynamic.literal(ProvisionToken = ProvisionToken.asInstanceOf[js.Any], ProvisionedProductName = ProvisionedProductName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionProductInput]
  }
  @scala.inline
  implicit class ProvisionProductInputOps[Self <: ProvisionProductInput] (val x: Self) extends AnyVal {
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
    def setProvisionToken(value: IdempotencyToken): Self = this.set("ProvisionToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvisionedProductName(value: ProvisionedProductName): Self = this.set("ProvisionedProductName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = this.set("AcceptLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptLanguage: Self = this.set("AcceptLanguage", js.undefined)
    @scala.inline
    def setNotificationArnsVarargs(value: NotificationArn*): Self = this.set("NotificationArns", js.Array(value :_*))
    @scala.inline
    def setNotificationArns(value: NotificationArns): Self = this.set("NotificationArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationArns: Self = this.set("NotificationArns", js.undefined)
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
    def setProvisioningArtifactId(value: Id): Self = this.set("ProvisioningArtifactId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisioningArtifactId: Self = this.set("ProvisioningArtifactId", js.undefined)
    @scala.inline
    def setProvisioningArtifactName(value: ProvisioningArtifactName): Self = this.set("ProvisioningArtifactName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisioningArtifactName: Self = this.set("ProvisioningArtifactName", js.undefined)
    @scala.inline
    def setProvisioningParametersVarargs(value: ProvisioningParameter*): Self = this.set("ProvisioningParameters", js.Array(value :_*))
    @scala.inline
    def setProvisioningParameters(value: ProvisioningParameters): Self = this.set("ProvisioningParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisioningParameters: Self = this.set("ProvisioningParameters", js.undefined)
    @scala.inline
    def setProvisioningPreferences(value: ProvisioningPreferences): Self = this.set("ProvisioningPreferences", value.asInstanceOf[js.Any])
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

