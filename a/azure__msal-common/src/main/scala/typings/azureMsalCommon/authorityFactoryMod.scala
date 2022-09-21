package typings.azureMsalCommon

import typings.azureMsalCommon.authorityMod.Authority
import typings.azureMsalCommon.authorityOptionsMod.AuthorityOptions
import typings.azureMsalCommon.icachemanagerMod.ICacheManager
import typings.azureMsalCommon.inetworkmoduleMod.INetworkModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authorityFactoryMod {
  
  @JSImport("@azure/msal-common/dist/authority/AuthorityFactory", "AuthorityFactory")
  @js.native
  open class AuthorityFactory () extends StObject
  /* static members */
  object AuthorityFactory {
    
    @JSImport("@azure/msal-common/dist/authority/AuthorityFactory", "AuthorityFactory")
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
      authorityOptions: AuthorityOptions
    ): js.Promise[Authority] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiscoveredInstance")(authorityUri.asInstanceOf[js.Any], networkClient.asInstanceOf[js.Any], cacheManager.asInstanceOf[js.Any], authorityOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Authority]]
    inline def createDiscoveredInstance(
      authorityUri: String,
      networkClient: INetworkModule,
      cacheManager: ICacheManager,
      authorityOptions: AuthorityOptions,
      proxyUrl: String
    ): js.Promise[Authority] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiscoveredInstance")(authorityUri.asInstanceOf[js.Any], networkClient.asInstanceOf[js.Any], cacheManager.asInstanceOf[js.Any], authorityOptions.asInstanceOf[js.Any], proxyUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Authority]]
    
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
      authorityOptions: AuthorityOptions
    ): Authority = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(authorityUrl.asInstanceOf[js.Any], networkInterface.asInstanceOf[js.Any], cacheManager.asInstanceOf[js.Any], authorityOptions.asInstanceOf[js.Any])).asInstanceOf[Authority]
    inline def createInstance(
      authorityUrl: String,
      networkInterface: INetworkModule,
      cacheManager: ICacheManager,
      authorityOptions: AuthorityOptions,
      proxyUrl: String
    ): Authority = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(authorityUrl.asInstanceOf[js.Any], networkInterface.asInstanceOf[js.Any], cacheManager.asInstanceOf[js.Any], authorityOptions.asInstanceOf[js.Any], proxyUrl.asInstanceOf[js.Any])).asInstanceOf[Authority]
  }
}
