package typings
package chromeLib.chromeNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAuthenticationChallengeDetails extends WebResponseHeadersDetails {
  /** The server requesting authentication. */
  var challenger: WebAuthChallenger
  /** True for Proxy-Authenticate, false for WWW-Authenticate. */
  var isProxy: scala.Boolean
  /** The authentication realm provided by the server, if there is one. */
  var realm: js.UndefOr[java.lang.String] = js.undefined
  /** The authentication scheme, e.g. Basic or Digest. */
  var scheme: java.lang.String
}

object WebAuthenticationChallengeDetails {
  @scala.inline
  def apply(
    challenger: WebAuthChallenger,
    frameId: scala.Double,
    isProxy: scala.Boolean,
    method: java.lang.String,
    parentFrameId: scala.Double,
    requestId: java.lang.String,
    scheme: java.lang.String,
    statusCode: scala.Double,
    statusLine: java.lang.String,
    tabId: scala.Double,
    timeStamp: scala.Double,
    `type`: ResourceType,
    url: java.lang.String,
    initiator: java.lang.String = null,
    realm: java.lang.String = null,
    responseHeaders: js.Array[HttpHeader] = null
  ): WebAuthenticationChallengeDetails = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("challenger")(challenger)
    __obj.updateDynamic("frameId")(frameId)
    __obj.updateDynamic("isProxy")(isProxy)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("parentFrameId")(parentFrameId)
    __obj.updateDynamic("requestId")(requestId)
    __obj.updateDynamic("scheme")(scheme)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.updateDynamic("statusLine")(statusLine)
    __obj.updateDynamic("tabId")(tabId)
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.updateDynamic("url")(url)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    if (realm != null) __obj.updateDynamic("realm")(realm)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.asInstanceOf[WebAuthenticationChallengeDetails]
  }
}

