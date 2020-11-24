package typings.awsSdkClientS3Browser.typesUploadPartInputMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.cryptoMod.SourceData
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadPartInput[StreamType] extends js.Object {
  
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
    * <p>Object data.</p>
    */
  var Body: js.UndefOr[ArrayBuffer | ArrayBufferView | String | StreamType] = js.native
  
  /**
    * <p>Name of the bucket to which the multipart upload was initiated.</p>
    */
  var Bucket: String = js.native
  
  /**
    * <p>Size of the body in bytes. This parameter is useful when the size of the body cannot be determined automatically.</p>
    */
  var ContentLength: js.UndefOr[Double] = js.native
  
  /**
    * <p>The base64-encoded 128-bit MD5 digest of the part data.</p>
    */
  var ContentMD5: js.UndefOr[String] = js.native
  
  /**
    * <p>Object key for which the multipart upload was initiated.</p>
    */
  var Key: String = js.native
  
  /**
    * <p>Part number of part being uploaded. This is a positive integer between 1 and 10,000.</p>
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
    * <p>Upload ID identifying the multipart upload whose part is being uploaded.</p>
    */
  var UploadId: String = js.native
}
object UploadPartInput {
  
  @scala.inline
  def apply[StreamType](Bucket: String, Key: String, PartNumber: Double, UploadId: String): UploadPartInput[StreamType] = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], PartNumber = PartNumber.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadPartInput[StreamType]]
  }
  
  @scala.inline
  implicit class UploadPartInputOps[Self <: UploadPartInput[_], StreamType] (val x: Self with UploadPartInput[StreamType]) extends AnyVal {
    
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
    def setPartNumber(value: Double): Self = this.set("PartNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadId(value: String): Self = this.set("UploadId", value.asInstanceOf[js.Any])
    
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
    def setBody(value: ArrayBuffer | ArrayBufferView | String | StreamType): Self = this.set("Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("Body", js.undefined)
    
    @scala.inline
    def setContentLength(value: Double): Self = this.set("ContentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentLength: Self = this.set("ContentLength", js.undefined)
    
    @scala.inline
    def setContentMD5(value: String): Self = this.set("ContentMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentMD5: Self = this.set("ContentMD5", js.undefined)
    
    @scala.inline
    def setRequestPayer(value: requester_ | String): Self = this.set("RequestPayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestPayer: Self = this.set("RequestPayer", js.undefined)
    
    @scala.inline
    def setSSECustomerAlgorithm(value: String): Self = this.set("SSECustomerAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSECustomerAlgorithm: Self = this.set("SSECustomerAlgorithm", js.undefined)
  }
}
