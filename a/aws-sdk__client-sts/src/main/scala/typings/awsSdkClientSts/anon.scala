package typings.awsSdkClientSts

import org.scalablytyped.runtime.Instantiable1
import typings.awsSdkClientSts.distTypesDefaultStsRoleAssumersMod.DefaultCredentialProvider
import typings.awsSdkClientSts.distTypesEndpointEndpointParametersMod.EndpointParameters
import typings.awsSdkFetchHttpHandler.mod.FetchHttpHandler
import typings.awsSdkNodeHttpHandler.mod.NodeHttpHandler
import typings.awsSdkProtocolHttp.distTypesHttpHandlerMod.HttpHandler
import typings.awsSdkSignatureV4.distTypesSignatureV4Mod.SignatureV4CryptoInit
import typings.awsSdkSignatureV4.distTypesSignatureV4Mod.SignatureV4Init
import typings.awsSdkSmithyClient.distTypesDefaultsModeMod.DefaultsMode
import typings.awsSdkSmithyClient.distTypesDefaultsModeMod.ResolvedDefaultsMode
import typings.awsSdkTypes.distTypesAuthMod.AuthScheme
import typings.awsSdkTypes.distTypesCredentialsMod.Credentials
import typings.awsSdkTypes.distTypesCryptoMod.HashConstructor
import typings.awsSdkTypes.distTypesEndpointMod.EndpointV2
import typings.awsSdkTypes.distTypesHttpMod.Endpoint
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesIdentityAwsCredentialIdentityMod.AwsCredentialIdentity
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import typings.awsSdkTypes.distTypesRetryMod.RetryStrategyV2
import typings.awsSdkTypes.distTypesSerdeMod.StreamCollector
import typings.awsSdkTypes.distTypesSignatureMod.RequestSigner
import typings.awsSdkTypes.distTypesTransferMod.RequestHandler
import typings.awsSdkTypes.distTypesUtilMod.BodyLengthCalculator
import typings.awsSdkTypes.distTypesUtilMod.Decoder
import typings.awsSdkTypes.distTypesUtilMod.Encoder
import typings.awsSdkTypes.distTypesUtilMod.Provider
import typings.awsSdkTypes.distTypesUtilMod.RetryStrategy
import typings.awsSdkTypes.distTypesUtilMod.UrlParser
import typings.awsSdkTypes.distTypesUtilMod.UserAgent
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ApiVersion extends StObject {
    
    var apiVersion: String = js.native
    
    def base64Decoder(input: String): js.typedarray.Uint8Array = js.native
    @JSName("base64Decoder")
    var base64Decoder_Original: Decoder = js.native
    
    def base64Encoder(input: js.typedarray.Uint8Array): String = js.native
    @JSName("base64Encoder")
    var base64Encoder_Original: Encoder = js.native
    
    def bodyLengthChecker(body: Any): js.UndefOr[Double] = js.native
    @JSName("bodyLengthChecker")
    var bodyLengthChecker_Original: BodyLengthCalculator = js.native
    
    def credentialDefaultProvider(input: Any): Provider[Credentials] = js.native
    
    var credentials: js.UndefOr[AwsCredentialIdentity | Provider[AwsCredentialIdentity]] = js.native
    
    var customUserAgent: js.UndefOr[String | UserAgent] = js.native
    
    def defaultUserAgentProvider(): js.Promise[UserAgent] = js.native
    @JSName("defaultUserAgentProvider")
    var defaultUserAgentProvider_Original: Provider[UserAgent] = js.native
    
    def defaultsMode(): js.Promise[ResolvedDefaultsMode] = js.native
    @JSName("defaultsMode")
    var defaultsMode_Original: Provider[ResolvedDefaultsMode] = js.native
    
    var disableHostPrefix: Boolean = js.native
    
    var endpoint: js.UndefOr[
        (String | Endpoint | (Provider[Endpoint | EndpointV2]) | EndpointV2) & (String | (Provider[Endpoint | EndpointV2 | String]) | Endpoint | EndpointV2)
      ] = js.native
    
    def endpointProvider(endpointParams: EndpointParameters): EndpointV2 = js.native
    def endpointProvider(endpointParams: EndpointParameters, context: Logger): EndpointV2 = js.native
    
    var logger: typings.awsSdkTypes.distTypesLoggerMod.Logger = js.native
    
    var maxAttempts: Double | Provider[Double] = js.native
    
    var region: String | Provider[Any] = js.native
    
    var requestHandler: ((RequestHandler[Any, Any, HttpHandlerOptions]) & HttpHandler) | FetchHttpHandler = js.native
    
    var retryMode: String | Provider[String] = js.native
    
    var retryStrategy: js.UndefOr[RetryStrategy | RetryStrategyV2] = js.native
    
    var runtime: String = js.native
    
    var serviceId: String = js.native
    
    var sha256: HashConstructor = js.native
    
    var signer: js.UndefOr[
        RequestSigner | (js.Function1[/* authScheme */ js.UndefOr[AuthScheme], js.Promise[RequestSigner]])
      ] = js.native
    
    var signerConstructor: js.UndefOr[
        Instantiable1[/* options */ SignatureV4Init & SignatureV4CryptoInit, RequestSigner]
      ] = js.native
    
    var signingEscapePath: js.UndefOr[Boolean] = js.native
    
    var signingRegion: js.UndefOr[String] = js.native
    
    def streamCollector(stream: Any): js.Promise[js.typedarray.Uint8Array] = js.native
    @JSName("streamCollector")
    var streamCollector_Original: StreamCollector = js.native
    
    var systemClockOffset: js.UndefOr[Double] = js.native
    
    var tls: js.UndefOr[Boolean] = js.native
    
    def urlParser(url: String): Endpoint = js.native
    def urlParser(url: URL): Endpoint = js.native
    @JSName("urlParser")
    var urlParser_Original: UrlParser = js.native
    
    var useDualstackEndpoint: Boolean | Provider[Boolean] = js.native
    
    var useFipsEndpoint: Boolean | Provider[Boolean] = js.native
    
    var useGlobalEndpoint: js.UndefOr[Boolean | Provider[Boolean]] = js.native
    
    def utf8Decoder(input: String): js.typedarray.Uint8Array = js.native
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder = js.native
    
    def utf8Encoder(input: js.typedarray.Uint8Array): String = js.native
    @JSName("utf8Encoder")
    var utf8Encoder_Original: Encoder = js.native
  }
  
  @js.native
  trait Base64Decoder extends StObject {
    
    var apiVersion: String = js.native
    
    def base64Decoder(input: String): js.typedarray.Uint8Array = js.native
    @JSName("base64Decoder")
    var base64Decoder_Original: Decoder = js.native
    
    def base64Encoder(input: js.typedarray.Uint8Array): String = js.native
    @JSName("base64Encoder")
    var base64Encoder_Original: Encoder = js.native
    
    def bodyLengthChecker(body: Any): js.UndefOr[Double] = js.native
    @JSName("bodyLengthChecker")
    var bodyLengthChecker_Original: BodyLengthCalculator = js.native
    
    def credentialDefaultProvider(input: Any): Provider[Credentials] = js.native
    @JSName("credentialDefaultProvider")
    var credentialDefaultProvider_Original: DefaultCredentialProvider = js.native
    
    var credentials: js.UndefOr[AwsCredentialIdentity | Provider[AwsCredentialIdentity]] = js.native
    
    var customUserAgent: js.UndefOr[String | UserAgent] = js.native
    
    def defaultUserAgentProvider(): js.Promise[UserAgent] = js.native
    @JSName("defaultUserAgentProvider")
    var defaultUserAgentProvider_Original: Provider[UserAgent] = js.native
    
    def defaultsMode(): js.Promise[ResolvedDefaultsMode] = js.native
    @JSName("defaultsMode")
    var defaultsMode_Original: Provider[ResolvedDefaultsMode] = js.native
    
    var disableHostPrefix: Boolean = js.native
    
    var endpoint: js.UndefOr[
        (String | Endpoint | (Provider[Endpoint | EndpointV2]) | EndpointV2) & (String | (Provider[Endpoint | EndpointV2 | String]) | Endpoint | EndpointV2)
      ] = js.native
    
    def endpointProvider(endpointParams: EndpointParameters): EndpointV2 = js.native
    def endpointProvider(endpointParams: EndpointParameters, context: Logger): EndpointV2 = js.native
    
    var logger: typings.awsSdkTypes.distTypesLoggerMod.Logger = js.native
    
    var maxAttempts: Double | Provider[Double] = js.native
    
    var region: String | Provider[String] = js.native
    
    var requestHandler: ((RequestHandler[Any, Any, HttpHandlerOptions]) & HttpHandler) | NodeHttpHandler = js.native
    
    var retryMode: String | Provider[String] = js.native
    
    var retryStrategy: js.UndefOr[RetryStrategy | RetryStrategyV2] = js.native
    
    var runtime: String = js.native
    
    var serviceId: String = js.native
    
    var sha256: HashConstructor = js.native
    
    var signer: js.UndefOr[
        RequestSigner | (js.Function1[/* authScheme */ js.UndefOr[AuthScheme], js.Promise[RequestSigner]])
      ] = js.native
    
    var signerConstructor: js.UndefOr[
        Instantiable1[/* options */ SignatureV4Init & SignatureV4CryptoInit, RequestSigner]
      ] = js.native
    
    var signingEscapePath: js.UndefOr[Boolean] = js.native
    
    var signingRegion: js.UndefOr[String] = js.native
    
    def streamCollector(stream: Any): js.Promise[js.typedarray.Uint8Array] = js.native
    @JSName("streamCollector")
    var streamCollector_Original: StreamCollector = js.native
    
    var systemClockOffset: js.UndefOr[Double] = js.native
    
    var tls: js.UndefOr[Boolean] = js.native
    
    def urlParser(url: String): Endpoint = js.native
    def urlParser(url: URL): Endpoint = js.native
    @JSName("urlParser")
    var urlParser_Original: UrlParser = js.native
    
    var useDualstackEndpoint: Boolean | Provider[Boolean] = js.native
    
    var useFipsEndpoint: Boolean | Provider[Boolean] = js.native
    
    var useGlobalEndpoint: js.UndefOr[Boolean | Provider[Boolean]] = js.native
    
    def utf8Decoder(input: String): js.typedarray.Uint8Array = js.native
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder = js.native
    
    def utf8Encoder(input: js.typedarray.Uint8Array): String = js.native
    @JSName("utf8Encoder")
    var utf8Encoder_Original: Encoder = js.native
  }
  
  @js.native
  trait Base64Encoder extends StObject {
    
    var apiVersion: String = js.native
    
    def base64Decoder(input: String): js.typedarray.Uint8Array = js.native
    @JSName("base64Decoder")
    var base64Decoder_Original: Decoder = js.native
    
    def base64Encoder(input: js.typedarray.Uint8Array): String = js.native
    @JSName("base64Encoder")
    var base64Encoder_Original: Encoder = js.native
    
    def bodyLengthChecker(body: Any): js.UndefOr[Double] = js.native
    @JSName("bodyLengthChecker")
    var bodyLengthChecker_Original: BodyLengthCalculator = js.native
    
    def credentialDefaultProvider(input: Any): Provider[Credentials] = js.native
    
    var credentials: js.UndefOr[AwsCredentialIdentity | Provider[AwsCredentialIdentity]] = js.native
    
    var customUserAgent: js.UndefOr[String | UserAgent] = js.native
    
    def defaultUserAgentProvider(): js.Promise[UserAgent] = js.native
    @JSName("defaultUserAgentProvider")
    var defaultUserAgentProvider_Original: Provider[UserAgent] = js.native
    
    var defaultsMode: DefaultsMode | Provider[DefaultsMode] = js.native
    
    var disableHostPrefix: Boolean = js.native
    
    var endpoint: js.UndefOr[String | Endpoint | (Provider[Endpoint | EndpointV2]) | EndpointV2] = js.native
    
    def endpointProvider(endpointParams: EndpointParameters): EndpointV2 = js.native
    def endpointProvider(endpointParams: EndpointParameters, context: Logger): EndpointV2 = js.native
    
    var logger: typings.awsSdkTypes.distTypesLoggerMod.Logger = js.native
    
    var maxAttempts: Double | Provider[Double] = js.native
    
    var region: String | Provider[Any] = js.native
    
    var requestHandler: ((RequestHandler[Any, Any, HttpHandlerOptions]) & HttpHandler) | FetchHttpHandler = js.native
    
    var retryMode: String | Provider[String] = js.native
    
    var retryStrategy: js.UndefOr[RetryStrategy | RetryStrategyV2] = js.native
    
    var runtime: String = js.native
    
    var serviceId: String = js.native
    
    var sha256: HashConstructor = js.native
    
    var signer: js.UndefOr[
        RequestSigner | (js.Function1[/* authScheme */ js.UndefOr[AuthScheme], js.Promise[RequestSigner]])
      ] = js.native
    
    var signerConstructor: js.UndefOr[
        Instantiable1[/* options */ SignatureV4Init & SignatureV4CryptoInit, RequestSigner]
      ] = js.native
    
    var signingEscapePath: js.UndefOr[Boolean] = js.native
    
    var signingRegion: js.UndefOr[String] = js.native
    
    def streamCollector(stream: Any): js.Promise[js.typedarray.Uint8Array] = js.native
    @JSName("streamCollector")
    var streamCollector_Original: StreamCollector = js.native
    
    var systemClockOffset: js.UndefOr[Double] = js.native
    
    var tls: js.UndefOr[Boolean] = js.native
    
    def urlParser(url: String): Endpoint = js.native
    def urlParser(url: URL): Endpoint = js.native
    @JSName("urlParser")
    var urlParser_Original: UrlParser = js.native
    
    var useDualstackEndpoint: Boolean | Provider[Boolean] = js.native
    
    var useFipsEndpoint: Boolean | Provider[Boolean] = js.native
    
    var useGlobalEndpoint: js.UndefOr[Boolean | Provider[Boolean]] = js.native
    
    def utf8Decoder(input: String): js.typedarray.Uint8Array = js.native
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder = js.native
    
    def utf8Encoder(input: js.typedarray.Uint8Array): String = js.native
    @JSName("utf8Encoder")
    var utf8Encoder_Original: Encoder = js.native
  }
  
  trait DefaultSigningName extends StObject {
    
    var defaultSigningName: String
  }
  object DefaultSigningName {
    
    inline def apply(defaultSigningName: String): DefaultSigningName = {
      val __obj = js.Dynamic.literal(defaultSigningName = defaultSigningName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultSigningName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultSigningName] (val x: Self) extends AnyVal {
      
      inline def setDefaultSigningName(value: String): Self = StObject.set(x, "defaultSigningName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DisableHostPrefix extends StObject {
    
    var apiVersion: String = js.native
    
    def base64Decoder(input: String): js.typedarray.Uint8Array = js.native
    @JSName("base64Decoder")
    var base64Decoder_Original: Decoder = js.native
    
    def base64Encoder(input: js.typedarray.Uint8Array): String = js.native
    @JSName("base64Encoder")
    var base64Encoder_Original: Encoder = js.native
    
    var disableHostPrefix: Boolean = js.native
    
    def endpointProvider(endpointParams: EndpointParameters): EndpointV2 = js.native
    def endpointProvider(endpointParams: EndpointParameters, context: Logger): EndpointV2 = js.native
    
    var logger: typings.awsSdkTypes.distTypesLoggerMod.Logger = js.native
    
    var serviceId: String = js.native
    
    def urlParser(url: String): Endpoint = js.native
    def urlParser(url: URL): Endpoint = js.native
    @JSName("urlParser")
    var urlParser_Original: UrlParser = js.native
    
    def utf8Decoder(input: String): js.typedarray.Uint8Array = js.native
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder = js.native
    
    def utf8Encoder(input: js.typedarray.Uint8Array): String = js.native
    @JSName("utf8Encoder")
    var utf8Encoder_Original: Encoder = js.native
  }
  
  /* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.ExceptionOptionType<@aws-sdk/client-sts.@aws-sdk/client-sts/dist-types/models/models_0.ExpiredTokenException, @aws-sdk/client-sts.@aws-sdk/client-sts/dist-types/models/STSServiceException.STSServiceException> */
  trait ExceptionOptionTypeExpire extends StObject {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    var message: String
  }
  object ExceptionOptionTypeExpire {
    
    inline def apply($metadata: ResponseMetadata, message: String): ExceptionOptionTypeExpire = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExceptionOptionTypeExpire]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExceptionOptionTypeExpire] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.ExceptionOptionType<@aws-sdk/client-sts.@aws-sdk/client-sts/dist-types/models/models_0.IDPCommunicationErrorException, @aws-sdk/client-sts.@aws-sdk/client-sts/dist-types/models/STSServiceException.STSServiceException> */
  trait ExceptionOptionTypeIDPCom extends StObject {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    var message: String
  }
  object ExceptionOptionTypeIDPCom {
    
    inline def apply($metadata: ResponseMetadata, message: String): ExceptionOptionTypeIDPCom = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExceptionOptionTypeIDPCom]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExceptionOptionTypeIDPCom] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.ExceptionOptionType<@aws-sdk/client-sts.@aws-sdk/client-sts/dist-types/models/models_0.IDPRejectedClaimException, @aws-sdk/client-sts.@aws-sdk/client-sts/dist-types/models/STSServiceException.STSServiceException> */
  trait ExceptionOptionTypeIDPRej extends StObject {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    var message: String
  }
  object ExceptionOptionTypeIDPRej {
    
    inline def apply($metadata: ResponseMetadata, message: String): ExceptionOptionTypeIDPRej = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExceptionOptionTypeIDPRej]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExceptionOptionTypeIDPRej] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.ExceptionOptionType<@aws-sdk/client-sts.@aws-sdk/client-sts/dist-types/models/models_0.InvalidAuthorizationMessageException, @aws-sdk/client-sts.@aws-sdk/client-sts/dist-types/models/STSServiceException.STSServiceException> */
  trait ExceptionOptionTypeInvali extends StObject {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    var message: String
  }
  object ExceptionOptionTypeInvali {
    
    inline def apply($metadata: ResponseMetadata, message: String): ExceptionOptionTypeInvali = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExceptionOptionTypeInvali]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExceptionOptionTypeInvali] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.ExceptionOptionType<@aws-sdk/client-sts.@aws-sdk/client-sts/dist-types/models/models_0.MalformedPolicyDocumentException, @aws-sdk/client-sts.@aws-sdk/client-sts/dist-types/models/STSServiceException.STSServiceException> */
  trait ExceptionOptionTypeMalfor extends StObject {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    var message: String
  }
  object ExceptionOptionTypeMalfor {
    
    inline def apply($metadata: ResponseMetadata, message: String): ExceptionOptionTypeMalfor = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExceptionOptionTypeMalfor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExceptionOptionTypeMalfor] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.ExceptionOptionType<@aws-sdk/client-sts.@aws-sdk/client-sts/dist-types/models/models_0.PackedPolicyTooLargeException, @aws-sdk/client-sts.@aws-sdk/client-sts/dist-types/models/STSServiceException.STSServiceException> */
  trait ExceptionOptionTypePacked extends StObject {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    var message: String
  }
  object ExceptionOptionTypePacked {
    
    inline def apply($metadata: ResponseMetadata, message: String): ExceptionOptionTypePacked = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExceptionOptionTypePacked]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExceptionOptionTypePacked] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.ExceptionOptionType<@aws-sdk/client-sts.@aws-sdk/client-sts/dist-types/models/models_0.RegionDisabledException, @aws-sdk/client-sts.@aws-sdk/client-sts/dist-types/models/STSServiceException.STSServiceException> */
  trait ExceptionOptionTypeRegion extends StObject {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    var message: String
  }
  object ExceptionOptionTypeRegion {
    
    inline def apply($metadata: ResponseMetadata, message: String): ExceptionOptionTypeRegion = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExceptionOptionTypeRegion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExceptionOptionTypeRegion] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Logger extends StObject {
    
    var logger: js.UndefOr[typings.awsSdkTypes.distTypesLoggerMod.Logger] = js.undefined
  }
  object Logger {
    
    inline def apply(): Logger = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      inline def setLogger(value: typings.awsSdkTypes.distTypesLoggerMod.Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
  
  /* Inlined std.Pick<@aws-sdk/client-sts.@aws-sdk/client-sts/dist-types/STSClient.STSClientConfig, 'logger' | 'region' | 'requestHandler'> */
  trait PickSTSClientConfiglogger extends StObject {
    
    var logger: js.UndefOr[typings.awsSdkTypes.distTypesLoggerMod.Logger] = js.undefined
    
    var region: js.UndefOr[String | Provider[String]] = js.undefined
    
    var requestHandler: js.UndefOr[RequestHandler[Any, Any, HttpHandlerOptions]] = js.undefined
  }
  object PickSTSClientConfiglogger {
    
    inline def apply(): PickSTSClientConfiglogger = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickSTSClientConfiglogger]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickSTSClientConfiglogger] (val x: Self) extends AnyVal {
      
      inline def setLogger(value: typings.awsSdkTypes.distTypesLoggerMod.Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setRegion(value: String | Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionFunction0(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRequestHandler(value: RequestHandler[Any, Any, HttpHandlerOptions]): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
      
      inline def setRequestHandlerUndefined: Self = StObject.set(x, "requestHandler", js.undefined)
    }
  }
}
