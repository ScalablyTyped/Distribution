package typings.awsSdkClientS3Browser.typesCreateMultipartUploadInputMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.AES256
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ONEZONE_IA
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.REDUCED_REDUNDANCY
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD_IA
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`authenticated-read`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`aws-exec-read`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`bucket-owner-full-control`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`bucket-owner-read`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`private`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`public-read-write`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`public-read`
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.awsColonkms
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typings.awsSdkClientS3Browser.inputTypesUnionMod._InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.cryptoMod.SourceData
import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import typings.std.Date
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMultipartUploadInput extends _InputTypesUnion {
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
    * <p>The canned ACL to apply to the object.</p>
    */
  var ACL: js.UndefOr[
    `private` | `public-read` | `public-read-write` | `authenticated-read` | `aws-exec-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
  ] = js.undefined
  /**
    * _BucketName shape
    */
  var Bucket: String
  /**
    * <p>Specifies caching behavior along the request/reply chain.</p>
    */
  var CacheControl: js.UndefOr[String] = js.undefined
  /**
    * <p>Specifies presentational information for the object.</p>
    */
  var ContentDisposition: js.UndefOr[String] = js.undefined
  /**
    * <p>Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.</p>
    */
  var ContentEncoding: js.UndefOr[String] = js.undefined
  /**
    * <p>The language the content is in.</p>
    */
  var ContentLanguage: js.UndefOr[String] = js.undefined
  /**
    * <p>A standard MIME type describing the format of the object data.</p>
    */
  var ContentType: js.UndefOr[String] = js.undefined
  /**
    * <p>The date and time at which the object is no longer cacheable.</p>
    */
  var Expires: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on the object.</p>
    */
  var GrantFullControl: js.UndefOr[String] = js.undefined
  /**
    * <p>Allows grantee to read the object data and its metadata.</p>
    */
  var GrantRead: js.UndefOr[String] = js.undefined
  /**
    * <p>Allows grantee to read the object ACL.</p>
    */
  var GrantReadACP: js.UndefOr[String] = js.undefined
  /**
    * <p>Allows grantee to write the ACL for the applicable object.</p>
    */
  var GrantWriteACP: js.UndefOr[String] = js.undefined
  /**
    * _ObjectKey shape
    */
  var Key: String
  /**
    * <p>A map of metadata to store with the object in S3.</p>
    */
  var Metadata: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.undefined
  /**
    * <p>Confirms that the requester knows that she or he will be charged for the request. Bucket owners need not specify this parameter in their requests. Documentation on downloading objects from requester pays buckets can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html</p>
    */
  var RequestPayer: js.UndefOr[requester_ | String] = js.undefined
  /**
    * <p>Specifies the algorithm to use to when encrypting the object (e.g., AES256).</p>
    */
  var SSECustomerAlgorithm: js.UndefOr[String] = js.undefined
  /**
    * <p>Specifies the AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS KMS will fail if not made via SSL or using SigV4. Documentation on configuring any of the officially supported AWS SDKs and CLI can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version</p>
    */
  var SSEKMSKeyId: js.UndefOr[String] = js.undefined
  /**
    * <p>The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).</p>
    */
  var ServerSideEncryption: js.UndefOr[AES256 | awsColonkms | String] = js.undefined
  /**
    * <p>The type of storage to use for the object. Defaults to 'STANDARD'.</p>
    */
  var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String] = js.undefined
  /**
    * <p>The tag-set for the object. The tag-set must be encoded as URL Query parameters</p>
    */
  var Tagging: js.UndefOr[String] = js.undefined
  /**
    * <p>If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.</p>
    */
  var WebsiteRedirectLocation: js.UndefOr[String] = js.undefined
}

object CreateMultipartUploadInput {
  @scala.inline
  def apply(
    Bucket: String,
    Key: String,
    $abortSignal: AbortSignal = null,
    $bucketEndpoint: String = null,
    $forcePathStyle: js.UndefOr[Boolean] = js.undefined,
    $httpOptions: BrowserHttpOptions = null,
    $maxRetries: js.UndefOr[Double] = js.undefined,
    $serverSideEncryptionKey: SourceData = null,
    $useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined,
    $useDualstackEndpoint: js.UndefOr[Boolean] = js.undefined,
    ACL: `private` | `public-read` | `public-read-write` | `authenticated-read` | `aws-exec-read` | `bucket-owner-read` | `bucket-owner-full-control` | String = null,
    CacheControl: String = null,
    ContentDisposition: String = null,
    ContentEncoding: String = null,
    ContentLanguage: String = null,
    ContentType: String = null,
    Expires: Date | String | Double = null,
    GrantFullControl: String = null,
    GrantRead: String = null,
    GrantReadACP: String = null,
    GrantWriteACP: String = null,
    Metadata: StringDictionary[String] | (Iterable[js.Tuple2[String, String]]) = null,
    RequestPayer: requester_ | String = null,
    SSECustomerAlgorithm: String = null,
    SSEKMSKeyId: String = null,
    ServerSideEncryption: AES256 | awsColonkms | String = null,
    StorageClass: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String = null,
    Tagging: String = null,
    WebsiteRedirectLocation: String = null
  ): CreateMultipartUploadInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($bucketEndpoint != null) __obj.updateDynamic("$bucketEndpoint")($bucketEndpoint.asInstanceOf[js.Any])
    if (!js.isUndefined($forcePathStyle)) __obj.updateDynamic("$forcePathStyle")($forcePathStyle.get.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if (!js.isUndefined($maxRetries)) __obj.updateDynamic("$maxRetries")($maxRetries.get.asInstanceOf[js.Any])
    if ($serverSideEncryptionKey != null) __obj.updateDynamic("$serverSideEncryptionKey")($serverSideEncryptionKey.asInstanceOf[js.Any])
    if (!js.isUndefined($useAccelerateEndpoint)) __obj.updateDynamic("$useAccelerateEndpoint")($useAccelerateEndpoint.get.asInstanceOf[js.Any])
    if (!js.isUndefined($useDualstackEndpoint)) __obj.updateDynamic("$useDualstackEndpoint")($useDualstackEndpoint.get.asInstanceOf[js.Any])
    if (ACL != null) __obj.updateDynamic("ACL")(ACL.asInstanceOf[js.Any])
    if (CacheControl != null) __obj.updateDynamic("CacheControl")(CacheControl.asInstanceOf[js.Any])
    if (ContentDisposition != null) __obj.updateDynamic("ContentDisposition")(ContentDisposition.asInstanceOf[js.Any])
    if (ContentEncoding != null) __obj.updateDynamic("ContentEncoding")(ContentEncoding.asInstanceOf[js.Any])
    if (ContentLanguage != null) __obj.updateDynamic("ContentLanguage")(ContentLanguage.asInstanceOf[js.Any])
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType.asInstanceOf[js.Any])
    if (Expires != null) __obj.updateDynamic("Expires")(Expires.asInstanceOf[js.Any])
    if (GrantFullControl != null) __obj.updateDynamic("GrantFullControl")(GrantFullControl.asInstanceOf[js.Any])
    if (GrantRead != null) __obj.updateDynamic("GrantRead")(GrantRead.asInstanceOf[js.Any])
    if (GrantReadACP != null) __obj.updateDynamic("GrantReadACP")(GrantReadACP.asInstanceOf[js.Any])
    if (GrantWriteACP != null) __obj.updateDynamic("GrantWriteACP")(GrantWriteACP.asInstanceOf[js.Any])
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata.asInstanceOf[js.Any])
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    if (SSECustomerAlgorithm != null) __obj.updateDynamic("SSECustomerAlgorithm")(SSECustomerAlgorithm.asInstanceOf[js.Any])
    if (SSEKMSKeyId != null) __obj.updateDynamic("SSEKMSKeyId")(SSEKMSKeyId.asInstanceOf[js.Any])
    if (ServerSideEncryption != null) __obj.updateDynamic("ServerSideEncryption")(ServerSideEncryption.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (Tagging != null) __obj.updateDynamic("Tagging")(Tagging.asInstanceOf[js.Any])
    if (WebsiteRedirectLocation != null) __obj.updateDynamic("WebsiteRedirectLocation")(WebsiteRedirectLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMultipartUploadInput]
  }
}

