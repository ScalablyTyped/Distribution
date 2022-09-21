package typings.azureMsalCommon

import typings.azureMsalCommon.authorityMod.Authority
import typings.azureMsalCommon.cacheManagerMod.CacheManager
import typings.azureMsalCommon.ccsCredentialMod.CcsCredential
import typings.azureMsalCommon.clientConfigurationMod.ClientConfiguration
import typings.azureMsalCommon.clientConfigurationMod.CommonClientConfiguration
import typings.azureMsalCommon.icryptoMod.ICrypto
import typings.azureMsalCommon.inetworkmoduleMod.INetworkModule
import typings.azureMsalCommon.iperformanceclientMod.IPerformanceClient
import typings.azureMsalCommon.loggerMod.Logger
import typings.azureMsalCommon.networkManagerMod.NetworkManager
import typings.azureMsalCommon.networkManagerMod.NetworkResponse
import typings.azureMsalCommon.requestThumbprintMod.RequestThumbprint
import typings.azureMsalCommon.serverAuthorizationTokenResponseMod.ServerAuthorizationTokenResponse
import typings.azureMsalCommon.serverTelemetryManagerMod.ServerTelemetryManager
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseClientMod {
  
  @JSImport("@azure/msal-common/dist/client/BaseClient", "BaseClient")
  @js.native
  abstract class BaseClient protected () extends StObject {
    /* protected */ def this(configuration: ClientConfiguration) = this()
    /* protected */ def this(configuration: ClientConfiguration, performanceClient: IPerformanceClient) = this()
    
    var authority: Authority = js.native
    
    /* protected */ var cacheManager: CacheManager = js.native
    
    /* protected */ var config: CommonClientConfiguration = js.native
    
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
