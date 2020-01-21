package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseConfigurationAssociation extends js.Object {
  /**
    * Time when the license configuration was associated with the resource.
    */
  var AssociationTime: js.UndefOr[DateTime] = js.native
  /**
    * Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: js.UndefOr[String] = js.native
  /**
    * ID of the AWS account that owns the resource consuming licenses.
    */
  var ResourceOwnerId: js.UndefOr[String] = js.native
  /**
    * Type of server resource.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.licensemanagerMod.ResourceType] = js.native
}

object LicenseConfigurationAssociation {
  @scala.inline
  def apply(
    AssociationTime: DateTime = null,
    ResourceArn: String = null,
    ResourceOwnerId: String = null,
    ResourceType: ResourceType = null
  ): LicenseConfigurationAssociation = {
    val __obj = js.Dynamic.literal()
    if (AssociationTime != null) __obj.updateDynamic("AssociationTime")(AssociationTime.asInstanceOf[js.Any])
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn.asInstanceOf[js.Any])
    if (ResourceOwnerId != null) __obj.updateDynamic("ResourceOwnerId")(ResourceOwnerId.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseConfigurationAssociation]
  }
}

