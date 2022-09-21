package typings.azureMsalCommon

import typings.azureMsalCommon.authenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.baseClientMod.BaseClient
import typings.azureMsalCommon.clientConfigurationMod.ClientConfiguration
import typings.azureMsalCommon.commonSilentFlowRequestMod.CommonSilentFlowRequest
import typings.azureMsalCommon.iperformanceclientMod.IPerformanceClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object silentFlowClientMod {
  
  @JSImport("@azure/msal-common/dist/client/SilentFlowClient", "SilentFlowClient")
  @js.native
  open class SilentFlowClient protected () extends BaseClient {
    def this(configuration: ClientConfiguration) = this()
    def this(configuration: ClientConfiguration, performanceClient: IPerformanceClient) = this()
    
    /**
      * Retrieves token from cache or throws an error if it must be refreshed.
      * @param request
      */
    def acquireCachedToken(request: CommonSilentFlowRequest): js.Promise[AuthenticationResult] = js.native
    
    /**
      * Retrieves a token from cache if it is still valid, or uses the cached refresh token to renew
      * the given token and returns the renewed token
      * @param request
      */
    def acquireToken(request: CommonSilentFlowRequest): js.Promise[AuthenticationResult] = js.native
    
    /**
      * Helper function to build response object from the CacheRecord
      * @param cacheRecord
      */
    /* private */ var generateResultFromCacheRecord: Any = js.native
  }
}
