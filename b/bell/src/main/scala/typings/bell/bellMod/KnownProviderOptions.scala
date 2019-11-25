package typings.bell.bellMod

import typings.bell.Anon_ExtendedProfile
import typings.bell.Anon_Uri
import typings.hapi.hapiMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnownProviderOptions
  extends RequiredProviderOptions
     with OptionalOptions
     with BellOptions {
  var provider: Provider
}

object KnownProviderOptions {
  @scala.inline
  def apply(
    clientId: String,
    clientSecret: String,
    password: String,
    provider: Provider,
    allowRuntimeProviderParams: StringLikeMap | Boolean = null,
    config: Anon_ExtendedProfile | Anon_Uri = null,
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
    ttl: Int | Double = null
  ): KnownProviderOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    if (allowRuntimeProviderParams != null) __obj.updateDynamic("allowRuntimeProviderParams")(allowRuntimeProviderParams.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(forceHttps)) __obj.updateDynamic("forceHttps")(forceHttps.asInstanceOf[js.Any])
    if (!js.isUndefined(isHttpOnly)) __obj.updateDynamic("isHttpOnly")(isHttpOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(isSecure)) __obj.updateDynamic("isSecure")(isSecure.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (profileParams != null) __obj.updateDynamic("profileParams")(profileParams.asInstanceOf[js.Any])
    if (providerParams != null) __obj.updateDynamic("providerParams")(providerParams.asInstanceOf[js.Any])
    if (runtimeStateCallback != null) __obj.updateDynamic("runtimeStateCallback")(js.Any.fromFunction1(runtimeStateCallback))
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(skipProfile)) __obj.updateDynamic("skipProfile")(skipProfile.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownProviderOptions]
  }
}

