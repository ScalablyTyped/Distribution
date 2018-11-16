package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Interface which provides access to webRequest events on the guest page.
     * @see[chrome.webRequest]{@link http://developer.chrome.com/extensions/webRequest}
     * extensions API for details on webRequest life cycle and related concepts.
     *
     * To illustrate how usage differs from the extensions webRequest API,
     * consider the following example code which blocks any guest requests
     * for URLs which match *://www.evil.com/ *:
     * @example
     * webview.request.onBeforeRequest.addListener(
     *   function(details) { return {cancel: true}; }, {urls: ['*://www.evil.com/ *']}, ['blocking']);
     * @description
     * Additionally, this interface supports declarative webRequest rules through onRequest and onMessage events.
     * @see[Docs]{@link http://developer.chrome.com/extensions/declarativeWebRequest.htmldeclarativeWebRequest}
     * @description
     * Note that conditions and actions for declarative webview webRequests should be instantiated
     * from their chrome.webViewRequest.* counterparts. The following example code declaratively
     * blocks all requests to 'example.com' on the webview myWebview:
     * @example const rule = { conditions: [ new chrome.webViewRequest.RequestMatcher({ url: { hostSuffix: 'example.com' } }) ], actions: [ new chrome.webViewRequest.CancelRequest() ] }; myWebview.request.onRequest.addRules([rule]);
     **/

trait WebRequestEventInterface extends js.Object {
  /**
           * Fired when an authentication failure is received.
           * The listener has three options: it can provide authentication credentials,
           * it can cancel the request and display the error page, or it can take no
           * action on the challenge. If bad user credentials are provided, this may be
           * called multiple times for the same request.
           */
  var onAuthRequired: WebAuthenticationChallengeEvent
  /** Fired when a server-initiated redirect is about to occur. */
  var onBeforeRedirect: WebRedirectionResponseEvent
  /** Fired when a request is about to occur. */
  var onBeforeRequest: WebRequestBodyEvent
  /**
           * Fired before sending an HTTP request, once the request headers are available.
           * This may occur after a TCP connection is made to the server, but before any HTTP data is sent.
           */
  var onBeforeSendHeaders: WebRequestHeadersEvent
  /** Fired when a request is completed. */
  var onCompleted: WebResponseCacheEvent
  /** Fired when an error occurs. */
  var onErrorOccured: WebResponseErrorEvent
  /** Fired when HTTP response headers of a request have been received. */
  var onHeadersReceived: WebResponseHeadersEvent
  /**
           * This interface supports declarative webRequest rules through
           * **onRequest** and **onMessage** events.
           * @see[See declarativeWebRequest for API details.]{@link http://developer.chrome.com/extensions/declarativeWebRequest.html}
           */
  var onMessage: chromeDashAppsLib.chromeNs.webViewRequestNs.OnMessageEvent
  /**
           * Provides the Declarative Event API consisting of addRules, removeRules, and getRules.
           * This interface supports declarative webRequest rules through
           * **onRequest** and **onMessage** events.
           * @see[See declarativeWebRequest for API details.]{@link http://developer.chrome.com/extensions/declarativeWebRequest.html}
           */
  var onRequest: chromeDashAppsLib.chromeNs.webViewRequestNs.OnRequestEvent
  /**
           * Fired when the first byte of the response body is received.
           * For HTTP requests, this means that the status line and
           * response headers are available.
           */
  var onResponseStarted: WebResponseCacheEvent
  /**
           * Fired just before a request is going to be sent to the server
           * (modifications of previous onBeforeSendHeaders callbacks
           * are visible by the time onSendHeaders is fired).
           */
  var onSendHeaders: WebRequestHeadersEvent
}

