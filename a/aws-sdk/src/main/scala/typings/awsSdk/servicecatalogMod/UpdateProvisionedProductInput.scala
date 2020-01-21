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
    * The new path identifier. This value is optional if the product has a default path, and required if the product has more than one path.
    */
  var PathId: js.UndefOr[Id] = js.native
  /**
    * The identifier of the product.
    */
  var ProductId: js.UndefOr[Id] = js.native
  /**
    * The identifier of the provisioned product. You cannot specify both ProvisionedProductName and ProvisionedProductId.
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
  def apply(
    UpdateToken: IdempotencyToken,
    AcceptLanguage: AcceptLanguage = null,
    PathId: Id = null,
    ProductId: Id = null,
    ProvisionedProductId: Id = null,
    ProvisionedProductName: ProvisionedProductNameOrArn = null,
    ProvisioningArtifactId: Id = null,
    ProvisioningParameters: UpdateProvisioningParameters = null,
    ProvisioningPreferences: UpdateProvisioningPreferences = null,
    Tags: Tags = null
  ): UpdateProvisionedProductInput = {
    val __obj = js.Dynamic.literal(UpdateToken = UpdateToken.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    if (PathId != null) __obj.updateDynamic("PathId")(PathId.asInstanceOf[js.Any])
    if (ProductId != null) __obj.updateDynamic("ProductId")(ProductId.asInstanceOf[js.Any])
    if (ProvisionedProductId != null) __obj.updateDynamic("ProvisionedProductId")(ProvisionedProductId.asInstanceOf[js.Any])
    if (ProvisionedProductName != null) __obj.updateDynamic("ProvisionedProductName")(ProvisionedProductName.asInstanceOf[js.Any])
    if (ProvisioningArtifactId != null) __obj.updateDynamic("ProvisioningArtifactId")(ProvisioningArtifactId.asInstanceOf[js.Any])
    if (ProvisioningParameters != null) __obj.updateDynamic("ProvisioningParameters")(ProvisioningParameters.asInstanceOf[js.Any])
    if (ProvisioningPreferences != null) __obj.updateDynamic("ProvisioningPreferences")(ProvisioningPreferences.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProvisionedProductInput]
  }
}

