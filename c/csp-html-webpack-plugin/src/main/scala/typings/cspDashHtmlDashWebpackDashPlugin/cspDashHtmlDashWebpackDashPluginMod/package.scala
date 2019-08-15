package typings.cspDashHtmlDashWebpackDashPlugin

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cspDashHtmlDashWebpackDashPluginMod {
  // HtmlWebpackPlugin v3 and v4 use different hook interfaces. Figure out
  // which we're using and infer the generic type variable inside.
  type HtmlPluginData = js.Any
  /**
    * A flat object which defines your CSP policy. Values can either be a
    * string or an array of strings.
    *
    * The default policy is:
    *
    * ```javascript
    * {
    *   'base-uri': "'self'",
    *   'object-src': "'none'",
    *   'script-src': ["'unsafe-inline'", "'self'", "'unsafe-eval'"],
    *   'style-src': ["'unsafe-inline'", "'self'", "'unsafe-eval'"]
    * }
    * ```
    */
  type Policy = StringDictionary[String | js.Array[String]]
}
