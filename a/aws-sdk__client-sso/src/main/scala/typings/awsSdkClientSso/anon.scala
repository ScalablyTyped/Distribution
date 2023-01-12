package typings.awsSdkClientSso

import typings.awsSdkClientSso.distTypesEndpointEndpointParametersMod.EndpointParameters
import typings.awsSdkFetchHttpHandler.mod.FetchHttpHandler
import typings.awsSdkNodeHttpHandler.mod.NodeHttpHandler
import typings.awsSdkProtocolHttp.distTypesHttpHandlerMod.HttpHandler
import typings.awsSdkSmithyClient.distTypesDefaultsModeMod.DefaultsMode
import typings.awsSdkSmithyClient.distTypesDefaultsModeMod.ResolvedDefaultsMode
import typings.awsSdkTypes.distTypesCryptoMod.HashConstructor
import typings.awsSdkTypes.distTypesEndpointMod.EndpointV2
import typings.awsSdkTypes.distTypesHttpMod.Endpoint
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import typings.awsSdkTypes.distTypesSerdeMod.StreamCollector
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
    
    var retryStrategy: js.UndefOr[RetryStrategy] = js.native
    
    var runtime: String = js.native
    
    var serviceId: String = js.native
    
    var sha256: HashConstructor = js.native
    
    def streamCollector(stream: Any): js.Promise[js.typedarray.Uint8Array] = js.native
    @JSName("streamCollector")
    var streamCollector_Original: StreamCollector = js.native
    
    var tls: js.UndefOr[Boolean] = js.native
    
    def urlParser(url: String): Endpoint = js.native
    def urlParser(url: URL): Endpoint = js.native
    @JSName("urlParser")
    var urlParser_Original: UrlParser = js.native
    
    var useDualstackEndpoint: Boolean | Provider[Boolean] = js.native
    
    var useFipsEndpoint: Boolean | Provider[Boolean] = js.native
    
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
    
    var retryStrategy: js.UndefOr[RetryStrategy] = js.native
    
    var runtime: String = js.native
    
    var serviceId: String = js.native
    
    var sha256: HashConstructor = js.native
    
    def streamCollector(stream: Any): js.Promise[js.typedarray.Uint8Array] = js.native
    @JSName("streamCollector")
    var streamCollector_Original: StreamCollector = js.native
    
    var tls: js.UndefOr[Boolean] = js.native
    
    def urlParser(url: String): Endpoint = js.native
    def urlParser(url: URL): Endpoint = js.native
    @JSName("urlParser")
    var urlParser_Original: UrlParser = js.native
    
    var useDualstackEndpoint: Boolean | Provider[Boolean] = js.native
    
    var useFipsEndpoint: Boolean | Provider[Boolean] = js.native
    
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
    
    var retryStrategy: js.UndefOr[RetryStrategy] = js.native
    
    var runtime: String = js.native
    
    var serviceId: String = js.native
    
    var sha256: HashConstructor = js.native
    
    def streamCollector(stream: Any): js.Promise[js.typedarray.Uint8Array] = js.native
    @JSName("streamCollector")
    var streamCollector_Original: StreamCollector = js.native
    
    var tls: js.UndefOr[Boolean] = js.native
    
    def urlParser(url: String): Endpoint = js.native
    def urlParser(url: URL): Endpoint = js.native
    @JSName("urlParser")
    var urlParser_Original: UrlParser = js.native
    
    var useDualstackEndpoint: Boolean | Provider[Boolean] = js.native
    
    var useFipsEndpoint: Boolean | Provider[Boolean] = js.native
    
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
  }
  
  /* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.ExceptionOptionType<@aws-sdk/client-sso.@aws-sdk/client-sso/dist-types/models/models_0.InvalidRequestException, @aws-sdk/client-sso.@aws-sdk/client-sso/dist-types/models/SSOServiceException.SSOServiceException> */
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
  
  /* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.ExceptionOptionType<@aws-sdk/client-sso.@aws-sdk/client-sso/dist-types/models/models_0.ResourceNotFoundException, @aws-sdk/client-sso.@aws-sdk/client-sso/dist-types/models/SSOServiceException.SSOServiceException> */
  trait ExceptionOptionTypeResour extends StObject {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    var message: String
  }
  object ExceptionOptionTypeResour {
    
    inline def apply($metadata: ResponseMetadata, message: String): ExceptionOptionTypeResour = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExceptionOptionTypeResour]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExceptionOptionTypeResour] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.ExceptionOptionType<@aws-sdk/client-sso.@aws-sdk/client-sso/dist-types/models/models_0.TooManyRequestsException, @aws-sdk/client-sso.@aws-sdk/client-sso/dist-types/models/SSOServiceException.SSOServiceException> */
  trait ExceptionOptionTypeTooMan extends StObject {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    var message: String
  }
  object ExceptionOptionTypeTooMan {
    
    inline def apply($metadata: ResponseMetadata, message: String): ExceptionOptionTypeTooMan = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExceptionOptionTypeTooMan]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExceptionOptionTypeTooMan] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @aws-sdk/smithy-client.@aws-sdk/smithy-client.ExceptionOptionType<@aws-sdk/client-sso.@aws-sdk/client-sso/dist-types/models/models_0.UnauthorizedException, @aws-sdk/client-sso.@aws-sdk/client-sso/dist-types/models/SSOServiceException.SSOServiceException> */
  trait ExceptionOptionTypeUnauth extends StObject {
    
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    var message: String
  }
  object ExceptionOptionTypeUnauth {
    
    inline def apply($metadata: ResponseMetadata, message: String): ExceptionOptionTypeUnauth = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExceptionOptionTypeUnauth]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExceptionOptionTypeUnauth] (val x: Self) extends AnyVal {
      
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
}
