package typings
package chromeLib.chromeNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BlockingResponse extends js.Object {
  /** Optional. Only used as a response to the onAuthRequired event. If set, the request is made using the supplied credentials. */
  var authCredentials: js.UndefOr[AuthCredentials] = js.undefined
  /** Optional. If true, the request is cancelled. Used in onBeforeRequest, this prevents the request from being sent. */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Optional.
           * Only used as a response to the onBeforeRequest and onHeadersReceived events. If set, the original request is prevented from being sent/completed and is instead redirected to the given URL. Redirections to non-HTTP schemes such as data: are allowed. Redirects initiated by a redirect action use the original request method for the redirect, with one exception: If the redirect is initiated at the onHeadersReceived stage, then the redirect will be issued using the GET method.
           */
  var redirectUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Optional.
           * Only used as a response to the onBeforeSendHeaders event. If set, the request is made with these request headers instead.
           */
  var requestHeaders: js.UndefOr[js.Array[HttpHeader]] = js.undefined
  /**
           * Optional.
           * Only used as a response to the onHeadersReceived event. If set, the server is assumed to have responded with these response headers instead. Only return responseHeaders if you really want to modify the headers in order to limit the number of conflicts (only one extension may modify responseHeaders for each request).
           */
  var responseHeaders: js.UndefOr[js.Array[HttpHeader]] = js.undefined
}

