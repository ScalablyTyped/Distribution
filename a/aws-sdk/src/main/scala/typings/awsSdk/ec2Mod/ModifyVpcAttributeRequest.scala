package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpcAttributeRequest extends js.Object {
  /**
    * Indicates whether the instances launched in the VPC get DNS hostnames. If enabled, instances in the VPC get DNS hostnames; otherwise, they do not. You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate requests for each attribute. You can only enable DNS hostnames if you've enabled DNS support.
    */
  var EnableDnsHostnames: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * Indicates whether the DNS resolution is supported for the VPC. If enabled, queries to the Amazon provided DNS server at the 169.254.169.253 IP address, or the reserved IP address at the base of the VPC network range "plus two" succeed. If disabled, the Amazon provided DNS service in the VPC that resolves public DNS hostnames to IP addresses is not enabled. You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate requests for each attribute.
    */
  var EnableDnsSupport: js.UndefOr[AttributeBooleanValue] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: typings.awsSdk.ec2Mod.VpcId = js.native
}

object ModifyVpcAttributeRequest {
  @scala.inline
  def apply(
    VpcId: VpcId,
    EnableDnsHostnames: AttributeBooleanValue = null,
    EnableDnsSupport: AttributeBooleanValue = null
  ): ModifyVpcAttributeRequest = {
    val __obj = js.Dynamic.literal(VpcId = VpcId.asInstanceOf[js.Any])
    if (EnableDnsHostnames != null) __obj.updateDynamic("EnableDnsHostnames")(EnableDnsHostnames.asInstanceOf[js.Any])
    if (EnableDnsSupport != null) __obj.updateDynamic("EnableDnsSupport")(EnableDnsSupport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcAttributeRequest]
  }
}

