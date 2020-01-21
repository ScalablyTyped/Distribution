package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateIp extends js.Object {
  /**
    * The DNS name of the private IP address.
    */
  var privateDnsName: js.UndefOr[Text] = js.native
  /**
    * The full IP address of the network inteface.
    */
  var privateIpAddress: js.UndefOr[Text] = js.native
}

object PrivateIp {
  @scala.inline
  def apply(privateDnsName: Text = null, privateIpAddress: Text = null): PrivateIp = {
    val __obj = js.Dynamic.literal()
    if (privateDnsName != null) __obj.updateDynamic("privateDnsName")(privateDnsName.asInstanceOf[js.Any])
    if (privateIpAddress != null) __obj.updateDynamic("privateIpAddress")(privateIpAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateIp]
  }
}

