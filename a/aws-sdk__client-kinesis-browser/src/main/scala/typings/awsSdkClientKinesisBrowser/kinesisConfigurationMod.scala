package typings.awsSdkClientKinesisBrowser

import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.httpMod.Endpoint
import typings.awsSdkTypes.middlewareMod.DeserializeHandler
import typings.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typings.awsSdkTypes.middlewareMod.Terminalware
import typings.awsSdkTypes.serdeMod.RequestSerializer
import typings.awsSdkTypes.serdeMod.StreamCollector
import typings.awsSdkTypes.signatureMod.RequestSigner
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import typings.awsSdkTypes.utilMod.Provider
import typings.awsSdkTypes.utilMod.UrlParser
import typings.std.Blob
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kinesisConfigurationMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/KinesisConfiguration", "configurationProperties")
  @js.native
  val configurationProperties: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ConfigurationDefinition<KinesisResolvableConfiguration, KinesisResolvedConfiguration> */ js.Any = js.native
  
  trait KinesisConfiguration extends StObject {
    
    /**
      * The function that will be used to convert a base64-encoded string to a byte array
      */
    var base64Decoder: js.UndefOr[Decoder] = js.undefined
    
    /**
      * The function that will be used to convert binary data to a base64-encoded string
      */
    var base64Encoder: js.UndefOr[Encoder] = js.undefined
    
    /**
      * The credentials used to sign requests.
      */
    var credentials: Credentials | Provider[Credentials]
    
    /**
      * A function that determines how long (in milliseconds) the SDK should wait before retrying a request
      */
    var delayDecider: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.DelayDecider */ js.Any
      ] = js.undefined
    
    /**
      * The fully qualified endpoint of the webservice. This is only required when using a custom endpoint (for example, when using a local version of S3).
      */
    var endpoint: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ js.Any) | (Provider[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ js.Any
        ])
      ] = js.undefined
    
    /**
      * The endpoint provider to call if no endpoint is provided
      */
    var endpointProvider: js.UndefOr[js.Any] = js.undefined
    
    /**
      * The handler to use as the core of the client's middleware stack
      */
    var handler: js.UndefOr[Terminalware] = js.undefined
    
    /**
      * The HTTP handler to use
      */
    var httpHandler: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpHandler<Blob> */ js.Any
      ] = js.undefined
    
    /**
      * The maximum number of redirects to follow for a service request. Set to `0` to disable retries.
      */
    var maxRedirects: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of times requests that encounter potentially transient failures should be retried
      */
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * The configuration profile to use.
      */
    var profile: js.UndefOr[String] = js.undefined
    
    /**
      * The AWS region to which this client will send requests
      */
    var region: String | Provider[String]
    
    /**
      * A function that determines whether an error is retryable
      */
    var retryDecider: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.RetryDecider */ js.Any
      ] = js.undefined
    
    /**
      * A constructor for a class implementing the @aws-sdk/types.Hash interface that computes the SHA-256 HMAC or checksum of a string or binary buffer
      */
    var sha256: js.UndefOr[HashConstructor] = js.undefined
    
    /**
      * The signer to use when signing requests.
      */
    var signer: js.UndefOr[RequestSigner] = js.undefined
    
    /**
      * The service name with which to sign requests.
      */
    var signingName: js.UndefOr[String] = js.undefined
    
    /**
      * Whether SSL is enabled for requests.
      */
    var sslEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function that converts a stream into an array of bytes.
      */
    var streamCollector: js.UndefOr[StreamCollector] = js.undefined
    
    /**
      * The function that will be used to convert strings into HTTP endpoints
      */
    var urlParser: js.UndefOr[UrlParser] = js.undefined
    
    /**
      * The function that will be used to convert a UTF8-encoded string to a byte array
      */
    var utf8Decoder: js.UndefOr[Decoder] = js.undefined
    
    /**
      * The function that will be used to convert binary data to a UTF-8 encoded string
      */
    var utf8Encoder: js.UndefOr[Encoder] = js.undefined
  }
  object KinesisConfiguration {
    
    @scala.inline
    def apply(credentials: Credentials | Provider[Credentials], region: String | Provider[String]): KinesisConfiguration = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[KinesisConfiguration]
    }
    
    @scala.inline
    implicit class KinesisConfigurationMutableBuilder[Self <: KinesisConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase64Decoder(value: /* input */ String => Uint8Array): Self = StObject.set(x, "base64Decoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBase64DecoderUndefined: Self = StObject.set(x, "base64Decoder", js.undefined)
      
      @scala.inline
      def setBase64Encoder(value: /* input */ Uint8Array => String): Self = StObject.set(x, "base64Encoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBase64EncoderUndefined: Self = StObject.set(x, "base64Encoder", js.undefined)
      
      @scala.inline
      def setCredentials(value: Credentials | Provider[Credentials]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsFunction0(value: () => js.Promise[Credentials]): Self = StObject.set(x, "credentials", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDelayDecider(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.DelayDecider */ js.Any
      ): Self = StObject.set(x, "delayDecider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayDeciderUndefined: Self = StObject.set(x, "delayDecider", js.undefined)
      
      @scala.inline
      def setEndpoint(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ js.Any) | (Provider[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ js.Any
            ])
      ): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointFunction0(
        value: () => js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ js.Any
            ]
      ): Self = StObject.set(x, "endpoint", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEndpointProvider(value: js.Any): Self = StObject.set(x, "endpointProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointProviderUndefined: Self = StObject.set(x, "endpointProvider", js.undefined)
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setHandler(value: /* context */ HandlerExecutionContext => DeserializeHandler[js.Object, js.Object]): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      @scala.inline
      def setHttpHandler(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpHandler<Blob> */ js.Any
      ): Self = StObject.set(x, "httpHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpHandlerUndefined: Self = StObject.set(x, "httpHandler", js.undefined)
      
      @scala.inline
      def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      @scala.inline
      def setRegion(value: String | Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionFunction0(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRetryDecider(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.RetryDecider */ js.Any
      ): Self = StObject.set(x, "retryDecider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryDeciderUndefined: Self = StObject.set(x, "retryDecider", js.undefined)
      
      @scala.inline
      def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
      
      @scala.inline
      def setSigner(value: RequestSigner): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
      
      @scala.inline
      def setSigningName(value: String): Self = StObject.set(x, "signingName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningNameUndefined: Self = StObject.set(x, "signingName", js.undefined)
      
      @scala.inline
      def setSslEnabled(value: Boolean): Self = StObject.set(x, "sslEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslEnabledUndefined: Self = StObject.set(x, "sslEnabled", js.undefined)
      
      @scala.inline
      def setStreamCollector(value: /* stream */ js.Any => js.Promise[Uint8Array]): Self = StObject.set(x, "streamCollector", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStreamCollectorUndefined: Self = StObject.set(x, "streamCollector", js.undefined)
      
      @scala.inline
      def setUrlParser(value: /* url */ String => Endpoint): Self = StObject.set(x, "urlParser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUrlParserUndefined: Self = StObject.set(x, "urlParser", js.undefined)
      
      @scala.inline
      def setUtf8Decoder(value: /* input */ String => Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUtf8DecoderUndefined: Self = StObject.set(x, "utf8Decoder", js.undefined)
      
      @scala.inline
      def setUtf8Encoder(value: /* input */ Uint8Array => String): Self = StObject.set(x, "utf8Encoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUtf8EncoderUndefined: Self = StObject.set(x, "utf8Encoder", js.undefined)
    }
  }
  
  trait KinesisResolvableConfiguration
    extends StObject
       with KinesisConfiguration {
    
    /**
      * Whether the HTTP handler was injected by the user and should thus not be destroyed when this client is
      */
    var _user_injected_http_handler: js.Any
    
    /**
      * A function that can calculate the length of a request body.
      */
    def bodyLengthChecker(body: js.Any): js.UndefOr[Double]
    
    /**
      * The parser to use when converting HTTP responses to SDK output types
      */
    var parser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ResponseParser<Blob> */ js.Any
    
    /**
      * The serializer to use when converting SDK input to HTTP requests
      */
    def serializer(): js.Promise[RequestSerializer[Blob, js.Any]]
    /**
      * The serializer to use when converting SDK input to HTTP requests
      */
    @JSName("serializer")
    var serializer_Original: Provider[RequestSerializer[Blob, js.Any]]
  }
  object KinesisResolvableConfiguration {
    
    @scala.inline
    def apply(
      _user_injected_http_handler: js.Any,
      bodyLengthChecker: js.Any => js.UndefOr[Double],
      credentials: Credentials | Provider[Credentials],
      parser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ResponseParser<Blob> */ js.Any,
      region: String | Provider[String],
      serializer: () => js.Promise[RequestSerializer[Blob, js.Any]]
    ): KinesisResolvableConfiguration = {
      val __obj = js.Dynamic.literal(_user_injected_http_handler = _user_injected_http_handler.asInstanceOf[js.Any], bodyLengthChecker = js.Any.fromFunction1(bodyLengthChecker), credentials = credentials.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], serializer = js.Any.fromFunction0(serializer))
      __obj.asInstanceOf[KinesisResolvableConfiguration]
    }
    
    @scala.inline
    implicit class KinesisResolvableConfigurationMutableBuilder[Self <: KinesisResolvableConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyLengthChecker(value: js.Any => js.UndefOr[Double]): Self = StObject.set(x, "bodyLengthChecker", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParser(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ResponseParser<Blob> */ js.Any
      ): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializer(value: () => js.Promise[RequestSerializer[Blob, js.Any]]): Self = StObject.set(x, "serializer", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_user_injected_http_handler(value: js.Any): Self = StObject.set(x, "_user_injected_http_handler", value.asInstanceOf[js.Any])
    }
  }
  
  trait KinesisResolvedConfiguration
    extends StObject
       with KinesisConfiguration {
    
    var _user_injected_http_handler: Boolean
    
    @JSName("base64Decoder")
    def base64Decoder_MKinesisResolvedConfiguration(input: String): Uint8Array
    @JSName("base64Decoder")
    var base64Decoder_Original: Decoder
    
    @JSName("base64Encoder")
    def base64Encoder_MKinesisResolvedConfiguration(input: Uint8Array): String
    @JSName("base64Encoder")
    var base64Encoder_Original: Encoder
    
    def bodyLengthChecker(body: js.Any): js.UndefOr[Double]
    
    @JSName("credentials")
    def credentials_MKinesisResolvedConfiguration(): js.Promise[Credentials]
    @JSName("credentials")
    var credentials_Original: Provider[Credentials]
    
    @JSName("endpoint")
    def endpoint_MKinesisResolvedConfiguration(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ js.Any
      ]
    @JSName("endpoint")
    var endpoint_Original: Provider[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ js.Any
      ]
    
    @JSName("handler")
    def handler_MKinesisResolvedConfiguration[Input /* <: js.Object */, Output /* <: js.Object */](context: HandlerExecutionContext): DeserializeHandler[Input, Output]
    @JSName("handler")
    var handler_Original: Terminalware
    
    @JSName("maxRedirects")
    var maxRedirects_KinesisResolvedConfiguration: Double
    
    @JSName("maxRetries")
    var maxRetries_KinesisResolvedConfiguration: Double
    
    var parser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ResponseParser<Blob> */ js.Any
    
    @JSName("region")
    def region_MKinesisResolvedConfiguration(): js.Promise[String]
    @JSName("region")
    var region_Original: Provider[String]
    
    def serializer(): js.Promise[RequestSerializer[Blob, js.Any]]
    @JSName("serializer")
    var serializer_Original: Provider[RequestSerializer[Blob, js.Any]]
    
    @JSName("sha256")
    var sha256_KinesisResolvedConfiguration: HashConstructor
    
    @JSName("signer")
    var signer_KinesisResolvedConfiguration: RequestSigner
    
    @JSName("signingName")
    var signingName_KinesisResolvedConfiguration: String
    
    @JSName("sslEnabled")
    var sslEnabled_KinesisResolvedConfiguration: Boolean
    
    @JSName("streamCollector")
    def streamCollector_MKinesisResolvedConfiguration(stream: js.Any): js.Promise[Uint8Array]
    @JSName("streamCollector")
    var streamCollector_Original: StreamCollector
    
    @JSName("urlParser")
    def urlParser_MKinesisResolvedConfiguration(url: String): Endpoint
    @JSName("urlParser")
    var urlParser_Original: UrlParser
    
    @JSName("utf8Decoder")
    def utf8Decoder_MKinesisResolvedConfiguration(input: String): Uint8Array
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder
    
    @JSName("utf8Encoder")
    def utf8Encoder_MKinesisResolvedConfiguration(input: Uint8Array): String
    @JSName("utf8Encoder")
    var utf8Encoder_Original: Encoder
  }
  object KinesisResolvedConfiguration {
    
    @scala.inline
    def apply(
      _user_injected_http_handler: Boolean,
      base64Decoder: /* input */ String => Uint8Array,
      base64Encoder: /* input */ Uint8Array => String,
      bodyLengthChecker: js.Any => js.UndefOr[Double],
      credentials: () => js.Promise[Credentials],
      endpoint: () => js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ js.Any
        ],
      handler: /* context */ HandlerExecutionContext => DeserializeHandler[js.Object, js.Object],
      maxRedirects: Double,
      maxRetries: Double,
      parser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ResponseParser<Blob> */ js.Any,
      region: () => js.Promise[String],
      serializer: () => js.Promise[RequestSerializer[Blob, js.Any]],
      sha256: HashConstructor,
      signer: RequestSigner,
      signingName: String,
      sslEnabled: Boolean,
      streamCollector: /* stream */ js.Any => js.Promise[Uint8Array],
      urlParser: /* url */ String => Endpoint,
      utf8Decoder: /* input */ String => Uint8Array,
      utf8Encoder: /* input */ Uint8Array => String
    ): KinesisResolvedConfiguration = {
      val __obj = js.Dynamic.literal(_user_injected_http_handler = _user_injected_http_handler.asInstanceOf[js.Any], base64Decoder = js.Any.fromFunction1(base64Decoder), base64Encoder = js.Any.fromFunction1(base64Encoder), bodyLengthChecker = js.Any.fromFunction1(bodyLengthChecker), credentials = js.Any.fromFunction0(credentials), endpoint = js.Any.fromFunction0(endpoint), handler = js.Any.fromFunction1(handler), maxRedirects = maxRedirects.asInstanceOf[js.Any], maxRetries = maxRetries.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], region = js.Any.fromFunction0(region), serializer = js.Any.fromFunction0(serializer), sha256 = sha256.asInstanceOf[js.Any], signer = signer.asInstanceOf[js.Any], signingName = signingName.asInstanceOf[js.Any], sslEnabled = sslEnabled.asInstanceOf[js.Any], streamCollector = js.Any.fromFunction1(streamCollector), urlParser = js.Any.fromFunction1(urlParser), utf8Decoder = js.Any.fromFunction1(utf8Decoder), utf8Encoder = js.Any.fromFunction1(utf8Encoder))
      __obj.asInstanceOf[KinesisResolvedConfiguration]
    }
    
    @scala.inline
    implicit class KinesisResolvedConfigurationMutableBuilder[Self <: KinesisResolvedConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase64Decoder(value: /* input */ String => Uint8Array): Self = StObject.set(x, "base64Decoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBase64Encoder(value: /* input */ Uint8Array => String): Self = StObject.set(x, "base64Encoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBodyLengthChecker(value: js.Any => js.UndefOr[Double]): Self = StObject.set(x, "bodyLengthChecker", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCredentials(value: () => js.Promise[Credentials]): Self = StObject.set(x, "credentials", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEndpoint(
        value: () => js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ js.Any
            ]
      ): Self = StObject.set(x, "endpoint", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHandler(value: /* context */ HandlerExecutionContext => DeserializeHandler[js.Object, js.Object]): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParser(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ResponseParser<Blob> */ js.Any
      ): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSerializer(value: () => js.Promise[RequestSerializer[Blob, js.Any]]): Self = StObject.set(x, "serializer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigner(value: RequestSigner): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningName(value: String): Self = StObject.set(x, "signingName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslEnabled(value: Boolean): Self = StObject.set(x, "sslEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamCollector(value: /* stream */ js.Any => js.Promise[Uint8Array]): Self = StObject.set(x, "streamCollector", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUrlParser(value: /* url */ String => Endpoint): Self = StObject.set(x, "urlParser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUtf8Decoder(value: /* input */ String => Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUtf8Encoder(value: /* input */ Uint8Array => String): Self = StObject.set(x, "utf8Encoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_user_injected_http_handler(value: Boolean): Self = StObject.set(x, "_user_injected_http_handler", value.asInstanceOf[js.Any])
    }
  }
}
