package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableVpcClassicLinkDnsSupportRequest extends js.Object {
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[typings.awsSdk.ec2Mod.VpcId] = js.native
}

object EnableVpcClassicLinkDnsSupportRequest {
  @scala.inline
  def apply(VpcId: VpcId = null): EnableVpcClassicLinkDnsSupportRequest = {
    val __obj = js.Dynamic.literal()
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableVpcClassicLinkDnsSupportRequest]
  }
}

