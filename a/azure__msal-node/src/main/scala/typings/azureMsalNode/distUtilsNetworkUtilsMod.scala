package typings.azureMsalNode

import typings.azureMsalCommon.distNetworkNetworkManagerMod.NetworkResponse
import typings.azureMsalCommon.distNetworkNetworkManagerMod.UrlToHttpRequestOptions
import typings.std.Record
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsNetworkUtilsMod {
  
  @JSImport("@azure/msal-node/dist/utils/NetworkUtils", "NetworkUtils")
  @js.native
  open class NetworkUtils () extends StObject
  /* static members */
  object NetworkUtils {
    
    @JSImport("@azure/msal-node/dist/utils/NetworkUtils", "NetworkUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getNetworkResponse[T](headers: Record[String, String], body: T, statusCode: Double): NetworkResponse[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkResponse")(headers.asInstanceOf[js.Any], body.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any])).asInstanceOf[NetworkResponse[T]]
    
    inline def urlToHttpOptions(url: URL): UrlToHttpRequestOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("urlToHttpOptions")(url.asInstanceOf[js.Any]).asInstanceOf[UrlToHttpRequestOptions]
  }
}
