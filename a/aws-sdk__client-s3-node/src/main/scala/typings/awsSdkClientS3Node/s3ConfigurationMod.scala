package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.anon.Instantiable
import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.cryptoMod.StreamHasher
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
import typings.node.streamMod.Readable
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3ConfigurationMod {
  
  @JSImport("@aws-sdk/client-s3-node/S3Configuration", "configurationProperties")
  @js.native
  val configurationProperties: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ConfigurationDefinition<S3ResolvableConfiguration, S3ResolvedConfiguration> */ js.Any = js.native
  
  @js.native
  trait S3Configuration extends StObject {
    
    /**
      * The function that will be used to convert a base64-encoded string to a byte array
      */
    var base64Decoder: js.UndefOr[Decoder] = js.native
    
    /**
      * The function that will be used to convert binary data to a base64-encoded string
      */
    var base64Encoder: js.UndefOr[Encoder] = js.native
    
    /**
      * Whether the provided endpoint addresses an individual bucket.
      */
    var bucketEndpoint: js.UndefOr[Boolean] = js.native
    
    /**
      * The credentials used to sign requests.
      *
      * If no static credentials are supplied, the SDK will attempt to credentials from known environment variables, from shared configuration and credentials files, and from the EC2 Instance Metadata Service, in that order.
      */
    var credentials: js.UndefOr[Credentials | Provider[Credentials]] = js.native
    
    /**
      * A function that determines how long (in milliseconds) the SDK should wait before retrying a request
      */
    var delayDecider: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.DelayDecider */ js.Any
      ] = js.native
    
    /**
      * Whether body signing should be disabled. Body signing can only be disabled when using HTTPS
      */
    var disableBodySigning: js.UndefOr[Boolean] = js.native
    
    /**
      * The fully qualified endpoint of the webservice. This is only required when using a custom endpoint (for example, when using a local version of S3).
      */
    var endpoint: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ js.Any) | (Provider[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ _
        ])
      ] = js.native
    
    /**
      * The endpoint provider to call if no endpoint is provided
      */
    var endpointProvider: js.UndefOr[js.Any] = js.native
    
    /**
      * Whether to force path style URLs for S3 objects (e.g., https://s3.amazonaws.com/<bucketName>/<key> instead of https://<bucketName>.s3.amazonaws.com/<key>
      */
    var forcePathStyle: js.UndefOr[Boolean] = js.native
    
    /**
      * The handler to use as the core of the client's middleware stack
      */
    var handler: js.UndefOr[Terminalware] = js.native
    
    /**
      * The HTTP handler to use
      */
    var httpHandler: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpHandler<_stream.Readable> */ js.Any
      ] = js.native
    
    /**
      * The maximum number of redirects to follow for a service request. Set to `0` to disable retries.
      */
    var maxRedirects: js.UndefOr[Double] = js.native
    
    /**
      * The maximum number of times requests that encounter potentially transient failures should be retried
      */
    var maxRetries: js.UndefOr[Double] = js.native
    
    /**
      * A constructor for a class implementing the @aws-sdk/types.Hash interface that computes the MD5 checksum of a string or binary buffer
      */
    var md5: js.UndefOr[Instantiable] = js.native
    
    /**
      * The configuration profile to use.
      */
    var profile: js.UndefOr[String] = js.native
    
    /**
      * The AWS region to which this client will send requests
      */
    var region: js.UndefOr[String | Provider[String]] = js.native
    
    /**
      * A function that determines whether an error is retryable
      */
    var retryDecider: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.RetryDecider */ js.Any
      ] = js.native
    
    /**
      * A constructor for a class implementing the @aws-sdk/types.Hash interface that computes the SHA-256 HMAC or checksum of a string or binary buffer
      */
    var sha256: js.UndefOr[HashConstructor] = js.native
    
    /**
      * The signer to use when signing requests.
      */
    var signer: js.UndefOr[RequestSigner] = js.native
    
    /**
      * The service name with which to sign requests.
      */
    var signingName: js.UndefOr[String] = js.native
    
    /**
      * Whether SSL is enabled for requests.
      */
    var sslEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * A function that converts a stream into an array of bytes.
      */
    var streamCollector: js.UndefOr[StreamCollector] = js.native
    
    /**
      * A function that, given a hash constructor and a stream, calculates the hash of the streamed value
      */
    var streamHasher: js.UndefOr[StreamHasher[Readable]] = js.native
    
    /**
      * The function that will be used to convert strings into HTTP endpoints
      */
    var urlParser: js.UndefOr[UrlParser] = js.native
    
    /**
      * Whether to use the S3 Transfer Acceleration endpoint by default
      */
    var useAccelerateEndpoint: js.UndefOr[Boolean] = js.native
    
    /**
      * Enables IPv6/IPv4 dualstack endpoint. When a DNS lookup is performed on an endpoint of this type, it returns an “A” record with an IPv4 address and an “AAAA” record with an IPv6 address. In most cases the network stack in the client environment will automatically prefer the AAAA record and make a connection using the IPv6 address. Note, however, that currently on Windows, the IPv4 address will be preferred.
      */
    var useDualstackEndpoint: js.UndefOr[Boolean] = js.native
    
    /**
      * The function that will be used to convert a UTF8-encoded string to a byte array
      */
    var utf8Decoder: js.UndefOr[Decoder] = js.native
    
    /**
      * The function that will be used to convert binary data to a UTF-8 encoded string
      */
    var utf8Encoder: js.UndefOr[Encoder] = js.native
  }
  object S3Configuration {
    
    @scala.inline
    def apply(): S3Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3Configuration]
    }
    
    @scala.inline
    implicit class S3ConfigurationMutableBuilder[Self <: S3Configuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase64Decoder(value: /* input */ String => Uint8Array): Self = StObject.set(x, "base64Decoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBase64DecoderUndefined: Self = StObject.set(x, "base64Decoder", js.undefined)
      
      @scala.inline
      def setBase64Encoder(value: /* input */ Uint8Array => String): Self = StObject.set(x, "base64Encoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBase64EncoderUndefined: Self = StObject.set(x, "base64Encoder", js.undefined)
      
      @scala.inline
      def setBucketEndpoint(value: Boolean): Self = StObject.set(x, "bucketEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketEndpointUndefined: Self = StObject.set(x, "bucketEndpoint", js.undefined)
      
      @scala.inline
      def setCredentials(value: Credentials | Provider[Credentials]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsFunction0(value: () => js.Promise[Credentials]): Self = StObject.set(x, "credentials", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setDelayDecider(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.DelayDecider */ js.Any
      ): Self = StObject.set(x, "delayDecider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayDeciderUndefined: Self = StObject.set(x, "delayDecider", js.undefined)
      
      @scala.inline
      def setDisableBodySigning(value: Boolean): Self = StObject.set(x, "disableBodySigning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableBodySigningUndefined: Self = StObject.set(x, "disableBodySigning", js.undefined)
      
      @scala.inline
      def setEndpoint(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ js.Any) | (Provider[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ _
            ])
      ): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointFunction0(
        value: () => js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ _
            ]
      ): Self = StObject.set(x, "endpoint", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEndpointProvider(value: js.Any): Self = StObject.set(x, "endpointProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointProviderUndefined: Self = StObject.set(x, "endpointProvider", js.undefined)
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setForcePathStyle(value: Boolean): Self = StObject.set(x, "forcePathStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForcePathStyleUndefined: Self = StObject.set(x, "forcePathStyle", js.undefined)
      
      @scala.inline
      def setHandler(value: /* context */ HandlerExecutionContext => DeserializeHandler[js.Object, js.Object]): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      @scala.inline
      def setHttpHandler(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpHandler<_stream.Readable> */ js.Any
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
      def setMd5(value: Instantiable): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMd5Undefined: Self = StObject.set(x, "md5", js.undefined)
      
      @scala.inline
      def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      @scala.inline
      def setRegion(value: String | Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionFunction0(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
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
      def setStreamHasher(value: (/* hashCtor */ typings.awsSdkTypes.anon.Instantiable, Readable) => js.Promise[Uint8Array]): Self = StObject.set(x, "streamHasher", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStreamHasherUndefined: Self = StObject.set(x, "streamHasher", js.undefined)
      
      @scala.inline
      def setUrlParser(value: /* url */ String => Endpoint): Self = StObject.set(x, "urlParser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUrlParserUndefined: Self = StObject.set(x, "urlParser", js.undefined)
      
      @scala.inline
      def setUseAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "useAccelerateEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseAccelerateEndpointUndefined: Self = StObject.set(x, "useAccelerateEndpoint", js.undefined)
      
      @scala.inline
      def setUseDualstackEndpoint(value: Boolean): Self = StObject.set(x, "useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseDualstackEndpointUndefined: Self = StObject.set(x, "useDualstackEndpoint", js.undefined)
      
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
  
  @js.native
  trait S3ResolvableConfiguration extends S3Configuration {
    
    /**
      * Whether the HTTP handler was injected by the user and should thus not be destroyed when this client is
      */
    var _user_injected_http_handler: js.Any = js.native
    
    /**
      * A function that can calculate the length of a request body.
      */
    def bodyLengthChecker(body: js.Any): js.UndefOr[Double] = js.native
    
    /**
      * The parser to use when converting HTTP responses to SDK output types
      */
    var parser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ResponseParser<_stream.Readable> */ js.Any = js.native
    
    /**
      * The serializer to use when converting SDK input to HTTP requests
      */
    def serializer(): js.Promise[RequestSerializer[Readable, _]] = js.native
    /**
      * The serializer to use when converting SDK input to HTTP requests
      */
    @JSName("serializer")
    var serializer_Original: Provider[RequestSerializer[Readable, _]] = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ClientResolvedConfigurationBase<OutputTypesUnion, _stream.Readable> * / any */ @js.native
  trait S3ResolvedConfiguration extends S3Configuration {
    
    var _user_injected_http_handler: Boolean = js.native
    
    @JSName("base64Decoder")
    def base64Decoder_MS3ResolvedConfiguration(input: String): Uint8Array = js.native
    @JSName("base64Decoder")
    var base64Decoder_Original: Decoder = js.native
    
    @JSName("base64Encoder")
    def base64Encoder_MS3ResolvedConfiguration(input: Uint8Array): String = js.native
    @JSName("base64Encoder")
    var base64Encoder_Original: Encoder = js.native
    
    def bodyLengthChecker(body: js.Any): js.UndefOr[Double] = js.native
    
    @JSName("bucketEndpoint")
    var bucketEndpoint_S3ResolvedConfiguration: Boolean = js.native
    
    @JSName("credentials")
    def credentials_MS3ResolvedConfiguration(): js.Promise[Credentials] = js.native
    @JSName("credentials")
    var credentials_Original: Provider[Credentials] = js.native
    
    @JSName("disableBodySigning")
    var disableBodySigning_S3ResolvedConfiguration: Boolean = js.native
    
    @JSName("endpoint")
    def endpoint_MS3ResolvedConfiguration(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ _
      ] = js.native
    @JSName("endpoint")
    var endpoint_Original: Provider[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.HttpEndpoint */ _
      ] = js.native
    
    @JSName("forcePathStyle")
    var forcePathStyle_S3ResolvedConfiguration: Boolean = js.native
    
    @JSName("handler")
    def handler_MS3ResolvedConfiguration[Input /* <: js.Object */, Output /* <: js.Object */](context: HandlerExecutionContext): DeserializeHandler[Input, Output] = js.native
    @JSName("handler")
    var handler_Original: Terminalware = js.native
    
    @JSName("maxRedirects")
    var maxRedirects_S3ResolvedConfiguration: Double = js.native
    
    @JSName("maxRetries")
    var maxRetries_S3ResolvedConfiguration: Double = js.native
    
    @JSName("md5")
    var md5_S3ResolvedConfiguration: Instantiable = js.native
    
    var parser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ResponseParser<_stream.Readable> */ js.Any = js.native
    
    @JSName("region")
    def region_MS3ResolvedConfiguration(): js.Promise[String] = js.native
    @JSName("region")
    var region_Original: Provider[String] = js.native
    
    def serializer(): js.Promise[RequestSerializer[Readable, _]] = js.native
    @JSName("serializer")
    var serializer_Original: Provider[RequestSerializer[Readable, _]] = js.native
    
    @JSName("sha256")
    var sha256_S3ResolvedConfiguration: HashConstructor = js.native
    
    @JSName("signer")
    var signer_S3ResolvedConfiguration: RequestSigner = js.native
    
    @JSName("signingName")
    var signingName_S3ResolvedConfiguration: String = js.native
    
    @JSName("sslEnabled")
    var sslEnabled_S3ResolvedConfiguration: Boolean = js.native
    
    @JSName("streamCollector")
    def streamCollector_MS3ResolvedConfiguration(stream: js.Any): js.Promise[Uint8Array] = js.native
    @JSName("streamCollector")
    var streamCollector_Original: StreamCollector = js.native
    
    @JSName("streamHasher")
    def streamHasher_MS3ResolvedConfiguration(hashCtor: typings.awsSdkTypes.anon.Instantiable, stream: Readable): js.Promise[Uint8Array] = js.native
    @JSName("streamHasher")
    var streamHasher_Original: StreamHasher[Readable] = js.native
    
    @JSName("urlParser")
    def urlParser_MS3ResolvedConfiguration(url: String): Endpoint = js.native
    @JSName("urlParser")
    var urlParser_Original: UrlParser = js.native
    
    @JSName("useAccelerateEndpoint")
    var useAccelerateEndpoint_S3ResolvedConfiguration: Boolean = js.native
    
    @JSName("useDualstackEndpoint")
    var useDualstackEndpoint_S3ResolvedConfiguration: Boolean = js.native
    
    @JSName("utf8Decoder")
    def utf8Decoder_MS3ResolvedConfiguration(input: String): Uint8Array = js.native
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder = js.native
    
    @JSName("utf8Encoder")
    def utf8Encoder_MS3ResolvedConfiguration(input: Uint8Array): String = js.native
    @JSName("utf8Encoder")
    var utf8Encoder_Original: Encoder = js.native
  }
}
