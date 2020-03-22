package typings.ddTrace.mod.plugins

import org.scalablytyped.runtime.StringDictionary
import typings.ddTrace.AnonRequest
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait HttpServer extends Http_ {
  /**
    * Hooks to run before spans are finished.
    */
  var hooks: js.UndefOr[AnonRequest] = js.undefined
  /**
    * Whether to enable instrumention of <plugin>.middleware spans
    *
    * @default true
    */
  var middleware: js.UndefOr[Boolean] = js.undefined
}

object HttpServer {
  @scala.inline
  def apply(
    analytics: Boolean | Double | (StringDictionary[Boolean | Double]) = null,
    blacklist: String | RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* url */ String, Boolean])]) = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    headers: js.Array[String] = null,
    hooks: AnonRequest = null,
    middleware: js.UndefOr[Boolean] = js.undefined,
    service: String = null,
    validateStatus: /* code */ Double => Boolean = null,
    whitelist: String | RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* url */ String, Boolean])]) = null
  ): HttpServer = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (!js.isUndefined(middleware)) __obj.updateDynamic("middleware")(middleware.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (validateStatus != null) __obj.updateDynamic("validateStatus")(js.Any.fromFunction1(validateStatus))
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpServer]
  }
}

