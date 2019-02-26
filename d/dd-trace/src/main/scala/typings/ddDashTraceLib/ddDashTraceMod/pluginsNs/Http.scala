package typings
package ddDashTraceLib.ddDashTraceMod.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait Http extends Integration {
  /**
    * List of URLs that should not be instrumented. Takes precedence over
    * whitelist if a URL matches an entry in both.
    *
    * @default []
    */
  var blacklist: js.UndefOr[
    java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]) | (js.Array[
      java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean])
    ])
  ] = js.undefined
  /**
    * An array of headers to include in the span metadata.
    *
    * @default []
    */
  var headers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Callback function to determine if there was an error. It should take a
    * status code as its only parameter and return `true` for success or `false`
    * for errors.
    *
    * @default code => code < 500
    */
  var validateStatus: js.UndefOr[js.Function1[/* code */ scala.Double, scala.Boolean]] = js.undefined
  /**
    * List of URLs that should be instrumented.
    *
    * @default /^.*$/
    */
  var whitelist: js.UndefOr[
    java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean]) | (js.Array[
      java.lang.String | stdLib.RegExp | (js.Function1[/* url */ java.lang.String, scala.Boolean])
    ])
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
- ddDashTraceLib.ddDashTraceMod.pluginsNs.HttpServer because var conflicts: blacklist, headers, service, validateStatus, whitelist. Inlined hooks */ trait http extends HttpClient {
  /**
    * Configuration for HTTP clients.
    */
  var client: js.UndefOr[HttpClient] = js.undefined
  /**
    * Hooks to run before spans are finished.
    */
  var hooks: js.UndefOr[ddDashTraceLib.Anon_Req] = js.undefined
  /**
    * Configuration for HTTP servers.
    */
  var server: js.UndefOr[HttpServer] = js.undefined
}

