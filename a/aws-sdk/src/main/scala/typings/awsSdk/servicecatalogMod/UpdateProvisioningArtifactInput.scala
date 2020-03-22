package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProvisioningArtifactInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * Indicates whether the product version is active. Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned product from an inactive provisioning artifact.
    */
  var Active: js.UndefOr[ProvisioningArtifactActive] = js.native
  /**
    * The updated description of the provisioning artifact.
    */
  var Description: js.UndefOr[ProvisioningArtifactDescription] = js.native
  /**
    * Information set by the administrator to provide guidance to end users about which provisioning artifacts to use. The DEFAULT value indicates that the product version is active. The administrator can set the guidance to DEPRECATED to inform users that the product version is deprecated. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new provisioned products using a deprecated version.
    */
  var Guidance: js.UndefOr[ProvisioningArtifactGuidance] = js.native
  /**
    * The updated name of the provisioning artifact.
    */
  var Name: js.UndefOr[ProvisioningArtifactName] = js.native
  /**
    * The product identifier.
    */
  var ProductId: Id = js.native
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: Id = js.native
}

object UpdateProvisioningArtifactInput {
  @scala.inline
  def apply(
    ProductId: Id,
    ProvisioningArtifactId: Id,
    AcceptLanguage: AcceptLanguage = null,
    Active: js.UndefOr[Boolean] = js.undefined,
    Description: ProvisioningArtifactDescription = null,
    Guidance: ProvisioningArtifactGuidance = null,
    Name: ProvisioningArtifactName = null
  ): UpdateProvisioningArtifactInput = {
    val __obj = js.Dynamic.literal(ProductId = ProductId.asInstanceOf[js.Any], ProvisioningArtifactId = ProvisioningArtifactId.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    if (!js.isUndefined(Active)) __obj.updateDynamic("Active")(Active.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Guidance != null) __obj.updateDynamic("Guidance")(Guidance.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProvisioningArtifactInput]
  }
}

