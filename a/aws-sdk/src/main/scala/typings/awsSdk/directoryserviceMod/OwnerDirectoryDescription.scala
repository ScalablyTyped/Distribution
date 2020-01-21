package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OwnerDirectoryDescription extends js.Object {
  /**
    * Identifier of the directory owner account.
    */
  var AccountId: js.UndefOr[CustomerId] = js.native
  /**
    * Identifier of the AWS Managed Microsoft AD directory in the directory owner account.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.native
  /**
    * IP address of the directory’s domain controllers.
    */
  var DnsIpAddrs: js.UndefOr[typings.awsSdk.directoryserviceMod.DnsIpAddrs] = js.native
  /**
    * A RadiusSettings object that contains information about the RADIUS server.
    */
  var RadiusSettings: js.UndefOr[typings.awsSdk.directoryserviceMod.RadiusSettings] = js.native
  /**
    * Information about the status of the RADIUS server.
    */
  var RadiusStatus: js.UndefOr[typings.awsSdk.directoryserviceMod.RadiusStatus] = js.native
  /**
    * Information about the VPC settings for the directory.
    */
  var VpcSettings: js.UndefOr[DirectoryVpcSettingsDescription] = js.native
}

object OwnerDirectoryDescription {
  @scala.inline
  def apply(
    AccountId: CustomerId = null,
    DirectoryId: DirectoryId = null,
    DnsIpAddrs: DnsIpAddrs = null,
    RadiusSettings: RadiusSettings = null,
    RadiusStatus: RadiusStatus = null,
    VpcSettings: DirectoryVpcSettingsDescription = null
  ): OwnerDirectoryDescription = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId.asInstanceOf[js.Any])
    if (DnsIpAddrs != null) __obj.updateDynamic("DnsIpAddrs")(DnsIpAddrs.asInstanceOf[js.Any])
    if (RadiusSettings != null) __obj.updateDynamic("RadiusSettings")(RadiusSettings.asInstanceOf[js.Any])
    if (RadiusStatus != null) __obj.updateDynamic("RadiusStatus")(RadiusStatus.asInstanceOf[js.Any])
    if (VpcSettings != null) __obj.updateDynamic("VpcSettings")(VpcSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerDirectoryDescription]
  }
}

