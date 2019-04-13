package typings
package crossDashFetchLib.crossDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cross-fetch", "Request")
@js.native
class Request protected ()
  extends stdLib.Request {
  def this(input: stdLib.RequestInfo) = this()
  def this(input: stdLib.RequestInfo, init: stdLib.RequestInit) = this()
  /* CompleteClass */
  override val body: stdLib.ReadableStream[stdLib.Uint8Array] | scala.Null = js.native
  /* CompleteClass */
  override val bodyUsed: scala.Boolean = js.native
  /**
    * Returns the cache mode associated with request, which is a string indicating
    * how the request will interact with the browser's cache when fetching.
    */
  /* CompleteClass */
  override val cache: stdLib.RequestCache = js.native
  /**
    * Returns the credentials mode associated with request, which is a string
    * indicating whether credentials will be sent with the request always, never, or only when sent to a
    * same-origin URL.
    */
  /* CompleteClass */
  override val credentials: stdLib.RequestCredentials = js.native
  /**
    * Returns the kind of resource requested by request, e.g., "document" or
    * "script".
    */
  /* CompleteClass */
  override val destination: stdLib.RequestDestination = js.native
  /**
    * Returns a Headers object consisting of the headers associated with request.
    * Note that headers added in the network layer by the user agent will not be accounted for in this
    * object, e.g., the "Host" header.
    */
  /* CompleteClass */
  override val headers: stdLib.Headers = js.native
  /**
    * Returns request's subresource integrity metadata, which is a cryptographic hash of
    * the resource being fetched. Its value consists of multiple hashes separated by whitespace. [SRI]
    */
  /* CompleteClass */
  override val integrity: java.lang.String = js.native
  /**
    * Returns a boolean indicating whether or not request is for a history
    * navigation (a.k.a. back-foward navigation).
    */
  /* CompleteClass */
  override val isHistoryNavigation: scala.Boolean = js.native
  /**
    * Returns a boolean indicating whether or not request is for a reload navigation.
    */
  /* CompleteClass */
  override val isReloadNavigation: scala.Boolean = js.native
  /**
    * Returns a boolean indicating whether or not request can outlive the global in which
    * it was created.
    */
  /* CompleteClass */
  override val keepalive: scala.Boolean = js.native
  /**
    * Returns request's HTTP method, which is "GET" by default.
    */
  /* CompleteClass */
  override val method: java.lang.String = js.native
  /**
    * Returns the mode associated with request, which is a string indicating
    * whether the request will use CORS, or will be restricted to same-origin URLs.
    */
  /* CompleteClass */
  override val mode: stdLib.RequestMode = js.native
  /**
    * Returns the redirect mode associated with request, which is a string
    * indicating how redirects for the request will be handled during fetching. A request will follow redirects by default.
    */
  /* CompleteClass */
  override val redirect: stdLib.RequestRedirect = js.native
  /**
    * Returns the referrer of request. Its value can be a same-origin URL if
    * explicitly set in init, the empty string to indicate no referrer, and
    * "about:client" when defaulting to the global's default. This is used during
    * fetching to determine the value of the `Referer` header of the request being made.
    */
  /* CompleteClass */
  override val referrer: java.lang.String = js.native
  /**
    * Returns the referrer policy associated with request. This is used during
    * fetching to compute the value of the request's referrer.
    */
  /* CompleteClass */
  override val referrerPolicy: stdLib.ReferrerPolicy = js.native
  /**
    * Returns the signal associated with request, which is an AbortSignal object indicating whether or not request has been aborted, and its abort
    * event handler.
    */
  /* CompleteClass */
  override val signal: stdLib.AbortSignal = js.native
  /**
    * Returns the URL of request as a string.
    */
  /* CompleteClass */
  override val url: java.lang.String = js.native
  /* CompleteClass */
  override def arrayBuffer(): js.Promise[stdLib.ArrayBuffer] = js.native
  /* CompleteClass */
  override def blob(): js.Promise[stdLib.Blob] = js.native
  /* CompleteClass */
  override def formData(): js.Promise[stdLib.FormData] = js.native
  /* CompleteClass */
  override def json(): js.Promise[_] = js.native
  /* CompleteClass */
  override def text(): js.Promise[java.lang.String] = js.native
}

@JSImport("cross-fetch", "Request")
@js.native
object Request
  extends org.scalablytyped.runtime.Instantiable1[/* input */ stdLib.RequestInfo, stdLib.Request]
     with org.scalablytyped.runtime.Instantiable2[/* input */ stdLib.RequestInfo, /* init */ stdLib.RequestInit, stdLib.Request]

