package typings.awsSdkMiddlewareEndpointDiscovery

import org.scalablytyped.runtime.Instantiable1
import typings.awsSdkEndpointCache.mod.EndpointCache
import typings.awsSdkTypes.anon.ForceRefresh
import typings.awsSdkTypes.distTypesIdentityAwsCredentialIdentityMod.AwsCredentialIdentity
import typings.awsSdkTypes.distTypesUtilMod.MemoizedProvider
import typings.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResolveEndpointDiscoveryConfigMod {
  
  @JSImport("@aws-sdk/middleware-endpoint-discovery/dist-types/resolveEndpointDiscoveryConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveEndpointDiscoveryConfig[T](
    input: T & PreviouslyResolved & EndpointDiscoveryInputConfig,
    param1: EndpointDiscoveryConfigOptions
  ): T & EndpointDiscoveryResolvedConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveEndpointDiscoveryConfig")(input.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[T & EndpointDiscoveryResolvedConfig]
  
  trait EndpointDiscoveryConfigOptions extends StObject {
    
    /**
      * The constructor of the Command used for discovering endpoints.
      */
    var endpointDiscoveryCommandCtor: Instantiable1[/* comandConfig */ Any, Any]
  }
  object EndpointDiscoveryConfigOptions {
    
    inline def apply(endpointDiscoveryCommandCtor: Instantiable1[/* comandConfig */ Any, Any]): EndpointDiscoveryConfigOptions = {
      val __obj = js.Dynamic.literal(endpointDiscoveryCommandCtor = endpointDiscoveryCommandCtor.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointDiscoveryConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EndpointDiscoveryConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setEndpointDiscoveryCommandCtor(value: Instantiable1[/* comandConfig */ Any, Any]): Self = StObject.set(x, "endpointDiscoveryCommandCtor", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndpointDiscoveryInputConfig extends StObject {
    
    /**
      * The size of the client cache storing endpoints from endpoint discovery operations.
      * Defaults to 1000.
      */
    var endpointCacheSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to call operations with endpoints given by service dynamically.
      * Setting this config to `true` will enable endpoint discovery for all applicable operations.
      * Setting it to `false` will explicitly disable endpoint discovery even though operations that
      * require endpoint discovery will presumably fail. Leaving it to undefined means SDK only do
      * endpoint discovery when it's required. Defaults to `undefined`.
      */
    var endpointDiscoveryEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object EndpointDiscoveryInputConfig {
    
    inline def apply(): EndpointDiscoveryInputConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointDiscoveryInputConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EndpointDiscoveryInputConfig] (val x: Self) extends AnyVal {
      
      inline def setEndpointCacheSize(value: Double): Self = StObject.set(x, "endpointCacheSize", value.asInstanceOf[js.Any])
      
      inline def setEndpointCacheSizeUndefined: Self = StObject.set(x, "endpointCacheSize", js.undefined)
      
      inline def setEndpointDiscoveryEnabled(value: Boolean): Self = StObject.set(x, "endpointDiscoveryEnabled", value.asInstanceOf[js.Any])
      
      inline def setEndpointDiscoveryEnabledUndefined: Self = StObject.set(x, "endpointDiscoveryEnabled", js.undefined)
    }
  }
  
  trait EndpointDiscoveryResolvedConfig extends StObject {
    
    /**
      * LRU Cache which stores endpoints from endpoint discovery operations.
      * The size is either provided by {@link EndpointDiscoveryInputConfig.endpointCacheSize}.
      */
    var endpointCache: EndpointCache
    
    /**
      * The constructor of the Command used for discovering endpoints.
      * @internal
      */
    var endpointDiscoveryCommandCtor: Instantiable1[/* comandConfig */ Any, Any]
    
    /**
      * Resolved value for input config {@link EndpointDiscoveryInputConfig.endpointDiscoveryEnabled}.
      */
    def endpointDiscoveryEnabled(): js.Promise[js.UndefOr[Boolean]]
    /**
      * Resolved value for input config {@link EndpointDiscoveryInputConfig.endpointDiscoveryEnabled}.
      */
    @JSName("endpointDiscoveryEnabled")
    var endpointDiscoveryEnabled_Original: Provider[js.UndefOr[Boolean]]
    
    /**
      * Stores whether endpoint discovery configuration is set locally by passing
      * {@link EndpointDiscoveryInputConfig.endpointDiscoveryEnabled} during client creation.
      * @internal
      */
    var isClientEndpointDiscoveryEnabled: Boolean
  }
  object EndpointDiscoveryResolvedConfig {
    
    inline def apply(
      endpointCache: EndpointCache,
      endpointDiscoveryCommandCtor: Instantiable1[/* comandConfig */ Any, Any],
      endpointDiscoveryEnabled: () => js.Promise[js.UndefOr[Boolean]],
      isClientEndpointDiscoveryEnabled: Boolean
    ): EndpointDiscoveryResolvedConfig = {
      val __obj = js.Dynamic.literal(endpointCache = endpointCache.asInstanceOf[js.Any], endpointDiscoveryCommandCtor = endpointDiscoveryCommandCtor.asInstanceOf[js.Any], endpointDiscoveryEnabled = js.Any.fromFunction0(endpointDiscoveryEnabled), isClientEndpointDiscoveryEnabled = isClientEndpointDiscoveryEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointDiscoveryResolvedConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EndpointDiscoveryResolvedConfig] (val x: Self) extends AnyVal {
      
      inline def setEndpointCache(value: EndpointCache): Self = StObject.set(x, "endpointCache", value.asInstanceOf[js.Any])
      
      inline def setEndpointDiscoveryCommandCtor(value: Instantiable1[/* comandConfig */ Any, Any]): Self = StObject.set(x, "endpointDiscoveryCommandCtor", value.asInstanceOf[js.Any])
      
      inline def setEndpointDiscoveryEnabled(value: () => js.Promise[js.UndefOr[Boolean]]): Self = StObject.set(x, "endpointDiscoveryEnabled", js.Any.fromFunction0(value))
      
      inline def setIsClientEndpointDiscoveryEnabled(value: Boolean): Self = StObject.set(x, "isClientEndpointDiscoveryEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait PreviouslyResolved extends StObject {
    
    def credentials(): js.Promise[AwsCredentialIdentity]
    def credentials(options: ForceRefresh): js.Promise[AwsCredentialIdentity]
    @JSName("credentials")
    var credentials_Original: MemoizedProvider[AwsCredentialIdentity]
    
    def endpointDiscoveryEnabledProvider(): js.Promise[js.UndefOr[Boolean]]
    @JSName("endpointDiscoveryEnabledProvider")
    var endpointDiscoveryEnabledProvider_Original: Provider[js.UndefOr[Boolean]]
    
    var isCustomEndpoint: js.UndefOr[Boolean] = js.undefined
  }
  object PreviouslyResolved {
    
    inline def apply(
      credentials: /* options */ js.UndefOr[ForceRefresh] => js.Promise[AwsCredentialIdentity],
      endpointDiscoveryEnabledProvider: () => js.Promise[js.UndefOr[Boolean]]
    ): PreviouslyResolved = {
      val __obj = js.Dynamic.literal(credentials = js.Any.fromFunction1(credentials), endpointDiscoveryEnabledProvider = js.Any.fromFunction0(endpointDiscoveryEnabledProvider))
      __obj.asInstanceOf[PreviouslyResolved]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreviouslyResolved] (val x: Self) extends AnyVal {
      
      inline def setCredentials(value: /* options */ js.UndefOr[ForceRefresh] => js.Promise[AwsCredentialIdentity]): Self = StObject.set(x, "credentials", js.Any.fromFunction1(value))
      
      inline def setEndpointDiscoveryEnabledProvider(value: () => js.Promise[js.UndefOr[Boolean]]): Self = StObject.set(x, "endpointDiscoveryEnabledProvider", js.Any.fromFunction0(value))
      
      inline def setIsCustomEndpoint(value: Boolean): Self = StObject.set(x, "isCustomEndpoint", value.asInstanceOf[js.Any])
      
      inline def setIsCustomEndpointUndefined: Self = StObject.set(x, "isCustomEndpoint", js.undefined)
    }
  }
}
