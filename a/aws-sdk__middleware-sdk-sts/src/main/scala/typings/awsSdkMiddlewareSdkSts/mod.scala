package typings.awsSdkMiddlewareSdkSts

import org.scalablytyped.runtime.Instantiable1
import typings.awsSdkMiddlewareSigning.distTypesConfigurationsMod.AwsAuthInputConfig
import typings.awsSdkMiddlewareSigning.distTypesConfigurationsMod.AwsAuthResolvedConfig
import typings.awsSdkTypes.distTypesClientMod.Client
import typings.awsSdkTypes.distTypesCredentialsMod.Credentials
import typings.awsSdkTypes.distTypesCryptoMod.HashConstructor
import typings.awsSdkTypes.distTypesUtilMod.Provider
import typings.awsSdkTypes.distTypesUtilMod.RegionInfo
import typings.awsSdkTypes.distTypesUtilMod.RegionInfoProvider
import typings.awsSdkTypes.distTypesUtilMod.RegionInfoProviderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-sdk-sts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveStsAuthConfig[T](input: T & PreviouslyResolved & StsAuthInputConfig, hasStsClientCtor: StsAuthConfigOptions): T & StsAuthResolvedConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveStsAuthConfig")(input.asInstanceOf[js.Any], hasStsClientCtor.asInstanceOf[js.Any])).asInstanceOf[T & StsAuthResolvedConfig]
  
  trait PreviouslyResolved extends StObject {
    
    def credentialDefaultProvider(input: Any): Provider[Credentials]
    
    var region: String | Provider[String]
    
    var regionInfoProvider: js.UndefOr[RegionInfoProvider] = js.undefined
    
    var serviceId: String
    
    var sha256: HashConstructor
    
    var signingName: js.UndefOr[String] = js.undefined
    
    def useDualstackEndpoint(): js.Promise[Boolean]
    @JSName("useDualstackEndpoint")
    var useDualstackEndpoint_Original: Provider[Boolean]
    
    def useFipsEndpoint(): js.Promise[Boolean]
    @JSName("useFipsEndpoint")
    var useFipsEndpoint_Original: Provider[Boolean]
  }
  object PreviouslyResolved {
    
    inline def apply(
      credentialDefaultProvider: Any => Provider[Credentials],
      region: String | Provider[String],
      serviceId: String,
      sha256: HashConstructor,
      useDualstackEndpoint: () => js.Promise[Boolean],
      useFipsEndpoint: () => js.Promise[Boolean]
    ): PreviouslyResolved = {
      val __obj = js.Dynamic.literal(credentialDefaultProvider = js.Any.fromFunction1(credentialDefaultProvider), region = region.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], useDualstackEndpoint = js.Any.fromFunction0(useDualstackEndpoint), useFipsEndpoint = js.Any.fromFunction0(useFipsEndpoint))
      __obj.asInstanceOf[PreviouslyResolved]
    }
    
    extension [Self <: PreviouslyResolved](x: Self) {
      
      inline def setCredentialDefaultProvider(value: Any => Provider[Credentials]): Self = StObject.set(x, "credentialDefaultProvider", js.Any.fromFunction1(value))
      
      inline def setRegion(value: String | Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionFunction0(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      inline def setRegionInfoProvider(
        value: (/* region */ String, /* options */ js.UndefOr[RegionInfoProviderOptions]) => js.Promise[js.UndefOr[RegionInfo]]
      ): Self = StObject.set(x, "regionInfoProvider", js.Any.fromFunction2(value))
      
      inline def setRegionInfoProviderUndefined: Self = StObject.set(x, "regionInfoProvider", js.undefined)
      
      inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      inline def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      inline def setSigningName(value: String): Self = StObject.set(x, "signingName", value.asInstanceOf[js.Any])
      
      inline def setSigningNameUndefined: Self = StObject.set(x, "signingName", js.undefined)
      
      inline def setUseDualstackEndpoint(value: () => js.Promise[Boolean]): Self = StObject.set(x, "useDualstackEndpoint", js.Any.fromFunction0(value))
      
      inline def setUseFipsEndpoint(value: () => js.Promise[Boolean]): Self = StObject.set(x, "useFipsEndpoint", js.Any.fromFunction0(value))
    }
  }
  
  trait StsAuthConfigOptions extends StObject {
    
    /**
      * Reference to STSClient class constructor.
      */
    var stsClientCtor: Instantiable1[/* clientConfig */ Any, Client[Any, Any, Any]]
  }
  object StsAuthConfigOptions {
    
    inline def apply(stsClientCtor: Instantiable1[/* clientConfig */ Any, Client[Any, Any, Any]]): StsAuthConfigOptions = {
      val __obj = js.Dynamic.literal(stsClientCtor = stsClientCtor.asInstanceOf[js.Any])
      __obj.asInstanceOf[StsAuthConfigOptions]
    }
    
    extension [Self <: StsAuthConfigOptions](x: Self) {
      
      inline def setStsClientCtor(value: Instantiable1[/* clientConfig */ Any, Client[Any, Any, Any]]): Self = StObject.set(x, "stsClientCtor", value.asInstanceOf[js.Any])
    }
  }
  
  type StsAuthInputConfig = AwsAuthInputConfig
  
  @js.native
  trait StsAuthResolvedConfig
    extends StObject
       with AwsAuthResolvedConfig {
    
    /**
      * Reference to STSClient class constructor.
      * @internal
      */
    var stsClientCtor: Instantiable1[/* clientConfig */ Any, Client[Any, Any, Any]] = js.native
  }
}
