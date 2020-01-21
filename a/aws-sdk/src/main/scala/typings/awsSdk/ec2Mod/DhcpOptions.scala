package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DhcpOptions extends js.Object {
  /**
    * One or more DHCP options in the set.
    */
  var DhcpConfigurations: js.UndefOr[DhcpConfigurationList] = js.native
  /**
    * The ID of the set of DHCP options.
    */
  var DhcpOptionsId: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS account that owns the DHCP options set.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * Any tags assigned to the DHCP options set.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object DhcpOptions {
  @scala.inline
  def apply(
    DhcpConfigurations: DhcpConfigurationList = null,
    DhcpOptionsId: String = null,
    OwnerId: String = null,
    Tags: TagList = null
  ): DhcpOptions = {
    val __obj = js.Dynamic.literal()
    if (DhcpConfigurations != null) __obj.updateDynamic("DhcpConfigurations")(DhcpConfigurations.asInstanceOf[js.Any])
    if (DhcpOptionsId != null) __obj.updateDynamic("DhcpOptionsId")(DhcpOptionsId.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DhcpOptions]
  }
}

