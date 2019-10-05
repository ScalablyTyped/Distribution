package typings.chromeDashApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebView {
  type WebRedirectionResponseEvent = _WebResponseHeadersEvent[WebRedirectionResponseDetails]
  type WebResponseCacheEvent = _WebResponseHeadersEvent[WebResponseCacheDetails]
  type WebResponseErrorEvent = _WebResponseHeadersEvent[WebResponseErrorDetails]
  type WebResponseHeadersEvent = _WebResponseHeadersEvent[WebResponseHeadersDetails]
}
