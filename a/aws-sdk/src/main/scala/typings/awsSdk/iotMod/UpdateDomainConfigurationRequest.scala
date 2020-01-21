package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainConfigurationRequest extends js.Object {
  /**
    * An object that specifies the authorization service for a domain.
    */
  var authorizerConfig: js.UndefOr[AuthorizerConfig] = js.native
  /**
    * The name of the domain configuration to be updated.
    */
  var domainConfigurationName: ReservedDomainConfigurationName = js.native
  /**
    * The status to which the domain configuration should be updated.
    */
  var domainConfigurationStatus: js.UndefOr[DomainConfigurationStatus] = js.native
  /**
    * Removes the authorization configuration from a domain.
    */
  var removeAuthorizerConfig: js.UndefOr[RemoveAuthorizerConfig] = js.native
}

object UpdateDomainConfigurationRequest {
  @scala.inline
  def apply(
    domainConfigurationName: ReservedDomainConfigurationName,
    authorizerConfig: AuthorizerConfig = null,
    domainConfigurationStatus: DomainConfigurationStatus = null,
    removeAuthorizerConfig: js.UndefOr[scala.Boolean] = js.undefined
  ): UpdateDomainConfigurationRequest = {
    val __obj = js.Dynamic.literal(domainConfigurationName = domainConfigurationName.asInstanceOf[js.Any])
    if (authorizerConfig != null) __obj.updateDynamic("authorizerConfig")(authorizerConfig.asInstanceOf[js.Any])
    if (domainConfigurationStatus != null) __obj.updateDynamic("domainConfigurationStatus")(domainConfigurationStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(removeAuthorizerConfig)) __obj.updateDynamic("removeAuthorizerConfig")(removeAuthorizerConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainConfigurationRequest]
  }
}

