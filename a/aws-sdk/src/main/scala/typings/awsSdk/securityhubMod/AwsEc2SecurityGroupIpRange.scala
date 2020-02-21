package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsEc2SecurityGroupIpRange extends js.Object {
  /**
    * The IPv4 CIDR range. You can either specify either a CIDR range or a source security group, but not both. To specify a single IPv4 address, use the /32 prefix length.
    */
  var CidrIp: js.UndefOr[NonEmptyString] = js.native
}

object AwsEc2SecurityGroupIpRange {
  @scala.inline
  def apply(CidrIp: NonEmptyString = null): AwsEc2SecurityGroupIpRange = {
    val __obj = js.Dynamic.literal()
    if (CidrIp != null) __obj.updateDynamic("CidrIp")(CidrIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsEc2SecurityGroupIpRange]
  }
}

