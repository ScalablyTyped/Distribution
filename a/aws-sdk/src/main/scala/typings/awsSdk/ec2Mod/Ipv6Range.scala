package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ipv6Range extends js.Object {
  /**
    * The IPv6 CIDR range. You can either specify a CIDR range or a source security group, not both. To specify a single IPv6 address, use the /128 prefix length.
    */
  var CidrIpv6: js.UndefOr[String] = js.native
  /**
    * A description for the security group rule that references this IPv6 address range. Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$*
    */
  var Description: js.UndefOr[String] = js.native
}

object Ipv6Range {
  @scala.inline
  def apply(CidrIpv6: String = null, Description: String = null): Ipv6Range = {
    val __obj = js.Dynamic.literal()
    if (CidrIpv6 != null) __obj.updateDynamic("CidrIpv6")(CidrIpv6.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ipv6Range]
  }
}

