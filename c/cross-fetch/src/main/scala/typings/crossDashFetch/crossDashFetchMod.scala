package typings.crossDashFetch

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.AbortSignal
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.BodyInit
import typings.std.FormData
import typings.std.HeadersInit
import typings.std.ReadableStream
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestDestination
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.RequestMode
import typings.std.RequestRedirect
import typings.std.ResponseInit
import typings.std.ResponseType
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cross-fetch", JSImport.Namespace)
@js.native
object crossDashFetchMod extends js.Object {
  @js.native
  class Headers ()
    extends typings.std.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @js.native
  class Request protected ()
    extends typings.std.Request {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
    /* CompleteClass */
    override val body: ReadableStream[Uint8Array] | Null = js.native
    /* CompleteClass */
    override val bodyUsed: Boolean = js.native
    /**
      * Returns the cache mode associated with request, which is a string indicating how the request will interact with the browser's cache when fetching.
      */
    /* CompleteClass */
    override val cache: RequestCache = js.native
    /**
      * Returns the credentials mode associated with request, which is a string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL.
      */
    /* CompleteClass */
    override val credentials: RequestCredentials = js.native
    /**
      * Returns the kind of resource requested by request, e.g., "document" or "script".
      */
    /* CompleteClass */
    override val destination: RequestDestination = js.native
    /**
      * Returns a Headers object consisting of the headers associated with request. Note that headers added in the network layer by the user agent will not be accounted for in this object, e.g., the "Host" header.
      */
    /* CompleteClass */
    override val headers: typings.std.Headers = js.native
    /**
      * Returns request's subresource integrity metadata, which is a cryptographic hash of the resource being fetched. Its value consists of multiple hashes separated by whitespace. [SRI]
      */
    /* CompleteClass */
    override val integrity: String = js.native
    /**
      * Returns a boolean indicating whether or not request is for a history navigation (a.k.a. back-foward navigation).
      */
    /* CompleteClass */
    override val isHistoryNavigation: Boolean = js.native
    /**
      * Returns a boolean indicating whether or not request is for a reload navigation.
      */
    /* CompleteClass */
    override val isReloadNavigation: Boolean = js.native
    /**
      * Returns a boolean indicating whether or not request can outlive the global in which it was created.
      */
    /* CompleteClass */
    override val keepalive: Boolean = js.native
    /**
      * Returns request's HTTP method, which is "GET" by default.
      */
    /* CompleteClass */
    override val method: String = js.native
    /**
      * Returns the mode associated with request, which is a string indicating whether the request will use CORS, or will be restricted to same-origin URLs.
      */
    /* CompleteClass */
    override val mode: RequestMode = js.native
    /**
      * Returns the redirect mode associated with request, which is a string indicating how redirects for the request will be handled during fetching. A request will follow redirects by default.
      */
    /* CompleteClass */
    override val redirect: RequestRedirect = js.native
    /**
      * Returns the referrer of request. Its value can be a same-origin URL if explicitly set in init, the empty string to indicate no referrer, and "about:client" when defaulting to the global's default. This is used during fetching to determine the value of the `Referer` header of the request being made.
      */
    /* CompleteClass */
    override val referrer: String = js.native
    /**
      * Returns the referrer policy associated with request. This is used during fetching to compute the value of the request's referrer.
      */
    /* CompleteClass */
    override val referrerPolicy: ReferrerPolicy = js.native
    /**
      * Returns the signal associated with request, which is an AbortSignal object indicating whether or not request has been aborted, and its abort event handler.
      */
    /* CompleteClass */
    override val signal: AbortSignal = js.native
    /**
      * Returns the URL of request as a string.
      */
    /* CompleteClass */
    override val url: String = js.native
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
    /* CompleteClass */
    override def blob(): js.Promise[Blob] = js.native
    /* CompleteClass */
    override def formData(): js.Promise[FormData] = js.native
    /* CompleteClass */
    override def json(): js.Promise[_] = js.native
    /* CompleteClass */
    override def text(): js.Promise[String] = js.native
  }
  
  @js.native
  class Response ()
    extends typings.std.Response {
    def this(body: BodyInit) = this()
    def this(body: Null, init: ResponseInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
    /* CompleteClass */
    override val body: ReadableStream[Uint8Array] | Null = js.native
    /* CompleteClass */
    override val bodyUsed: Boolean = js.native
    /* CompleteClass */
    override val headers: typings.std.Headers = js.native
    /* CompleteClass */
    override val ok: Boolean = js.native
    /* CompleteClass */
    override val redirected: Boolean = js.native
    /* CompleteClass */
    override val status: Double = js.native
    /* CompleteClass */
    override val statusText: String = js.native
    /* CompleteClass */
    override val trailer: js.Promise[typings.std.Headers] = js.native
    /* CompleteClass */
    override val `type`: ResponseType = js.native
    /* CompleteClass */
    override val url: String = js.native
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
    /* CompleteClass */
    override def blob(): js.Promise[Blob] = js.native
    /* CompleteClass */
    override def formData(): js.Promise[FormData] = js.native
    /* CompleteClass */
    override def json(): js.Promise[_] = js.native
    /* CompleteClass */
    override def text(): js.Promise[String] = js.native
  }
  
  @js.native
  object Headers
    extends Instantiable0[typings.std.Headers]
       with Instantiable1[/* init */ HeadersInit, typings.std.Headers]
  
  @js.native
  object Request
    extends Instantiable1[/* input */ RequestInfo, typings.std.Request]
       with Instantiable2[/* input */ RequestInfo, /* init */ RequestInit, typings.std.Request]
  
  @js.native
  object Response
    extends Instantiable0[typings.std.Response]
       with Instantiable1[/* body */ BodyInit, typings.std.Response]
       with Instantiable2[
          (/* body */ BodyInit) | (/* body */ Null), 
          /* init */ ResponseInit, 
          typings.std.Response
        ] {
    def error(): typings.std.Response = js.native
    def redirect(url: String): typings.std.Response = js.native
    def redirect(url: String, status: Double): typings.std.Response = js.native
  }
  
  @js.native
  object default extends js.Object {
    def apply(input: RequestInfo): js.Promise[typings.std.Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[typings.std.Response] = js.native
  }
  
  @js.native
  object fetch extends js.Object {
    def apply(input: RequestInfo): js.Promise[typings.std.Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[typings.std.Response] = js.native
  }
  
}

