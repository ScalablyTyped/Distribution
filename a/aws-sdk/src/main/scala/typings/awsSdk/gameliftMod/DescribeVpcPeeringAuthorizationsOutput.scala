package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcPeeringAuthorizationsOutput extends js.Object {
  /**
    * A collection of objects that describe all valid VPC peering operations for the current AWS account.
    */
  var VpcPeeringAuthorizations: js.UndefOr[VpcPeeringAuthorizationList] = js.native
}

object DescribeVpcPeeringAuthorizationsOutput {
  @scala.inline
  def apply(VpcPeeringAuthorizations: VpcPeeringAuthorizationList = null): DescribeVpcPeeringAuthorizationsOutput = {
    val __obj = js.Dynamic.literal()
    if (VpcPeeringAuthorizations != null) __obj.updateDynamic("VpcPeeringAuthorizations")(VpcPeeringAuthorizations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcPeeringAuthorizationsOutput]
  }
}

