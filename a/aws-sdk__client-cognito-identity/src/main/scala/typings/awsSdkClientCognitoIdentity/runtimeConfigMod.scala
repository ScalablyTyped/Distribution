package typings.awsSdkClientCognitoIdentity

import typings.awsSdkProtocolHttp.httpHandlerMod.HttpHandler
import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.Hash
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.cryptoMod.SourceData
import typings.awsSdkTypes.httpMod.Endpoint
import typings.awsSdkTypes.loggerMod.Logger
import typings.awsSdkTypes.serdeMod.StreamCollector
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import typings.awsSdkTypes.utilMod.Provider
import typings.awsSdkTypes.utilMod.RegionInfo
import typings.awsSdkTypes.utilMod.RegionInfoProvider
import typings.awsSdkTypes.utilMod.UrlParser
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeConfigMod {
  
  /* Inlined std.Required<@aws-sdk/client-cognito-identity.@aws-sdk/client-cognito-identity/types/CognitoIdentityClient.ClientDefaults> */
  object ClientDefaultValues {
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.apiVersion")
    @js.native
    def apiVersion: String = js.native
    @scala.inline
    def apiVersion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.base64Decoder")
    @js.native
    def base64Decoder: Decoder = js.native
    @scala.inline
    def base64Decoder(input: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Decoder")(input.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
    @scala.inline
    def base64Decoder_=(x: Decoder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base64Decoder")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.base64Encoder")
    @js.native
    def base64Encoder: Encoder = js.native
    @scala.inline
    def base64Encoder(input: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Encoder")(input.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def base64Encoder_=(x: Encoder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base64Encoder")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.bodyLengthChecker")
    @js.native
    def bodyLengthChecker: js.Function1[/* body */ js.Any, js.UndefOr[Double]] = js.native
    @scala.inline
    def bodyLengthChecker(body: js.Any): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("bodyLengthChecker")(body.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
    @scala.inline
    def bodyLengthChecker_=(x: js.Function1[/* body */ js.Any, js.UndefOr[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bodyLengthChecker")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.credentialDefaultProvider")
    @js.native
    def credentialDefaultProvider: js.Function1[/* input */ js.Any, Provider[Credentials]] = js.native
    @scala.inline
    def credentialDefaultProvider(input: js.Any): Provider[Credentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialDefaultProvider")(input.asInstanceOf[js.Any]).asInstanceOf[Provider[Credentials]]
    @scala.inline
    def credentialDefaultProvider_=(x: js.Function1[/* input */ js.Any, Provider[Credentials]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("credentialDefaultProvider")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.defaultUserAgent")
    @js.native
    def defaultUserAgent: String = js.native
    @scala.inline
    def defaultUserAgent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultUserAgent")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.disableHostPrefix")
    @js.native
    def disableHostPrefix: Boolean = js.native
    @scala.inline
    def disableHostPrefix_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableHostPrefix")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.logger")
    @js.native
    def logger: Logger = js.native
    @scala.inline
    def logger_=(x: Logger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logger")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.maxAttempts")
    @js.native
    def maxAttempts: Double | Provider[Double] = js.native
    @scala.inline
    def maxAttempts_=(x: Double | Provider[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxAttempts")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.region")
    @js.native
    def region: String | Provider[String] = js.native
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.regionInfoProvider")
    @js.native
    def regionInfoProvider: RegionInfoProvider = js.native
    @scala.inline
    def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("regionInfoProvider")(region.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[RegionInfo]]]
    @scala.inline
    def regionInfoProvider(region: String, options: js.Any): js.Promise[js.UndefOr[RegionInfo]] = (^.asInstanceOf[js.Dynamic].applyDynamic("regionInfoProvider")(region.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[RegionInfo]]]
    @scala.inline
    def regionInfoProvider_=(x: RegionInfoProvider): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regionInfoProvider")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def region_=(x: String | Provider[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("region")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.requestHandler")
    @js.native
    def requestHandler: HttpHandler = js.native
    @scala.inline
    def requestHandler_=(x: HttpHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestHandler")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.runtime")
    @js.native
    def runtime: String = js.native
    @scala.inline
    def runtime_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runtime")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.sha256")
    @js.native
    class sha256 ()
      extends StObject
         with Hash {
      def this(secret: SourceData) = this()
    }
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.sha256")
    @js.native
    def sha256: HashConstructor = js.native
    @scala.inline
    def sha256_=(x: HashConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha256")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.signingName")
    @js.native
    def signingName: String = js.native
    @scala.inline
    def signingName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("signingName")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.streamCollector")
    @js.native
    def streamCollector: StreamCollector = js.native
    @scala.inline
    def streamCollector(stream: js.Any): js.Promise[Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("streamCollector")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Uint8Array]]
    @scala.inline
    def streamCollector_=(x: StreamCollector): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("streamCollector")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.urlParser")
    @js.native
    def urlParser: UrlParser = js.native
    @scala.inline
    def urlParser(url: String): Endpoint = ^.asInstanceOf[js.Dynamic].applyDynamic("urlParser")(url.asInstanceOf[js.Any]).asInstanceOf[Endpoint]
    @scala.inline
    def urlParser_=(x: UrlParser): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urlParser")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.utf8Decoder")
    @js.native
    def utf8Decoder: Decoder = js.native
    @scala.inline
    def utf8Decoder(input: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("utf8Decoder")(input.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
    @scala.inline
    def utf8Decoder_=(x: Decoder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utf8Decoder")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig", "ClientDefaultValues.utf8Encoder")
    @js.native
    def utf8Encoder: Encoder = js.native
    @scala.inline
    def utf8Encoder(input: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("utf8Encoder")(input.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def utf8Encoder_=(x: Encoder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utf8Encoder")(x.asInstanceOf[js.Any])
  }
}
