package typings.chromeDashApps

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.chromeDashApps.chromeNs.webViewRequestNs.AddCookie
import typings.chromeDashApps.chromeNs.webViewRequestNs.AddRequestCookie
import typings.chromeDashApps.chromeNs.webViewRequestNs.AddResponseCookie
import typings.chromeDashApps.chromeNs.webViewRequestNs.AddResponseHeader
import typings.chromeDashApps.chromeNs.webViewRequestNs.AddResponseHeaderParams
import typings.chromeDashApps.chromeNs.webViewRequestNs.CancelRequest
import typings.chromeDashApps.chromeNs.webViewRequestNs.EditCookieParams
import typings.chromeDashApps.chromeNs.webViewRequestNs.EditRequestCookie
import typings.chromeDashApps.chromeNs.webViewRequestNs.EditResponseCookie
import typings.chromeDashApps.chromeNs.webViewRequestNs.FilterResponseCookie
import typings.chromeDashApps.chromeNs.webViewRequestNs.IgnoreRules
import typings.chromeDashApps.chromeNs.webViewRequestNs.IgnoreRulesParams
import typings.chromeDashApps.chromeNs.webViewRequestNs.RedirectByRegEx
import typings.chromeDashApps.chromeNs.webViewRequestNs.RedirectByRegExParams
import typings.chromeDashApps.chromeNs.webViewRequestNs.RedirectRequest
import typings.chromeDashApps.chromeNs.webViewRequestNs.RedirectRequestParams
import typings.chromeDashApps.chromeNs.webViewRequestNs.RedirectToEmptyDocument
import typings.chromeDashApps.chromeNs.webViewRequestNs.RedirectToTransparentImage
import typings.chromeDashApps.chromeNs.webViewRequestNs.RemoveCookieParams
import typings.chromeDashApps.chromeNs.webViewRequestNs.RemoveRequestCookie
import typings.chromeDashApps.chromeNs.webViewRequestNs.RemoveRequestHeader
import typings.chromeDashApps.chromeNs.webViewRequestNs.RemoveRequestHeaderParams
import typings.chromeDashApps.chromeNs.webViewRequestNs.RemoveResponseCookie
import typings.chromeDashApps.chromeNs.webViewRequestNs.RemoveResponseHeader
import typings.chromeDashApps.chromeNs.webViewRequestNs.RemoveResponseHeaderParams
import typings.chromeDashApps.chromeNs.webViewRequestNs.RequestCookie
import typings.chromeDashApps.chromeNs.webViewRequestNs.RequestMatcher
import typings.chromeDashApps.chromeNs.webViewRequestNs.RequestMatcherFields
import typings.chromeDashApps.chromeNs.webViewRequestNs.ResponseCookie
import typings.chromeDashApps.chromeNs.webViewRequestNs.SendMessageParams
import typings.chromeDashApps.chromeNs.webViewRequestNs.SendMessageToExtension
import typings.chromeDashApps.chromeNs.webViewRequestNs.SetRequestHeader
import typings.chromeDashApps.chromeNs.webViewRequestNs.SetRequestHeaderParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofwebViewRequest extends js.Object {
  /**
    * Adds a cookie to the request or overrides a cookie, in case another cookie of the same name exists already.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var AddRequestCookie: Instantiable1[
    /* parameters */ AddCookie[RequestCookie], 
    typings.chromeDashApps.chromeNs.webViewRequestNs.AddRequestCookie
  ]
  /**
    * Adds a cookie to the response or overrides a cookie, in case another cookie of the same name exists already.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var AddResponseCookie: Instantiable1[
    /* parameters */ AddCookie[ResponseCookie], 
    typings.chromeDashApps.chromeNs.webViewRequestNs.AddResponseCookie
  ]
  /**
    * Adds the response header to the response of this web request.
    * As multiple response headers may share the same name,
    * you need to first remove and then add a new
    * response header in order to replace one.
    */
  var AddResponseHeader: Instantiable1[
    /* parameters */ AddResponseHeaderParams, 
    typings.chromeDashApps.chromeNs.webViewRequestNs.AddResponseHeader
  ]
  /** Declarative event action that cancels a network request. */
  var CancelRequest: Instantiable0[typings.chromeDashApps.chromeNs.webViewRequestNs.CancelRequest]
  /**
    * Edits one or more cookies of request.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var EditRequestCookie: Instantiable1[
    /* parameters */ EditCookieParams[RequestCookie, RequestCookie], 
    typings.chromeDashApps.chromeNs.webViewRequestNs.EditRequestCookie
  ]
  /**
    * Edits one or more cookies of response.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var EditResponseCookie: Instantiable1[
    /* parameter */ EditCookieParams[FilterResponseCookie, ResponseCookie], 
    typings.chromeDashApps.chromeNs.webViewRequestNs.EditResponseCookie
  ]
  /**
    * Masks all rules that match the specified criteria.
    */
  var IgnoreRules: Instantiable1[
    /* parameters */ IgnoreRulesParams, 
    typings.chromeDashApps.chromeNs.webViewRequestNs.IgnoreRules
  ]
  /**
    * Redirects a request by applying a regular expression on the URL.
    * The regular expressions use the RE2 syntax.
    * @see[RE2 syntax]{@link https://github.com/google/re2/blob/master/doc/syntax.txt}
    */
  var RedirectByRegEx: Instantiable1[
    /* parameters */ RedirectByRegExParams, 
    typings.chromeDashApps.chromeNs.webViewRequestNs.RedirectByRegEx
  ]
  /** Declarative event action that redirects a network request.  */
  var RedirectRequest: Instantiable1[
    /* parameters */ RedirectRequestParams, 
    typings.chromeDashApps.chromeNs.webViewRequestNs.RedirectRequest
  ]
  /** Declarative event action that redirects a network request to an empty document. */
  var RedirectToEmptyDocument: Instantiable0[typings.chromeDashApps.chromeNs.webViewRequestNs.RedirectToEmptyDocument]
  /** Declarative event action that redirects a network request to a transparent image. */
  var RedirectToTransparentImage: Instantiable0[typings.chromeDashApps.chromeNs.webViewRequestNs.RedirectToTransparentImage]
  /**
    * Removes one or more cookies of request.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var RemoveRequestCookie: Instantiable1[
    /* parameters */ RemoveCookieParams[RequestCookie], 
    typings.chromeDashApps.chromeNs.webViewRequestNs.RemoveRequestCookie
  ]
  /**
    * Removes the request header of the specified name.
    * Do not use SetRequestHeader and RemoveRequestHeader with
    * the same header name on the same request.
    * Each request header name occurs only once in each request.
    */
  var RemoveRequestHeader: Instantiable1[
    /* parameters */ RemoveRequestHeaderParams, 
    typings.chromeDashApps.chromeNs.webViewRequestNs.RemoveRequestHeader
  ]
  /**
    * Removes one or more cookies of response.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var RemoveResponseCookie: Instantiable1[
    /* parameters */ RemoveCookieParams[FilterResponseCookie], 
    typings.chromeDashApps.chromeNs.webViewRequestNs.RemoveResponseCookie
  ]
  /**
    * Removes all response headers of the specified names and values.
    */
  var RemoveResponseHeader: Instantiable1[
    /* parameters */ RemoveResponseHeaderParams, 
    typings.chromeDashApps.chromeNs.webViewRequestNs.RemoveResponseHeader
  ]
  /**
    * @description Matches network events by various criteria.
    */
  var RequestMatcher: Instantiable1[
    js.UndefOr[/* parameters */ RequestMatcherFields], 
    typings.chromeDashApps.chromeNs.webViewRequestNs.RequestMatcher
  ]
  /**
    * Triggers the webviewWebRequest.*OnMessageEvent* event which are used in webviews.
    */
  var SendMessageToExtension: Instantiable1[
    /* parameters */ SendMessageParams, 
    typings.chromeDashApps.chromeNs.webViewRequestNs.SendMessageToExtension
  ]
  /**
    * Sets the request header of the specified name to the specified value.
    * If a header with the specified name did not exist before, a new one is created.
    * Header name comparison is always case-insensitive.
    * Each request header name occurs only once in each request.
    */
  var SetRequestHeader: Instantiable1[
    /* parameters */ SetRequestHeaderParams, 
    typings.chromeDashApps.chromeNs.webViewRequestNs.SetRequestHeader
  ]
}

object TypeofwebViewRequest {
  @scala.inline
  def apply(
    AddRequestCookie: Instantiable1[/* parameters */ AddCookie[RequestCookie], AddRequestCookie],
    AddResponseCookie: Instantiable1[/* parameters */ AddCookie[ResponseCookie], AddResponseCookie],
    AddResponseHeader: Instantiable1[/* parameters */ AddResponseHeaderParams, AddResponseHeader],
    CancelRequest: Instantiable0[CancelRequest],
    EditRequestCookie: Instantiable1[/* parameters */ EditCookieParams[RequestCookie, RequestCookie], EditRequestCookie],
    EditResponseCookie: Instantiable1[
      /* parameter */ EditCookieParams[FilterResponseCookie, ResponseCookie], 
      EditResponseCookie
    ],
    IgnoreRules: Instantiable1[/* parameters */ IgnoreRulesParams, IgnoreRules],
    RedirectByRegEx: Instantiable1[/* parameters */ RedirectByRegExParams, RedirectByRegEx],
    RedirectRequest: Instantiable1[/* parameters */ RedirectRequestParams, RedirectRequest],
    RedirectToEmptyDocument: Instantiable0[RedirectToEmptyDocument],
    RedirectToTransparentImage: Instantiable0[RedirectToTransparentImage],
    RemoveRequestCookie: Instantiable1[/* parameters */ RemoveCookieParams[RequestCookie], RemoveRequestCookie],
    RemoveRequestHeader: Instantiable1[/* parameters */ RemoveRequestHeaderParams, RemoveRequestHeader],
    RemoveResponseCookie: Instantiable1[/* parameters */ RemoveCookieParams[FilterResponseCookie], RemoveResponseCookie],
    RemoveResponseHeader: Instantiable1[/* parameters */ RemoveResponseHeaderParams, RemoveResponseHeader],
    RequestMatcher: Instantiable1[js.UndefOr[/* parameters */ RequestMatcherFields], RequestMatcher],
    SendMessageToExtension: Instantiable1[/* parameters */ SendMessageParams, SendMessageToExtension],
    SetRequestHeader: Instantiable1[/* parameters */ SetRequestHeaderParams, SetRequestHeader]
  ): TypeofwebViewRequest = {
    val __obj = js.Dynamic.literal(AddRequestCookie = AddRequestCookie, AddResponseCookie = AddResponseCookie, AddResponseHeader = AddResponseHeader, CancelRequest = CancelRequest, EditRequestCookie = EditRequestCookie, EditResponseCookie = EditResponseCookie, IgnoreRules = IgnoreRules, RedirectByRegEx = RedirectByRegEx, RedirectRequest = RedirectRequest, RedirectToEmptyDocument = RedirectToEmptyDocument, RedirectToTransparentImage = RedirectToTransparentImage, RemoveRequestCookie = RemoveRequestCookie, RemoveRequestHeader = RemoveRequestHeader, RemoveResponseCookie = RemoveResponseCookie, RemoveResponseHeader = RemoveResponseHeader, RequestMatcher = RequestMatcher, SendMessageToExtension = SendMessageToExtension, SetRequestHeader = SetRequestHeader)
  
    __obj.asInstanceOf[TypeofwebViewRequest]
  }
}

