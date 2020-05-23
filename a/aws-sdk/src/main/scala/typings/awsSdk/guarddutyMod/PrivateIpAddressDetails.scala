package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateIpAddressDetails extends js.Object {
  /**
    * The private DNS name of the EC2 instance.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  /**
    * The private IP address of the EC2 instance.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
}

object PrivateIpAddressDetails {
  @scala.inline
  def apply(PrivateDnsName: String = null, PrivateIpAddress: String = null): PrivateIpAddressDetails = {
    val __obj = js.Dynamic.literal()
    if (PrivateDnsName != null) __obj.updateDynamic("PrivateDnsName")(PrivateDnsName.asInstanceOf[js.Any])
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateIpAddressDetails]
  }
}

