package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountResult extends js.Object {
  /**
    * The IP address range, specified as an IPv4 CIDR block, used for the management network interface. The management network interface is connected to a secure Amazon WorkSpaces management network. It is used for interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon WorkSpaces to manage the WorkSpace.
    */
  var DedicatedTenancyManagementCidrRange: js.UndefOr[typings.awsSdk.workspacesMod.DedicatedTenancyManagementCidrRange] = js.native
  /**
    * The status of BYOL (whether BYOL is enabled or disabled).
    */
  var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportResultEnum] = js.native
}

object DescribeAccountResult {
  @scala.inline
  def apply(): DescribeAccountResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountResult]
  }
  @scala.inline
  implicit class DescribeAccountResultOps[Self <: DescribeAccountResult] (val x: Self) extends AnyVal {
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
    def setDedicatedTenancySupport(value: DedicatedTenancySupportResultEnum): Self = this.set("DedicatedTenancySupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDedicatedTenancySupport: Self = this.set("DedicatedTenancySupport", js.undefined)
  }
  
}

