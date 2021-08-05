package typings.cacheableRequest

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.cacheableRequest.cacheableRequestStrings.error
import typings.cacheableRequest.cacheableRequestStrings.request
import typings.cacheableRequest.cacheableRequestStrings.response
import typings.keyv.mod.Store
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import typings.node.httpMod.ServerResponse
import typings.node.urlMod.URL_
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cacheable-request", JSImport.Namespace)
  @js.native
  val ^ : js.Object & CacheableRequest = js.native
  
  type CacheError = CacheErrorCls
  
  trait CacheErrorCls
    extends StObject
       with Error {
    
    @JSName("name")
    val name_CacheErrorCls: typings.cacheableRequest.cacheableRequestStrings.CacheError
  }
  object CacheErrorCls {
    
    inline def apply(message: String): CacheErrorCls = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = "CacheError")
      __obj.asInstanceOf[CacheErrorCls]
    }
    
    extension [Self <: CacheErrorCls](x: Self) {
      
      inline def setName(value: typings.cacheableRequest.cacheableRequestStrings.CacheError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CacheableRequest
    extends StObject
       with Instantiable1[
          /* requestFn */ RequestFn, 
          js.Function2[
            /* opts */ String | URL_ | (RequestOptions & typings.httpCacheSemantics.mod.Options), 
            /* cb */ js.UndefOr[js.Function1[/* response */ ServerResponse | typings.responselike.mod.^, Unit]], 
            Emitter
          ]
        ]
       with Instantiable2[
          /* requestFn */ RequestFn, 
          (/* storageAdapter */ StorageAdapter) | (/* storageAdapter */ String), 
          js.Function2[
            (RequestOptions & typings.httpCacheSemantics.mod.Options) | String | URL_, 
            js.UndefOr[js.Function1[ServerResponse | typings.responselike.mod.^, Unit]], 
            Emitter
          ]
        ] {
    
    var CacheError: Instantiable1[/* error */ Error, CacheErrorCls] = js.native
    
    var RequestError: Instantiable1[/* error */ Error, RequestErrorCls] = js.native
  }
  
  @js.native
  trait Emitter extends EventEmitter {
    
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* error */ RequestError | CacheError, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_request(event: request, listener: js.Function1[/* request */ ClientRequest, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_response(
      event: response,
      listener: js.Function1[/* response */ ServerResponse | typings.responselike.mod.^, Unit]
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
    def listeners_response(event: response): js.Array[js.Function1[/* response */ ServerResponse | typings.responselike.mod.^, Unit]] = js.native
    
    @JSName("off")
    def off_error(event: error, listener: js.Function1[/* error */ RequestError | CacheError, Unit]): this.type = js.native
    @JSName("off")
    def off_request(event: request, listener: js.Function1[/* request */ ClientRequest, Unit]): this.type = js.native
    @JSName("off")
    def off_response(
      event: response,
      listener: js.Function1[/* response */ ServerResponse | typings.responselike.mod.^, Unit]
    ): this.type = js.native
    
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* error */ RequestError | CacheError, Unit]): this.type = js.native
    @JSName("on")
    def on_request(event: request, listener: js.Function1[/* request */ ClientRequest, Unit]): this.type = js.native
    @JSName("on")
    def on_response(
      event: response,
      listener: js.Function1[/* response */ ServerResponse | typings.responselike.mod.^, Unit]
    ): this.type = js.native
    
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* error */ RequestError | CacheError, Unit]): this.type = js.native
    @JSName("once")
    def once_request(event: request, listener: js.Function1[/* request */ ClientRequest, Unit]): this.type = js.native
    @JSName("once")
    def once_response(
      event: response,
      listener: js.Function1[/* response */ ServerResponse | typings.responselike.mod.^, Unit]
    ): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* error */ RequestError | CacheError, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_request(event: request, listener: js.Function1[/* request */ ClientRequest, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_response(
      event: response,
      listener: js.Function1[/* response */ ServerResponse | typings.responselike.mod.^, Unit]
    ): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* error */ RequestError | CacheError, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_request(event: request, listener: js.Function1[/* request */ ClientRequest, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_response(
      event: response,
      listener: js.Function1[/* response */ ServerResponse | typings.responselike.mod.^, Unit]
    ): this.type = js.native
    
    @JSName("rawListeners")
    def rawListeners_error(event: error): js.Array[js.Function1[/* error */ RequestError | CacheError, Unit]] = js.native
    @JSName("rawListeners")
    def rawListeners_request(event: request): js.Array[js.Function1[/* request */ ClientRequest, Unit]] = js.native
    @JSName("rawListeners")
    def rawListeners_response(event: response): js.Array[js.Function1[/* response */ ServerResponse | typings.responselike.mod.^, Unit]] = js.native
    
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
      listener: js.Function1[/* response */ ServerResponse | typings.responselike.mod.^, Unit]
    ): this.type = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * When set to `true`, if the DB connection fails we will automatically fallback to a network request.
      * DB errors will still be emitted to notify you of the problem even though the request callback may succeed.
      * @default false
      */
    var automaticFailover: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If the cache should be used. Setting this to `false` will completely bypass the cache for the current request.
      * @default true
      */
    var cache: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Forces refreshing the cache. If the response could be retrieved from the cache, it will perform a
      * new request and override the cache instead.
      * @default false
      */
    var forceRefresh: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Limits TTL. The `number` represents milliseconds.
      * @default undefined
      */
    var maxTtl: js.UndefOr[Double] = js.undefined
    
    /**
      * If set to `true` once a cached resource has expired it is deleted and will have to be re-requested.
      *
      * If set to `false`, after a cached resource's TTL expires it is kept in the cache and will be revalidated
      * on the next request with `If-None-Match`/`If-Modified-Since` headers.
      * @default false
      */
    var strictTtl: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAutomaticFailover(value: Boolean): Self = StObject.set(x, "automaticFailover", value.asInstanceOf[js.Any])
      
      inline def setAutomaticFailoverUndefined: Self = StObject.set(x, "automaticFailover", js.undefined)
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setForceRefresh(value: Boolean): Self = StObject.set(x, "forceRefresh", value.asInstanceOf[js.Any])
      
      inline def setForceRefreshUndefined: Self = StObject.set(x, "forceRefresh", js.undefined)
      
      inline def setMaxTtl(value: Double): Self = StObject.set(x, "maxTtl", value.asInstanceOf[js.Any])
      
      inline def setMaxTtlUndefined: Self = StObject.set(x, "maxTtl", js.undefined)
      
      inline def setStrictTtl(value: Boolean): Self = StObject.set(x, "strictTtl", value.asInstanceOf[js.Any])
      
      inline def setStrictTtlUndefined: Self = StObject.set(x, "strictTtl", js.undefined)
    }
  }
  
  type RequestError = RequestErrorCls
  
  trait RequestErrorCls
    extends StObject
       with Error {
    
    @JSName("name")
    val name_RequestErrorCls: typings.cacheableRequest.cacheableRequestStrings.RequestError
  }
  object RequestErrorCls {
    
    inline def apply(message: String): RequestErrorCls = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = "RequestError")
      __obj.asInstanceOf[RequestErrorCls]
    }
    
    extension [Self <: RequestErrorCls](x: Self) {
      
      inline def setName(value: typings.cacheableRequest.cacheableRequestStrings.RequestError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RequestFn extends StObject {
    
    def apply(options: String): ClientRequest = js.native
    def apply(options: String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def apply(options: RequestOptions): ClientRequest = js.native
    def apply(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def apply(options: URL_): ClientRequest = js.native
    def apply(options: URL_, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def apply(url: String, options: RequestOptions): ClientRequest = js.native
    def apply(url: String, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def apply(url: URL_, options: RequestOptions): ClientRequest = js.native
    def apply(url: URL_, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  }
  
  type StorageAdapter = Store[js.Any]
  
  type _To = js.Object & CacheableRequest
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & CacheableRequest = ^
}
