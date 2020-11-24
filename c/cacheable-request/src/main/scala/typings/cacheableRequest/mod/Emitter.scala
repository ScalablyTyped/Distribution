package typings.cacheableRequest.mod

import typings.cacheableRequest.cacheableRequestStrings.error
import typings.cacheableRequest.cacheableRequestStrings.request
import typings.cacheableRequest.cacheableRequestStrings.response
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Emitter extends EventEmitter {
  
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* error */ RequestError | CacheError, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_request(event: request, listener: js.Function1[/* request */ ClientRequest, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_response(
    event: response,
    listener: js.Function1[/* response */ ServerResponse | typings.responselike.mod.^ , Unit]
  ): this.type = js.native
  
  @JSName("emit")
  def emit_error(event: error, error: CacheError): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, error: RequestError): Boolean = js.native
  @JSName("emit")
  def emit_request(event: request, request: ClientRequest): Boolean = js.native
  @JSName("emit")
  def emit_response(event: response, response: ServerResponse): Boolean = js.native
  @JSName("emit")
  def emit_response(event: response, response: typings.responselike.mod.^): Boolean = js.native
  
  @JSName("listenerCount")
  def listenerCount_error(`type`: error): Double = js.native
  @JSName("listenerCount")
  def listenerCount_request(`type`: request): Double = js.native
  @JSName("listenerCount")
  def listenerCount_response(`type`: response): Double = js.native
  
  @JSName("listeners")
  def listeners_error(event: error): js.Array[js.Function1[/* error */ RequestError | CacheError, Unit]] = js.native
  @JSName("listeners")
  def listeners_request(event: request): js.Array[js.Function1[/* request */ ClientRequest, Unit]] = js.native
  @JSName("listeners")
  def listeners_response(event: response): js.Array[js.Function1[/* response */ ServerResponse | typings.responselike.mod.^ , Unit]] = js.native
  
  @JSName("off")
  def off_error(event: error, listener: js.Function1[/* error */ RequestError | CacheError, Unit]): this.type = js.native
  @JSName("off")
  def off_request(event: request, listener: js.Function1[/* request */ ClientRequest, Unit]): this.type = js.native
  @JSName("off")
  def off_response(
    event: response,
    listener: js.Function1[/* response */ ServerResponse | typings.responselike.mod.^ , Unit]
  ): this.type = js.native
  
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ RequestError | CacheError, Unit]): this.type = js.native
  @JSName("on")
  def on_request(event: request, listener: js.Function1[/* request */ ClientRequest, Unit]): this.type = js.native
  @JSName("on")
  def on_response(
    event: response,
    listener: js.Function1[/* response */ ServerResponse | typings.responselike.mod.^ , Unit]
  ): this.type = js.native
  
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* error */ RequestError | CacheError, Unit]): this.type = js.native
  @JSName("once")
  def once_request(event: request, listener: js.Function1[/* request */ ClientRequest, Unit]): this.type = js.native
  @JSName("once")
  def once_response(
    event: response,
    listener: js.Function1[/* response */ ServerResponse | typings.responselike.mod.^ , Unit]
  ): this.type = js.native
  
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* error */ RequestError | CacheError, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_request(event: request, listener: js.Function1[/* request */ ClientRequest, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_response(
    event: response,
    listener: js.Function1[/* response */ ServerResponse | typings.responselike.mod.^ , Unit]
  ): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* error */ RequestError | CacheError, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_request(event: request, listener: js.Function1[/* request */ ClientRequest, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_response(
    event: response,
    listener: js.Function1[/* response */ ServerResponse | typings.responselike.mod.^ , Unit]
  ): this.type = js.native
  
  @JSName("rawListeners")
  def rawListeners_error(event: error): js.Array[js.Function1[/* error */ RequestError | CacheError, Unit]] = js.native
  @JSName("rawListeners")
  def rawListeners_request(event: request): js.Array[js.Function1[/* request */ ClientRequest, Unit]] = js.native
  @JSName("rawListeners")
  def rawListeners_response(event: response): js.Array[js.Function1[/* response */ ServerResponse | typings.responselike.mod.^ , Unit]] = js.native
  
  @JSName("removeAllListeners")
  def removeAllListeners_error(event: error): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_request(event: request): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_response(event: response): this.type = js.native
  
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function1[/* error */ RequestError | CacheError, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_request(event: request, listener: js.Function1[/* request */ ClientRequest, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_response(
    event: response,
    listener: js.Function1[/* response */ ServerResponse | typings.responselike.mod.^ , Unit]
  ): this.type = js.native
}
