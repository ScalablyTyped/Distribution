package typings.azureMsalCommon.mod

import typings.azureMsalCommon.distAuthorityAuthorityOptionsMod.AuthorityOptions
import typings.azureMsalCommon.distCacheInterfaceIcachemanagerMod.ICacheManager
import typings.azureMsalCommon.distNetworkInetworkmoduleMod.INetworkModule
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "AuthorityFactory")
@js.native
open class AuthorityFactory ()
  extends typings.azureMsalCommon.distAuthorityAuthorityFactoryMod.AuthorityFactory
/* static members */
object AuthorityFactory {
  
  @JSImport("@azure/msal-common", "AuthorityFactory")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create an authority object of the correct type based on the url
    * Performs basic authority validation - checks to see if the authority is of a valid type (i.e. aad, b2c, adfs)
    *
    * Also performs endpoint discovery.
    *
    * @param authorityUri
    * @param networkClient
    * @param protocolMode
    */
  inline def createDiscoveredInstance(
    authorityUri: String,
    networkClient: INetworkModule,
    cacheManager: ICacheManager,
    authorityOptions: AuthorityOptions,
    logger: typings.azureMsalCommon.distLoggerLoggerMod.Logger
  ): js.Promise[typings.azureMsalCommon.distAuthorityAuthorityMod.Authority] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiscoveredInstance")(authorityUri.asInstanceOf[js.Any], networkClient.asInstanceOf[js.Any], cacheManager.asInstanceOf[js.Any], authorityOptions.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.azureMsalCommon.distAuthorityAuthorityMod.Authority]]
  inline def createDiscoveredInstance(
    authorityUri: String,
    networkClient: INetworkModule,
    cacheManager: ICacheManager,
    authorityOptions: AuthorityOptions,
    logger: typings.azureMsalCommon.distLoggerLoggerMod.Logger,
    performanceClient: Unit,
    correlationId: String
  ): js.Promise[typings.azureMsalCommon.distAuthorityAuthorityMod.Authority] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiscoveredInstance")(authorityUri.asInstanceOf[js.Any], networkClient.asInstanceOf[js.Any], cacheManager.asInstanceOf[js.Any], authorityOptions.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], performanceClient.asInstanceOf[js.Any], correlationId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.azureMsalCommon.distAuthorityAuthorityMod.Authority]]
  inline def createDiscoveredInstance(
    authorityUri: String,
    networkClient: INetworkModule,
    cacheManager: ICacheManager,
    authorityOptions: AuthorityOptions,
    logger: typings.azureMsalCommon.distLoggerLoggerMod.Logger,
    performanceClient: IPerformanceClient
  ): js.Promise[typings.azureMsalCommon.distAuthorityAuthorityMod.Authority] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiscoveredInstance")(authorityUri.asInstanceOf[js.Any], networkClient.asInstanceOf[js.Any], cacheManager.asInstanceOf[js.Any], authorityOptions.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], performanceClient.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.azureMsalCommon.distAuthorityAuthorityMod.Authority]]
  inline def createDiscoveredInstance(
    authorityUri: String,
    networkClient: INetworkModule,
    cacheManager: ICacheManager,
    authorityOptions: AuthorityOptions,
    logger: typings.azureMsalCommon.distLoggerLoggerMod.Logger,
    performanceClient: IPerformanceClient,
    correlationId: String
  ): js.Promise[typings.azureMsalCommon.distAuthorityAuthorityMod.Authority] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiscoveredInstance")(authorityUri.asInstanceOf[js.Any], networkClient.asInstanceOf[js.Any], cacheManager.asInstanceOf[js.Any], authorityOptions.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], performanceClient.asInstanceOf[js.Any], correlationId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.azureMsalCommon.distAuthorityAuthorityMod.Authority]]
  
  /**
    * Create an authority object of the correct type based on the url
    * Performs basic authority validation - checks to see if the authority is of a valid type (i.e. aad, b2c, adfs)
    *
    * Does not perform endpoint discovery.
    *
    * @param authorityUrl
    * @param networkInterface
    * @param protocolMode
    */
  inline def createInstance(
    authorityUrl: String,
    networkInterface: INetworkModule,
    cacheManager: ICacheManager,
    authorityOptions: AuthorityOptions,
    logger: typings.azureMsalCommon.distLoggerLoggerMod.Logger
  ): typings.azureMsalCommon.distAuthorityAuthorityMod.Authority = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(authorityUrl.asInstanceOf[js.Any], networkInterface.asInstanceOf[js.Any], cacheManager.asInstanceOf[js.Any], authorityOptions.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distAuthorityAuthorityMod.Authority]
  inline def createInstance(
    authorityUrl: String,
    networkInterface: INetworkModule,
    cacheManager: ICacheManager,
    authorityOptions: AuthorityOptions,
    logger: typings.azureMsalCommon.distLoggerLoggerMod.Logger,
    performanceClient: Unit,
    correlationId: String
  ): typings.azureMsalCommon.distAuthorityAuthorityMod.Authority = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(authorityUrl.asInstanceOf[js.Any], networkInterface.asInstanceOf[js.Any], cacheManager.asInstanceOf[js.Any], authorityOptions.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], performanceClient.asInstanceOf[js.Any], correlationId.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distAuthorityAuthorityMod.Authority]
  inline def createInstance(
    authorityUrl: String,
    networkInterface: INetworkModule,
    cacheManager: ICacheManager,
    authorityOptions: AuthorityOptions,
    logger: typings.azureMsalCommon.distLoggerLoggerMod.Logger,
    performanceClient: IPerformanceClient
  ): typings.azureMsalCommon.distAuthorityAuthorityMod.Authority = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(authorityUrl.asInstanceOf[js.Any], networkInterface.asInstanceOf[js.Any], cacheManager.asInstanceOf[js.Any], authorityOptions.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], performanceClient.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distAuthorityAuthorityMod.Authority]
  inline def createInstance(
    authorityUrl: String,
    networkInterface: INetworkModule,
    cacheManager: ICacheManager,
    authorityOptions: AuthorityOptions,
    logger: typings.azureMsalCommon.distLoggerLoggerMod.Logger,
    performanceClient: IPerformanceClient,
    correlationId: String
  ): typings.azureMsalCommon.distAuthorityAuthorityMod.Authority = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(authorityUrl.asInstanceOf[js.Any], networkInterface.asInstanceOf[js.Any], cacheManager.asInstanceOf[js.Any], authorityOptions.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], performanceClient.asInstanceOf[js.Any], correlationId.asInstanceOf[js.Any])).asInstanceOf[typings.azureMsalCommon.distAuthorityAuthorityMod.Authority]
}
