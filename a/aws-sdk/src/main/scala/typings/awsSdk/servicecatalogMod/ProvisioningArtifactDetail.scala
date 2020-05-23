package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningArtifactDetail extends js.Object {
  /**
    * Indicates whether the product version is active.
    */
  var Active: js.UndefOr[ProvisioningArtifactActive] = js.native
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[CreationTime] = js.native
  /**
    * The description of the provisioning artifact.
    */
  var Description: js.UndefOr[ProvisioningArtifactName] = js.native
  /**
    * Information set by the administrator to provide guidance to end users about which provisioning artifacts to use.
    */
  var Guidance: js.UndefOr[ProvisioningArtifactGuidance] = js.native
  /**
    * The identifier of the provisioning artifact.
    */
  var Id: js.UndefOr[typings.awsSdk.servicecatalogMod.Id] = js.native
  /**
    * The name of the provisioning artifact.
    */
  var Name: js.UndefOr[ProvisioningArtifactName] = js.native
  /**
    * The type of provisioning artifact.    CLOUD_FORMATION_TEMPLATE - AWS CloudFormation template    MARKETPLACE_AMI - AWS Marketplace AMI    MARKETPLACE_CAR - AWS Marketplace Clusters and AWS Resources  
    */
  var Type: js.UndefOr[ProvisioningArtifactType] = js.native
}

object ProvisioningArtifactDetail {
  @scala.inline
  def apply(
    Active: js.UndefOr[ProvisioningArtifactActive] = js.undefined,
    CreatedTime: CreationTime = null,
    Description: ProvisioningArtifactName = null,
    Guidance: ProvisioningArtifactGuidance = null,
    Id: Id = null,
    Name: ProvisioningArtifactName = null,
    Type: ProvisioningArtifactType = null
  ): ProvisioningArtifactDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Active)) __obj.updateDynamic("Active")(Active.get.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Guidance != null) __obj.updateDynamic("Guidance")(Guidance.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisioningArtifactDetail]
  }
}

