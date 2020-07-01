package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    ActiveDirectoryStatus: ActiveDirectoryStatus = null,
    DomainName: DomainName = null,
    GatewayARN: GatewayARN = null,
    SMBGuestPasswordSet: js.UndefOr[Boolean] = js.undefined,
    SMBSecurityStrategy: SMBSecurityStrategy = null
  ): DescribeSMBSettingsOutput = {
    val __obj = js.Dynamic.literal()
    if (ActiveDirectoryStatus != null) __obj.updateDynamic("ActiveDirectoryStatus")(ActiveDirectoryStatus.asInstanceOf[js.Any])
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName.asInstanceOf[js.Any])
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    if (!js.isUndefined(SMBGuestPasswordSet)) __obj.updateDynamic("SMBGuestPasswordSet")(SMBGuestPasswordSet.get.asInstanceOf[js.Any])
    if (SMBSecurityStrategy != null) __obj.updateDynamic("SMBSecurityStrategy")(SMBSecurityStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSMBSettingsOutput]
  }
}

