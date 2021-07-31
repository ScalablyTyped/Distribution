package typings.chrome.chrome.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockingResponse extends StObject {
  
  /** Optional. Only used as a response to the onAuthRequired event. If set, the request is made using the supplied credentials. */
  var authCredentials: js.UndefOr[AuthCredentials] = js.undefined
  
  /** Optional. If true, the request is cancelled. Used in onBeforeRequest, this prevents the request from being sent. */
  var cancel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.
    * Only used as a response to the onBeforeRequest and onHeadersReceived events. If set, the original request is prevented from being sent/completed and is instead redirected to the given URL. Redirections to non-HTTP schemes such as data: are allowed. Redirects initiated by a redirect action use the original request method for the redirect, with one exception: If the redirect is initiated at the onHeadersReceived stage, then the redirect will be issued using the GET method.
    */
  var redirectUrl: js.UndefOr[String] = js.undefined
  
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
object BlockingResponse {
  
  @scala.inline
  def apply(): BlockingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockingResponse]
  }
  
  @scala.inline
  implicit class BlockingResponseMutableBuilder[Self <: BlockingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthCredentials(value: AuthCredentials): Self = StObject.set(x, "authCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthCredentialsUndefined: Self = StObject.set(x, "authCredentials", js.undefined)
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUrlUndefined: Self = StObject.set(x, "redirectUrl", js.undefined)
    
    @scala.inline
    def setRequestHeaders(value: js.Array[HttpHeader]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
    
    @scala.inline
    def setRequestHeadersVarargs(value: HttpHeader*): Self = StObject.set(x, "requestHeaders", js.Array(value :_*))
    
    @scala.inline
    def setResponseHeaders(value: js.Array[HttpHeader]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseHeadersUndefined: Self = StObject.set(x, "responseHeaders", js.undefined)
    
    @scala.inline
    def setResponseHeadersVarargs(value: HttpHeader*): Self = StObject.set(x, "responseHeaders", js.Array(value :_*))
  }
}
