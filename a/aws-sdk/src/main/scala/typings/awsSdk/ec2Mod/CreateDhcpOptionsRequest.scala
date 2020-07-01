package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDhcpOptionsRequest extends js.Object {
  /**
    * A DHCP configuration option.
    */
  var DhcpConfigurations: NewDhcpConfigurationList = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The tags to assign to the DHCP option.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
}

object CreateDhcpOptionsRequest {
  @scala.inline
  def apply(
    DhcpConfigurations: NewDhcpConfigurationList,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    TagSpecifications: TagSpecificationList = null
  ): CreateDhcpOptionsRequest = {
    val __obj = js.Dynamic.literal(DhcpConfigurations = DhcpConfigurations.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDhcpOptionsRequest]
  }
}

