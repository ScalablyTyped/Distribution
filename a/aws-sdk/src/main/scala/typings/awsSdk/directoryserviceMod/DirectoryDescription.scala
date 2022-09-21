package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectoryDescription extends StObject {
  
  /**
    * The access URL for the directory, such as http://&lt;alias&gt;.awsapps.com. If no alias has been created for the directory, &lt;alias&gt; is the directory identifier, such as d-XXXXXXXXXX.
    */
  var AccessUrl: js.UndefOr[typings.awsSdk.directoryserviceMod.AccessUrl] = js.undefined
  
  /**
    * The alias for the directory. If no alias has been created for the directory, the alias is the directory identifier, such as d-XXXXXXXXXX.
    */
  var Alias: js.UndefOr[AliasName] = js.undefined
  
  /**
    * A DirectoryConnectSettingsDescription object that contains additional information about an AD Connector directory. This member is only present if the directory is an AD Connector directory.
    */
  var ConnectSettings: js.UndefOr[DirectoryConnectSettingsDescription] = js.undefined
  
  /**
    * The description for the directory.
    */
  var Description: js.UndefOr[typings.awsSdk.directoryserviceMod.Description] = js.undefined
  
  /**
    * The desired number of domain controllers in the directory if the directory is Microsoft AD.
    */
  var DesiredNumberOfDomainControllers: js.UndefOr[typings.awsSdk.directoryserviceMod.DesiredNumberOfDomainControllers] = js.undefined
  
  /**
    * The directory identifier.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.undefined
  
  /**
    * The IP addresses of the DNS servers for the directory. For a Simple AD or Microsoft AD directory, these are the IP addresses of the Simple AD or Microsoft AD directory servers. For an AD Connector directory, these are the IP addresses of the DNS servers or domain controllers in your self-managed directory to which the AD Connector is connected.
    */
  var DnsIpAddrs: js.UndefOr[typings.awsSdk.directoryserviceMod.DnsIpAddrs] = js.undefined
  
  /**
    * The edition associated with this directory.
    */
  var Edition: js.UndefOr[DirectoryEdition] = js.undefined
  
  /**
    * Specifies when the directory was created.
    */
  var LaunchTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The fully qualified name of the directory.
    */
  var Name: js.UndefOr[DirectoryName] = js.undefined
  
  /**
    * Describes the Managed Microsoft AD directory in the directory owner account.
    */
  var OwnerDirectoryDescription: js.UndefOr[typings.awsSdk.directoryserviceMod.OwnerDirectoryDescription] = js.undefined
  
  /**
    * A RadiusSettings object that contains information about the RADIUS server configured for this directory.
    */
  var RadiusSettings: js.UndefOr[typings.awsSdk.directoryserviceMod.RadiusSettings] = js.undefined
  
  /**
    * The status of the RADIUS MFA server connection.
    */
  var RadiusStatus: js.UndefOr[typings.awsSdk.directoryserviceMod.RadiusStatus] = js.undefined
  
  /**
    * Lists the Regions where the directory has replicated.
    */
  var RegionsInfo: js.UndefOr[typings.awsSdk.directoryserviceMod.RegionsInfo] = js.undefined
  
  /**
    * The method used when sharing a directory to determine whether the directory should be shared within your Amazon Web Services organization (ORGANIZATIONS) or with any Amazon Web Services account by sending a shared directory request (HANDSHAKE).
    */
  var ShareMethod: js.UndefOr[typings.awsSdk.directoryserviceMod.ShareMethod] = js.undefined
  
  /**
    * A directory share request that is sent by the directory owner to the directory consumer. The request includes a typed message to help the directory consumer administrator determine whether to approve or reject the share invitation.
    */
  var ShareNotes: js.UndefOr[Notes] = js.undefined
  
  /**
    * Current directory status of the shared Managed Microsoft AD directory.
    */
  var ShareStatus: js.UndefOr[typings.awsSdk.directoryserviceMod.ShareStatus] = js.undefined
  
  /**
    * The short name of the directory.
    */
  var ShortName: js.UndefOr[DirectoryShortName] = js.undefined
  
  /**
    * The directory size.
    */
  var Size: js.UndefOr[DirectorySize] = js.undefined
  
  /**
    * Indicates if single sign-on is enabled for the directory. For more information, see EnableSso and DisableSso.
    */
  var SsoEnabled: js.UndefOr[typings.awsSdk.directoryserviceMod.SsoEnabled] = js.undefined
  
  /**
    * The current stage of the directory.
    */
  var Stage: js.UndefOr[DirectoryStage] = js.undefined
  
  /**
    * The date and time that the stage was last updated.
    */
  var StageLastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Additional information about the directory stage.
    */
  var StageReason: js.UndefOr[typings.awsSdk.directoryserviceMod.StageReason] = js.undefined
  
  /**
    * The directory size.
    */
  var Type: js.UndefOr[DirectoryType] = js.undefined
  
  /**
    * A DirectoryVpcSettingsDescription object that contains additional information about a directory. This member is only present if the directory is a Simple AD or Managed Microsoft AD directory.
    */
  var VpcSettings: js.UndefOr[DirectoryVpcSettingsDescription] = js.undefined
}
object DirectoryDescription {
  
  inline def apply(): DirectoryDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryDescription]
  }
  
  extension [Self <: DirectoryDescription](x: Self) {
    
    inline def setAccessUrl(value: AccessUrl): Self = StObject.set(x, "AccessUrl", value.asInstanceOf[js.Any])
    
    inline def setAccessUrlUndefined: Self = StObject.set(x, "AccessUrl", js.undefined)
    
    inline def setAlias(value: AliasName): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
    
    inline def setConnectSettings(value: DirectoryConnectSettingsDescription): Self = StObject.set(x, "ConnectSettings", value.asInstanceOf[js.Any])
    
    inline def setConnectSettingsUndefined: Self = StObject.set(x, "ConnectSettings", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDesiredNumberOfDomainControllers(value: DesiredNumberOfDomainControllers): Self = StObject.set(x, "DesiredNumberOfDomainControllers", value.asInstanceOf[js.Any])
    
    inline def setDesiredNumberOfDomainControllersUndefined: Self = StObject.set(x, "DesiredNumberOfDomainControllers", js.undefined)
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    inline def setDnsIpAddrs(value: DnsIpAddrs): Self = StObject.set(x, "DnsIpAddrs", value.asInstanceOf[js.Any])
    
    inline def setDnsIpAddrsUndefined: Self = StObject.set(x, "DnsIpAddrs", js.undefined)
    
    inline def setDnsIpAddrsVarargs(value: IpAddr*): Self = StObject.set(x, "DnsIpAddrs", js.Array(value*))
    
    inline def setEdition(value: DirectoryEdition): Self = StObject.set(x, "Edition", value.asInstanceOf[js.Any])
    
    inline def setEditionUndefined: Self = StObject.set(x, "Edition", js.undefined)
    
    inline def setLaunchTime(value: js.Date): Self = StObject.set(x, "LaunchTime", value.asInstanceOf[js.Any])
    
    inline def setLaunchTimeUndefined: Self = StObject.set(x, "LaunchTime", js.undefined)
    
    inline def setName(value: DirectoryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOwnerDirectoryDescription(value: OwnerDirectoryDescription): Self = StObject.set(x, "OwnerDirectoryDescription", value.asInstanceOf[js.Any])
    
    inline def setOwnerDirectoryDescriptionUndefined: Self = StObject.set(x, "OwnerDirectoryDescription", js.undefined)
    
    inline def setRadiusSettings(value: RadiusSettings): Self = StObject.set(x, "RadiusSettings", value.asInstanceOf[js.Any])
    
    inline def setRadiusSettingsUndefined: Self = StObject.set(x, "RadiusSettings", js.undefined)
    
    inline def setRadiusStatus(value: RadiusStatus): Self = StObject.set(x, "RadiusStatus", value.asInstanceOf[js.Any])
    
    inline def setRadiusStatusUndefined: Self = StObject.set(x, "RadiusStatus", js.undefined)
    
    inline def setRegionsInfo(value: RegionsInfo): Self = StObject.set(x, "RegionsInfo", value.asInstanceOf[js.Any])
    
    inline def setRegionsInfoUndefined: Self = StObject.set(x, "RegionsInfo", js.undefined)
    
    inline def setShareMethod(value: ShareMethod): Self = StObject.set(x, "ShareMethod", value.asInstanceOf[js.Any])
    
    inline def setShareMethodUndefined: Self = StObject.set(x, "ShareMethod", js.undefined)
    
    inline def setShareNotes(value: Notes): Self = StObject.set(x, "ShareNotes", value.asInstanceOf[js.Any])
    
    inline def setShareNotesUndefined: Self = StObject.set(x, "ShareNotes", js.undefined)
    
    inline def setShareStatus(value: ShareStatus): Self = StObject.set(x, "ShareStatus", value.asInstanceOf[js.Any])
    
    inline def setShareStatusUndefined: Self = StObject.set(x, "ShareStatus", js.undefined)
    
    inline def setShortName(value: DirectoryShortName): Self = StObject.set(x, "ShortName", value.asInstanceOf[js.Any])
    
    inline def setShortNameUndefined: Self = StObject.set(x, "ShortName", js.undefined)
    
    inline def setSize(value: DirectorySize): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
    
    inline def setSsoEnabled(value: SsoEnabled): Self = StObject.set(x, "SsoEnabled", value.asInstanceOf[js.Any])
    
    inline def setSsoEnabledUndefined: Self = StObject.set(x, "SsoEnabled", js.undefined)
    
    inline def setStage(value: DirectoryStage): Self = StObject.set(x, "Stage", value.asInstanceOf[js.Any])
    
    inline def setStageLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "StageLastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setStageLastUpdatedDateTimeUndefined: Self = StObject.set(x, "StageLastUpdatedDateTime", js.undefined)
    
    inline def setStageReason(value: StageReason): Self = StObject.set(x, "StageReason", value.asInstanceOf[js.Any])
    
    inline def setStageReasonUndefined: Self = StObject.set(x, "StageReason", js.undefined)
    
    inline def setStageUndefined: Self = StObject.set(x, "Stage", js.undefined)
    
    inline def setType(value: DirectoryType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setVpcSettings(value: DirectoryVpcSettingsDescription): Self = StObject.set(x, "VpcSettings", value.asInstanceOf[js.Any])
    
    inline def setVpcSettingsUndefined: Self = StObject.set(x, "VpcSettings", js.undefined)
  }
}
