package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DnsProperties extends js.Object {
  /**
    * The ID for the Route 53 hosted zone that AWS Cloud Map creates when you create a namespace.
    */
  var HostedZoneId: js.UndefOr[ResourceId] = js.native
}

object DnsProperties {
  @scala.inline
  def apply(HostedZoneId: ResourceId = null): DnsProperties = {
    val __obj = js.Dynamic.literal()
    if (HostedZoneId != null) __obj.updateDynamic("HostedZoneId")(HostedZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnsProperties]
  }
}

