package typings.chromeApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebView {
  type WebRedirectionResponseEvent = typings.chromeApps.WebView._WebResponseHeadersEvent[typings.chromeApps.WebView.WebRedirectionResponseDetails]
  type WebResponseCacheEvent = typings.chromeApps.WebView._WebResponseHeadersEvent[typings.chromeApps.WebView.WebResponseCacheDetails]
  type WebResponseErrorEvent = typings.chromeApps.WebView._WebResponseHeadersEvent[typings.chromeApps.WebView.WebResponseErrorDetails]
  type WebResponseHeadersEvent = typings.chromeApps.WebView._WebResponseHeadersEvent[typings.chromeApps.WebView.WebResponseHeadersDetails]
}
