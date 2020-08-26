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
  def apply(): ModifyAccountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyAccountRequest]
  }
  @scala.inline
  implicit class ModifyAccountRequestOps[Self <: ModifyAccountRequest] (val x: Self) extends AnyVal {
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
    def setDedicatedTenancyManagementCidrRange(value: DedicatedTenancyManagementCidrRange): Self = this.set("DedicatedTenancyManagementCidrRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDedicatedTenancyManagementCidrRange: Self = this.set("DedicatedTenancyManagementCidrRange", js.undefined)
    @scala.inline
    def setDedicatedTenancySupport(value: DedicatedTenancySupportEnum): Self = this.set("DedicatedTenancySupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDedicatedTenancySupport: Self = this.set("DedicatedTenancySupport", js.undefined)
  }
  
}

