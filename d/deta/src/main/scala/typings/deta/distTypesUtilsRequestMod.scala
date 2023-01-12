package typings.deta

import org.scalablytyped.runtime.StringDictionary
import typings.deta.distTypesTypesKeyMod.KeyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsRequestMod {
  
  @JSImport("deta/dist/types/utils/request", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Requests {
    def this(key: String, `type`: KeyType, baseURL: String) = this()
  }
  /* static members */
  object default {
    
    @JSImport("deta/dist/types/utils/request", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("deta/dist/types/utils/request", "default.fetch")
    @js.native
    def fetch: Any = js.native
    inline def fetch_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fetch")(x.asInstanceOf[js.Any])
  }
  
  trait GetConfig extends StObject {
    
    var blobResponse: Boolean
  }
  object GetConfig {
    
    inline def apply(blobResponse: Boolean): GetConfig = {
      val __obj = js.Dynamic.literal(blobResponse = blobResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetConfig] (val x: Self) extends AnyVal {
      
      inline def setBlobResponse(value: Boolean): Self = StObject.set(x, "blobResponse", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestInit extends StObject {
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var payload: js.UndefOr[Any] = js.undefined
  }
  object RequestInit {
    
    inline def apply(): RequestInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestInit] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    }
  }
  
  @js.native
  trait Requests extends StObject {
    
    def delete(uri: String): js.Promise[Response] = js.native
    def delete(uri: String, payload: Any): js.Promise[Response] = js.native
    
    def get(uri: String): js.Promise[Response] = js.native
    def get(uri: String, config: GetConfig): js.Promise[Response] = js.native
    
    def patch(uri: String): js.Promise[Response] = js.native
    def patch(uri: String, payload: Any): js.Promise[Response] = js.native
    
    def post(uri: String, init: RequestInit): js.Promise[Response] = js.native
    
    def put(uri: String, payload: Any): js.Promise[Response] = js.native
    
    /* private */ var requestConfig: Any = js.native
  }
  
  trait Response extends StObject {
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var response: js.UndefOr[Any] = js.undefined
    
    var status: Double
  }
  object Response {
    
    inline def apply(status: Double): Response = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
