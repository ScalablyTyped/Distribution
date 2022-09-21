package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.ReferrerPolicy
import typings.typescriptNn5FuAjk.RequestCache
import typings.typescriptNn5FuAjk.RequestCredentials
import typings.typescriptNn5FuAjk.RequestDestination
import typings.typescriptNn5FuAjk.RequestInfo
import typings.typescriptNn5FuAjk.RequestInit
import typings.typescriptNn5FuAjk.RequestMode
import typings.typescriptNn5FuAjk.RequestRedirect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Request")
@js.native
open class Request protected ()
  extends StObject
     with typings.typescriptNn5FuAjk.Request {
  def this(input: RequestInfo) = this()
  def this(input: typings.typescriptNn5FuAjk.URL) = this()
  def this(input: RequestInfo, init: RequestInit) = this()
  def this(input: typings.typescriptNn5FuAjk.URL, init: RequestInit) = this()
  
  /* CompleteClass */
  override def arrayBuffer(): typings.typescriptNn5FuAjk.Promise[typings.typescriptNn5FuAjk.ArrayBuffer] = js.native
  
  /* CompleteClass */
  override def blob(): typings.typescriptNn5FuAjk.Promise[typings.typescriptNn5FuAjk.Blob] = js.native
  
  /* CompleteClass */
  override val body: typings.typescriptNn5FuAjk.ReadableStream[typings.typescriptNn5FuAjk.Uint8Array] | Null = js.native
  
  /* CompleteClass */
  override val bodyUsed: scala.Boolean = js.native
  
  /** Returns the cache mode associated with request, which is a string indicating how the request will interact with the browser's cache when fetching. */
  /* CompleteClass */
  override val cache: RequestCache = js.native
  
  /** Returns the credentials mode associated with request, which is a string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL. */
  /* CompleteClass */
  override val credentials: RequestCredentials = js.native
  
  /** Returns the kind of resource requested by request, e.g., "document" or "script". */
  /* CompleteClass */
  override val destination: RequestDestination = js.native
  
  /* CompleteClass */
  override def formData(): typings.typescriptNn5FuAjk.Promise[typings.typescriptNn5FuAjk.FormData] = js.native
  
  /** Returns a Headers object consisting of the headers associated with request. Note that headers added in the network layer by the user agent will not be accounted for in this object, e.g., the "Host" header. */
  /* CompleteClass */
  override val headers: typings.typescriptNn5FuAjk.Headers = js.native
  
  /** Returns request's subresource integrity metadata, which is a cryptographic hash of the resource being fetched. Its value consists of multiple hashes separated by whitespace. [SRI] */
  /* CompleteClass */
  override val integrity: java.lang.String = js.native
  
  /* CompleteClass */
  override def json(): typings.typescriptNn5FuAjk.Promise[Any] = js.native
  
  /** Returns a boolean indicating whether or not request can outlive the global in which it was created. */
  /* CompleteClass */
  override val keepalive: scala.Boolean = js.native
  
  /** Returns request's HTTP method, which is "GET" by default. */
  /* CompleteClass */
  override val method: java.lang.String = js.native
  
  /** Returns the mode associated with request, which is a string indicating whether the request will use CORS, or will be restricted to same-origin URLs. */
  /* CompleteClass */
  override val mode: RequestMode = js.native
  
  /** Returns the redirect mode associated with request, which is a string indicating how redirects for the request will be handled during fetching. A request will follow redirects by default. */
  /* CompleteClass */
  override val redirect: RequestRedirect = js.native
  
  /** Returns the referrer of request. Its value can be a same-origin URL if explicitly set in init, the empty string to indicate no referrer, and "about:client" when defaulting to the global's default. This is used during fetching to determine the value of the `Referer` header of the request being made. */
  /* CompleteClass */
  override val referrer: java.lang.String = js.native
  
  /** Returns the referrer policy associated with request. This is used during fetching to compute the value of the request's referrer. */
  /* CompleteClass */
  override val referrerPolicy: ReferrerPolicy = js.native
  
  /** Returns the signal associated with request, which is an AbortSignal object indicating whether or not request has been aborted, and its abort event handler. */
  /* CompleteClass */
  override val signal: typings.typescriptNn5FuAjk.AbortSignal = js.native
  
  /* CompleteClass */
  override def text(): typings.typescriptNn5FuAjk.Promise[java.lang.String] = js.native
  
  /** Returns the URL of request as a string. */
  /* CompleteClass */
  override val url: java.lang.String = js.native
}
