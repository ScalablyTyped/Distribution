package typings.awsSdkClientS3Browser

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCopyObjectInputMod {
  
  trait CopyObjectInput
    extends StObject
       with _InputTypesUnion {
    
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
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ] = js.undefined
    
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
    var CopySourceIfModifiedSince: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * <p>Copies the object if its entity tag (ETag) is different than the specified ETag.</p>
      */
    var CopySourceIfNoneMatch: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Copies the object if it hasn't been modified since the specified time.</p>
      */
    var CopySourceIfUnmodifiedSince: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * <p>Specifies the algorithm to use when decrypting the source object (e.g., AES256).</p>
      */
    var CopySourceSSECustomerAlgorithm: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The date and time at which the object is no longer cacheable.</p>
      */
    var Expires: js.UndefOr[js.Date | String | Double] = js.undefined
    
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
    var Metadata: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.undefined
    
    /**
      * <p>Specifies whether the metadata is copied from the source object or replaced with metadata provided in the request.</p>
      */
    var MetadataDirective: js.UndefOr[COPY | REPLACE | String] = js.undefined
    
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
      * <p>The tag-set for the object destination object this value must be used in conjunction with the TaggingDirective. The tag-set must be encoded as URL Query parameters</p>
      */
    var Tagging: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Specifies whether the object tag-set are copied from the source object or replaced with tag-set provided in the request.</p>
      */
    var TaggingDirective: js.UndefOr[COPY | REPLACE | String] = js.undefined
    
    /**
      * <p>If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.</p>
      */
    var WebsiteRedirectLocation: js.UndefOr[String] = js.undefined
  }
  object CopyObjectInput {
    
    inline def apply(Bucket: String, CopySource: String, Key: String): CopyObjectInput = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CopySource = CopySource.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyObjectInput]
    }
    
    extension [Self <: CopyObjectInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$bucketEndpoint(value: String): Self = StObject.set(x, "$bucketEndpoint", value.asInstanceOf[js.Any])
      
      inline def set$bucketEndpointUndefined: Self = StObject.set(x, "$bucketEndpoint", js.undefined)
      
      inline def set$copySourceServerSideEncryptionKey(value: SourceData): Self = StObject.set(x, "$copySourceServerSideEncryptionKey", value.asInstanceOf[js.Any])
      
      inline def set$copySourceServerSideEncryptionKeyUndefined: Self = StObject.set(x, "$copySourceServerSideEncryptionKey", js.undefined)
      
      inline def set$forcePathStyle(value: Boolean): Self = StObject.set(x, "$forcePathStyle", value.asInstanceOf[js.Any])
      
      inline def set$forcePathStyleUndefined: Self = StObject.set(x, "$forcePathStyle", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def set$serverSideEncryptionKey(value: SourceData): Self = StObject.set(x, "$serverSideEncryptionKey", value.asInstanceOf[js.Any])
      
      inline def set$serverSideEncryptionKeyUndefined: Self = StObject.set(x, "$serverSideEncryptionKey", js.undefined)
      
      inline def set$useAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "$useAccelerateEndpoint", value.asInstanceOf[js.Any])
      
      inline def set$useAccelerateEndpointUndefined: Self = StObject.set(x, "$useAccelerateEndpoint", js.undefined)
      
      inline def set$useDualstackEndpoint(value: Boolean): Self = StObject.set(x, "$useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def set$useDualstackEndpointUndefined: Self = StObject.set(x, "$useDualstackEndpoint", js.undefined)
      
      inline def setACL(
        value: `private` | `public-read` | `public-read-write` | `authenticated-read` | `aws-exec-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
      ): Self = StObject.set(x, "ACL", value.asInstanceOf[js.Any])
      
      inline def setACLUndefined: Self = StObject.set(x, "ACL", js.undefined)
      
      inline def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
      
      inline def setCacheControl(value: String): Self = StObject.set(x, "CacheControl", value.asInstanceOf[js.Any])
      
      inline def setCacheControlUndefined: Self = StObject.set(x, "CacheControl", js.undefined)
      
      inline def setContentDisposition(value: String): Self = StObject.set(x, "ContentDisposition", value.asInstanceOf[js.Any])
      
      inline def setContentDispositionUndefined: Self = StObject.set(x, "ContentDisposition", js.undefined)
      
      inline def setContentEncoding(value: String): Self = StObject.set(x, "ContentEncoding", value.asInstanceOf[js.Any])
      
      inline def setContentEncodingUndefined: Self = StObject.set(x, "ContentEncoding", js.undefined)
      
      inline def setContentLanguage(value: String): Self = StObject.set(x, "ContentLanguage", value.asInstanceOf[js.Any])
      
      inline def setContentLanguageUndefined: Self = StObject.set(x, "ContentLanguage", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
      
      inline def setCopySource(value: String): Self = StObject.set(x, "CopySource", value.asInstanceOf[js.Any])
      
      inline def setCopySourceIfMatch(value: String): Self = StObject.set(x, "CopySourceIfMatch", value.asInstanceOf[js.Any])
      
      inline def setCopySourceIfMatchUndefined: Self = StObject.set(x, "CopySourceIfMatch", js.undefined)
      
      inline def setCopySourceIfModifiedSince(value: js.Date | String | Double): Self = StObject.set(x, "CopySourceIfModifiedSince", value.asInstanceOf[js.Any])
      
      inline def setCopySourceIfModifiedSinceUndefined: Self = StObject.set(x, "CopySourceIfModifiedSince", js.undefined)
      
      inline def setCopySourceIfNoneMatch(value: String): Self = StObject.set(x, "CopySourceIfNoneMatch", value.asInstanceOf[js.Any])
      
      inline def setCopySourceIfNoneMatchUndefined: Self = StObject.set(x, "CopySourceIfNoneMatch", js.undefined)
      
      inline def setCopySourceIfUnmodifiedSince(value: js.Date | String | Double): Self = StObject.set(x, "CopySourceIfUnmodifiedSince", value.asInstanceOf[js.Any])
      
      inline def setCopySourceIfUnmodifiedSinceUndefined: Self = StObject.set(x, "CopySourceIfUnmodifiedSince", js.undefined)
      
      inline def setCopySourceSSECustomerAlgorithm(value: String): Self = StObject.set(x, "CopySourceSSECustomerAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setCopySourceSSECustomerAlgorithmUndefined: Self = StObject.set(x, "CopySourceSSECustomerAlgorithm", js.undefined)
      
      inline def setExpires(value: js.Date | String | Double): Self = StObject.set(x, "Expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "Expires", js.undefined)
      
      inline def setGrantFullControl(value: String): Self = StObject.set(x, "GrantFullControl", value.asInstanceOf[js.Any])
      
      inline def setGrantFullControlUndefined: Self = StObject.set(x, "GrantFullControl", js.undefined)
      
      inline def setGrantRead(value: String): Self = StObject.set(x, "GrantRead", value.asInstanceOf[js.Any])
      
      inline def setGrantReadACP(value: String): Self = StObject.set(x, "GrantReadACP", value.asInstanceOf[js.Any])
      
      inline def setGrantReadACPUndefined: Self = StObject.set(x, "GrantReadACP", js.undefined)
      
      inline def setGrantReadUndefined: Self = StObject.set(x, "GrantRead", js.undefined)
      
      inline def setGrantWriteACP(value: String): Self = StObject.set(x, "GrantWriteACP", value.asInstanceOf[js.Any])
      
      inline def setGrantWriteACPUndefined: Self = StObject.set(x, "GrantWriteACP", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataDirective(value: COPY | REPLACE | String): Self = StObject.set(x, "MetadataDirective", value.asInstanceOf[js.Any])
      
      inline def setMetadataDirectiveUndefined: Self = StObject.set(x, "MetadataDirective", js.undefined)
      
      inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
      
      inline def setRequestPayer(value: requester_ | String): Self = StObject.set(x, "RequestPayer", value.asInstanceOf[js.Any])
      
      inline def setRequestPayerUndefined: Self = StObject.set(x, "RequestPayer", js.undefined)
      
      inline def setSSECustomerAlgorithm(value: String): Self = StObject.set(x, "SSECustomerAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setSSECustomerAlgorithmUndefined: Self = StObject.set(x, "SSECustomerAlgorithm", js.undefined)
      
      inline def setSSEKMSKeyId(value: String): Self = StObject.set(x, "SSEKMSKeyId", value.asInstanceOf[js.Any])
      
      inline def setSSEKMSKeyIdUndefined: Self = StObject.set(x, "SSEKMSKeyId", js.undefined)
      
      inline def setServerSideEncryption(value: AES256 | awsColonkms | String): Self = StObject.set(x, "ServerSideEncryption", value.asInstanceOf[js.Any])
      
      inline def setServerSideEncryptionUndefined: Self = StObject.set(x, "ServerSideEncryption", js.undefined)
      
      inline def setStorageClass(value: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
      
      inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
      
      inline def setTagging(value: String): Self = StObject.set(x, "Tagging", value.asInstanceOf[js.Any])
      
      inline def setTaggingDirective(value: COPY | REPLACE | String): Self = StObject.set(x, "TaggingDirective", value.asInstanceOf[js.Any])
      
      inline def setTaggingDirectiveUndefined: Self = StObject.set(x, "TaggingDirective", js.undefined)
      
      inline def setTaggingUndefined: Self = StObject.set(x, "Tagging", js.undefined)
      
      inline def setWebsiteRedirectLocation(value: String): Self = StObject.set(x, "WebsiteRedirectLocation", value.asInstanceOf[js.Any])
      
      inline def setWebsiteRedirectLocationUndefined: Self = StObject.set(x, "WebsiteRedirectLocation", js.undefined)
    }
  }
}
