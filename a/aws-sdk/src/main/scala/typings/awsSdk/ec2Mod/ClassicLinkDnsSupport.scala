package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassicLinkDnsSupport extends js.Object {
  /**
    * Indicates whether ClassicLink DNS support is enabled for the VPC.
    */
  var ClassicLinkDnsSupported: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object ClassicLinkDnsSupport {
  @scala.inline
  def apply(ClassicLinkDnsSupported: js.UndefOr[scala.Boolean] = js.undefined, VpcId: String = null): ClassicLinkDnsSupport = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ClassicLinkDnsSupported)) __obj.updateDynamic("ClassicLinkDnsSupported")(ClassicLinkDnsSupported.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassicLinkDnsSupport]
  }
}

