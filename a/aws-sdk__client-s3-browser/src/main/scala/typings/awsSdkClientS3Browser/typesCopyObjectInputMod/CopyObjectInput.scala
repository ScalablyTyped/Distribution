package typings.awsSdkClientS3Browser.typesCopyObjectInputMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.AES256
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.COPY
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ONEZONE_IA
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.REDUCED_REDUNDANCY
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.REPLACE
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
import typings.std.Date
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyObjectInput extends _InputTypesUnion {
  
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
  var $httpOptions: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
  ] = js.native
  
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
    * <p>Specifies the algorithm to use when decrypting the source object (e.g., AES256).</p>
    */
  var CopySourceSSECustomerAlgorithm: js.UndefOr[String] = js.native
  
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
    * <p>Specifies whether the metadata is copied from the source object or replaced with metadata provided in the request.</p>
    */
  var MetadataDirective: js.UndefOr[COPY | REPLACE | String] = js.native
  
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
    * <p>The tag-set for the object destination object this value must be used in conjunction with the TaggingDirective. The tag-set must be encoded as URL Query parameters</p>
    */
  var Tagging: js.UndefOr[String] = js.native
  
  /**
    * <p>Specifies whether the object tag-set are copied from the source object or replaced with tag-set provided in the request.</p>
    */
  var TaggingDirective: js.UndefOr[COPY | REPLACE | String] = js.native
  
  /**
    * <p>If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.</p>
    */
  var WebsiteRedirectLocation: js.UndefOr[String] = js.native
}
object CopyObjectInput {
  
  @scala.inline
  def apply(Bucket: String, CopySource: String, Key: String): CopyObjectInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CopySource = CopySource.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyObjectInput]
  }
  
  @scala.inline
  implicit class CopyObjectInputOps[Self <: CopyObjectInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucket(value: String): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopySource(value: String): Self = this.set("CopySource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$abortSignal(value: AbortSignal): Self = this.set("$abortSignal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$abortSignal: Self = this.set("$abortSignal", js.undefined)
    
    @scala.inline
    def set$bucketEndpoint(value: String): Self = this.set("$bucketEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$bucketEndpoint: Self = this.set("$bucketEndpoint", js.undefined)
    
    @scala.inline
    def set$copySourceServerSideEncryptionKey(value: SourceData): Self = this.set("$copySourceServerSideEncryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$copySourceServerSideEncryptionKey: Self = this.set("$copySourceServerSideEncryptionKey", js.undefined)
    
    @scala.inline
    def set$forcePathStyle(value: Boolean): Self = this.set("$forcePathStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$forcePathStyle: Self = this.set("$forcePathStyle", js.undefined)
    
    @scala.inline
    def set$httpOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ js.Any
    ): Self = this.set("$httpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$httpOptions: Self = this.set("$httpOptions", js.undefined)
    
    @scala.inline
    def set$maxRetries(value: Double): Self = this.set("$maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$maxRetries: Self = this.set("$maxRetries", js.undefined)
    
    @scala.inline
    def set$serverSideEncryptionKey(value: SourceData): Self = this.set("$serverSideEncryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$serverSideEncryptionKey: Self = this.set("$serverSideEncryptionKey", js.undefined)
    
    @scala.inline
    def set$useAccelerateEndpoint(value: Boolean): Self = this.set("$useAccelerateEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$useAccelerateEndpoint: Self = this.set("$useAccelerateEndpoint", js.undefined)
    
    @scala.inline
    def set$useDualstackEndpoint(value: Boolean): Self = this.set("$useDualstackEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$useDualstackEndpoint: Self = this.set("$useDualstackEndpoint", js.undefined)
    
    @scala.inline
    def setACL(
      value: `private` | `public-read` | `public-read-write` | `authenticated-read` | `aws-exec-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
    ): Self = this.set("ACL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteACL: Self = this.set("ACL", js.undefined)
    
    @scala.inline
    def setCacheControl(value: String): Self = this.set("CacheControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheControl: Self = this.set("CacheControl", js.undefined)
    
    @scala.inline
    def setContentDisposition(value: String): Self = this.set("ContentDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentDisposition: Self = this.set("ContentDisposition", js.undefined)
    
    @scala.inline
    def setContentEncoding(value: String): Self = this.set("ContentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentEncoding: Self = this.set("ContentEncoding", js.undefined)
    
    @scala.inline
    def setContentLanguage(value: String): Self = this.set("ContentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentLanguage: Self = this.set("ContentLanguage", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("ContentType", js.undefined)
    
    @scala.inline
    def setCopySourceIfMatch(value: String): Self = this.set("CopySourceIfMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopySourceIfMatch: Self = this.set("CopySourceIfMatch", js.undefined)
    
    @scala.inline
    def setCopySourceIfModifiedSince(value: Date | String | Double): Self = this.set("CopySourceIfModifiedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopySourceIfModifiedSince: Self = this.set("CopySourceIfModifiedSince", js.undefined)
    
    @scala.inline
    def setCopySourceIfNoneMatch(value: String): Self = this.set("CopySourceIfNoneMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopySourceIfNoneMatch: Self = this.set("CopySourceIfNoneMatch", js.undefined)
    
    @scala.inline
    def setCopySourceIfUnmodifiedSince(value: Date | String | Double): Self = this.set("CopySourceIfUnmodifiedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopySourceIfUnmodifiedSince: Self = this.set("CopySourceIfUnmodifiedSince", js.undefined)
    
    @scala.inline
    def setCopySourceSSECustomerAlgorithm(value: String): Self = this.set("CopySourceSSECustomerAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopySourceSSECustomerAlgorithm: Self = this.set("CopySourceSSECustomerAlgorithm", js.undefined)
    
    @scala.inline
    def setExpires(value: Date | String | Double): Self = this.set("Expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires: Self = this.set("Expires", js.undefined)
    
    @scala.inline
    def setGrantFullControl(value: String): Self = this.set("GrantFullControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantFullControl: Self = this.set("GrantFullControl", js.undefined)
    
    @scala.inline
    def setGrantRead(value: String): Self = this.set("GrantRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantRead: Self = this.set("GrantRead", js.undefined)
    
    @scala.inline
    def setGrantReadACP(value: String): Self = this.set("GrantReadACP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantReadACP: Self = this.set("GrantReadACP", js.undefined)
    
    @scala.inline
    def setGrantWriteACP(value: String): Self = this.set("GrantWriteACP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantWriteACP: Self = this.set("GrantWriteACP", js.undefined)
    
    @scala.inline
    def setMetadata(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = this.set("Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("Metadata", js.undefined)
    
    @scala.inline
    def setMetadataDirective(value: COPY | REPLACE | String): Self = this.set("MetadataDirective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataDirective: Self = this.set("MetadataDirective", js.undefined)
    
    @scala.inline
    def setRequestPayer(value: requester_ | String): Self = this.set("RequestPayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestPayer: Self = this.set("RequestPayer", js.undefined)
    
    @scala.inline
    def setSSECustomerAlgorithm(value: String): Self = this.set("SSECustomerAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSECustomerAlgorithm: Self = this.set("SSECustomerAlgorithm", js.undefined)
    
    @scala.inline
    def setSSEKMSKeyId(value: String): Self = this.set("SSEKMSKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSEKMSKeyId: Self = this.set("SSEKMSKeyId", js.undefined)
    
    @scala.inline
    def setServerSideEncryption(value: AES256 | awsColonkms | String): Self = this.set("ServerSideEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerSideEncryption: Self = this.set("ServerSideEncryption", js.undefined)
    
    @scala.inline
    def setStorageClass(value: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String): Self = this.set("StorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageClass: Self = this.set("StorageClass", js.undefined)
    
    @scala.inline
    def setTagging(value: String): Self = this.set("Tagging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagging: Self = this.set("Tagging", js.undefined)
    
    @scala.inline
    def setTaggingDirective(value: COPY | REPLACE | String): Self = this.set("TaggingDirective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaggingDirective: Self = this.set("TaggingDirective", js.undefined)
    
    @scala.inline
    def setWebsiteRedirectLocation(value: String): Self = this.set("WebsiteRedirectLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsiteRedirectLocation: Self = this.set("WebsiteRedirectLocation", js.undefined)
  }
}
