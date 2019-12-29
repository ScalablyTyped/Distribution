package typings.atAwsDashSdkClientDashS3DashBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.AES256
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.ONEZONE_IA
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.REDUCED_REDUNDANCY
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.STANDARD
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.STANDARD_IA
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`authenticated-read`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`aws-exec-read`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`bucket-owner-full-control`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`bucket-owner-read`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`private`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`public-read-write`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.`public-read`
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.awsColonkms
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.requester_
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod._InputTypesUnion
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildCryptoMod.SourceData
import typings.atAwsDashSdkTypes.buildHttpMod.BrowserHttpOptions
import typings.std.Date
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/CreateMultipartUploadInput", JSImport.Namespace)
@js.native
object typesCreateMultipartUploadInputMod extends js.Object {
  @js.native
  trait CreateMultipartUploadInput extends _InputTypesUnion {
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
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
    var $bucketEndpoint: js.UndefOr[String] = js.native
    /**
      * Whether to force path style URLs for S3 objects (e.g., https://s3.amazonaws.com/<bucketName>/<key> instead of https://<bucketName>.s3.amazonaws.com/<key>
      */
    @JSName("$forcePathStyle")
    var $forcePathStyle: js.UndefOr[Boolean] = js.native
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.native
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    /**
      * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon does not store the encryption key. The key must be appropriate for use with the algorithm specified in the `SSECustomerAlgorithm` parameter
      */
    @JSName("$serverSideEncryptionKey")
    var $serverSideEncryptionKey: js.UndefOr[SourceData] = js.native
    /**
      * Whether to use the S3 Transfer Acceleration endpoint by default
      */
    @JSName("$useAccelerateEndpoint")
    var $useAccelerateEndpoint: js.UndefOr[Boolean] = js.native
    /**
      * Enables IPv6/IPv4 dualstack endpoint. When a DNS lookup is performed on an endpoint of this type, it returns an “A” record with an IPv4 address and an “AAAA” record with an IPv6 address. In most cases the network stack in the client environment will automatically prefer the AAAA record and make a connection using the IPv6 address. Note, however, that currently on Windows, the IPv4 address will be preferred.
      */
    @JSName("$useDualstackEndpoint")
    var $useDualstackEndpoint: js.UndefOr[Boolean] = js.native
    /**
      * <p>The canned ACL to apply to the object.</p>
      */
    var ACL: js.UndefOr[
        `private` | `public-read` | `public-read-write` | `authenticated-read` | `aws-exec-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
      ] = js.native
    /**
      * _BucketName shape
      */
    var Bucket: String = js.native
    /**
      * <p>Specifies caching behavior along the request/reply chain.</p>
      */
    var CacheControl: js.UndefOr[String] = js.native
    /**
      * <p>Specifies presentational information for the object.</p>
      */
    var ContentDisposition: js.UndefOr[String] = js.native
    /**
      * <p>Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.</p>
      */
    var ContentEncoding: js.UndefOr[String] = js.native
    /**
      * <p>The language the content is in.</p>
      */
    var ContentLanguage: js.UndefOr[String] = js.native
    /**
      * <p>A standard MIME type describing the format of the object data.</p>
      */
    var ContentType: js.UndefOr[String] = js.native
    /**
      * <p>The date and time at which the object is no longer cacheable.</p>
      */
    var Expires: js.UndefOr[Date | String | Double] = js.native
    /**
      * <p>Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on the object.</p>
      */
    var GrantFullControl: js.UndefOr[String] = js.native
    /**
      * <p>Allows grantee to read the object data and its metadata.</p>
      */
    var GrantRead: js.UndefOr[String] = js.native
    /**
      * <p>Allows grantee to read the object ACL.</p>
      */
    var GrantReadACP: js.UndefOr[String] = js.native
    /**
      * <p>Allows grantee to write the ACL for the applicable object.</p>
      */
    var GrantWriteACP: js.UndefOr[String] = js.native
    /**
      * _ObjectKey shape
      */
    var Key: String = js.native
    /**
      * <p>A map of metadata to store with the object in S3.</p>
      */
    var Metadata: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
    /**
      * <p>Confirms that the requester knows that she or he will be charged for the request. Bucket owners need not specify this parameter in their requests. Documentation on downloading objects from requester pays buckets can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html</p>
      */
    var RequestPayer: js.UndefOr[requester_ | String] = js.native
    /**
      * <p>Specifies the algorithm to use to when encrypting the object (e.g., AES256).</p>
      */
    var SSECustomerAlgorithm: js.UndefOr[String] = js.native
    /**
      * <p>Specifies the AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS KMS will fail if not made via SSL or using SigV4. Documentation on configuring any of the officially supported AWS SDKs and CLI can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version</p>
      */
    var SSEKMSKeyId: js.UndefOr[String] = js.native
    /**
      * <p>The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).</p>
      */
    var ServerSideEncryption: js.UndefOr[AES256 | awsColonkms | String] = js.native
    /**
      * <p>The type of storage to use for the object. Defaults to 'STANDARD'.</p>
      */
    var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String] = js.native
    /**
      * <p>The tag-set for the object. The tag-set must be encoded as URL Query parameters</p>
      */
    var Tagging: js.UndefOr[String] = js.native
    /**
      * <p>If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.</p>
      */
    var WebsiteRedirectLocation: js.UndefOr[String] = js.native
  }
  
}

