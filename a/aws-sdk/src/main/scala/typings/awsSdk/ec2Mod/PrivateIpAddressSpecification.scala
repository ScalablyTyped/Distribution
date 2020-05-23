package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateIpAddressSpecification extends js.Object {
  /**
    * Indicates whether the private IPv4 address is the primary private IPv4 address. Only one IPv4 address can be designated as primary.
    */
  var Primary: js.UndefOr[Boolean] = js.native
  /**
    * The private IPv4 addresses.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
}

object PrivateIpAddressSpecification {
  @scala.inline
  def apply(Primary: js.UndefOr[Boolean] = js.undefined, PrivateIpAddress: String = null): PrivateIpAddressSpecification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Primary)) __obj.updateDynamic("Primary")(Primary.get.asInstanceOf[js.Any])
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateIpAddressSpecification]
  }
}

