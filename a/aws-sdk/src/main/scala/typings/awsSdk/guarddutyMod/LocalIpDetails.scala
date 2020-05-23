package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalIpDetails extends js.Object {
  /**
    * The IPv4 local address of the connection.
    */
  var IpAddressV4: js.UndefOr[String] = js.native
}

object LocalIpDetails {
  @scala.inline
  def apply(IpAddressV4: String = null): LocalIpDetails = {
    val __obj = js.Dynamic.literal()
    if (IpAddressV4 != null) __obj.updateDynamic("IpAddressV4")(IpAddressV4.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalIpDetails]
  }
}

