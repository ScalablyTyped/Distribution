package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.anon.Instantiable
import typings.awsSdkTypes.distTypesCredentialsMod.Credentials
import typings.awsSdkTypes.distTypesCryptoMod.HashConstructor
import typings.awsSdkTypes.distTypesCryptoMod.StreamHasher
import typings.awsSdkTypes.distTypesHttpMod.Endpoint
import typings.awsSdkTypes.distTypesMiddlewareMod.DeserializeHandler
import typings.awsSdkTypes.distTypesMiddlewareMod.HandlerExecutionContext
import typings.awsSdkTypes.distTypesMiddlewareMod.Terminalware
import typings.awsSdkTypes.distTypesSerdeMod.RequestSerializer
import typings.awsSdkTypes.distTypesSerdeMod.StreamCollector
import typings.awsSdkTypes.distTypesSignatureMod.RequestSigner
import typings.awsSdkTypes.distTypesUtilMod.Decoder
import typings.awsSdkTypes.distTypesUtilMod.Encoder
import typings.awsSdkTypes.distTypesUtilMod.Provider
import typings.awsSdkTypes.distTypesUtilMod.UrlParser
import typings.node.streamMod.Readable
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3ConfigurationMod {
  
  @JSImport("@aws-sdk/client-s3-node/S3Configuration", "configurationProperties")
  @js.native
  val configurationProperties: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ConfigurationDefinition<S3ResolvableConfiguration, S3ResolvedConfiguration> */ Any = js.native
  
  trait S3Configuration extends StObject {
    
    /**
      * The function that will be used to convert a base64-encoded string to a byte array
      */
    var base64Decoder: js.UndefOr[Decoder] = js.undefined
    
    /**
      * The function that will be used to convert binary data to a base64-encoded string
      */
    var base64Encoder: js.UndefOr[Encoder] = js.undefined
    
    /**
      * Whether the provided endpoint addresses an individual bucket.
      */
    var bucketEndpoint: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The credentials used to sign requests.
      *
      * If no static credentials are supplied, the SDK will attempt to credentials from known environment variables, from shared configuration and credentials files, and from the EC2 Instance Metadata Service, in that order.
      */
    var credentials: js.UndefOr[Credentials | Provider[Credentials]] = js.undefined
    
    /**
      * A function that determines how long (in milliseconds) the SDK should wait before retrying a request
      */
    var delayDecider: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.DelayDecider */ Any
      ] = js.undefined
    
    /**
      * Whether body signing should be disabled. Body signing can only be disabled when using HTTPS
      */
    var disableBodySigning: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The fully qualified endpoint of the webservice. This is only required when using a custom endpoint (for example, when using a local version of S3).
      */
    var endpoint: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ Any) | (Provider[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ Any
        ])
      ] = js.undefined
    
    /**
      * The endpoint provider to call if no endpoint is provided
      */
    var endpointProvider: js.UndefOr[Any] = js.undefined
    
    /**
      * Whether to force path style URLs for S3 objects (e.g., https://s3.amazonaws.com/<bucketName>/<key> instead of https://<bucketName>.s3.amazonaws.com/<key>
      */
    var forcePathStyle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The handler to use as the core of the client's middleware stack
      */
    var handler: js.UndefOr[Terminalware] = js.undefined
    
    /**
      * The HTTP handler to use
      */
    var httpHandler: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpHandler<_stream.Readable> */ Any
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
      * A constructor for a class implementing the @aws-sdk/types.Hash interface that computes the MD5 checksum of a string or binary buffer
      */
    var md5: js.UndefOr[Instantiable] = js.undefined
    
    /**
      * The configuration profile to use.
      */
    var profile: js.UndefOr[String] = js.undefined
    
    /**
      * The AWS region to which this client will send requests
      */
    var region: js.UndefOr[String | Provider[String]] = js.undefined
    
    /**
      * A function that determines whether an error is retryable
      */
    var retryDecider: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.RetryDecider */ Any
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
      * A function that, given a hash constructor and a stream, calculates the hash of the streamed value
      */
    var streamHasher: js.UndefOr[StreamHasher[Readable]] = js.undefined
    
    /**
      * The function that will be used to convert strings into HTTP endpoints
      */
    var urlParser: js.UndefOr[UrlParser] = js.undefined
    
    /**
      * Whether to use the S3 Transfer Acceleration endpoint by default
      */
    var useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables IPv6/IPv4 dualstack endpoint. When a DNS lookup is performed on an endpoint of this type, it returns an “A” record with an IPv4 address and an “AAAA” record with an IPv6 address. In most cases the network stack in the client environment will automatically prefer the AAAA record and make a connection using the IPv6 address. Note, however, that currently on Windows, the IPv4 address will be preferred.
      */
    var useDualstackEndpoint: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The function that will be used to convert a UTF8-encoded string to a byte array
      */
    var utf8Decoder: js.UndefOr[Decoder] = js.undefined
    
    /**
      * The function that will be used to convert binary data to a UTF-8 encoded string
      */
    var utf8Encoder: js.UndefOr[Encoder] = js.undefined
  }
  object S3Configuration {
    
    inline def apply(): S3Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3Configuration]
    }
    
    extension [Self <: S3Configuration](x: Self) {
      
      inline def setBase64Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = StObject.set(x, "base64Decoder", js.Any.fromFunction1(value))
      
      inline def setBase64DecoderUndefined: Self = StObject.set(x, "base64Decoder", js.undefined)
      
      inline def setBase64Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "base64Encoder", js.Any.fromFunction1(value))
      
      inline def setBase64EncoderUndefined: Self = StObject.set(x, "base64Encoder", js.undefined)
      
      inline def setBucketEndpoint(value: Boolean): Self = StObject.set(x, "bucketEndpoint", value.asInstanceOf[js.Any])
      
      inline def setBucketEndpointUndefined: Self = StObject.set(x, "bucketEndpoint", js.undefined)
      
      inline def setCredentials(value: Credentials | Provider[Credentials]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsFunction0(value: () => js.Promise[Credentials]): Self = StObject.set(x, "credentials", js.Any.fromFunction0(value))
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setDelayDecider(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.DelayDecider */ Any
      ): Self = StObject.set(x, "delayDecider", value.asInstanceOf[js.Any])
      
      inline def setDelayDeciderUndefined: Self = StObject.set(x, "delayDecider", js.undefined)
      
      inline def setDisableBodySigning(value: Boolean): Self = StObject.set(x, "disableBodySigning", value.asInstanceOf[js.Any])
      
      inline def setDisableBodySigningUndefined: Self = StObject.set(x, "disableBodySigning", js.undefined)
      
      inline def setEndpoint(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ Any) | (Provider[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ Any
            ])
      ): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointFunction0(
        value: () => js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ Any
            ]
      ): Self = StObject.set(x, "endpoint", js.Any.fromFunction0(value))
      
      inline def setEndpointProvider(value: Any): Self = StObject.set(x, "endpointProvider", value.asInstanceOf[js.Any])
      
      inline def setEndpointProviderUndefined: Self = StObject.set(x, "endpointProvider", js.undefined)
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setForcePathStyle(value: Boolean): Self = StObject.set(x, "forcePathStyle", value.asInstanceOf[js.Any])
      
      inline def setForcePathStyleUndefined: Self = StObject.set(x, "forcePathStyle", js.undefined)
      
      inline def setHandler(value: /* context */ HandlerExecutionContext => DeserializeHandler[js.Object, js.Object]): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      inline def setHttpHandler(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpHandler<_stream.Readable> */ Any
      ): Self = StObject.set(x, "httpHandler", value.asInstanceOf[js.Any])
      
      inline def setHttpHandlerUndefined: Self = StObject.set(x, "httpHandler", js.undefined)
      
      inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      inline def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setMd5(value: Instantiable): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
      
      inline def setMd5Undefined: Self = StObject.set(x, "md5", js.undefined)
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setRegion(value: String | Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionFunction0(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRetryDecider(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.RetryDecider */ Any
      ): Self = StObject.set(x, "retryDecider", value.asInstanceOf[js.Any])
      
      inline def setRetryDeciderUndefined: Self = StObject.set(x, "retryDecider", js.undefined)
      
      inline def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
      
      inline def setSigner(value: RequestSigner): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
      
      inline def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
      
      inline def setSigningName(value: String): Self = StObject.set(x, "signingName", value.asInstanceOf[js.Any])
      
      inline def setSigningNameUndefined: Self = StObject.set(x, "signingName", js.undefined)
      
      inline def setSslEnabled(value: Boolean): Self = StObject.set(x, "sslEnabled", value.asInstanceOf[js.Any])
      
      inline def setSslEnabledUndefined: Self = StObject.set(x, "sslEnabled", js.undefined)
      
      inline def setStreamCollector(value: /* stream */ Any => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "streamCollector", js.Any.fromFunction1(value))
      
      inline def setStreamCollectorUndefined: Self = StObject.set(x, "streamCollector", js.undefined)
      
      inline def setStreamHasher(value: (/* hashCtor */ HashConstructor, Readable) => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "streamHasher", js.Any.fromFunction2(value))
      
      inline def setStreamHasherUndefined: Self = StObject.set(x, "streamHasher", js.undefined)
      
      inline def setUrlParser(value: /* url */ String | URL => Endpoint): Self = StObject.set(x, "urlParser", js.Any.fromFunction1(value))
      
      inline def setUrlParserUndefined: Self = StObject.set(x, "urlParser", js.undefined)
      
      inline def setUseAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "useAccelerateEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseAccelerateEndpointUndefined: Self = StObject.set(x, "useAccelerateEndpoint", js.undefined)
      
      inline def setUseDualstackEndpoint(value: Boolean): Self = StObject.set(x, "useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseDualstackEndpointUndefined: Self = StObject.set(x, "useDualstackEndpoint", js.undefined)
      
      inline def setUtf8Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
      
      inline def setUtf8DecoderUndefined: Self = StObject.set(x, "utf8Decoder", js.undefined)
      
      inline def setUtf8Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "utf8Encoder", js.Any.fromFunction1(value))
      
      inline def setUtf8EncoderUndefined: Self = StObject.set(x, "utf8Encoder", js.undefined)
    }
  }
  
  trait S3ResolvableConfiguration
    extends StObject
       with S3Configuration {
    
    /**
      * Whether the HTTP handler was injected by the user and should thus not be destroyed when this client is
      */
    var _user_injected_http_handler: Any
    
    /**
      * A function that can calculate the length of a request body.
      */
    def bodyLengthChecker(body: Any): js.UndefOr[Double]
    
    /**
      * The parser to use when converting HTTP responses to SDK output types
      */
    var parser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ResponseParser<_stream.Readable> */ Any
    
    /**
      * The serializer to use when converting SDK input to HTTP requests
      */
    def serializer(): js.Promise[RequestSerializer[Readable, Any]]
    /**
      * The serializer to use when converting SDK input to HTTP requests
      */
    @JSName("serializer")
    var serializer_Original: Provider[RequestSerializer[Readable, Any]]
  }
  object S3ResolvableConfiguration {
    
    inline def apply(
      _user_injected_http_handler: Any,
      bodyLengthChecker: Any => js.UndefOr[Double],
      parser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ResponseParser<_stream.Readable> */ Any,
      serializer: () => js.Promise[RequestSerializer[Readable, Any]]
    ): S3ResolvableConfiguration = {
      val __obj = js.Dynamic.literal(_user_injected_http_handler = _user_injected_http_handler.asInstanceOf[js.Any], bodyLengthChecker = js.Any.fromFunction1(bodyLengthChecker), parser = parser.asInstanceOf[js.Any], serializer = js.Any.fromFunction0(serializer))
      __obj.asInstanceOf[S3ResolvableConfiguration]
    }
    
    extension [Self <: S3ResolvableConfiguration](x: Self) {
      
      inline def setBodyLengthChecker(value: Any => js.UndefOr[Double]): Self = StObject.set(x, "bodyLengthChecker", js.Any.fromFunction1(value))
      
      inline def setParser(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ResponseParser<_stream.Readable> */ Any
      ): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setSerializer(value: () => js.Promise[RequestSerializer[Readable, Any]]): Self = StObject.set(x, "serializer", js.Any.fromFunction0(value))
      
      inline def set_user_injected_http_handler(value: Any): Self = StObject.set(x, "_user_injected_http_handler", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ClientResolvedConfigurationBase<OutputTypesUnion, _stream.Readable> * / any */ trait S3ResolvedConfiguration
    extends StObject
       with S3Configuration {
    
    var _user_injected_http_handler: Boolean
    
    @JSName("base64Decoder")
    def base64Decoder_MS3ResolvedConfiguration(input: String): js.typedarray.Uint8Array
    @JSName("base64Decoder")
    var base64Decoder_Original: Decoder
    
    @JSName("base64Encoder")
    def base64Encoder_MS3ResolvedConfiguration(input: js.typedarray.Uint8Array): String
    @JSName("base64Encoder")
    var base64Encoder_Original: Encoder
    
    def bodyLengthChecker(body: Any): js.UndefOr[Double]
    
    @JSName("bucketEndpoint")
    var bucketEndpoint_S3ResolvedConfiguration: Boolean
    
    @JSName("credentials")
    def credentials_MS3ResolvedConfiguration(): js.Promise[Credentials]
    @JSName("credentials")
    var credentials_Original: Provider[Credentials]
    
    @JSName("disableBodySigning")
    var disableBodySigning_S3ResolvedConfiguration: Boolean
    
    @JSName("endpoint")
    def endpoint_MS3ResolvedConfiguration(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ Any
      ]
    @JSName("endpoint")
    var endpoint_Original: Provider[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ Any
      ]
    
    @JSName("forcePathStyle")
    var forcePathStyle_S3ResolvedConfiguration: Boolean
    
    @JSName("handler")
    def handler_MS3ResolvedConfiguration[Input /* <: js.Object */, Output /* <: js.Object */](context: HandlerExecutionContext): DeserializeHandler[Input, Output]
    @JSName("handler")
    var handler_Original: Terminalware
    
    @JSName("maxRedirects")
    var maxRedirects_S3ResolvedConfiguration: Double
    
    @JSName("maxRetries")
    var maxRetries_S3ResolvedConfiguration: Double
    
    @JSName("md5")
    var md5_S3ResolvedConfiguration: Instantiable
    
    var parser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ResponseParser<_stream.Readable> */ Any
    
    @JSName("region")
    def region_MS3ResolvedConfiguration(): js.Promise[String]
    @JSName("region")
    var region_Original: Provider[String]
    
    def serializer(): js.Promise[RequestSerializer[Readable, Any]]
    @JSName("serializer")
    var serializer_Original: Provider[RequestSerializer[Readable, Any]]
    
    @JSName("sha256")
    var sha256_S3ResolvedConfiguration: HashConstructor
    
    @JSName("signer")
    var signer_S3ResolvedConfiguration: RequestSigner
    
    @JSName("signingName")
    var signingName_S3ResolvedConfiguration: String
    
    @JSName("sslEnabled")
    var sslEnabled_S3ResolvedConfiguration: Boolean
    
    @JSName("streamCollector")
    def streamCollector_MS3ResolvedConfiguration(stream: Any): js.Promise[js.typedarray.Uint8Array]
    @JSName("streamCollector")
    var streamCollector_Original: StreamCollector
    
    @JSName("streamHasher")
    def streamHasher_MS3ResolvedConfiguration(hashCtor: HashConstructor, stream: Readable): js.Promise[js.typedarray.Uint8Array]
    @JSName("streamHasher")
    var streamHasher_Original: StreamHasher[Readable]
    
    @JSName("urlParser")
    def urlParser_MS3ResolvedConfiguration(url: String): Endpoint
    @JSName("urlParser")
    def urlParser_MS3ResolvedConfiguration(url: URL): Endpoint
    @JSName("urlParser")
    var urlParser_Original: UrlParser
    
    @JSName("useAccelerateEndpoint")
    var useAccelerateEndpoint_S3ResolvedConfiguration: Boolean
    
    @JSName("useDualstackEndpoint")
    var useDualstackEndpoint_S3ResolvedConfiguration: Boolean
    
    @JSName("utf8Decoder")
    def utf8Decoder_MS3ResolvedConfiguration(input: String): js.typedarray.Uint8Array
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder
    
    @JSName("utf8Encoder")
    def utf8Encoder_MS3ResolvedConfiguration(input: js.typedarray.Uint8Array): String
    @JSName("utf8Encoder")
    var utf8Encoder_Original: Encoder
  }
  object S3ResolvedConfiguration {
    
    inline def apply(
      _user_injected_http_handler: Boolean,
      base64Decoder: /* input */ String => js.typedarray.Uint8Array,
      base64Encoder: /* input */ js.typedarray.Uint8Array => String,
      bodyLengthChecker: Any => js.UndefOr[Double],
      bucketEndpoint: Boolean,
      credentials: () => js.Promise[Credentials],
      disableBodySigning: Boolean,
      endpoint: () => js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ Any
        ],
      forcePathStyle: Boolean,
      handler: /* context */ HandlerExecutionContext => DeserializeHandler[js.Object, js.Object],
      maxRedirects: Double,
      maxRetries: Double,
      md5: Instantiable,
      parser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ResponseParser<_stream.Readable> */ Any,
      region: () => js.Promise[String],
      serializer: () => js.Promise[RequestSerializer[Readable, Any]],
      sha256: HashConstructor,
      signer: RequestSigner,
      signingName: String,
      sslEnabled: Boolean,
      streamCollector: /* stream */ Any => js.Promise[js.typedarray.Uint8Array],
      streamHasher: (/* hashCtor */ HashConstructor, Readable) => js.Promise[js.typedarray.Uint8Array],
      urlParser: /* url */ String | URL => Endpoint,
      useAccelerateEndpoint: Boolean,
      useDualstackEndpoint: Boolean,
      utf8Decoder: /* input */ String => js.typedarray.Uint8Array,
      utf8Encoder: /* input */ js.typedarray.Uint8Array => String
    ): S3ResolvedConfiguration = {
      val __obj = js.Dynamic.literal(_user_injected_http_handler = _user_injected_http_handler.asInstanceOf[js.Any], base64Decoder = js.Any.fromFunction1(base64Decoder), base64Encoder = js.Any.fromFunction1(base64Encoder), bodyLengthChecker = js.Any.fromFunction1(bodyLengthChecker), bucketEndpoint = bucketEndpoint.asInstanceOf[js.Any], credentials = js.Any.fromFunction0(credentials), disableBodySigning = disableBodySigning.asInstanceOf[js.Any], endpoint = js.Any.fromFunction0(endpoint), forcePathStyle = forcePathStyle.asInstanceOf[js.Any], handler = js.Any.fromFunction1(handler), maxRedirects = maxRedirects.asInstanceOf[js.Any], maxRetries = maxRetries.asInstanceOf[js.Any], md5 = md5.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], region = js.Any.fromFunction0(region), serializer = js.Any.fromFunction0(serializer), sha256 = sha256.asInstanceOf[js.Any], signer = signer.asInstanceOf[js.Any], signingName = signingName.asInstanceOf[js.Any], sslEnabled = sslEnabled.asInstanceOf[js.Any], streamCollector = js.Any.fromFunction1(streamCollector), streamHasher = js.Any.fromFunction2(streamHasher), urlParser = js.Any.fromFunction1(urlParser), useAccelerateEndpoint = useAccelerateEndpoint.asInstanceOf[js.Any], useDualstackEndpoint = useDualstackEndpoint.asInstanceOf[js.Any], utf8Decoder = js.Any.fromFunction1(utf8Decoder), utf8Encoder = js.Any.fromFunction1(utf8Encoder))
      __obj.asInstanceOf[S3ResolvedConfiguration]
    }
    
    extension [Self <: S3ResolvedConfiguration](x: Self) {
      
      inline def setBase64Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = StObject.set(x, "base64Decoder", js.Any.fromFunction1(value))
      
      inline def setBase64Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "base64Encoder", js.Any.fromFunction1(value))
      
      inline def setBodyLengthChecker(value: Any => js.UndefOr[Double]): Self = StObject.set(x, "bodyLengthChecker", js.Any.fromFunction1(value))
      
      inline def setBucketEndpoint(value: Boolean): Self = StObject.set(x, "bucketEndpoint", value.asInstanceOf[js.Any])
      
      inline def setCredentials(value: () => js.Promise[Credentials]): Self = StObject.set(x, "credentials", js.Any.fromFunction0(value))
      
      inline def setDisableBodySigning(value: Boolean): Self = StObject.set(x, "disableBodySigning", value.asInstanceOf[js.Any])
      
      inline def setEndpoint(
        value: () => js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ Any
            ]
      ): Self = StObject.set(x, "endpoint", js.Any.fromFunction0(value))
      
      inline def setForcePathStyle(value: Boolean): Self = StObject.set(x, "forcePathStyle", value.asInstanceOf[js.Any])
      
      inline def setHandler(value: /* context */ HandlerExecutionContext => DeserializeHandler[js.Object, js.Object]): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMd5(value: Instantiable): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
      
      inline def setParser(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ResponseParser<_stream.Readable> */ Any
      ): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      inline def setSerializer(value: () => js.Promise[RequestSerializer[Readable, Any]]): Self = StObject.set(x, "serializer", js.Any.fromFunction0(value))
      
      inline def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      inline def setSigner(value: RequestSigner): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
      
      inline def setSigningName(value: String): Self = StObject.set(x, "signingName", value.asInstanceOf[js.Any])
      
      inline def setSslEnabled(value: Boolean): Self = StObject.set(x, "sslEnabled", value.asInstanceOf[js.Any])
      
      inline def setStreamCollector(value: /* stream */ Any => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "streamCollector", js.Any.fromFunction1(value))
      
      inline def setStreamHasher(value: (/* hashCtor */ HashConstructor, Readable) => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "streamHasher", js.Any.fromFunction2(value))
      
      inline def setUrlParser(value: /* url */ String | URL => Endpoint): Self = StObject.set(x, "urlParser", js.Any.fromFunction1(value))
      
      inline def setUseAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "useAccelerateEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseDualstackEndpoint(value: Boolean): Self = StObject.set(x, "useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUtf8Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
      
      inline def setUtf8Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "utf8Encoder", js.Any.fromFunction1(value))
      
      inline def set_user_injected_http_handler(value: Boolean): Self = StObject.set(x, "_user_injected_http_handler", value.asInstanceOf[js.Any])
    }
  }
}
