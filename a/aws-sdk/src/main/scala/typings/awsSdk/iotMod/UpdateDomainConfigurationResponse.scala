package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainConfigurationResponse extends js.Object {
  /**
    * The ARN of the domain configuration that was updated.
    */
  var domainConfigurationArn: js.UndefOr[DomainConfigurationArn] = js.native
  /**
    * The name of the domain configuration that was updated.
    */
  var domainConfigurationName: js.UndefOr[ReservedDomainConfigurationName] = js.native
}

object UpdateDomainConfigurationResponse {
  @scala.inline
  def apply(
    domainConfigurationArn: DomainConfigurationArn = null,
    domainConfigurationName: ReservedDomainConfigurationName = null
  ): UpdateDomainConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (domainConfigurationArn != null) __obj.updateDynamic("domainConfigurationArn")(domainConfigurationArn.asInstanceOf[js.Any])
    if (domainConfigurationName != null) __obj.updateDynamic("domainConfigurationName")(domainConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainConfigurationResponse]
  }
}

