package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddRequestCookie extends js.Object {
  /**
    * Adds a cookie to the request or overrides a cookie, in case another cookie of the same name exists already.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var AddRequestCookie: org.scalablytyped.runtime.Instantiable1[
    /* parameters */ chromeDashAppsLib.chromeNs.webViewRequestNs.AddCookie[chromeDashAppsLib.chromeNs.webViewRequestNs.RequestCookie], 
    chromeDashAppsLib.chromeNs.webViewRequestNs.AddRequestCookie
  ]
  /**
    * Adds a cookie to the response or overrides a cookie, in case another cookie of the same name exists already.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var AddResponseCookie: org.scalablytyped.runtime.Instantiable1[
    /* parameters */ chromeDashAppsLib.chromeNs.webViewRequestNs.AddCookie[chromeDashAppsLib.chromeNs.webViewRequestNs.ResponseCookie], 
    chromeDashAppsLib.chromeNs.webViewRequestNs.AddResponseCookie
  ]
  /**
    * Adds the response header to the response of this web request.
    * As multiple response headers may share the same name,
    * you need to first remove and then add a new
    * response header in order to replace one.
    */
  var AddResponseHeader: org.scalablytyped.runtime.Instantiable1[
    /* parameters */ chromeDashAppsLib.chromeNs.webViewRequestNs.AddResponseHeaderParams, 
    chromeDashAppsLib.chromeNs.webViewRequestNs.AddResponseHeader
  ]
  /** Declarative event action that cancels a network request. */
  var CancelRequest: org.scalablytyped.runtime.Instantiable0[chromeDashAppsLib.chromeNs.webViewRequestNs.CancelRequest]
  /**
    * Edits one or more cookies of request.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var EditRequestCookie: org.scalablytyped.runtime.Instantiable1[
    /* parameters */ chromeDashAppsLib.chromeNs.webViewRequestNs.EditCookieParams[
      chromeDashAppsLib.chromeNs.webViewRequestNs.RequestCookie, 
      chromeDashAppsLib.chromeNs.webViewRequestNs.RequestCookie
    ], 
    chromeDashAppsLib.chromeNs.webViewRequestNs.EditRequestCookie
  ]
  /**
    * Edits one or more cookies of response.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var EditResponseCookie: org.scalablytyped.runtime.Instantiable1[
    /* parameter */ chromeDashAppsLib.chromeNs.webViewRequestNs.EditCookieParams[
      chromeDashAppsLib.chromeNs.webViewRequestNs.FilterResponseCookie, 
      chromeDashAppsLib.chromeNs.webViewRequestNs.ResponseCookie
    ], 
    chromeDashAppsLib.chromeNs.webViewRequestNs.EditResponseCookie
  ]
  /**
    * Masks all rules that match the specified criteria.
    */
  var IgnoreRules: org.scalablytyped.runtime.Instantiable1[
    /* parameters */ chromeDashAppsLib.chromeNs.webViewRequestNs.IgnoreRulesParams, 
    chromeDashAppsLib.chromeNs.webViewRequestNs.IgnoreRules
  ]
  /**
    * Redirects a request by applying a regular expression on the URL.
    * The regular expressions use the RE2 syntax.
    * @see[RE2 syntax]{@link https://github.com/google/re2/blob/master/doc/syntax.txt}
    */
  var RedirectByRegEx: org.scalablytyped.runtime.Instantiable1[
    /* parameters */ chromeDashAppsLib.chromeNs.webViewRequestNs.RedirectByRegExParams, 
    chromeDashAppsLib.chromeNs.webViewRequestNs.RedirectByRegEx
  ]
  /** Declarative event action that redirects a network request.  */
  var RedirectRequest: org.scalablytyped.runtime.Instantiable1[
    /* parameters */ chromeDashAppsLib.chromeNs.webViewRequestNs.RedirectRequestParams, 
    chromeDashAppsLib.chromeNs.webViewRequestNs.RedirectRequest
  ]
  /** Declarative event action that redirects a network request to an empty document. */
  var RedirectToEmptyDocument: org.scalablytyped.runtime.Instantiable0[chromeDashAppsLib.chromeNs.webViewRequestNs.RedirectToEmptyDocument]
  /** Declarative event action that redirects a network request to a transparent image. */
  var RedirectToTransparentImage: org.scalablytyped.runtime.Instantiable0[chromeDashAppsLib.chromeNs.webViewRequestNs.RedirectToTransparentImage]
  /**
    * Removes one or more cookies of request.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var RemoveRequestCookie: org.scalablytyped.runtime.Instantiable1[
    /* parameters */ chromeDashAppsLib.chromeNs.webViewRequestNs.RemoveCookieParams[chromeDashAppsLib.chromeNs.webViewRequestNs.RequestCookie], 
    chromeDashAppsLib.chromeNs.webViewRequestNs.RemoveRequestCookie
  ]
  /**
    * Removes the request header of the specified name.
    * Do not use SetRequestHeader and RemoveRequestHeader with
    * the same header name on the same request.
    * Each request header name occurs only once in each request.
    */
  var RemoveRequestHeader: org.scalablytyped.runtime.Instantiable1[
    /* parameters */ chromeDashAppsLib.chromeNs.webViewRequestNs.RemoveRequestHeaderParams, 
    chromeDashAppsLib.chromeNs.webViewRequestNs.RemoveRequestHeader
  ]
  /**
    * Removes one or more cookies of response.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var RemoveResponseCookie: org.scalablytyped.runtime.Instantiable1[
    /* parameters */ chromeDashAppsLib.chromeNs.webViewRequestNs.RemoveCookieParams[chromeDashAppsLib.chromeNs.webViewRequestNs.FilterResponseCookie], 
    chromeDashAppsLib.chromeNs.webViewRequestNs.RemoveResponseCookie
  ]
  /**
    * Removes all response headers of the specified names and values.
    */
  var RemoveResponseHeader: org.scalablytyped.runtime.Instantiable1[
    /* parameters */ chromeDashAppsLib.chromeNs.webViewRequestNs.RemoveResponseHeaderParams, 
    chromeDashAppsLib.chromeNs.webViewRequestNs.RemoveResponseHeader
  ]
  /**
    * @description Matches network events by various criteria.
    */
  var RequestMatcher: org.scalablytyped.runtime.Instantiable1[
    /* parameters */ js.UndefOr[
      /* parameters */ chromeDashAppsLib.chromeNs.webViewRequestNs.RequestMatcherFields
    ], 
    chromeDashAppsLib.chromeNs.webViewRequestNs.RequestMatcher
  ]
  /**
    * Triggers the webviewWebRequest.*OnMessageEvent* event which are used in webviews.
    */
  var SendMessageToExtension: org.scalablytyped.runtime.Instantiable1[
    /* parameters */ chromeDashAppsLib.chromeNs.webViewRequestNs.SendMessageParams, 
    chromeDashAppsLib.chromeNs.webViewRequestNs.SendMessageToExtension
  ]
  /**
    * Sets the request header of the specified name to the specified value.
    * If a header with the specified name did not exist before, a new one is created.
    * Header name comparison is always case-insensitive.
    * Each request header name occurs only once in each request.
    */
  var SetRequestHeader: org.scalablytyped.runtime.Instantiable1[
    /* parameters */ chromeDashAppsLib.chromeNs.webViewRequestNs.SetRequestHeaderParams, 
    chromeDashAppsLib.chromeNs.webViewRequestNs.SetRequestHeader
  ]
}

