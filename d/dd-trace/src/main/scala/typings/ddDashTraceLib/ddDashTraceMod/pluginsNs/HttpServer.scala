package typings
package ddDashTraceLib.ddDashTraceMod.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait HttpServer extends Http {
  /**
    * Hooks to run before spans are finished.
    */
  var hooks: js.UndefOr[ddDashTraceLib.Anon_Req] = js.undefined
}

object HttpServer {
  @scala.inline
  def apply(
    blacklist: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]) | (js.Array[
      java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean])
    ]) = null,
    headers: js.Array[java.lang.String] = null,
    hooks: ddDashTraceLib.Anon_Req = null,
    service: java.lang.String = null,
    validateStatus: js.Function1[/* code */ scala.Double, scala.Boolean] = null,
    whitelist: java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]) | (js.Array[
      java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean])
    ]) = null
  ): HttpServer = {
    val __obj = js.Dynamic.literal()
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (hooks != null) __obj.updateDynamic("hooks")(hooks)
    if (service != null) __obj.updateDynamic("service")(service)
    if (validateStatus != null) __obj.updateDynamic("validateStatus")(validateStatus)
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpServer]
  }
}

