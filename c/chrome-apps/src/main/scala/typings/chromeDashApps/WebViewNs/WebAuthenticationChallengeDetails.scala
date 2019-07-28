package typings.chromeDashApps.WebViewNs

import typings.chromeDashApps.chromeNs.double
import typings.chromeDashApps.chromeNs.integer
import typings.chromeDashApps.chromeNs.webRequestNs.ResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAuthenticationChallengeDetails extends WebResponseHeadersDetails {
  /** The server requesting authentication. */
  var challenger: WebAuthChallenger
  /** True for Proxy-Authenticate, false for WWW-Authenticate. */
  var isProxy: Boolean
  /** The authentication realm provided by the server, if there is one. */
  var realm: js.UndefOr[String] = js.undefined
  /** The authentication scheme, e.g. Basic or Digest. */
  var scheme: String
}

object WebAuthenticationChallengeDetails {
  @scala.inline
  def apply(
    challenger: WebAuthChallenger,
    frameId: integer,
    isProxy: Boolean,
    method: String,
    parentFrameId: integer,
    requestId: String,
    scheme: String,
    statusCode: integer,
    statusLine: String,
    tabId: integer,
    timeStamp: double,
    `type`: ResourceType,
    url: String,
    initiator: String = null,
    realm: String = null,
    responseHeaders: js.Array[HttpHeader] = null
  ): WebAuthenticationChallengeDetails = {
    val __obj = js.Dynamic.literal(challenger = challenger, frameId = frameId, isProxy = isProxy, method = method, parentFrameId = parentFrameId, requestId = requestId, scheme = scheme, statusCode = statusCode, statusLine = statusLine, tabId = tabId, timeStamp = timeStamp, url = url)
    __obj.updateDynamic("type")(`type`)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    if (realm != null) __obj.updateDynamic("realm")(realm)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.asInstanceOf[WebAuthenticationChallengeDetails]
  }
}

