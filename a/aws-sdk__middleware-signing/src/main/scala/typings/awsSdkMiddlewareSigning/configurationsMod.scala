package typings.awsSdkMiddlewareSigning

import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.signatureMod.RequestSigner
import typings.awsSdkTypes.utilMod.Provider
import typings.awsSdkTypes.utilMod.RegionInfo
import typings.awsSdkTypes.utilMod.RegionInfoProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationsMod {
  
  @JSImport("@aws-sdk/middleware-signing/dist/cjs/configurations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveAwsAuthConfig[T](input: T & AwsAuthInputConfig & PreviouslyResolved): T & AwsAuthResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAwsAuthConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & AwsAuthResolvedConfig]
  
  trait AwsAuthInputConfig extends StObject {
    
    /**
      * The credentials used to sign requests.
      */
    var credentials: js.UndefOr[Credentials | Provider[Credentials]] = js.undefined
    
    /**
      * The signer to use when signing requests.
      */
    var signer: js.UndefOr[RequestSigner | Provider[RequestSigner]] = js.undefined
    
    /**
      * Whether to escape request path when signing the request.
      */
    var signingEscapePath: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The region where you want to sign your request against. This
      * can be different to the region in the endpoint.
      */
    var signingRegion: js.UndefOr[String] = js.undefined
    
    /**
      * An offset value in milliseconds to apply to all signing times.
      */
    var systemClockOffset: js.UndefOr[Double] = js.undefined
  }
  object AwsAuthInputConfig {
    
    inline def apply(): AwsAuthInputConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AwsAuthInputConfig]
    }
    
    extension [Self <: AwsAuthInputConfig](x: Self) {
      
      inline def setCredentials(value: Credentials | Provider[Credentials]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsFunction0(value: () => js.Promise[Credentials]): Self = StObject.set(x, "credentials", js.Any.fromFunction0(value))
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setSigner(value: RequestSigner | Provider[RequestSigner]): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
      
      inline def setSignerFunction0(value: () => js.Promise[RequestSigner]): Self = StObject.set(x, "signer", js.Any.fromFunction0(value))
      
      inline def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
      
      inline def setSigningEscapePath(value: Boolean): Self = StObject.set(x, "signingEscapePath", value.asInstanceOf[js.Any])
      
      inline def setSigningEscapePathUndefined: Self = StObject.set(x, "signingEscapePath", js.undefined)
      
      inline def setSigningRegion(value: String): Self = StObject.set(x, "signingRegion", value.asInstanceOf[js.Any])
      
      inline def setSigningRegionUndefined: Self = StObject.set(x, "signingRegion", js.undefined)
      
      inline def setSystemClockOffset(value: Double): Self = StObject.set(x, "systemClockOffset", value.asInstanceOf[js.Any])
      
      inline def setSystemClockOffsetUndefined: Self = StObject.set(x, "systemClockOffset", js.undefined)
    }
  }
  
  trait AwsAuthResolvedConfig extends StObject {
    
    def credentials(): js.Promise[Credentials]
    @JSName("credentials")
    var credentials_Original: Provider[Credentials]
    
    def signer(): js.Promise[RequestSigner]
    @JSName("signer")
    var signer_Original: Provider[RequestSigner]
    
    var signingEscapePath: Boolean
    
    var systemClockOffset: Double
  }
  object AwsAuthResolvedConfig {
    
    inline def apply(
      credentials: () => js.Promise[Credentials],
      signer: () => js.Promise[RequestSigner],
      signingEscapePath: Boolean,
      systemClockOffset: Double
    ): AwsAuthResolvedConfig = {
      val __obj = js.Dynamic.literal(credentials = js.Any.fromFunction0(credentials), signer = js.Any.fromFunction0(signer), signingEscapePath = signingEscapePath.asInstanceOf[js.Any], systemClockOffset = systemClockOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[AwsAuthResolvedConfig]
    }
    
    extension [Self <: AwsAuthResolvedConfig](x: Self) {
      
      inline def setCredentials(value: () => js.Promise[Credentials]): Self = StObject.set(x, "credentials", js.Any.fromFunction0(value))
      
      inline def setSigner(value: () => js.Promise[RequestSigner]): Self = StObject.set(x, "signer", js.Any.fromFunction0(value))
      
      inline def setSigningEscapePath(value: Boolean): Self = StObject.set(x, "signingEscapePath", value.asInstanceOf[js.Any])
      
      inline def setSystemClockOffset(value: Double): Self = StObject.set(x, "systemClockOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait PreviouslyResolved extends StObject {
    
    def credentialDefaultProvider(input: js.Any): Provider[Credentials]
    
    var region: String | Provider[String]
    
    def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]]
    def regionInfoProvider(region: String, options: js.Any): js.Promise[js.UndefOr[RegionInfo]]
    @JSName("regionInfoProvider")
    var regionInfoProvider_Original: RegionInfoProvider
    
    var sha256: HashConstructor
    
    var signingName: String
  }
  object PreviouslyResolved {
    
    inline def apply(
      credentialDefaultProvider: js.Any => Provider[Credentials],
      region: String | Provider[String],
      regionInfoProvider: (/* region */ String, /* options */ js.UndefOr[js.Any]) => js.Promise[js.UndefOr[RegionInfo]],
      sha256: HashConstructor,
      signingName: String
    ): PreviouslyResolved = {
      val __obj = js.Dynamic.literal(credentialDefaultProvider = js.Any.fromFunction1(credentialDefaultProvider), region = region.asInstanceOf[js.Any], regionInfoProvider = js.Any.fromFunction2(regionInfoProvider), sha256 = sha256.asInstanceOf[js.Any], signingName = signingName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviouslyResolved]
    }
    
    extension [Self <: PreviouslyResolved](x: Self) {
      
      inline def setCredentialDefaultProvider(value: js.Any => Provider[Credentials]): Self = StObject.set(x, "credentialDefaultProvider", js.Any.fromFunction1(value))
      
      inline def setRegion(value: String | Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionFunction0(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      inline def setRegionInfoProvider(
        value: (/* region */ String, /* options */ js.UndefOr[js.Any]) => js.Promise[js.UndefOr[RegionInfo]]
      ): Self = StObject.set(x, "regionInfoProvider", js.Any.fromFunction2(value))
      
      inline def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      inline def setSigningName(value: String): Self = StObject.set(x, "signingName", value.asInstanceOf[js.Any])
    }
  }
}
