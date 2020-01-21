package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainConfigurationSummary extends js.Object {
  /**
    * The ARN of the domain configuration.
    */
  var domainConfigurationArn: js.UndefOr[DomainConfigurationArn] = js.native
  /**
    * The name of the domain configuration. This value must be unique to a region.
    */
  var domainConfigurationName: js.UndefOr[ReservedDomainConfigurationName] = js.native
  /**
    * The type of service delivered by the endpoint.
    */
  var serviceType: js.UndefOr[ServiceType] = js.native
}

object DomainConfigurationSummary {
  @scala.inline
  def apply(
    domainConfigurationArn: DomainConfigurationArn = null,
    domainConfigurationName: ReservedDomainConfigurationName = null,
    serviceType: ServiceType = null
  ): DomainConfigurationSummary = {
    val __obj = js.Dynamic.literal()
    if (domainConfigurationArn != null) __obj.updateDynamic("domainConfigurationArn")(domainConfigurationArn.asInstanceOf[js.Any])
    if (domainConfigurationName != null) __obj.updateDynamic("domainConfigurationName")(domainConfigurationName.asInstanceOf[js.Any])
    if (serviceType != null) __obj.updateDynamic("serviceType")(serviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainConfigurationSummary]
  }
}

