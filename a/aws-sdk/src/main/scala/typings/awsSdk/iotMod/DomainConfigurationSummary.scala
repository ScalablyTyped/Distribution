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
  def apply(): DomainConfigurationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainConfigurationSummary]
  }
  @scala.inline
  implicit class DomainConfigurationSummaryOps[Self <: DomainConfigurationSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDomainConfigurationArn(value: DomainConfigurationArn): Self = this.set("domainConfigurationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainConfigurationArn: Self = this.set("domainConfigurationArn", js.undefined)
    @scala.inline
    def setDomainConfigurationName(value: ReservedDomainConfigurationName): Self = this.set("domainConfigurationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainConfigurationName: Self = this.set("domainConfigurationName", js.undefined)
    @scala.inline
    def setServiceType(value: ServiceType): Self = this.set("serviceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceType: Self = this.set("serviceType", js.undefined)
  }
  
}

