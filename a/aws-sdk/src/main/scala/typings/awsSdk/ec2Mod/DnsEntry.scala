package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DnsEntry extends js.Object {
  /**
    * The DNS name.
    */
  var DnsName: js.UndefOr[String] = js.native
  /**
    * The ID of the private hosted zone.
    */
  var HostedZoneId: js.UndefOr[String] = js.native
}

object DnsEntry {
  @scala.inline
  def apply(DnsName: String = null, HostedZoneId: String = null): DnsEntry = {
    val __obj = js.Dynamic.literal()
    if (DnsName != null) __obj.updateDynamic("DnsName")(DnsName.asInstanceOf[js.Any])
    if (HostedZoneId != null) __obj.updateDynamic("HostedZoneId")(HostedZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnsEntry]
  }
}

