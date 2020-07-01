package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JoinDomainOutput extends js.Object {
  /**
    * Indicates the status of the gateway as a member of the Active Directory domain.    ACCESS_DENIED: Indicates that the JoinDomain operation failed due to an authentication error.    DETACHED: Indicates that gateway is not joined to a domain.    JOINED: Indicates that the gateway has successfully joined a domain.    JOINING: Indicates that a JoinDomain operation is in progress.    NETWORK_ERROR: Indicates that JoinDomain operation failed due to a network or connectivity error.    TIMEOUT: Indicates that the JoinDomain operation failed because the operation didn't complete within the allotted time.    UNKNOWN_ERROR: Indicates that the JoinDomain operation failed due to another type of error.  
    */
  var ActiveDirectoryStatus: js.UndefOr[typings.awsSdk.storagegatewayMod.ActiveDirectoryStatus] = js.native
  /**
    * The unique Amazon Resource Name (ARN) of the gateway that joined the domain.
    */
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
}

object JoinDomainOutput {
  @scala.inline
  def apply(ActiveDirectoryStatus: ActiveDirectoryStatus = null, GatewayARN: GatewayARN = null): JoinDomainOutput = {
    val __obj = js.Dynamic.literal()
    if (ActiveDirectoryStatus != null) __obj.updateDynamic("ActiveDirectoryStatus")(ActiveDirectoryStatus.asInstanceOf[js.Any])
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinDomainOutput]
  }
}

