package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryDescription extends js.Object {
  /**
    * The access URL for the directory, such as http://&lt;alias&gt;.awsapps.com. If no alias has been created for the directory, &lt;alias&gt; is the directory identifier, such as d-XXXXXXXXXX.
    */
  var AccessUrl: js.UndefOr[typings.awsSdk.directoryserviceMod.AccessUrl] = js.native
  /**
    * The alias for the directory. If no alias has been created for the directory, the alias is the directory identifier, such as d-XXXXXXXXXX.
    */
  var Alias: js.UndefOr[AliasName] = js.native
  /**
    * A DirectoryConnectSettingsDescription object that contains additional information about an AD Connector directory. This member is only present if the directory is an AD Connector directory.
    */
  var ConnectSettings: js.UndefOr[DirectoryConnectSettingsDescription] = js.native
  /**
    * The description for the directory.
    */
  var Description: js.UndefOr[typings.awsSdk.directoryserviceMod.Description] = js.native
  /**
    * The desired number of domain controllers in the directory if the directory is Microsoft AD.
    */
  var DesiredNumberOfDomainControllers: js.UndefOr[typings.awsSdk.directoryserviceMod.DesiredNumberOfDomainControllers] = js.native
  /**
    * The directory identifier.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.native
  /**
    * The IP addresses of the DNS servers for the directory. For a Simple AD or Microsoft AD directory, these are the IP addresses of the Simple AD or Microsoft AD directory servers. For an AD Connector directory, these are the IP addresses of the DNS servers or domain controllers in the on-premises directory to which the AD Connector is connected.
    */
  var DnsIpAddrs: js.UndefOr[typings.awsSdk.directoryserviceMod.DnsIpAddrs] = js.native
  /**
    * The edition associated with this directory.
    */
  var Edition: js.UndefOr[DirectoryEdition] = js.native
  /**
    * Specifies when the directory was created.
    */
  var LaunchTime: js.UndefOr[typings.awsSdk.directoryserviceMod.LaunchTime] = js.native
  /**
    * The fully qualified name of the directory.
    */
  var Name: js.UndefOr[DirectoryName] = js.native
  /**
    * Describes the AWS Managed Microsoft AD directory in the directory owner account.
    */
  var OwnerDirectoryDescription: js.UndefOr[typings.awsSdk.directoryserviceMod.OwnerDirectoryDescription] = js.native
  /**
    * A RadiusSettings object that contains information about the RADIUS server configured for this directory.
    */
  var RadiusSettings: js.UndefOr[typings.awsSdk.directoryserviceMod.RadiusSettings] = js.native
  /**
    * The status of the RADIUS MFA server connection.
    */
  var RadiusStatus: js.UndefOr[typings.awsSdk.directoryserviceMod.RadiusStatus] = js.native
  /**
    * The method used when sharing a directory to determine whether the directory should be shared within your AWS organization (ORGANIZATIONS) or with any AWS account by sending a shared directory request (HANDSHAKE).
    */
  var ShareMethod: js.UndefOr[typings.awsSdk.directoryserviceMod.ShareMethod] = js.native
  /**
    * A directory share request that is sent by the directory owner to the directory consumer. The request includes a typed message to help the directory consumer administrator determine whether to approve or reject the share invitation.
    */
  var ShareNotes: js.UndefOr[Notes] = js.native
  /**
    * Current directory status of the shared AWS Managed Microsoft AD directory.
    */
  var ShareStatus: js.UndefOr[typings.awsSdk.directoryserviceMod.ShareStatus] = js.native
  /**
    * The short name of the directory.
    */
  var ShortName: js.UndefOr[DirectoryShortName] = js.native
  /**
    * The directory size.
    */
  var Size: js.UndefOr[DirectorySize] = js.native
  /**
    * Indicates if single sign-on is enabled for the directory. For more information, see EnableSso and DisableSso.
    */
  var SsoEnabled: js.UndefOr[typings.awsSdk.directoryserviceMod.SsoEnabled] = js.native
  /**
    * The current stage of the directory.
    */
  var Stage: js.UndefOr[DirectoryStage] = js.native
  /**
    * The date and time that the stage was last updated.
    */
  var StageLastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime] = js.native
  /**
    * Additional information about the directory stage.
    */
  var StageReason: js.UndefOr[typings.awsSdk.directoryserviceMod.StageReason] = js.native
  /**
    * The directory size.
    */
  var Type: js.UndefOr[DirectoryType] = js.native
  /**
    * A DirectoryVpcSettingsDescription object that contains additional information about a directory. This member is only present if the directory is a Simple AD or Managed AD directory.
    */
  var VpcSettings: js.UndefOr[DirectoryVpcSettingsDescription] = js.native
}

object DirectoryDescription {
  @scala.inline
  def apply(): DirectoryDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryDescription]
  }
  @scala.inline
  implicit class DirectoryDescriptionOps[Self <: DirectoryDescription] (val x: Self) extends AnyVal {
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
    def setAccessUrl(value: AccessUrl): Self = this.set("AccessUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessUrl: Self = this.set("AccessUrl", js.undefined)
    @scala.inline
    def setAlias(value: AliasName): Self = this.set("Alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("Alias", js.undefined)
    @scala.inline
    def setConnectSettings(value: DirectoryConnectSettingsDescription): Self = this.set("ConnectSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectSettings: Self = this.set("ConnectSettings", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDesiredNumberOfDomainControllers(value: DesiredNumberOfDomainControllers): Self = this.set("DesiredNumberOfDomainControllers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredNumberOfDomainControllers: Self = this.set("DesiredNumberOfDomainControllers", js.undefined)
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
    def setEdition(value: DirectoryEdition): Self = this.set("Edition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdition: Self = this.set("Edition", js.undefined)
    @scala.inline
    def setLaunchTime(value: LaunchTime): Self = this.set("LaunchTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTime: Self = this.set("LaunchTime", js.undefined)
    @scala.inline
    def setName(value: DirectoryName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setOwnerDirectoryDescription(value: OwnerDirectoryDescription): Self = this.set("OwnerDirectoryDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerDirectoryDescription: Self = this.set("OwnerDirectoryDescription", js.undefined)
    @scala.inline
    def setRadiusSettings(value: RadiusSettings): Self = this.set("RadiusSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadiusSettings: Self = this.set("RadiusSettings", js.undefined)
    @scala.inline
    def setRadiusStatus(value: RadiusStatus): Self = this.set("RadiusStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadiusStatus: Self = this.set("RadiusStatus", js.undefined)
    @scala.inline
    def setShareMethod(value: ShareMethod): Self = this.set("ShareMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareMethod: Self = this.set("ShareMethod", js.undefined)
    @scala.inline
    def setShareNotes(value: Notes): Self = this.set("ShareNotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareNotes: Self = this.set("ShareNotes", js.undefined)
    @scala.inline
    def setShareStatus(value: ShareStatus): Self = this.set("ShareStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareStatus: Self = this.set("ShareStatus", js.undefined)
    @scala.inline
    def setShortName(value: DirectoryShortName): Self = this.set("ShortName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortName: Self = this.set("ShortName", js.undefined)
    @scala.inline
    def setSize(value: DirectorySize): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("Size", js.undefined)
    @scala.inline
    def setSsoEnabled(value: SsoEnabled): Self = this.set("SsoEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsoEnabled: Self = this.set("SsoEnabled", js.undefined)
    @scala.inline
    def setStage(value: DirectoryStage): Self = this.set("Stage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStage: Self = this.set("Stage", js.undefined)
    @scala.inline
    def setStageLastUpdatedDateTime(value: LastUpdatedDateTime): Self = this.set("StageLastUpdatedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStageLastUpdatedDateTime: Self = this.set("StageLastUpdatedDateTime", js.undefined)
    @scala.inline
    def setStageReason(value: StageReason): Self = this.set("StageReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStageReason: Self = this.set("StageReason", js.undefined)
    @scala.inline
    def setType(value: DirectoryType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setVpcSettings(value: DirectoryVpcSettingsDescription): Self = this.set("VpcSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcSettings: Self = this.set("VpcSettings", js.undefined)
  }
  
}

