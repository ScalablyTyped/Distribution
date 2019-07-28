package typings.ddDashTrace.ddDashTraceMod.pluginsNs

import typings.ddDashTrace.Anon_Enabled
import typings.ddDashTrace.Anon_ReqRequest
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait HttpClient extends Http {
  /**
    * Hooks to run before spans are finished.
    */
  var hooks: js.UndefOr[Anon_ReqRequest] = js.undefined
  /**
    * Use the remote endpoint host as the service name instead of the default.
    *
    * @default false
    */
  var splitByDomain: js.UndefOr[Boolean] = js.undefined
}

object HttpClient {
  @scala.inline
  def apply(
    analytics: Boolean | Anon_Enabled = null,
    blacklist: String | RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* url */ String, Boolean])]) = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    headers: js.Array[String] = null,
    hooks: Anon_ReqRequest = null,
    service: String = null,
    splitByDomain: js.UndefOr[Boolean] = js.undefined,
    validateStatus: /* code */ Double => Boolean = null,
    whitelist: String | RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* url */ String, Boolean])]) = null
  ): HttpClient = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (hooks != null) __obj.updateDynamic("hooks")(hooks)
    if (service != null) __obj.updateDynamic("service")(service)
    if (!js.isUndefined(splitByDomain)) __obj.updateDynamic("splitByDomain")(splitByDomain)
    if (validateStatus != null) __obj.updateDynamic("validateStatus")(js.Any.fromFunction1(validateStatus))
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpClient]
  }
}

