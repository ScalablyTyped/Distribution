package typings.cspHtmlWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
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
  type Policy = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
}
