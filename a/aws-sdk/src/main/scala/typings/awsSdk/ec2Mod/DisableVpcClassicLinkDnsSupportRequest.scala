package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableVpcClassicLinkDnsSupportRequest extends js.Object {
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[typings.awsSdk.ec2Mod.VpcId] = js.native
}

object DisableVpcClassicLinkDnsSupportRequest {
  @scala.inline
  def apply(VpcId: VpcId = null): DisableVpcClassicLinkDnsSupportRequest = {
    val __obj = js.Dynamic.literal()
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableVpcClassicLinkDnsSupportRequest]
  }
}

