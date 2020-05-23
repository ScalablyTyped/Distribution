package typings.awsSdkClientGlacierNode.glacierConfigurationMod

import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.httpMod.HttpEndpoint
import typings.awsSdkTypes.httpMod.HttpHandler
import typings.awsSdkTypes.httpMod.HttpOptions
import typings.awsSdkTypes.middlewareMod.FinalizeHandler
import typings.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typings.awsSdkTypes.middlewareMod.Terminalware
import typings.awsSdkTypes.signatureMod.RequestSigner
import typings.awsSdkTypes.unmarshallerMod.StreamCollector
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.DelayDecider
import typings.awsSdkTypes.utilMod.Encoder
import typings.awsSdkTypes.utilMod.Provider
import typings.awsSdkTypes.utilMod.RetryDecider
import typings.awsSdkTypes.utilMod.SdkError
import typings.awsSdkTypes.utilMod.UrlParser
import typings.node.streamMod.Readable
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlacierConfiguration extends js.Object {
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
    *
    * If no static credentials are supplied, the SDK will attempt to credentials from known environment variables, from shared configuration and credentials files, and from the EC2 Instance Metadata Service, in that order.
    */
  var credentials: js.UndefOr[Credentials | Provider[Credentials]] = js.undefined
  /**
    * A function that determines how long (in milliseconds) the SDK should wait before retrying a request
    */
  var delayDecider: js.UndefOr[DelayDecider] = js.undefined
  /**
    * The fully qualified endpoint of the webservice. This is only required when using a custom endpoint (for example, when using a local version of S3).
    */
  var endpoint: js.UndefOr[String | HttpEndpoint | Provider[HttpEndpoint]] = js.undefined
  /**
    * The endpoint provider to call if no endpoint is provided
    */
  var endpointProvider: js.UndefOr[js.Any] = js.undefined
  /**
    * The handler to use as the core of the client's middleware stack
    */
  var handler: js.UndefOr[Terminalware[_, Readable]] = js.undefined
  /**
    * The HTTP handler to use
    */
  var httpHandler: js.UndefOr[HttpHandler[Readable, HttpOptions]] = js.undefined
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
  var region: js.UndefOr[String | Provider[String]] = js.undefined
  /**
    * A function that determines whether an error is retryable
    */
  var retryDecider: js.UndefOr[RetryDecider] = js.undefined
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
  var streamCollector: js.UndefOr[StreamCollector[Readable]] = js.undefined
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

object GlacierConfiguration {
  @scala.inline
  def apply(
    base64Decoder: /* input */ String => Uint8Array = null,
    base64Encoder: /* input */ Uint8Array => String = null,
    credentials: Credentials | Provider[Credentials] = null,
    delayDecider: (/* delayBase */ Double, /* attempts */ Double) => Double = null,
    endpoint: String | HttpEndpoint | Provider[HttpEndpoint] = null,
    endpointProvider: js.Any = null,
    handler: /* context */ HandlerExecutionContext => FinalizeHandler[js.Object, _, Readable] = null,
    httpHandler: HttpHandler[Readable, HttpOptions] = null,
    maxRedirects: js.UndefOr[Double] = js.undefined,
    maxRetries: js.UndefOr[Double] = js.undefined,
    profile: String = null,
    region: String | Provider[String] = null,
    retryDecider: /* error */ SdkError => Boolean = null,
    sha256: HashConstructor = null,
    signer: RequestSigner = null,
    signingName: String = null,
    sslEnabled: js.UndefOr[Boolean] = js.undefined,
    streamCollector: Readable => js.Promise[Uint8Array] = null,
    urlParser: /* url */ String => HttpEndpoint = null,
    utf8Decoder: /* input */ String => Uint8Array = null,
    utf8Encoder: /* input */ Uint8Array => String = null
  ): GlacierConfiguration = {
    val __obj = js.Dynamic.literal()
    if (base64Decoder != null) __obj.updateDynamic("base64Decoder")(js.Any.fromFunction1(base64Decoder))
    if (base64Encoder != null) __obj.updateDynamic("base64Encoder")(js.Any.fromFunction1(base64Encoder))
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (delayDecider != null) __obj.updateDynamic("delayDecider")(js.Any.fromFunction2(delayDecider))
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (endpointProvider != null) __obj.updateDynamic("endpointProvider")(endpointProvider.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction1(handler))
    if (httpHandler != null) __obj.updateDynamic("httpHandler")(httpHandler.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRedirects)) __obj.updateDynamic("maxRedirects")(maxRedirects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (retryDecider != null) __obj.updateDynamic("retryDecider")(js.Any.fromFunction1(retryDecider))
    if (sha256 != null) __obj.updateDynamic("sha256")(sha256.asInstanceOf[js.Any])
    if (signer != null) __obj.updateDynamic("signer")(signer.asInstanceOf[js.Any])
    if (signingName != null) __obj.updateDynamic("signingName")(signingName.asInstanceOf[js.Any])
    if (!js.isUndefined(sslEnabled)) __obj.updateDynamic("sslEnabled")(sslEnabled.get.asInstanceOf[js.Any])
    if (streamCollector != null) __obj.updateDynamic("streamCollector")(js.Any.fromFunction1(streamCollector))
    if (urlParser != null) __obj.updateDynamic("urlParser")(js.Any.fromFunction1(urlParser))
    if (utf8Decoder != null) __obj.updateDynamic("utf8Decoder")(js.Any.fromFunction1(utf8Decoder))
    if (utf8Encoder != null) __obj.updateDynamic("utf8Encoder")(js.Any.fromFunction1(utf8Encoder))
    __obj.asInstanceOf[GlacierConfiguration]
  }
}

