package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSMBSettingsOutput extends js.Object {
  
  /**
    * Indicates the status of a gateway that is a member of the Active Directory domain.    ACCESS_DENIED: Indicates that the JoinDomain operation failed due to an authentication error.    DETACHED: Indicates that gateway is not joined to a domain.    JOINED: Indicates that the gateway has successfully joined a domain.    JOINING: Indicates that a JoinDomain operation is in progress.    NETWORK_ERROR: Indicates that JoinDomain operation failed due to a network or connectivity error.    TIMEOUT: Indicates that the JoinDomain operation failed because the operation didn't complete within the allotted time.    UNKNOWN_ERROR: Indicates that the JoinDomain operation failed due to another type of error.  
    */
  var ActiveDirectoryStatus: js.UndefOr[typings.awsSdk.storagegatewayMod.ActiveDirectoryStatus] = js.native
  
  /**
    * The name of the domain that the gateway is joined to.
    */
  var DomainName: js.UndefOr[typings.awsSdk.storagegatewayMod.DomainName] = js.native
  
  /**
    * The shares on this gateway appear when listing shares.
    */
  var FileSharesVisible: js.UndefOr[Boolean] = js.native
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
  
  /**
    * This value is true if a password for the guest user smbguest is set, otherwise false. Valid Values: true | false 
    */
  var SMBGuestPasswordSet: js.UndefOr[Boolean] = js.native
  
  /**
    * The type of security strategy that was specified for file gateway.    ClientSpecified: If you use this option, requests are established based on what is negotiated by the client. This option is recommended when you want to maximize compatibility across different clients in your environment.    MandatorySigning: If you use this option, file gateway only allows connections from SMBv2 or SMBv3 clients that have signing enabled. This option works with SMB clients on Microsoft Windows Vista, Windows Server 2008 or newer.    MandatoryEncryption: If you use this option, file gateway only allows connections from SMBv3 clients that have encryption enabled. This option is highly recommended for environments that handle sensitive data. This option works with SMB clients on Microsoft Windows 8, Windows Server 2012 or newer.  
    */
  var SMBSecurityStrategy: js.UndefOr[typings.awsSdk.storagegatewayMod.SMBSecurityStrategy] = js.native
}
object DescribeSMBSettingsOutput {
  
  @scala.inline
  def apply(): DescribeSMBSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSMBSettingsOutput]
  }
  
  @scala.inline
  implicit class DescribeSMBSettingsOutputOps[Self <: DescribeSMBSettingsOutput] (val x: Self) extends AnyVal {
    
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
    def setActiveDirectoryStatus(value: ActiveDirectoryStatus): Self = this.set("ActiveDirectoryStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveDirectoryStatus: Self = this.set("ActiveDirectoryStatus", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("DomainName", js.undefined)
    
    @scala.inline
    def setFileSharesVisible(value: Boolean): Self = this.set("FileSharesVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSharesVisible: Self = this.set("FileSharesVisible", js.undefined)
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayARN: Self = this.set("GatewayARN", js.undefined)
    
    @scala.inline
    def setSMBGuestPasswordSet(value: Boolean): Self = this.set("SMBGuestPasswordSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSMBGuestPasswordSet: Self = this.set("SMBGuestPasswordSet", js.undefined)
    
    @scala.inline
    def setSMBSecurityStrategy(value: SMBSecurityStrategy): Self = this.set("SMBSecurityStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSMBSecurityStrategy: Self = this.set("SMBSecurityStrategy", js.undefined)
  }
}
