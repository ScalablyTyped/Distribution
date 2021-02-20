package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.webViewRequest.AddCookie
import typings.chromeApps.chrome.webViewRequest.AddResponseHeaderParams
import typings.chromeApps.chrome.webViewRequest.EditCookieParams
import typings.chromeApps.chrome.webViewRequest.FilterResponseCookie
import typings.chromeApps.chrome.webViewRequest.IgnoreRulesParams
import typings.chromeApps.chrome.webViewRequest.RedirectByRegExParams
import typings.chromeApps.chrome.webViewRequest.RedirectRequestParams
import typings.chromeApps.chrome.webViewRequest.RemoveCookieParams
import typings.chromeApps.chrome.webViewRequest.RemoveRequestHeaderParams
import typings.chromeApps.chrome.webViewRequest.RemoveResponseHeaderParams
import typings.chromeApps.chrome.webViewRequest.RequestCookie
import typings.chromeApps.chrome.webViewRequest.RequestMatcherFields
import typings.chromeApps.chrome.webViewRequest.ResponseCookie
import typings.chromeApps.chrome.webViewRequest.SendMessageParams
import typings.chromeApps.chrome.webViewRequest.SetRequestHeaderParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.webViewRequest
/////////////////////
// WebView Request //
/////////////////////
/**
  * @requires Permissions: 'webview'
  * @description
  * Use the *chrome.webViewRequest* API to intercept, block, or modify requests in-flight.
  */
object webViewRequest {
  
  /**
    * Adds a cookie to the request or overrides a cookie, in case another cookie of the same name exists already.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  @JSGlobal("chrome.webViewRequest.AddRequestCookie")
  @js.native
  class AddRequestCookie protected ()
    extends typings.chromeApps.chrome.webViewRequest.AddRequestCookie {
    def this(parameters: AddCookie[RequestCookie]) = this()
  }
  
  /**
    * Adds a cookie to the response or overrides a cookie, in case another cookie of the same name exists already.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  @JSGlobal("chrome.webViewRequest.AddResponseCookie")
  @js.native
  class AddResponseCookie protected ()
    extends typings.chromeApps.chrome.webViewRequest.AddResponseCookie {
    def this(parameters: AddCookie[ResponseCookie]) = this()
  }
  
  /**
    * Adds the response header to the response of this web request.
    * As multiple response headers may share the same name,
    * you need to first remove and then add a new
    * response header in order to replace one.
    */
  @JSGlobal("chrome.webViewRequest.AddResponseHeader")
  @js.native
  class AddResponseHeader protected ()
    extends typings.chromeApps.chrome.webViewRequest.AddResponseHeader {
    def this(parameters: AddResponseHeaderParams) = this()
  }
  
  /** Declarative event action that cancels a network request. */
  @JSGlobal("chrome.webViewRequest.CancelRequest")
  @js.native
  class CancelRequest ()
    extends typings.chromeApps.chrome.webViewRequest.CancelRequest
  
  /**
    * Edits one or more cookies of request.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  @JSGlobal("chrome.webViewRequest.EditRequestCookie")
  @js.native
  class EditRequestCookie protected ()
    extends typings.chromeApps.chrome.webViewRequest.EditRequestCookie {
    /**
      * @param filter
      * @param modification Attributes that shall be overridden in cookies that machted the filter.
      *                     Attributes that are set to an empty string are removed.
      */
    def this(parameters: EditCookieParams[RequestCookie, RequestCookie]) = this()
  }
  
  /**
    * Edits one or more cookies of response.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  @JSGlobal("chrome.webViewRequest.EditResponseCookie")
  @js.native
  class EditResponseCookie protected ()
    extends typings.chromeApps.chrome.webViewRequest.EditResponseCookie {
    /**
      * @param filter Filter for cookies that will be modified.All empty entries are ignored.
      * @param modification
      */
    def this(parameter: EditCookieParams[FilterResponseCookie, ResponseCookie]) = this()
  }
  
  /**
    * Masks all rules that match the specified criteria.
    */
  @JSGlobal("chrome.webViewRequest.IgnoreRules")
  @js.native
  class IgnoreRules protected ()
    extends typings.chromeApps.chrome.webViewRequest.IgnoreRules {
    def this(parameters: IgnoreRulesParams) = this()
  }
  
  /**
    * Redirects a request by applying a regular expression on the URL.
    * The regular expressions use the RE2 syntax.
    * @see[RE2 syntax]{@link https://github.com/google/re2/blob/master/doc/syntax.txt}
    */
  @JSGlobal("chrome.webViewRequest.RedirectByRegEx")
  @js.native
  class RedirectByRegEx protected ()
    extends typings.chromeApps.chrome.webViewRequest.RedirectByRegEx {
    def this(parameters: RedirectByRegExParams) = this()
  }
  
  /** Declarative event action that redirects a network request.  */
  @JSGlobal("chrome.webViewRequest.RedirectRequest")
  @js.native
  class RedirectRequest protected ()
    extends typings.chromeApps.chrome.webViewRequest.RedirectRequest {
    def this(parameters: RedirectRequestParams) = this()
  }
  
  /** Declarative event action that redirects a network request to an empty document. */
  @JSGlobal("chrome.webViewRequest.RedirectToEmptyDocument")
  @js.native
  class RedirectToEmptyDocument ()
    extends typings.chromeApps.chrome.webViewRequest.RedirectToEmptyDocument
  
  /** Declarative event action that redirects a network request to a transparent image. */
  @JSGlobal("chrome.webViewRequest.RedirectToTransparentImage")
  @js.native
  class RedirectToTransparentImage ()
    extends typings.chromeApps.chrome.webViewRequest.RedirectToTransparentImage
  
  /**
    * Removes one or more cookies of request.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  @JSGlobal("chrome.webViewRequest.RemoveRequestCookie")
  @js.native
  class RemoveRequestCookie protected ()
    extends typings.chromeApps.chrome.webViewRequest.RemoveRequestCookie {
    def this(parameters: RemoveCookieParams[RequestCookie]) = this()
  }
  
  /**
    * Removes the request header of the specified name.
    * Do not use SetRequestHeader and RemoveRequestHeader with
    * the same header name on the same request.
    * Each request header name occurs only once in each request.
    */
  @JSGlobal("chrome.webViewRequest.RemoveRequestHeader")
  @js.native
  class RemoveRequestHeader protected ()
    extends typings.chromeApps.chrome.webViewRequest.RemoveRequestHeader {
    def this(parameters: RemoveRequestHeaderParams) = this()
  }
  
  /**
    * Removes one or more cookies of response.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  @JSGlobal("chrome.webViewRequest.RemoveResponseCookie")
  @js.native
  class RemoveResponseCookie protected ()
    extends typings.chromeApps.chrome.webViewRequest.RemoveResponseCookie {
    def this(parameters: RemoveCookieParams[FilterResponseCookie]) = this()
  }
  
  /**
    * Removes all response headers of the specified names and values.
    */
  @JSGlobal("chrome.webViewRequest.RemoveResponseHeader")
  @js.native
  class RemoveResponseHeader protected ()
    extends typings.chromeApps.chrome.webViewRequest.RemoveResponseHeader {
    def this(parameters: RemoveResponseHeaderParams) = this()
  }
  
  /**
    * @description Matches network events by various criteria.
    */
  @JSGlobal("chrome.webViewRequest.RequestMatcher")
  @js.native
  class RequestMatcher ()
    extends typings.chromeApps.chrome.webViewRequest.RequestMatcher {
    def this(parameters: RequestMatcherFields) = this()
  }
  
  /**
    * Triggers the webviewWebRequest.*OnMessageEvent* event which are used in webviews.
    */
  @JSGlobal("chrome.webViewRequest.SendMessageToExtension")
  @js.native
  class SendMessageToExtension protected ()
    extends typings.chromeApps.chrome.webViewRequest.SendMessageToExtension {
    def this(parameters: SendMessageParams) = this()
  }
  
  /**
    * Sets the request header of the specified name to the specified value.
    * If a header with the specified name did not exist before, a new one is created.
    * Header name comparison is always case-insensitive.
    * Each request header name occurs only once in each request.
    */
  @JSGlobal("chrome.webViewRequest.SetRequestHeader")
  @js.native
  class SetRequestHeader protected ()
    extends typings.chromeApps.chrome.webViewRequest.SetRequestHeader {
    def this(parameters: SetRequestHeaderParams) = this()
  }
}
