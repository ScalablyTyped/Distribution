package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizerConfig extends js.Object {
  /**
    * A Boolean that specifies whether the domain configuration's authorization service can be overridden.
    */
  var allowAuthorizerOverride: js.UndefOr[AllowAuthorizerOverride] = js.native
  /**
    * The name of the authorization service for a domain configuration.
    */
  var defaultAuthorizerName: js.UndefOr[AuthorizerName] = js.native
}

object AuthorizerConfig {
  @scala.inline
  def apply(
    allowAuthorizerOverride: js.UndefOr[AllowAuthorizerOverride] = js.undefined,
    defaultAuthorizerName: AuthorizerName = null
  ): AuthorizerConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAuthorizerOverride)) __obj.updateDynamic("allowAuthorizerOverride")(allowAuthorizerOverride.get.asInstanceOf[js.Any])
    if (defaultAuthorizerName != null) __obj.updateDynamic("defaultAuthorizerName")(defaultAuthorizerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizerConfig]
  }
}

