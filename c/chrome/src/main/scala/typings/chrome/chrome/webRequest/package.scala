package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webRequest {
  type WebRedirectionResponseEvent = _WebResponseHeadersEvent[WebRedirectionResponseDetails]
  type WebResponseCacheEvent = _WebResponseHeadersEvent[WebResponseCacheDetails]
  type WebResponseErrorEvent = _WebResponseHeadersEvent[WebResponseErrorDetails]
}
