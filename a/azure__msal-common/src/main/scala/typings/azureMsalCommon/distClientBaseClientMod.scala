package typings.azureMsalCommon

import typings.azureMsalCommon.distAccountCcsCredentialMod.CcsCredential
import typings.azureMsalCommon.distAuthorityAuthorityMod.Authority
import typings.azureMsalCommon.distCacheCacheManagerMod.CacheManager
import typings.azureMsalCommon.distConfigClientConfigurationMod.ClientConfiguration
import typings.azureMsalCommon.distConfigClientConfigurationMod.CommonClientConfiguration
import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.azureMsalCommon.distLoggerLoggerMod.Logger
import typings.azureMsalCommon.distNetworkInetworkmoduleMod.INetworkModule
import typings.azureMsalCommon.distNetworkNetworkManagerMod.NetworkManager
import typings.azureMsalCommon.distNetworkNetworkManagerMod.NetworkResponse
import typings.azureMsalCommon.distNetworkRequestThumbprintMod.RequestThumbprint
import typings.azureMsalCommon.distRequestBaseAuthRequestMod.BaseAuthRequest
import typings.azureMsalCommon.distResponseServerAuthorizationTokenResponseMod.ServerAuthorizationTokenResponse
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import typings.azureMsalCommon.distTelemetryServerServerTelemetryManagerMod.ServerTelemetryManager
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientBaseClientMod {
  
  /* note: abstract class */ @JSImport("@azure/msal-common/dist/client/BaseClient", "BaseClient")
  @js.native
  open class BaseClient protected () extends StObject {
    /* protected */ def this(configuration: ClientConfiguration) = this()
    /* protected */ def this(configuration: ClientConfiguration, performanceClient: IPerformanceClient) = this()
    
    var authority: Authority = js.native
    
    /* protected */ var cacheManager: CacheManager = js.native
    
    /* protected */ var config: CommonClientConfiguration = js.native
    
    /**
      * Creates query string for the /token request
      * @param request
      */
    def createTokenQueryParameters(request: BaseAuthRequest): String = js.native
    
    /**
      * Creates default headers for requests to token endpoint
      */
    /* protected */ def createTokenRequestHeaders(): Record[String, String] = js.native
    /* protected */ def createTokenRequestHeaders(ccsCred: CcsCredential): Record[String, String] = js.native
    
    /* protected */ var cryptoUtils: ICrypto = js.native
    
    /**
      * Http post to token endpoint
      * @param tokenEndpoint
      * @param queryString
      * @param headers
      * @param thumbprint
      */
    /* protected */ def executePostToTokenEndpoint(
      tokenEndpoint: String,
      queryString: String,
      headers: Record[String, String],
      thumbprint: RequestThumbprint
    ): js.Promise[NetworkResponse[ServerAuthorizationTokenResponse]] = js.native
    
    var logger: Logger = js.native
    
    /* protected */ var networkClient: INetworkModule = js.native
    
    /* protected */ var networkManager: NetworkManager = js.native
    
    /* protected */ var performanceClient: js.UndefOr[IPerformanceClient] = js.native
    
    /* protected */ var serverTelemetryManager: ServerTelemetryManager | Null = js.native
    
    /**
      * Updates the authority object of the client. Endpoint discovery must be completed.
      * @param updatedAuthority
      */
    def updateAuthority(updatedAuthority: Authority): Unit = js.native
  }
}
