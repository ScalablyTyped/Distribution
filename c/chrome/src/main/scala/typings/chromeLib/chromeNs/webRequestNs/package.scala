package typings
package chromeLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webRequestNs {
  type ResourceType = chromeLib.chromeLibStrings.main_frame | chromeLib.chromeLibStrings.sub_frame | chromeLib.chromeLibStrings.stylesheet | chromeLib.chromeLibStrings.script | chromeLib.chromeLibStrings.image | chromeLib.chromeLibStrings.font | chromeLib.chromeLibStrings.`object` | chromeLib.chromeLibStrings.xmlhttprequest | chromeLib.chromeLibStrings.ping | chromeLib.chromeLibStrings.csp_report | chromeLib.chromeLibStrings.media | chromeLib.chromeLibStrings.websocket | chromeLib.chromeLibStrings.other
  type WebRedirectionResponseEvent = _WebResponseHeadersEvent[WebRedirectionResponseDetails]
  type WebResponseCacheEvent = _WebResponseHeadersEvent[WebResponseCacheDetails]
  type WebResponseErrorEvent = _WebResponseHeadersEvent[WebResponseErrorDetails]
  type WebResponseHeadersEvent = _WebResponseHeadersEvent[WebResponseHeadersDetails]
}
