package typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod

import typings.atAwsDashSdkClientDashS3DashBrowser.Anon_Hash
import typings.atAwsDashSdkTypes.buildCredentialsMod.Credentials
import typings.atAwsDashSdkTypes.buildCryptoMod.HashConstructor
import typings.atAwsDashSdkTypes.buildCryptoMod.StreamHasher
import typings.atAwsDashSdkTypes.buildHttpMod.HttpEndpoint
import typings.atAwsDashSdkTypes.buildHttpMod.HttpHandler
import typings.atAwsDashSdkTypes.buildHttpMod.HttpOptions
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Terminalware
import typings.atAwsDashSdkTypes.buildSignatureMod.RequestSigner
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.StreamCollector
import typings.atAwsDashSdkTypes.buildUtilMod.Decoder
import typings.atAwsDashSdkTypes.buildUtilMod.DelayDecider
import typings.atAwsDashSdkTypes.buildUtilMod.Encoder
import typings.atAwsDashSdkTypes.buildUtilMod.Provider
import typings.atAwsDashSdkTypes.buildUtilMod.RetryDecider
import typings.atAwsDashSdkTypes.buildUtilMod.UrlParser
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Configuration extends js.Object {
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
    */
  var credentials: Credentials | Provider[Credentials]
  /**
    * A function that determines how long (in milliseconds) the SDK should wait before retrying a request
    */
  var delayDecider: js.UndefOr[DelayDecider] = js.undefined
  /**
    * Whether body signing should be disabled. Body signing can only be disabled when using HTTPS
    */
  var disableBodySigning: js.UndefOr[Boolean] = js.undefined
  /**
    * The fully qualified endpoint of the webservice. This is only required when using a custom endpoint (for example, when using a local version of S3).
    */
  var endpoint: js.UndefOr[String | HttpEndpoint | Provider[HttpEndpoint]] = js.undefined
  /**
    * The endpoint provider to call if no endpoint is provided
    */
  var endpointProvider: js.UndefOr[js.Any] = js.undefined
  /**
    * Whether to force path style URLs for S3 objects (e.g., https://s3.amazonaws.com/<bucketName>/<key> instead of https://<bucketName>.s3.amazonaws.com/<key>
    */
  var forcePathStyle: js.UndefOr[Boolean] = js.undefined
  /**
    * The handler to use as the core of the client's middleware stack
    */
  var handler: js.UndefOr[Terminalware[_, Blob]] = js.undefined
  /**
    * The HTTP handler to use
    */
  var httpHandler: js.UndefOr[HttpHandler[Blob, HttpOptions]] = js.undefined
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
  var md5: js.UndefOr[Anon_Hash] = js.undefined
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
  var streamCollector: js.UndefOr[StreamCollector[Blob]] = js.undefined
  /**
    * A function that, given a hash constructor and a stream, calculates the hash of the streamed value
    */
  var streamHasher: js.UndefOr[StreamHasher[Blob]] = js.undefined
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
  @scala.inline
  def apply(
    credentials: Credentials | Provider[Credentials],
    region: String | Provider[String],
    base64Decoder: Decoder = null,
    base64Encoder: Encoder = null,
    bucketEndpoint: js.UndefOr[Boolean] = js.undefined,
    delayDecider: DelayDecider = null,
    disableBodySigning: js.UndefOr[Boolean] = js.undefined,
    endpoint: String | HttpEndpoint | Provider[HttpEndpoint] = null,
    endpointProvider: js.Any = null,
    forcePathStyle: js.UndefOr[Boolean] = js.undefined,
    handler: Terminalware[_, Blob] = null,
    httpHandler: HttpHandler[Blob, HttpOptions] = null,
    maxRedirects: Int | Double = null,
    maxRetries: Int | Double = null,
    md5: Anon_Hash = null,
    profile: String = null,
    retryDecider: RetryDecider = null,
    sha256: HashConstructor = null,
    signer: RequestSigner = null,
    signingName: String = null,
    sslEnabled: js.UndefOr[Boolean] = js.undefined,
    streamCollector: StreamCollector[Blob] = null,
    streamHasher: StreamHasher[Blob] = null,
    urlParser: UrlParser = null,
    useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined,
    useDualstackEndpoint: js.UndefOr[Boolean] = js.undefined,
    utf8Decoder: Decoder = null,
    utf8Encoder: Encoder = null
  ): S3Configuration = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    if (base64Decoder != null) __obj.updateDynamic("base64Decoder")(base64Decoder)
    if (base64Encoder != null) __obj.updateDynamic("base64Encoder")(base64Encoder)
    if (!js.isUndefined(bucketEndpoint)) __obj.updateDynamic("bucketEndpoint")(bucketEndpoint)
    if (delayDecider != null) __obj.updateDynamic("delayDecider")(delayDecider)
    if (!js.isUndefined(disableBodySigning)) __obj.updateDynamic("disableBodySigning")(disableBodySigning)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (endpointProvider != null) __obj.updateDynamic("endpointProvider")(endpointProvider)
    if (!js.isUndefined(forcePathStyle)) __obj.updateDynamic("forcePathStyle")(forcePathStyle)
    if (handler != null) __obj.updateDynamic("handler")(handler)
    if (httpHandler != null) __obj.updateDynamic("httpHandler")(httpHandler)
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (md5 != null) __obj.updateDynamic("md5")(md5)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (retryDecider != null) __obj.updateDynamic("retryDecider")(retryDecider)
    if (sha256 != null) __obj.updateDynamic("sha256")(sha256)
    if (signer != null) __obj.updateDynamic("signer")(signer)
    if (signingName != null) __obj.updateDynamic("signingName")(signingName)
    if (!js.isUndefined(sslEnabled)) __obj.updateDynamic("sslEnabled")(sslEnabled)
    if (streamCollector != null) __obj.updateDynamic("streamCollector")(streamCollector)
    if (streamHasher != null) __obj.updateDynamic("streamHasher")(streamHasher)
    if (urlParser != null) __obj.updateDynamic("urlParser")(urlParser)
    if (!js.isUndefined(useAccelerateEndpoint)) __obj.updateDynamic("useAccelerateEndpoint")(useAccelerateEndpoint)
    if (!js.isUndefined(useDualstackEndpoint)) __obj.updateDynamic("useDualstackEndpoint")(useDualstackEndpoint)
    if (utf8Decoder != null) __obj.updateDynamic("utf8Decoder")(utf8Decoder)
    if (utf8Encoder != null) __obj.updateDynamic("utf8Encoder")(utf8Encoder)
    __obj.asInstanceOf[S3Configuration]
  }
}

