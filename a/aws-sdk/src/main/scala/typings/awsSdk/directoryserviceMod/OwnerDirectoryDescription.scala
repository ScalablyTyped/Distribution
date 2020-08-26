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
  def apply(): OwnerDirectoryDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OwnerDirectoryDescription]
  }
  @scala.inline
  implicit class OwnerDirectoryDescriptionOps[Self <: OwnerDirectoryDescription] (val x: Self) extends AnyVal {
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
    def setAccountId(value: CustomerId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryId: Self = this.set("DirectoryId", js.undefined)
    @scala.inline
    def setDnsIpAddrsVarargs(value: IpAddr*): Self = this.set("DnsIpAddrs", js.Array(value :_*))
    @scala.inline
    def setDnsIpAddrs(value: DnsIpAddrs): Self = this.set("DnsIpAddrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsIpAddrs: Self = this.set("DnsIpAddrs", js.undefined)
    @scala.inline
    def setRadiusSettings(value: RadiusSettings): Self = this.set("RadiusSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadiusSettings: Self = this.set("RadiusSettings", js.undefined)
    @scala.inline
    def setRadiusStatus(value: RadiusStatus): Self = this.set("RadiusStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadiusStatus: Self = this.set("RadiusStatus", js.undefined)
    @scala.inline
    def setVpcSettings(value: DirectoryVpcSettingsDescription): Self = this.set("VpcSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcSettings: Self = this.set("VpcSettings", js.undefined)
  }
  
}

