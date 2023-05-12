package typings.awsSdkMiddlewareEndpointDiscovery

import typings.awsSdkMiddlewareEndpointDiscovery.anon.Credentials
import typings.awsSdkMiddlewareEndpointDiscovery.anon.Identifiers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGetCacheKeyMod {
  
  @JSImport("@aws-sdk/middleware-endpoint-discovery/dist-types/getCacheKey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCacheKey(commandName: String, config: Credentials, options: Identifiers): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCacheKey")(commandName.asInstanceOf[js.Any], config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
