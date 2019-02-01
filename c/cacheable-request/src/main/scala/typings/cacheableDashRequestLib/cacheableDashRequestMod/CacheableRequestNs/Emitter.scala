package typings
package cacheableDashRequestLib.cacheableDashRequestMod.CacheableRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emitter
  extends nodeLib.eventsMod.EventEmitter {
  @JSName("addListener")
  def addListener_error(
    event: cacheableDashRequestLib.cacheableDashRequestLibStrings.error,
    listener: js.Function1[/* error */ RequestError | CacheError, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_request(
    event: cacheableDashRequestLib.cacheableDashRequestLibStrings.request,
    listener: js.Function1[/* request */ nodeLib.httpMod.ClientRequest, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_response(
    event: cacheableDashRequestLib.cacheableDashRequestLibStrings.response,
    listener: js.Function1[
      /* response */ nodeLib.httpMod.ServerResponse | responselikeLib.responselikeMod.namespaced, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("emit")
  def emit_error(event: cacheableDashRequestLib.cacheableDashRequestLibStrings.error, error: CacheError): scala.Boolean = js.native
  @JSName("emit")
  def emit_error(event: cacheableDashRequestLib.cacheableDashRequestLibStrings.error, error: RequestError): scala.Boolean = js.native
  @JSName("emit")
  def emit_request(
    event: cacheableDashRequestLib.cacheableDashRequestLibStrings.request,
    request: nodeLib.httpMod.ClientRequest
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_response(
    event: cacheableDashRequestLib.cacheableDashRequestLibStrings.response,
    response: nodeLib.httpMod.ServerResponse
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_response(
    event: cacheableDashRequestLib.cacheableDashRequestLibStrings.response,
    response: responselikeLib.responselikeMod.namespaced
  ): scala.Boolean = js.native
  @JSName("listenerCount")
  def listenerCount_error(`type`: cacheableDashRequestLib.cacheableDashRequestLibStrings.error): scala.Double = js.native
  @JSName("listenerCount")
  def listenerCount_request(`type`: cacheableDashRequestLib.cacheableDashRequestLibStrings.request): scala.Double = js.native
  @JSName("listenerCount")
  def listenerCount_response(`type`: cacheableDashRequestLib.cacheableDashRequestLibStrings.response): scala.Double = js.native
  @JSName("listeners")
  def listeners_error(event: cacheableDashRequestLib.cacheableDashRequestLibStrings.error): js.Array[js.Function1[/* error */ RequestError | CacheError, scala.Unit]] = js.native
  @JSName("listeners")
  def listeners_request(event: cacheableDashRequestLib.cacheableDashRequestLibStrings.request): js.Array[js.Function1[/* request */ nodeLib.httpMod.ClientRequest, scala.Unit]] = js.native
  @JSName("listeners")
  def listeners_response(event: cacheableDashRequestLib.cacheableDashRequestLibStrings.response): js.Array[
    js.Function1[
      /* response */ nodeLib.httpMod.ServerResponse | responselikeLib.responselikeMod.namespaced, 
      scala.Unit
    ]
  ] = js.native
  @JSName("off")
  def off_error(
    event: cacheableDashRequestLib.cacheableDashRequestLibStrings.error,
    listener: js.Function1[/* error */ RequestError | CacheError, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_request(
    event: cacheableDashRequestLib.cacheableDashRequestLibStrings.request,
    listener: js.Function1[/* request */ nodeLib.httpMod.ClientRequest, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_response(
    event: cacheableDashRequestLib.cacheableDashRequestLibStrings.response,
    listener: js.Function1[
      /* response */ nodeLib.httpMod.ServerResponse | responselikeLib.responselikeMod.namespaced, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: cacheableDashRequestLib.cacheableDashRequestLibStrings.error,
    listener: js.Function1[/* error */ RequestError | CacheError, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_request(
    event: cacheableDashRequestLib.cacheableDashRequestLibStrings.request,
    listener: js.Function1[/* request */ nodeLib.httpMod.ClientRequest, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_response(
    event: cacheableDashRequestLib.cacheableDashRequestLibStrings.response,
    listener: js.Function1[
      /* response */ nodeLib.httpMod.ServerResponse | responselikeLib.responselikeMod.namespaced, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_error(
    event: cacheableDashRequestLib.cacheableDashRequestLibStrings.error,
    listener: js.Function1[/* error */ RequestError | CacheError, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_request(
    event: cacheableDashRequestLib.cacheableDashRequestLibStrings.request,
    listener: js.Function1[/* request */ nodeLib.httpMod.ClientRequest, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_response(
    event: cacheableDashRequestLib.cacheableDashRequestLibStrings.response,
    listener: js.Function1[
      /* response */ nodeLib.httpMod.ServerResponse | responselikeLib.responselikeMod.namespaced, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(
    event: cacheableDashRequestLib.cacheableDashRequestLibStrings.error,
    listener: js.Function1[/* error */ RequestError | CacheError, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_request(
    event: cacheableDashRequestLib.cacheableDashRequestLibStrings.request,
    listener: js.Function1[/* request */ nodeLib.httpMod.ClientRequest, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_response(
    event: cacheableDashRequestLib.cacheableDashRequestLibStrings.response,
    listener: js.Function1[
      /* response */ nodeLib.httpMod.ServerResponse | responselikeLib.responselikeMod.namespaced, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(
    event: cacheableDashRequestLib.cacheableDashRequestLibStrings.error,
    listener: js.Function1[/* error */ RequestError | CacheError, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_request(
    event: cacheableDashRequestLib.cacheableDashRequestLibStrings.request,
    listener: js.Function1[/* request */ nodeLib.httpMod.ClientRequest, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_response(
    event: cacheableDashRequestLib.cacheableDashRequestLibStrings.response,
    listener: js.Function1[
      /* response */ nodeLib.httpMod.ServerResponse | responselikeLib.responselikeMod.namespaced, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("rawListeners")
  def rawListeners_error(event: cacheableDashRequestLib.cacheableDashRequestLibStrings.error): js.Array[js.Function1[/* error */ RequestError | CacheError, scala.Unit]] = js.native
  @JSName("rawListeners")
  def rawListeners_request(event: cacheableDashRequestLib.cacheableDashRequestLibStrings.request): js.Array[js.Function1[/* request */ nodeLib.httpMod.ClientRequest, scala.Unit]] = js.native
  @JSName("rawListeners")
  def rawListeners_response(event: cacheableDashRequestLib.cacheableDashRequestLibStrings.response): js.Array[
    js.Function1[
      /* response */ nodeLib.httpMod.ServerResponse | responselikeLib.responselikeMod.namespaced, 
      scala.Unit
    ]
  ] = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_error(event: cacheableDashRequestLib.cacheableDashRequestLibStrings.error): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_request(event: cacheableDashRequestLib.cacheableDashRequestLibStrings.request): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_response(event: cacheableDashRequestLib.cacheableDashRequestLibStrings.response): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(
    event: cacheableDashRequestLib.cacheableDashRequestLibStrings.error,
    listener: js.Function1[/* error */ RequestError | CacheError, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_request(
    event: cacheableDashRequestLib.cacheableDashRequestLibStrings.request,
    listener: js.Function1[/* request */ nodeLib.httpMod.ClientRequest, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_response(
    event: cacheableDashRequestLib.cacheableDashRequestLibStrings.response,
    listener: js.Function1[
      /* response */ nodeLib.httpMod.ServerResponse | responselikeLib.responselikeMod.namespaced, 
      scala.Unit
    ]
  ): this.type = js.native
}

