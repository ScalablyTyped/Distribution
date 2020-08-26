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
  def apply(): Ipv6Range = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ipv6Range]
  }
  @scala.inline
  implicit class Ipv6RangeOps[Self <: Ipv6Range] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCidrIpv6(value: String): Self = this.set("CidrIpv6", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidrIpv6: Self = this.set("CidrIpv6", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
  
}

