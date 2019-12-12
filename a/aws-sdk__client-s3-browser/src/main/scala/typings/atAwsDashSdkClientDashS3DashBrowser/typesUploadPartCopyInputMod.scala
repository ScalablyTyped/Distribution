package typings.atAwsDashSdkClientDashS3DashBrowser

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.requester_
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod._InputTypesUnion
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildCryptoMod.SourceData
import typings.atAwsDashSdkTypes.buildHttpMod.BrowserHttpOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/UploadPartCopyInput", JSImport.Namespace)
@js.native
object typesUploadPartCopyInputMod extends js.Object {
  @js.native
  trait UploadPartCopyInput extends _InputTypesUnion {
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
      * Specifies the customer-provided encryption key for Amazon S3 to use to decrypt the source object. The encryption key provided in this header must be one that was used when the source object was created.
      */
    @JSName("$copySourceServerSideEncryptionKey")
    var $copySourceServerSideEncryptionKey: js.UndefOr[SourceData] = js.native
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
      * _BucketName shape
      */
    var Bucket: String = js.native
    /**
      * <p>The name of the source bucket and key name of the source object, separated by a slash (/). Must be URL-encoded.</p>
      */
    var CopySource: String = js.native
    /**
      * <p>Copies the object if its entity tag (ETag) matches the specified tag.</p>
      */
    var CopySourceIfMatch: js.UndefOr[String] = js.native
    /**
      * <p>Copies the object if it has been modified since the specified time.</p>
      */
    var CopySourceIfModifiedSince: js.UndefOr[Date | String | Double] = js.native
    /**
      * <p>Copies the object if its entity tag (ETag) is different than the specified ETag.</p>
      */
    var CopySourceIfNoneMatch: js.UndefOr[String] = js.native
    /**
      * <p>Copies the object if it hasn't been modified since the specified time.</p>
      */
    var CopySourceIfUnmodifiedSince: js.UndefOr[Date | String | Double] = js.native
    /**
      * <p>The range of bytes to copy from the source object. The range value must use the form bytes=first-last, where the first and last are the zero-based byte offsets to copy. For example, bytes=0-9 indicates that you want to copy the first ten bytes of the source. You can copy a range only if the source object is greater than 5 GB.</p>
      */
    var CopySourceRange: js.UndefOr[String] = js.native
    /**
      * <p>Specifies the algorithm to use when decrypting the source object (e.g., AES256).</p>
      */
    var CopySourceSSECustomerAlgorithm: js.UndefOr[String] = js.native
    /**
      * _ObjectKey shape
      */
    var Key: String = js.native
    /**
      * <p>Part number of part being copied. This is a positive integer between 1 and 10,000.</p>
      */
    var PartNumber: Double = js.native
    /**
      * <p>Confirms that the requester knows that she or he will be charged for the request. Bucket owners need not specify this parameter in their requests. Documentation on downloading objects from requester pays buckets can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html</p>
      */
    var RequestPayer: js.UndefOr[requester_ | String] = js.native
    /**
      * <p>Specifies the algorithm to use to when encrypting the object (e.g., AES256).</p>
      */
    var SSECustomerAlgorithm: js.UndefOr[String] = js.native
    /**
      * <p>Upload ID identifying the multipart upload whose part is being copied.</p>
      */
    var UploadId: String = js.native
  }
  
}

