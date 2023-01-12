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
}
