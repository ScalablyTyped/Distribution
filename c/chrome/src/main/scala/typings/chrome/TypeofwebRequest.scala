package typings.chrome

import typings.chrome.chromeNs.webRequestNs.WebAuthenticationChallengeEvent
import typings.chrome.chromeNs.webRequestNs.WebRedirectionResponseEvent
import typings.chrome.chromeNs.webRequestNs.WebRequestBodyEvent
import typings.chrome.chromeNs.webRequestNs.WebRequestHeadersEvent
import typings.chrome.chromeNs.webRequestNs.WebResponseCacheEvent
import typings.chrome.chromeNs.webRequestNs.WebResponseErrorEvent
import typings.chrome.chromeNs.webRequestNs.WebResponseHeadersEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofwebRequest extends js.Object {
  var MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES: Double = js.native
  var onAuthRequired: WebAuthenticationChallengeEvent = js.native
  var onBeforeRedirect: WebRedirectionResponseEvent = js.native
  var onBeforeRequest: WebRequestBodyEvent = js.native
  var onBeforeSendHeaders: WebRequestHeadersEvent = js.native
  var onCompleted: WebResponseCacheEvent = js.native
  var onErrorOccurred: WebResponseErrorEvent = js.native
  var onHeadersReceived: WebResponseHeadersEvent = js.native
  var onResponseStarted: WebResponseCacheEvent = js.native
  var onSendHeaders: WebRequestHeadersEvent = js.native
  def handlerBehaviorChanged(): Unit = js.native
  def handlerBehaviorChanged(callback: js.Function): Unit = js.native
}

