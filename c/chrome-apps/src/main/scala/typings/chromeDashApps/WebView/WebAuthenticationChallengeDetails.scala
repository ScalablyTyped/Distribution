package typings.chromeDashApps.WebView

import typings.chromeDashApps.chrome.double
import typings.chromeDashApps.chrome.integer
import typings.chromeDashApps.chrome.webRequest.ResourceType
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
    val __obj = js.Dynamic.literal(challenger = challenger.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], isProxy = isProxy.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusLine = statusLine.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (initiator != null) __obj.updateDynamic("initiator")(initiator.asInstanceOf[js.Any])
    if (realm != null) __obj.updateDynamic("realm")(realm.asInstanceOf[js.Any])
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAuthenticationChallengeDetails]
  }
}

