package typings.awsSdkClientS3Browser.typesGetObjectInputMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typings.awsSdkClientS3Browser.inputTypesUnionMod._InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.cryptoMod.SourceData
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetObjectInput extends _InputTypesUnion {
  
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
    * _BucketName shape
    */
  var Bucket: String = js.native
  
  /**
    * <p>Return the object only if its entity tag (ETag) is the same as the one specified, otherwise return a 412 (precondition failed).</p>
    */
  var IfMatch: js.UndefOr[String] = js.native
  
  /**
    * <p>Return the object only if it has been modified since the specified time, otherwise return a 304 (not modified).</p>
    */
  var IfModifiedSince: js.UndefOr[Date | String | Double] = js.native
  
  /**
    * <p>Return the object only if its entity tag (ETag) is different from the one specified, otherwise return a 304 (not modified).</p>
    */
  var IfNoneMatch: js.UndefOr[String] = js.native
  
  /**
    * <p>Return the object only if it has not been modified since the specified time, otherwise return a 412 (precondition failed).</p>
    */
  var IfUnmodifiedSince: js.UndefOr[Date | String | Double] = js.native
  
  /**
    * _ObjectKey shape
    */
  var Key: String = js.native
  
  /**
    * <p>Part number of the object being read. This is a positive integer between 1 and 10,000. Effectively performs a 'ranged' GET request for the part specified. Useful for downloading just a part of an object.</p>
    */
  var PartNumber: js.UndefOr[Double] = js.native
  
  /**
    * <p>Downloads the specified range bytes of an object. For more information about the HTTP Range header, go to http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35.</p>
    */
  var Range: js.UndefOr[String] = js.native
  
  /**
    * <p>Confirms that the requester knows that she or he will be charged for the request. Bucket owners need not specify this parameter in their requests. Documentation on downloading objects from requester pays buckets can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html</p>
    */
  var RequestPayer: js.UndefOr[requester_ | String] = js.native
  
  /**
    * <p>Sets the Cache-Control header of the response.</p>
    */
  var ResponseCacheControl: js.UndefOr[String] = js.native
  
  /**
    * <p>Sets the Content-Disposition header of the response</p>
    */
  var ResponseContentDisposition: js.UndefOr[String] = js.native
  
  /**
    * <p>Sets the Content-Encoding header of the response.</p>
    */
  var ResponseContentEncoding: js.UndefOr[String] = js.native
  
  /**
    * <p>Sets the Content-Language header of the response.</p>
    */
  var ResponseContentLanguage: js.UndefOr[String] = js.native
  
  /**
    * <p>Sets the Content-Type header of the response.</p>
    */
  var ResponseContentType: js.UndefOr[String] = js.native
  
  /**
    * <p>Sets the Expires header of the response.</p>
    */
  var ResponseExpires: js.UndefOr[Date | String | Double] = js.native
  
  /**
    * <p>Specifies the algorithm to use to when encrypting the object (e.g., AES256).</p>
    */
  var SSECustomerAlgorithm: js.UndefOr[String] = js.native
  
  /**
    * <p>VersionId used to reference a specific version of the object.</p>
    */
  var VersionId: js.UndefOr[String] = js.native
}
object GetObjectInput {
  
  @scala.inline
  def apply(Bucket: String, Key: String): GetObjectInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectInput]
  }
  
  @scala.inline
  implicit class GetObjectInputOps[Self <: GetObjectInput] (val x: Self) extends AnyVal {
    
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
    def setIfMatch(value: String): Self = this.set("IfMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfMatch: Self = this.set("IfMatch", js.undefined)
    
    @scala.inline
    def setIfModifiedSince(value: Date | String | Double): Self = this.set("IfModifiedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfModifiedSince: Self = this.set("IfModifiedSince", js.undefined)
    
    @scala.inline
    def setIfNoneMatch(value: String): Self = this.set("IfNoneMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfNoneMatch: Self = this.set("IfNoneMatch", js.undefined)
    
    @scala.inline
    def setIfUnmodifiedSince(value: Date | String | Double): Self = this.set("IfUnmodifiedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfUnmodifiedSince: Self = this.set("IfUnmodifiedSince", js.undefined)
    
    @scala.inline
    def setPartNumber(value: Double): Self = this.set("PartNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartNumber: Self = this.set("PartNumber", js.undefined)
    
    @scala.inline
    def setRange(value: String): Self = this.set("Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("Range", js.undefined)
    
    @scala.inline
    def setRequestPayer(value: requester_ | String): Self = this.set("RequestPayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestPayer: Self = this.set("RequestPayer", js.undefined)
    
    @scala.inline
    def setResponseCacheControl(value: String): Self = this.set("ResponseCacheControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseCacheControl: Self = this.set("ResponseCacheControl", js.undefined)
    
    @scala.inline
    def setResponseContentDisposition(value: String): Self = this.set("ResponseContentDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseContentDisposition: Self = this.set("ResponseContentDisposition", js.undefined)
    
    @scala.inline
    def setResponseContentEncoding(value: String): Self = this.set("ResponseContentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseContentEncoding: Self = this.set("ResponseContentEncoding", js.undefined)
    
    @scala.inline
    def setResponseContentLanguage(value: String): Self = this.set("ResponseContentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseContentLanguage: Self = this.set("ResponseContentLanguage", js.undefined)
    
    @scala.inline
    def setResponseContentType(value: String): Self = this.set("ResponseContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseContentType: Self = this.set("ResponseContentType", js.undefined)
    
    @scala.inline
    def setResponseExpires(value: Date | String | Double): Self = this.set("ResponseExpires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseExpires: Self = this.set("ResponseExpires", js.undefined)
    
    @scala.inline
    def setSSECustomerAlgorithm(value: String): Self = this.set("SSECustomerAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSECustomerAlgorithm: Self = this.set("SSECustomerAlgorithm", js.undefined)
    
    @scala.inline
    def setVersionId(value: String): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
}
