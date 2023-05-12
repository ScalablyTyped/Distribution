package typings.azureMsalCommon

import typings.azureMsalCommon.distNetworkNetworkManagerMod.NetworkResponse
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNetworkInetworkmoduleMod {
  
  @JSImport("@azure/msal-common/dist/network/INetworkModule", "StubbedNetworkModule")
  @js.native
  val StubbedNetworkModule: INetworkModule = js.native
  
  @js.native
  trait INetworkModule extends StObject {
    
    /**
      * Interface function for async network "GET" requests. Based on the Fetch standard: https://fetch.spec.whatwg.org/
      * @param url
      * @param requestParams
      * @param enableCaching
      */
    def sendGetRequestAsync[T](url: String): js.Promise[NetworkResponse[T]] = js.native
    def sendGetRequestAsync[T](url: String, options: Unit, cancellationToken: Double): js.Promise[NetworkResponse[T]] = js.native
    def sendGetRequestAsync[T](url: String, options: NetworkRequestOptions): js.Promise[NetworkResponse[T]] = js.native
    def sendGetRequestAsync[T](url: String, options: NetworkRequestOptions, cancellationToken: Double): js.Promise[NetworkResponse[T]] = js.native
    
    /**
      * Interface function for async network "POST" requests. Based on the Fetch standard: https://fetch.spec.whatwg.org/
      * @param url
      * @param requestParams
      * @param enableCaching
      */
    def sendPostRequestAsync[T](url: String): js.Promise[NetworkResponse[T]] = js.native
    def sendPostRequestAsync[T](url: String, options: NetworkRequestOptions): js.Promise[NetworkResponse[T]] = js.native
  }
  
  trait NetworkRequestOptions extends StObject {
    
    var body: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[Record[String, String]] = js.undefined
  }
  object NetworkRequestOptions {
    
    inline def apply(): NetworkRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkRequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NetworkRequestOptions] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    }
  }
}
