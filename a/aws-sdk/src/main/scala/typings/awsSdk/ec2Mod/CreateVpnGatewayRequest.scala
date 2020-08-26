package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpnGatewayRequest extends js.Object {
  /**
    * A private Autonomous System Number (ASN) for the Amazon side of a BGP session. If you're using a 16-bit ASN, it must be in the 64512 to 65534 range. If you're using a 32-bit ASN, it must be in the 4200000000 to 4294967294 range. Default: 64512
    */
  var AmazonSideAsn: js.UndefOr[Long] = js.native
  /**
    * The Availability Zone for the virtual private gateway.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The tags to apply to the virtual private gateway.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  /**
    * The type of VPN connection this virtual private gateway supports.
    */
  var Type: GatewayType = js.native
}

object CreateVpnGatewayRequest {
  @scala.inline
  def apply(Type: GatewayType): CreateVpnGatewayRequest = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpnGatewayRequest]
  }
  @scala.inline
  implicit class CreateVpnGatewayRequestOps[Self <: CreateVpnGatewayRequest] (val x: Self) extends AnyVal {
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
    def setType(value: GatewayType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmazonSideAsn(value: Long): Self = this.set("AmazonSideAsn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmazonSideAsn: Self = this.set("AmazonSideAsn", js.undefined)
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
  }
  
}

