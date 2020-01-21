package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpRoute extends js.Object {
  /**
    * IP address block using CIDR format, for example 10.0.0.0/24. This is often the address block of the DNS server used for your on-premises domain. For a single IP address use a CIDR address block with /32. For example 10.0.0.0/32.
    */
  var CidrIp: js.UndefOr[typings.awsSdk.directoryserviceMod.CidrIp] = js.native
  /**
    * Description of the address block.
    */
  var Description: js.UndefOr[typings.awsSdk.directoryserviceMod.Description] = js.native
}

object IpRoute {
  @scala.inline
  def apply(CidrIp: CidrIp = null, Description: Description = null): IpRoute = {
    val __obj = js.Dynamic.literal()
    if (CidrIp != null) __obj.updateDynamic("CidrIp")(CidrIp.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpRoute]
  }
}

