package typings.chromeApps.WebView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returns value for event handlers that have the 'blocking' extraInfoSpec applied. Allows the event handler to modify network requests. */
trait BlockingResponse extends js.Object {
  /**
    * Only used as a response to the onAuthRequired event.
    * If set, the request is made using the supplied credentials.
    */
  var authCredentials: js.UndefOr[AuthCredentials] = js.undefined
  /**
    * If true, the request is cancelled.
    * Used in onBeforeRequest, this prevents the request from being sent. */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /**
    * Only used as a response to the onBeforeRequest and onHeadersReceived events.
    * If set, the original request is prevented from being sent/completed and is
    * instead redirected to the given URL. Redirections to non-HTTP schemes such
    * as data: are allowed. Redirects initiated by a redirect action use the
    * original request method for the redirect, with one exception: If the
    * redirect is initiated at the onHeadersReceived stage, then the redirect
    * will be issued using the GET method.
    */
  var redirectUrl: js.UndefOr[String] = js.undefined
  /**
    * Only used as a response to the onBeforeSendHeaders event.
    * If set, the request is made with these request headers instead.
    */
  var requestHeaders: js.UndefOr[js.Array[HttpHeader]] = js.undefined
  /**
    * Only used as a response to the onHeadersReceived event.
    * If set, the server is assumed to have responded with these
    * response headers instead. Only return responseHeaders if you really
    * want to modify the headers in order to limit the number of conflicts
    * (only one extension may modify responseHeaders for each request).
    */
  var responseHeaders: js.UndefOr[js.Array[HttpHeader]] = js.undefined
}

object BlockingResponse {
  @scala.inline
  def apply(
    authCredentials: AuthCredentials = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    redirectUrl: String = null,
    requestHeaders: js.Array[HttpHeader] = null,
    responseHeaders: js.Array[HttpHeader] = null
  ): BlockingResponse = {
    val __obj = js.Dynamic.literal()
    if (authCredentials != null) __obj.updateDynamic("authCredentials")(authCredentials.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (redirectUrl != null) __obj.updateDynamic("redirectUrl")(redirectUrl.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockingResponse]
  }
}

