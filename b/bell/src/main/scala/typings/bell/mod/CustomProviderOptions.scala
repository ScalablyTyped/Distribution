package typings.bell.mod

import typings.bell.anon.ExtendedProfile
import typings.bell.anon.Uri
import typings.hapi.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomProviderOptions
  extends RequiredProviderOptions
     with OptionalOptions
     with BellOptions {
  var provider: CustomProtocol1 | CustomProtocol2
}

object CustomProviderOptions {
  @scala.inline
  def apply(
    clientId: String,
    clientSecret: String,
    password: String,
    provider: CustomProtocol1 | CustomProtocol2,
    allowRuntimeProviderParams: StringLikeMap | Boolean = null,
    config: ExtendedProfile | Uri = null,
    cookie: String = null,
    domain: String = null,
    forceHttps: js.UndefOr[Boolean] = js.undefined,
    isHttpOnly: js.UndefOr[Boolean] = js.undefined,
    isSecure: js.UndefOr[Boolean] = js.undefined,
    location: String | (js.Function1[/* req */ Request, String]) = null,
    profileParams: StringLikeMap = null,
    providerParams: StringLikeMap | (js.Function1[/* request */ Request, StringLikeMap]) = null,
    runtimeStateCallback: /* req */ Request => String = null,
    scope: js.Array[String] | (js.Function1[/* request */ Request, js.Array[String]]) = null,
    skipProfile: js.UndefOr[Boolean] = js.undefined,
    ttl: js.UndefOr[Double] = js.undefined
  ): CustomProviderOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    if (allowRuntimeProviderParams != null) __obj.updateDynamic("allowRuntimeProviderParams")(allowRuntimeProviderParams.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(forceHttps)) __obj.updateDynamic("forceHttps")(forceHttps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isHttpOnly)) __obj.updateDynamic("isHttpOnly")(isHttpOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSecure)) __obj.updateDynamic("isSecure")(isSecure.get.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (profileParams != null) __obj.updateDynamic("profileParams")(profileParams.asInstanceOf[js.Any])
    if (providerParams != null) __obj.updateDynamic("providerParams")(providerParams.asInstanceOf[js.Any])
    if (runtimeStateCallback != null) __obj.updateDynamic("runtimeStateCallback")(js.Any.fromFunction1(runtimeStateCallback))
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(skipProfile)) __obj.updateDynamic("skipProfile")(skipProfile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProviderOptions]
  }
}

