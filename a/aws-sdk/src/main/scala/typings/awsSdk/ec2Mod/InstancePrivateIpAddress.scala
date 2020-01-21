package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancePrivateIpAddress extends js.Object {
  /**
    * The association information for an Elastic IP address for the network interface.
    */
  var Association: js.UndefOr[InstanceNetworkInterfaceAssociation] = js.native
  /**
    * Indicates whether this IPv4 address is the primary private IP address of the network interface.
    */
  var Primary: js.UndefOr[Boolean] = js.native
  /**
    * The private IPv4 DNS name.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  /**
    * The private IPv4 address of the network interface.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
}

object InstancePrivateIpAddress {
  @scala.inline
  def apply(
    Association: InstanceNetworkInterfaceAssociation = null,
    Primary: js.UndefOr[scala.Boolean] = js.undefined,
    PrivateDnsName: String = null,
    PrivateIpAddress: String = null
  ): InstancePrivateIpAddress = {
    val __obj = js.Dynamic.literal()
    if (Association != null) __obj.updateDynamic("Association")(Association.asInstanceOf[js.Any])
    if (!js.isUndefined(Primary)) __obj.updateDynamic("Primary")(Primary.asInstanceOf[js.Any])
    if (PrivateDnsName != null) __obj.updateDynamic("PrivateDnsName")(PrivateDnsName.asInstanceOf[js.Any])
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancePrivateIpAddress]
  }
}

