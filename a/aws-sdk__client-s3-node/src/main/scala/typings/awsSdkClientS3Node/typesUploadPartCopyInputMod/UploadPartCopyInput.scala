package typings.awsSdkClientS3Node.typesUploadPartCopyInputMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.requester_
import typings.awsSdkClientS3Node.inputTypesUnionMod._InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.cryptoMod.SourceData
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadPartCopyInput extends _InputTypesUnion {
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
    * Specifies the customer-provided encryption key for Amazon S3 to use to decrypt the source object. The encryption key provided in this header must be one that was used when the source object was created.
    */
  @JSName("$copySourceServerSideEncryptionKey")
  var $copySourceServerSideEncryptionKey: js.UndefOr[SourceData] = js.undefined
  /**
    * Whether to force path style URLs for S3 objects (e.g., https://s3.amazonaws.com/<bucketName>/<key> instead of https://<bucketName>.s3.amazonaws.com/<key>
    */
  @JSName("$forcePathStyle")
  var $forcePathStyle: js.UndefOr[Boolean] = js.undefined
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[NodeHttpOptions] = js.undefined
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
    * _BucketName shape
    */
  var Bucket: String
  /**
    * <p>The name of the source bucket and key name of the source object, separated by a slash (/). Must be URL-encoded.</p>
    */
  var CopySource: String
  /**
    * <p>Copies the object if its entity tag (ETag) matches the specified tag.</p>
    */
  var CopySourceIfMatch: js.UndefOr[String] = js.undefined
  /**
    * <p>Copies the object if it has been modified since the specified time.</p>
    */
  var CopySourceIfModifiedSince: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>Copies the object if its entity tag (ETag) is different than the specified ETag.</p>
    */
  var CopySourceIfNoneMatch: js.UndefOr[String] = js.undefined
  /**
    * <p>Copies the object if it hasn't been modified since the specified time.</p>
    */
  var CopySourceIfUnmodifiedSince: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>The range of bytes to copy from the source object. The range value must use the form bytes=first-last, where the first and last are the zero-based byte offsets to copy. For example, bytes=0-9 indicates that you want to copy the first ten bytes of the source. You can copy a range only if the source object is greater than 5 GB.</p>
    */
  var CopySourceRange: js.UndefOr[String] = js.undefined
  /**
    * <p>Specifies the algorithm to use when decrypting the source object (e.g., AES256).</p>
    */
  var CopySourceSSECustomerAlgorithm: js.UndefOr[String] = js.undefined
  /**
    * _ObjectKey shape
    */
  var Key: String
  /**
    * <p>Part number of part being copied. This is a positive integer between 1 and 10,000.</p>
    */
  var PartNumber: Double
  /**
    * <p>Confirms that the requester knows that she or he will be charged for the request. Bucket owners need not specify this parameter in their requests. Documentation on downloading objects from requester pays buckets can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html</p>
    */
  var RequestPayer: js.UndefOr[requester_ | String] = js.undefined
  /**
    * <p>Specifies the algorithm to use to when encrypting the object (e.g., AES256).</p>
    */
  var SSECustomerAlgorithm: js.UndefOr[String] = js.undefined
  /**
    * <p>Upload ID identifying the multipart upload whose part is being copied.</p>
    */
  var UploadId: String
}

object UploadPartCopyInput {
  @scala.inline
  def apply(
    Bucket: String,
    CopySource: String,
    Key: String,
    PartNumber: Double,
    UploadId: String,
    $abortSignal: AbortSignal = null,
    $bucketEndpoint: String = null,
    $copySourceServerSideEncryptionKey: SourceData = null,
    $forcePathStyle: js.UndefOr[Boolean] = js.undefined,
    $httpOptions: NodeHttpOptions = null,
    $maxRetries: js.UndefOr[Double] = js.undefined,
    $serverSideEncryptionKey: SourceData = null,
    $useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined,
    $useDualstackEndpoint: js.UndefOr[Boolean] = js.undefined,
    CopySourceIfMatch: String = null,
    CopySourceIfModifiedSince: Date | String | Double = null,
    CopySourceIfNoneMatch: String = null,
    CopySourceIfUnmodifiedSince: Date | String | Double = null,
    CopySourceRange: String = null,
    CopySourceSSECustomerAlgorithm: String = null,
    RequestPayer: requester_ | String = null,
    SSECustomerAlgorithm: String = null
  ): UploadPartCopyInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CopySource = CopySource.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], PartNumber = PartNumber.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($bucketEndpoint != null) __obj.updateDynamic("$bucketEndpoint")($bucketEndpoint.asInstanceOf[js.Any])
    if ($copySourceServerSideEncryptionKey != null) __obj.updateDynamic("$copySourceServerSideEncryptionKey")($copySourceServerSideEncryptionKey.asInstanceOf[js.Any])
    if (!js.isUndefined($forcePathStyle)) __obj.updateDynamic("$forcePathStyle")($forcePathStyle.get.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if (!js.isUndefined($maxRetries)) __obj.updateDynamic("$maxRetries")($maxRetries.get.asInstanceOf[js.Any])
    if ($serverSideEncryptionKey != null) __obj.updateDynamic("$serverSideEncryptionKey")($serverSideEncryptionKey.asInstanceOf[js.Any])
    if (!js.isUndefined($useAccelerateEndpoint)) __obj.updateDynamic("$useAccelerateEndpoint")($useAccelerateEndpoint.get.asInstanceOf[js.Any])
    if (!js.isUndefined($useDualstackEndpoint)) __obj.updateDynamic("$useDualstackEndpoint")($useDualstackEndpoint.get.asInstanceOf[js.Any])
    if (CopySourceIfMatch != null) __obj.updateDynamic("CopySourceIfMatch")(CopySourceIfMatch.asInstanceOf[js.Any])
    if (CopySourceIfModifiedSince != null) __obj.updateDynamic("CopySourceIfModifiedSince")(CopySourceIfModifiedSince.asInstanceOf[js.Any])
    if (CopySourceIfNoneMatch != null) __obj.updateDynamic("CopySourceIfNoneMatch")(CopySourceIfNoneMatch.asInstanceOf[js.Any])
    if (CopySourceIfUnmodifiedSince != null) __obj.updateDynamic("CopySourceIfUnmodifiedSince")(CopySourceIfUnmodifiedSince.asInstanceOf[js.Any])
    if (CopySourceRange != null) __obj.updateDynamic("CopySourceRange")(CopySourceRange.asInstanceOf[js.Any])
    if (CopySourceSSECustomerAlgorithm != null) __obj.updateDynamic("CopySourceSSECustomerAlgorithm")(CopySourceSSECustomerAlgorithm.asInstanceOf[js.Any])
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    if (SSECustomerAlgorithm != null) __obj.updateDynamic("SSECustomerAlgorithm")(SSECustomerAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadPartCopyInput]
  }
}

