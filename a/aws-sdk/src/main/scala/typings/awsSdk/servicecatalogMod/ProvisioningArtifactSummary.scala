package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningArtifactSummary extends js.Object {
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[ProvisioningArtifactCreatedTime] = js.native
  /**
    * The description of the provisioning artifact.
    */
  var Description: js.UndefOr[ProvisioningArtifactDescription] = js.native
  /**
    * The identifier of the provisioning artifact.
    */
  var Id: js.UndefOr[typings.awsSdk.servicecatalogMod.Id] = js.native
  /**
    * The name of the provisioning artifact.
    */
  var Name: js.UndefOr[ProvisioningArtifactName] = js.native
  /**
    * The metadata for the provisioning artifact. This is used with AWS Marketplace products.
    */
  var ProvisioningArtifactMetadata: js.UndefOr[ProvisioningArtifactInfo] = js.native
}

object ProvisioningArtifactSummary {
  @scala.inline
  def apply(
    CreatedTime: ProvisioningArtifactCreatedTime = null,
    Description: ProvisioningArtifactDescription = null,
    Id: Id = null,
    Name: ProvisioningArtifactName = null,
    ProvisioningArtifactMetadata: ProvisioningArtifactInfo = null
  ): ProvisioningArtifactSummary = {
    val __obj = js.Dynamic.literal()
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ProvisioningArtifactMetadata != null) __obj.updateDynamic("ProvisioningArtifactMetadata")(ProvisioningArtifactMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisioningArtifactSummary]
  }
}

