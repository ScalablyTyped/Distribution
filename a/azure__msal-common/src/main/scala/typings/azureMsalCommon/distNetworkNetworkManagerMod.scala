package typings.azureMsalCommon

import typings.azureMsalCommon.distCacheCacheManagerMod.CacheManager
import typings.azureMsalCommon.distNetworkInetworkmoduleMod.INetworkModule
import typings.azureMsalCommon.distNetworkInetworkmoduleMod.NetworkRequestOptions
import typings.azureMsalCommon.distNetworkRequestThumbprintMod.RequestThumbprint
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNetworkNetworkManagerMod {
  
  @JSImport("@azure/msal-common/dist/network/NetworkManager", "NetworkManager")
  @js.native
  open class NetworkManager protected () extends StObject {
    def this(networkClient: INetworkModule, cacheManager: CacheManager) = this()
    
    /* private */ var cacheManager: Any = js.native
    
    /* private */ var networkClient: Any = js.native
    
    /**
      * Wraps sendPostRequestAsync with necessary preflight and postflight logic
      * @param thumbprint
      * @param tokenEndpoint
      * @param options
      */
    def sendPostRequest[T](thumbprint: RequestThumbprint, tokenEndpoint: String, options: NetworkRequestOptions): js.Promise[NetworkResponse[T]] = js.native
  }
  
  trait NetworkResponse[T] extends StObject {
    
    var body: T
    
    var headers: Record[String, String]
    
    var status: Double
  }
  object NetworkResponse {
    
    inline def apply[T](body: T, headers: Record[String, String], status: Double): NetworkResponse[T] = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkResponse[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NetworkResponse[?], T] (val x: Self & NetworkResponse[T]) extends AnyVal {
      
      inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait UrlToHttpRequestOptions extends StObject {
    
    var auth: js.UndefOr[String] = js.undefined
    
    var hash: String
    
    var hostname: String
    
    var href: String
    
    var path: String
    
    var pathname: String
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: String
    
    var search: String
  }
  object UrlToHttpRequestOptions {
    
    inline def apply(
      hash: String,
      hostname: String,
      href: String,
      path: String,
      pathname: String,
      protocol: String,
      search: String
    ): UrlToHttpRequestOptions = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlToHttpRequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UrlToHttpRequestOptions] (val x: Self) extends AnyVal {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
}
