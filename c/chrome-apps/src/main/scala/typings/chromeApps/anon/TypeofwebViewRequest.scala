package typings.chromeApps.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.chromeApps.chrome.webViewRequest.AddCookie
import typings.chromeApps.chrome.webViewRequest.AddRequestCookie
import typings.chromeApps.chrome.webViewRequest.AddResponseCookie
import typings.chromeApps.chrome.webViewRequest.AddResponseHeader
import typings.chromeApps.chrome.webViewRequest.AddResponseHeaderParams
import typings.chromeApps.chrome.webViewRequest.CancelRequest
import typings.chromeApps.chrome.webViewRequest.EditCookieParams
import typings.chromeApps.chrome.webViewRequest.EditRequestCookie
import typings.chromeApps.chrome.webViewRequest.EditResponseCookie
import typings.chromeApps.chrome.webViewRequest.FilterResponseCookie
import typings.chromeApps.chrome.webViewRequest.IgnoreRules
import typings.chromeApps.chrome.webViewRequest.IgnoreRulesParams
import typings.chromeApps.chrome.webViewRequest.RedirectByRegEx
import typings.chromeApps.chrome.webViewRequest.RedirectByRegExParams
import typings.chromeApps.chrome.webViewRequest.RedirectRequest
import typings.chromeApps.chrome.webViewRequest.RedirectRequestParams
import typings.chromeApps.chrome.webViewRequest.RedirectToEmptyDocument
import typings.chromeApps.chrome.webViewRequest.RedirectToTransparentImage
import typings.chromeApps.chrome.webViewRequest.RemoveCookieParams
import typings.chromeApps.chrome.webViewRequest.RemoveRequestCookie
import typings.chromeApps.chrome.webViewRequest.RemoveRequestHeader
import typings.chromeApps.chrome.webViewRequest.RemoveRequestHeaderParams
import typings.chromeApps.chrome.webViewRequest.RemoveResponseCookie
import typings.chromeApps.chrome.webViewRequest.RemoveResponseHeader
import typings.chromeApps.chrome.webViewRequest.RemoveResponseHeaderParams
import typings.chromeApps.chrome.webViewRequest.RequestCookie
import typings.chromeApps.chrome.webViewRequest.RequestMatcher
import typings.chromeApps.chrome.webViewRequest.RequestMatcherFields
import typings.chromeApps.chrome.webViewRequest.ResponseCookie
import typings.chromeApps.chrome.webViewRequest.SendMessageParams
import typings.chromeApps.chrome.webViewRequest.SendMessageToExtension
import typings.chromeApps.chrome.webViewRequest.SetRequestHeader
import typings.chromeApps.chrome.webViewRequest.SetRequestHeaderParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofwebViewRequest extends js.Object {
  /**
    * Adds a cookie to the request or overrides a cookie, in case another cookie of the same name exists already.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var AddRequestCookie: Instantiable1[
    /* parameters */ AddCookie[RequestCookie], 
    typings.chromeApps.chrome.webViewRequest.AddRequestCookie
  ] = js.native
  /**
    * Adds a cookie to the response or overrides a cookie, in case another cookie of the same name exists already.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var AddResponseCookie: Instantiable1[
    /* parameters */ AddCookie[ResponseCookie], 
    typings.chromeApps.chrome.webViewRequest.AddResponseCookie
  ] = js.native
  /**
    * Adds the response header to the response of this web request.
    * As multiple response headers may share the same name,
    * you need to first remove and then add a new
    * response header in order to replace one.
    */
  var AddResponseHeader: Instantiable1[
    /* parameters */ AddResponseHeaderParams, 
    typings.chromeApps.chrome.webViewRequest.AddResponseHeader
  ] = js.native
  /** Declarative event action that cancels a network request. */
  var CancelRequest: Instantiable0[typings.chromeApps.chrome.webViewRequest.CancelRequest] = js.native
  /**
    * Edits one or more cookies of request.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var EditRequestCookie: Instantiable1[
    /* parameters */ EditCookieParams[RequestCookie, RequestCookie], 
    typings.chromeApps.chrome.webViewRequest.EditRequestCookie
  ] = js.native
  /**
    * Edits one or more cookies of response.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var EditResponseCookie: Instantiable1[
    /* parameter */ EditCookieParams[FilterResponseCookie, ResponseCookie], 
    typings.chromeApps.chrome.webViewRequest.EditResponseCookie
  ] = js.native
  /**
    * Masks all rules that match the specified criteria.
    */
  var IgnoreRules: Instantiable1[
    /* parameters */ IgnoreRulesParams, 
    typings.chromeApps.chrome.webViewRequest.IgnoreRules
  ] = js.native
  /**
    * Redirects a request by applying a regular expression on the URL.
    * The regular expressions use the RE2 syntax.
    * @see[RE2 syntax]{@link https://github.com/google/re2/blob/master/doc/syntax.txt}
    */
  var RedirectByRegEx: Instantiable1[
    /* parameters */ RedirectByRegExParams, 
    typings.chromeApps.chrome.webViewRequest.RedirectByRegEx
  ] = js.native
  /** Declarative event action that redirects a network request.  */
  var RedirectRequest: Instantiable1[
    /* parameters */ RedirectRequestParams, 
    typings.chromeApps.chrome.webViewRequest.RedirectRequest
  ] = js.native
  /** Declarative event action that redirects a network request to an empty document. */
  var RedirectToEmptyDocument: Instantiable0[typings.chromeApps.chrome.webViewRequest.RedirectToEmptyDocument] = js.native
  /** Declarative event action that redirects a network request to a transparent image. */
  var RedirectToTransparentImage: Instantiable0[typings.chromeApps.chrome.webViewRequest.RedirectToTransparentImage] = js.native
  /**
    * Removes one or more cookies of request.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var RemoveRequestCookie: Instantiable1[
    /* parameters */ RemoveCookieParams[RequestCookie], 
    typings.chromeApps.chrome.webViewRequest.RemoveRequestCookie
  ] = js.native
  /**
    * Removes the request header of the specified name.
    * Do not use SetRequestHeader and RemoveRequestHeader with
    * the same header name on the same request.
    * Each request header name occurs only once in each request.
    */
  var RemoveRequestHeader: Instantiable1[
    /* parameters */ RemoveRequestHeaderParams, 
    typings.chromeApps.chrome.webViewRequest.RemoveRequestHeader
  ] = js.native
  /**
    * Removes one or more cookies of response.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var RemoveResponseCookie: Instantiable1[
    /* parameters */ RemoveCookieParams[FilterResponseCookie], 
    typings.chromeApps.chrome.webViewRequest.RemoveResponseCookie
  ] = js.native
  /**
    * Removes all response headers of the specified names and values.
    */
  var RemoveResponseHeader: Instantiable1[
    /* parameters */ RemoveResponseHeaderParams, 
    typings.chromeApps.chrome.webViewRequest.RemoveResponseHeader
  ] = js.native
  /**
    * @description Matches network events by various criteria.
    */
  var RequestMatcher: Instantiable1[
    /* parameters */ js.UndefOr[RequestMatcherFields], 
    typings.chromeApps.chrome.webViewRequest.RequestMatcher
  ] = js.native
  /**
    * Triggers the webviewWebRequest.*OnMessageEvent* event which are used in webviews.
    */
  var SendMessageToExtension: Instantiable1[
    /* parameters */ SendMessageParams, 
    typings.chromeApps.chrome.webViewRequest.SendMessageToExtension
  ] = js.native
  /**
    * Sets the request header of the specified name to the specified value.
    * If a header with the specified name did not exist before, a new one is created.
    * Header name comparison is always case-insensitive.
    * Each request header name occurs only once in each request.
    */
  var SetRequestHeader: Instantiable1[
    /* parameters */ SetRequestHeaderParams, 
    typings.chromeApps.chrome.webViewRequest.SetRequestHeader
  ] = js.native
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
    RequestMatcher: Instantiable1[/* parameters */ js.UndefOr[RequestMatcherFields], RequestMatcher],
    SendMessageToExtension: Instantiable1[/* parameters */ SendMessageParams, SendMessageToExtension],
    SetRequestHeader: Instantiable1[/* parameters */ SetRequestHeaderParams, SetRequestHeader]
  ): TypeofwebViewRequest = {
    val __obj = js.Dynamic.literal(AddRequestCookie = AddRequestCookie.asInstanceOf[js.Any], AddResponseCookie = AddResponseCookie.asInstanceOf[js.Any], AddResponseHeader = AddResponseHeader.asInstanceOf[js.Any], CancelRequest = CancelRequest.asInstanceOf[js.Any], EditRequestCookie = EditRequestCookie.asInstanceOf[js.Any], EditResponseCookie = EditResponseCookie.asInstanceOf[js.Any], IgnoreRules = IgnoreRules.asInstanceOf[js.Any], RedirectByRegEx = RedirectByRegEx.asInstanceOf[js.Any], RedirectRequest = RedirectRequest.asInstanceOf[js.Any], RedirectToEmptyDocument = RedirectToEmptyDocument.asInstanceOf[js.Any], RedirectToTransparentImage = RedirectToTransparentImage.asInstanceOf[js.Any], RemoveRequestCookie = RemoveRequestCookie.asInstanceOf[js.Any], RemoveRequestHeader = RemoveRequestHeader.asInstanceOf[js.Any], RemoveResponseCookie = RemoveResponseCookie.asInstanceOf[js.Any], RemoveResponseHeader = RemoveResponseHeader.asInstanceOf[js.Any], RequestMatcher = RequestMatcher.asInstanceOf[js.Any], SendMessageToExtension = SendMessageToExtension.asInstanceOf[js.Any], SetRequestHeader = SetRequestHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofwebViewRequest]
  }
  @scala.inline
  implicit class TypeofwebViewRequestOps[Self <: TypeofwebViewRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddRequestCookie(value: Instantiable1[/* parameters */ AddCookie[RequestCookie], AddRequestCookie]): Self = this.set("AddRequestCookie", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddResponseCookie(value: Instantiable1[/* parameters */ AddCookie[ResponseCookie], AddResponseCookie]): Self = this.set("AddResponseCookie", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddResponseHeader(value: Instantiable1[/* parameters */ AddResponseHeaderParams, AddResponseHeader]): Self = this.set("AddResponseHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelRequest(value: Instantiable0[CancelRequest]): Self = this.set("CancelRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditRequestCookie(
      value: Instantiable1[/* parameters */ EditCookieParams[RequestCookie, RequestCookie], EditRequestCookie]
    ): Self = this.set("EditRequestCookie", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditResponseCookie(
      value: Instantiable1[
          /* parameter */ EditCookieParams[FilterResponseCookie, ResponseCookie], 
          EditResponseCookie
        ]
    ): Self = this.set("EditResponseCookie", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreRules(value: Instantiable1[/* parameters */ IgnoreRulesParams, IgnoreRules]): Self = this.set("IgnoreRules", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirectByRegEx(value: Instantiable1[/* parameters */ RedirectByRegExParams, RedirectByRegEx]): Self = this.set("RedirectByRegEx", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirectRequest(value: Instantiable1[/* parameters */ RedirectRequestParams, RedirectRequest]): Self = this.set("RedirectRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirectToEmptyDocument(value: Instantiable0[RedirectToEmptyDocument]): Self = this.set("RedirectToEmptyDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirectToTransparentImage(value: Instantiable0[RedirectToTransparentImage]): Self = this.set("RedirectToTransparentImage", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveRequestCookie(value: Instantiable1[/* parameters */ RemoveCookieParams[RequestCookie], RemoveRequestCookie]): Self = this.set("RemoveRequestCookie", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveRequestHeader(value: Instantiable1[/* parameters */ RemoveRequestHeaderParams, RemoveRequestHeader]): Self = this.set("RemoveRequestHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveResponseCookie(
      value: Instantiable1[/* parameters */ RemoveCookieParams[FilterResponseCookie], RemoveResponseCookie]
    ): Self = this.set("RemoveResponseCookie", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveResponseHeader(value: Instantiable1[/* parameters */ RemoveResponseHeaderParams, RemoveResponseHeader]): Self = this.set("RemoveResponseHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestMatcher(value: Instantiable1[/* parameters */ js.UndefOr[RequestMatcherFields], RequestMatcher]): Self = this.set("RequestMatcher", value.asInstanceOf[js.Any])
    @scala.inline
    def setSendMessageToExtension(value: Instantiable1[/* parameters */ SendMessageParams, SendMessageToExtension]): Self = this.set("SendMessageToExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetRequestHeader(value: Instantiable1[/* parameters */ SetRequestHeaderParams, SetRequestHeader]): Self = this.set("SetRequestHeader", value.asInstanceOf[js.Any])
  }
  
}

