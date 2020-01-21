package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceChange extends js.Object {
  /**
    * A description for the service.
    */
  var Description: js.UndefOr[ResourceDescription] = js.native
  /**
    * A complex type that contains information about the Route 53 DNS records that you want AWS Cloud Map to create when you register an instance.
    */
  var DnsConfig: DnsConfigChange = js.native
  var HealthCheckConfig: js.UndefOr[typings.awsSdk.servicediscoveryMod.HealthCheckConfig] = js.native
}

object ServiceChange {
  @scala.inline
  def apply(
    DnsConfig: DnsConfigChange,
    Description: ResourceDescription = null,
    HealthCheckConfig: HealthCheckConfig = null
  ): ServiceChange = {
    val __obj = js.Dynamic.literal(DnsConfig = DnsConfig.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (HealthCheckConfig != null) __obj.updateDynamic("HealthCheckConfig")(HealthCheckConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceChange]
  }
}

