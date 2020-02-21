package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayVpcAttachmentOptions extends js.Object {
  /**
    * Indicates whether DNS support is enabled.
    */
  var DnsSupport: js.UndefOr[DnsSupportValue] = js.native
  /**
    * Indicates whether IPv6 support is disabled.
    */
  var Ipv6Support: js.UndefOr[Ipv6SupportValue] = js.native
}

object TransitGatewayVpcAttachmentOptions {
  @scala.inline
  def apply(DnsSupport: DnsSupportValue = null, Ipv6Support: Ipv6SupportValue = null): TransitGatewayVpcAttachmentOptions = {
    val __obj = js.Dynamic.literal()
    if (DnsSupport != null) __obj.updateDynamic("DnsSupport")(DnsSupport.asInstanceOf[js.Any])
    if (Ipv6Support != null) __obj.updateDynamic("Ipv6Support")(Ipv6Support.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitGatewayVpcAttachmentOptions]
  }
}

