package typings.cypress.typesNetStubbingMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CyHttpMessages {
  
  trait BaseMessage extends StObject {
    
    /**
      * The body of the HTTP message.
      * If a JSON Content-Type was used and the body was valid JSON, this will be an object.
      * If the body was binary content, this will be a buffer.
      */
    var body: Any
    
    /**
      * The headers of the HTTP message.
      */
    var headers: StringDictionary[String | js.Array[String]]
  }
  object BaseMessage {
    
    inline def apply(body: Any, headers: StringDictionary[String | js.Array[String]]): BaseMessage = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseMessage] (val x: Self) extends AnyVal {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IncomingHttpRequest
    extends StObject
       with IncomingRequest
       with RequestEvents {
    
    /**
      * Send the request outgoing, skipping any other request handlers.
      * If a function is passed, the request will be sent outgoing, and the function will be called
      * with the response from the upstream server.
      */
    def continue(): Unit = js.native
    def continue(interceptor: HttpResponseInterceptor): Unit = js.native
    
    /**
      * Destroy the request and respond with a network error.
      */
    def destroy(): Unit = js.native
    
    /**
      * Respond to this request with a redirect to a new `location`.
      * @param statusCode HTTP status code to redirect with. Default: 302
      */
    def redirect(location: String): Unit = js.native
    def redirect(location: String, statusCode: Double): Unit = js.native
    
    /**
      * Control the response to this request.
      * If a function is passed, the request will be sent outgoing, and the function will be called
      * with the response from the upstream server.
      * If a `StaticResponse` is passed, it will be used as the response, and no request will be made
      * to the upstream server.
      */
    def reply(): Unit = js.native
    /**
      * Shortcut to reply to the request with a body and optional headers.
      */
    def reply(body: String): Unit = js.native
    def reply(body: String, headers: StringDictionary[String]): Unit = js.native
    def reply(body: js.Object): Unit = js.native
    def reply(body: js.Object, headers: StringDictionary[String]): Unit = js.native
    def reply(interceptor: HttpResponseInterceptor): Unit = js.native
    def reply(interceptor: StaticResponse): Unit = js.native
    /**
      * Shortcut to reply to the request with an HTTP status code and optional body and headers.
      */
    def reply(status: Double): Unit = js.native
    def reply(status: Double, body: String): Unit = js.native
    def reply(status: Double, body: String, headers: StringDictionary[String]): Unit = js.native
    def reply(status: Double, body: js.Object): Unit = js.native
    def reply(status: Double, body: js.Object, headers: StringDictionary[String]): Unit = js.native
    def reply(status: Double, body: Unit, headers: StringDictionary[String]): Unit = js.native
  }
  
  /* Inlined cypress.cypress/types/net-stubbing.CyHttpMessages.IncomingResponse & {send (status : number, body : string | number | object | undefined, headers : {[key: string] : string} | undefined): void, send (body : string | object, headers : {[key: string] : string} | undefined): void, send (staticResponse : cypress.cypress/types/net-stubbing.StaticResponse): void, send (): void, setDelay (delay : number): cypress.cypress/types/net-stubbing.CyHttpMessages.IncomingHttpResponse, setThrottle (throttleKbps : number): cypress.cypress/types/net-stubbing.CyHttpMessages.IncomingHttpResponse} */
  @js.native
  trait IncomingHttpResponse extends StObject {
    
    /**
      * The body of the HTTP message.
      * If a JSON Content-Type was used and the body was valid JSON, this will be an object.
      * If the body was binary content, this will be a buffer.
      */
    var body: Any = js.native
    
    /**
      * Milliseconds to delay before the response is sent.
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * The headers of the HTTP message.
      */
    var headers: StringDictionary[String | js.Array[String]] = js.native
    
    /**
      * Continue the HTTP response to the browser, including any modifications made to `res`.
      */
    def send(): Unit = js.native
    def send(body: String): Unit = js.native
    def send(body: String, headers: StringDictionary[String]): Unit = js.native
    def send(body: js.Object): Unit = js.native
    def send(body: js.Object, headers: StringDictionary[String]): Unit = js.native
    def send(staticResponse: StaticResponse): Unit = js.native
    /**
      * Continue the HTTP response, merging the supplied values with the real response.
      */
    def send(status: Double): Unit = js.native
    def send(status: Double, body: String): Unit = js.native
    def send(status: Double, body: String, headers: StringDictionary[String]): Unit = js.native
    def send(status: Double, body: js.Object): Unit = js.native
    def send(status: Double, body: js.Object, headers: StringDictionary[String]): Unit = js.native
    def send(status: Double, body: Double): Unit = js.native
    def send(status: Double, body: Double, headers: StringDictionary[String]): Unit = js.native
    def send(status: Double, body: Unit, headers: StringDictionary[String]): Unit = js.native
    
    /**
      * Wait for `delay` milliseconds before sending the response to the client.
      */
    def setDelay(delay: Double): IncomingHttpResponse = js.native
    
    /**
      * Serve the response at `throttleKbps` kilobytes per second.
      */
    def setThrottle(throttleKbps: Double): IncomingHttpResponse = js.native
    
    /**
      * The HTTP status code of the response.
      */
    var statusCode: Double = js.native
    
    /**
      * The HTTP status message.
      */
    var statusMessage: String = js.native
    
    /**
      * Kilobytes per second to send 'body'.
      */
    var throttleKbps: js.UndefOr[Double] = js.native
  }
  
  trait IncomingRequest
    extends StObject
       with BaseMessage {
    
    /**
      * If set, `cy.wait` can be used to await the request/response cycle to complete for this
      * request via `cy.wait('@alias')`.
      */
    var alias: js.UndefOr[String] = js.undefined
    
    /**
      * Set if redirects should be followed when this request is made. By default, requests will
      * not follow redirects before yielding the response (the 3xx redirect is yielded)
      */
    var followRedirect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The HTTP version used in the request. Read only.
      */
    var httpVersion: String
    
    /**
      * Request HTTP method (GET, POST, ...).
      */
    var method: String
    
    /**
      * URL query string as object.
      */
    var query: Record[String, String | Double]
    
    /**
      * The resource type that is being requested, according to the browser.
      */
    var resourceType: ResourceType
    
    /**
      * If provided, the number of milliseconds before an upstream response to this request
      * will time out and cause an error. By default, `responseTimeout` from config is used.
      */
    var responseTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Request URL.
      */
    var url: String
  }
  object IncomingRequest {
    
    inline def apply(
      body: Any,
      headers: StringDictionary[String | js.Array[String]],
      httpVersion: String,
      method: String,
      query: Record[String, String | Double],
      resourceType: ResourceType,
      url: String
    ): IncomingRequest = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], httpVersion = httpVersion.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncomingRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IncomingRequest] (val x: Self) extends AnyVal {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
      
      inline def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
      
      inline def setHttpVersion(value: String): Self = StObject.set(x, "httpVersion", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Record[String, String | Double]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
      
      inline def setResponseTimeout(value: Double): Self = StObject.set(x, "responseTimeout", value.asInstanceOf[js.Any])
      
      inline def setResponseTimeoutUndefined: Self = StObject.set(x, "responseTimeout", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait IncomingResponse
    extends StObject
       with BaseMessage {
    
    /**
      * Milliseconds to delay before the response is sent.
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * The HTTP status code of the response.
      */
    var statusCode: Double
    
    /**
      * The HTTP status message.
      */
    var statusMessage: String
    
    /**
      * Kilobytes per second to send 'body'.
      */
    var throttleKbps: js.UndefOr[Double] = js.undefined
  }
  object IncomingResponse {
    
    inline def apply(
      body: Any,
      headers: StringDictionary[String | js.Array[String]],
      statusCode: Double,
      statusMessage: String
    ): IncomingResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncomingResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IncomingResponse] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      inline def setThrottleKbps(value: Double): Self = StObject.set(x, "throttleKbps", value.asInstanceOf[js.Any])
      
      inline def setThrottleKbpsUndefined: Self = StObject.set(x, "throttleKbps", js.undefined)
    }
  }
  
  trait NetworkError extends StObject {
    
    var error: Any
  }
  object NetworkError {
    
    inline def apply(error: Any): NetworkError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NetworkError] (val x: Self) extends AnyVal {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResponseComplete extends StObject {
    
    var finalResBody: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: cypress.cypress/types/net-stubbing.CyHttpMessages.BaseMessage['body'] */ js.Any
      ] = js.undefined
  }
  object ResponseComplete {
    
    inline def apply(): ResponseComplete = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseComplete]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponseComplete] (val x: Self) extends AnyVal {
      
      inline def setFinalResBody(
        value: /* import warning: importer.ImportType#apply Failed type conversion: cypress.cypress/types/net-stubbing.CyHttpMessages.BaseMessage['body'] */ js.Any
      ): Self = StObject.set(x, "finalResBody", value.asInstanceOf[js.Any])
      
      inline def setFinalResBodyUndefined: Self = StObject.set(x, "finalResBody", js.undefined)
    }
  }
}
