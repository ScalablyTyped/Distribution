package typings.ddDashTrace.ddDashTraceMod.plugins

import typings.ddDashTrace.Anon_ReqRequestRes
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait Http extends Instrumentation {
  /**
    * List of URLs that should not be instrumented. Takes precedence over
    * whitelist if a URL matches an entry in both.
    *
    * @default []
    */
  var blacklist: js.UndefOr[
    String | RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* url */ String, Boolean])])
  ] = js.undefined
  /**
    * An array of headers to include in the span metadata.
    *
    * @default []
    */
  var headers: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Callback function to determine if there was an error. It should take a
    * status code as its only parameter and return `true` for success or `false`
    * for errors.
    *
    * @default code => code < 500
    */
  var validateStatus: js.UndefOr[js.Function1[/* code */ Double, Boolean]] = js.undefined
  /**
    * List of URLs that should be instrumented.
    *
    * @default /^.*$/
    */
  var whitelist: js.UndefOr[
    String | RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* url */ String, Boolean])])
  ] = js.undefined
}

/**
  * This plugin automatically instruments the
  * [http](https://nodejs.org/api/http.html) module.
  *
  * By default any option set at the root will apply to both clients and
  * servers. To configure only one or the other, use the `client` and `server`
  * options.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.ddDashTrace.ddDashTraceMod.Analyzable because Already inherited
- typings.ddDashTrace.ddDashTraceMod.plugins.Integration because Already inherited
- typings.ddDashTrace.ddDashTraceMod.plugins.Instrumentation because Already inherited
- typings.ddDashTrace.ddDashTraceMod.plugins.Http because Already inherited
- typings.ddDashTrace.ddDashTraceMod.plugins.HttpServer because var conflicts: analytics, blacklist, enabled, headers, hooks, service, validateStatus, whitelist. Inlined  */ trait http extends HttpClient {
  /**
    * Configuration for HTTP clients.
    */
  var client: js.UndefOr[HttpClient] = js.undefined
  /**
    * Hooks to run before spans are finished.
    */
  @JSName("hooks")
  var hooks_http: js.UndefOr[Anon_ReqRequestRes] = js.undefined
  /**
    * Configuration for HTTP servers.
    */
  var server: js.UndefOr[HttpServer] = js.undefined
}

object Http {
  @scala.inline
  def apply(
    analytics: Boolean | Double = null,
    blacklist: String | RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* url */ String, Boolean])]) = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    headers: js.Array[String] = null,
    service: String = null,
    validateStatus: /* code */ Double => Boolean = null,
    whitelist: String | RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* url */ String, Boolean])]) = null
  ): Http = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (service != null) __obj.updateDynamic("service")(service)
    if (validateStatus != null) __obj.updateDynamic("validateStatus")(js.Any.fromFunction1(validateStatus))
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[Http]
  }
}

object http {
  @scala.inline
  def apply(
    analytics: Boolean | Double = null,
    blacklist: String | RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* url */ String, Boolean])]) = null,
    client: HttpClient = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    headers: js.Array[String] = null,
    hooks: Anon_ReqRequestRes = null,
    server: HttpServer = null,
    service: String = null,
    splitByDomain: js.UndefOr[Boolean] = js.undefined,
    validateStatus: /* code */ Double => Boolean = null,
    whitelist: String | RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* url */ String, Boolean])]) = null
  ): http = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (hooks != null) __obj.updateDynamic("hooks")(hooks)
    if (server != null) __obj.updateDynamic("server")(server)
    if (service != null) __obj.updateDynamic("service")(service)
    if (!js.isUndefined(splitByDomain)) __obj.updateDynamic("splitByDomain")(splitByDomain)
    if (validateStatus != null) __obj.updateDynamic("validateStatus")(js.Any.fromFunction1(validateStatus))
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[http]
  }
}

