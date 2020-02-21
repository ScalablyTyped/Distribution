package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsEc2SecurityGroupIpv6Range extends js.Object {
  /**
    * The IPv6 CIDR range. You can either specify either a CIDR range or a source security group, but not both. To specify a single IPv6 address, use the /128 prefix length.
    */
  var CidrIpv6: js.UndefOr[NonEmptyString] = js.native
}

object AwsEc2SecurityGroupIpv6Range {
  @scala.inline
  def apply(CidrIpv6: NonEmptyString = null): AwsEc2SecurityGroupIpv6Range = {
    val __obj = js.Dynamic.literal()
    if (CidrIpv6 != null) __obj.updateDynamic("CidrIpv6")(CidrIpv6.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsEc2SecurityGroupIpv6Range]
  }
}

