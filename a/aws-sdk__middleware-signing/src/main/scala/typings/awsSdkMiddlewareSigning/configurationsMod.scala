package typings.awsSdkMiddlewareSigning

import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.signatureMod.RequestSigner
import typings.awsSdkTypes.utilMod.Provider
import typings.awsSdkTypes.utilMod.RegionInfo
import typings.awsSdkTypes.utilMod.RegionInfoProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationsMod {
  
  @JSImport("@aws-sdk/middleware-signing/dist/cjs/configurations", "resolveAwsAuthConfig")
  @js.native
  def resolveAwsAuthConfig[T](input: T with AwsAuthInputConfig with PreviouslyResolved): T with AwsAuthResolvedConfig = js.native
  
  @js.native
  trait AwsAuthInputConfig extends StObject {
    
    /**
      * The credentials used to sign requests.
      */
    var credentials: js.UndefOr[Credentials | Provider[Credentials]] = js.native
    
    /**
      * The signer to use when signing requests.
      */
    var signer: js.UndefOr[RequestSigner | Provider[RequestSigner]] = js.native
    
    /**
      * Whether to escape request path when signing the request.
      */
    var signingEscapePath: js.UndefOr[Boolean] = js.native
    
    /**
      * The region where you want to sign your request against. This
      * can be different to the region in the endpoint.
      */
    var signingRegion: js.UndefOr[String] = js.native
    
    /**
      * An offset value in milliseconds to apply to all signing times.
      */
    var systemClockOffset: js.UndefOr[Double] = js.native
  }
  object AwsAuthInputConfig {
    
    @scala.inline
    def apply(): AwsAuthInputConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AwsAuthInputConfig]
    }
    
    @scala.inline
    implicit class AwsAuthInputConfigMutableBuilder[Self <: AwsAuthInputConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCredentials(value: Credentials | Provider[Credentials]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsFunction0(value: () => js.Promise[Credentials]): Self = StObject.set(x, "credentials", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setSigner(value: RequestSigner | Provider[RequestSigner]): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignerFunction0(value: () => js.Promise[RequestSigner]): Self = StObject.set(x, "signer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
      
      @scala.inline
      def setSigningEscapePath(value: Boolean): Self = StObject.set(x, "signingEscapePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningEscapePathUndefined: Self = StObject.set(x, "signingEscapePath", js.undefined)
      
      @scala.inline
      def setSigningRegion(value: String): Self = StObject.set(x, "signingRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningRegionUndefined: Self = StObject.set(x, "signingRegion", js.undefined)
      
      @scala.inline
      def setSystemClockOffset(value: Double): Self = StObject.set(x, "systemClockOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemClockOffsetUndefined: Self = StObject.set(x, "systemClockOffset", js.undefined)
    }
  }
  
  @js.native
  trait AwsAuthResolvedConfig extends StObject {
    
    def credentials(): js.Promise[Credentials] = js.native
    @JSName("credentials")
    var credentials_Original: Provider[Credentials] = js.native
    
    def signer(): js.Promise[RequestSigner] = js.native
    @JSName("signer")
    var signer_Original: Provider[RequestSigner] = js.native
    
    var signingEscapePath: Boolean = js.native
    
    var systemClockOffset: Double = js.native
  }
  
  @js.native
  trait PreviouslyResolved extends StObject {
    
    def credentialDefaultProvider(input: js.Any): Provider[Credentials] = js.native
    
    var region: String | Provider[String] = js.native
    
    def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]] = js.native
    def regionInfoProvider(region: String, options: js.Any): js.Promise[js.UndefOr[RegionInfo]] = js.native
    @JSName("regionInfoProvider")
    var regionInfoProvider_Original: RegionInfoProvider = js.native
    
    var sha256: HashConstructor = js.native
    
    var signingName: String = js.native
  }
}
