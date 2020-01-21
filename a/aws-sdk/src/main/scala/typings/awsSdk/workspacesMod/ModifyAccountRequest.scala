package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyAccountRequest extends js.Object {
  /**
    * The IP address range, specified as an IPv4 CIDR block, for the management network interface. Specify an IP address range that is compatible with your network and in CIDR notation (that is, specify the range as an IPv4 CIDR block). The CIDR block size must be /16 (for example, 203.0.113.25/16). It must also be specified as available by the ListAvailableManagementCidrRanges operation.
    */
  var DedicatedTenancyManagementCidrRange: js.UndefOr[typings.awsSdk.workspacesMod.DedicatedTenancyManagementCidrRange] = js.native
  /**
    * The status of BYOL.
    */
  var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportEnum] = js.native
}

object ModifyAccountRequest {
  @scala.inline
  def apply(
    DedicatedTenancyManagementCidrRange: DedicatedTenancyManagementCidrRange = null,
    DedicatedTenancySupport: DedicatedTenancySupportEnum = null
  ): ModifyAccountRequest = {
    val __obj = js.Dynamic.literal()
    if (DedicatedTenancyManagementCidrRange != null) __obj.updateDynamic("DedicatedTenancyManagementCidrRange")(DedicatedTenancyManagementCidrRange.asInstanceOf[js.Any])
    if (DedicatedTenancySupport != null) __obj.updateDynamic("DedicatedTenancySupport")(DedicatedTenancySupport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyAccountRequest]
  }
}

