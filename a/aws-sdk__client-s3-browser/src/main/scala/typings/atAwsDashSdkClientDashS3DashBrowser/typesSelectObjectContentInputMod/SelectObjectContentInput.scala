package typings.atAwsDashSdkClientDashS3DashBrowser.typesSelectObjectContentInputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.SQL
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod._InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreInputSerializationMod._InputSerialization
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreOutputSerializationMod._OutputSerialization
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreRequestProgressMod._RequestProgress
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildCryptoMod.SourceData
import typings.atAwsDashSdkTypes.buildHttpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectObjectContentInput extends _InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * Whether to use the bucket name as the endpoint for this request. The bucket
    * name must be a domain name with a CNAME record alias to an appropriate virtual
    * hosted-style S3 hostname, e.g. a bucket of `images.johnsmith.net` and a DNS
    * record of:
    *
    * ```
    * images.johnsmith.net CNAME 			images.johnsmith.net.s3.amazonaws.com.
    * ```
    *
    * @see https://docs.aws.amazon.com/AmazonS3/latest/dev/VirtualHosting.html#VirtualHostingCustomURLs
    */
  @JSName("$bucketEndpoint")
  var $bucketEndpoint: js.UndefOr[String] = js.undefined
  /**
    * Whether to force path style URLs for S3 objects (e.g., https://s3.amazonaws.com/<bucketName>/<key> instead of https://<bucketName>.s3.amazonaws.com/<key>
    */
  @JSName("$forcePathStyle")
  var $forcePathStyle: js.UndefOr[Boolean] = js.undefined
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.undefined
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon does not store the encryption key. The key must be appropriate for use with the algorithm specified in the `SSECustomerAlgorithm` parameter
    */
  @JSName("$serverSideEncryptionKey")
  var $serverSideEncryptionKey: js.UndefOr[SourceData] = js.undefined
  /**
    * Whether to use the S3 Transfer Acceleration endpoint by default
    */
  @JSName("$useAccelerateEndpoint")
  var $useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables IPv6/IPv4 dualstack endpoint. When a DNS lookup is performed on an endpoint of this type, it returns an “A” record with an IPv4 address and an “AAAA” record with an IPv6 address. In most cases the network stack in the client environment will automatically prefer the AAAA record and make a connection using the IPv6 address. Note, however, that currently on Windows, the IPv4 address will be preferred.
    */
  @JSName("$useDualstackEndpoint")
  var $useDualstackEndpoint: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>The S3 Bucket.</p>
    */
  var Bucket: String
  /**
    * <p>The expression that is used to query the object.</p>
    */
  var Expression: String
  /**
    * <p>The type of the provided expression (e.g., SQL).</p>
    */
  var ExpressionType: SQL | String
  /**
    * <p>Describes the format of the data in the object that is being queried.</p>
    */
  var InputSerialization: _InputSerialization
  /**
    * <p>The Object Key.</p>
    */
  var Key: String
  /**
    * <p>Describes the format of the data that you want Amazon S3 to return in response.</p>
    */
  var OutputSerialization: _OutputSerialization
  /**
    * <p>Specifies if periodic request progress information should be enabled.</p>
    */
  var RequestProgress: js.UndefOr[_RequestProgress] = js.undefined
  /**
    * <p>The SSE Algorithm used to encrypt the object. For more information, go to <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"> Server-Side Encryption (Using Customer-Provided Encryption Keys</a>. </p>
    */
  var SSECustomerAlgorithm: js.UndefOr[String] = js.undefined
}

object SelectObjectContentInput {
  @scala.inline
  def apply(
    Bucket: String,
    Expression: String,
    ExpressionType: SQL | String,
    InputSerialization: _InputSerialization,
    Key: String,
    OutputSerialization: _OutputSerialization,
    $abortSignal: AbortSignal = null,
    $bucketEndpoint: String = null,
    $forcePathStyle: js.UndefOr[Boolean] = js.undefined,
    $httpOptions: BrowserHttpOptions = null,
    $maxRetries: Int | Double = null,
    $serverSideEncryptionKey: SourceData = null,
    $useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined,
    $useDualstackEndpoint: js.UndefOr[Boolean] = js.undefined,
    RequestProgress: _RequestProgress = null,
    SSECustomerAlgorithm: String = null
  ): SelectObjectContentInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Expression = Expression, ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization, Key = Key, OutputSerialization = OutputSerialization)
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal)
    if ($bucketEndpoint != null) __obj.updateDynamic("$bucketEndpoint")($bucketEndpoint)
    if (!js.isUndefined($forcePathStyle)) __obj.updateDynamic("$forcePathStyle")($forcePathStyle)
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions)
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if ($serverSideEncryptionKey != null) __obj.updateDynamic("$serverSideEncryptionKey")($serverSideEncryptionKey.asInstanceOf[js.Any])
    if (!js.isUndefined($useAccelerateEndpoint)) __obj.updateDynamic("$useAccelerateEndpoint")($useAccelerateEndpoint)
    if (!js.isUndefined($useDualstackEndpoint)) __obj.updateDynamic("$useDualstackEndpoint")($useDualstackEndpoint)
    if (RequestProgress != null) __obj.updateDynamic("RequestProgress")(RequestProgress)
    if (SSECustomerAlgorithm != null) __obj.updateDynamic("SSECustomerAlgorithm")(SSECustomerAlgorithm)
    __obj.asInstanceOf[SelectObjectContentInput]
  }
}

