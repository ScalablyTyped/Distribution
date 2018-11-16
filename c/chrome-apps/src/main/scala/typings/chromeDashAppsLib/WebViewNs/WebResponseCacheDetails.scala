package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WebResponseCacheDetails extends WebResponseHeadersDetails {
  /** Indicates if this response was fetched from disk cache. */
  var fromCache: scala.Boolean
  /**
           * Optional.
           * The server IP address that the request was actually sent to. Note that it may be a literal IPv6 address.
           */
  var ip: js.UndefOr[java.lang.String] = js.undefined
}

