package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetObjectRequest extends js.Object {
  
  /**
    * The bucket name containing the object.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation with an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide. When using this API with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this operation using S3 on Outposts through the AWS SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see Using S3 on Outposts in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName = js.native
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.native
  
  /**
    * Return the object only if its entity tag (ETag) is the same as the one specified, otherwise return a 412 (precondition failed).
    */
  var IfMatch: js.UndefOr[typings.awsSdk.s3Mod.IfMatch] = js.native
  
  /**
    * Return the object only if it has been modified since the specified time, otherwise return a 304 (not modified).
    */
  var IfModifiedSince: js.UndefOr[typings.awsSdk.s3Mod.IfModifiedSince] = js.native
  
  /**
    * Return the object only if its entity tag (ETag) is different from the one specified, otherwise return a 304 (not modified).
    */
  var IfNoneMatch: js.UndefOr[typings.awsSdk.s3Mod.IfNoneMatch] = js.native
  
  /**
    * Return the object only if it has not been modified since the specified time, otherwise return a 412 (precondition failed).
    */
  var IfUnmodifiedSince: js.UndefOr[typings.awsSdk.s3Mod.IfUnmodifiedSince] = js.native
  
  /**
    * Key of the object to get.
    */
  var Key: ObjectKey = js.native
  
  /**
    * Part number of the object being read. This is a positive integer between 1 and 10,000. Effectively performs a 'ranged' GET request for the part specified. Useful for downloading just a part of an object.
    */
  var PartNumber: js.UndefOr[typings.awsSdk.s3Mod.PartNumber] = js.native
  
  /**
    * Downloads the specified range bytes of an object. For more information about the HTTP Range header, see https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35.  Amazon S3 doesn't support retrieving multiple ranges of data per GET request. 
    */
  var Range: js.UndefOr[typings.awsSdk.s3Mod.Range] = js.native
  
  var RequestPayer: js.UndefOr[typings.awsSdk.s3Mod.RequestPayer] = js.native
  
  /**
    * Sets the Cache-Control header of the response.
    */
  var ResponseCacheControl: js.UndefOr[typings.awsSdk.s3Mod.ResponseCacheControl] = js.native
  
  /**
    * Sets the Content-Disposition header of the response
    */
  var ResponseContentDisposition: js.UndefOr[typings.awsSdk.s3Mod.ResponseContentDisposition] = js.native
  
  /**
    * Sets the Content-Encoding header of the response.
    */
  var ResponseContentEncoding: js.UndefOr[typings.awsSdk.s3Mod.ResponseContentEncoding] = js.native
  
  /**
    * Sets the Content-Language header of the response.
    */
  var ResponseContentLanguage: js.UndefOr[typings.awsSdk.s3Mod.ResponseContentLanguage] = js.native
  
  /**
    * Sets the Content-Type header of the response.
    */
  var ResponseContentType: js.UndefOr[typings.awsSdk.s3Mod.ResponseContentType] = js.native
  
  /**
    * Sets the Expires header of the response.
    */
  var ResponseExpires: js.UndefOr[typings.awsSdk.s3Mod.ResponseExpires] = js.native
  
  /**
    * Specifies the algorithm to use to when encrypting the object (for example, AES256).
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerAlgorithm] = js.native
  
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon S3 does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side-encryption-customer-algorithm header.
    */
  var SSECustomerKey: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerKey] = js.native
  
  /**
    * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure that the encryption key was transmitted without error.
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerKeyMD5] = js.native
  
  /**
    * VersionId used to reference a specific version of the object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}
object GetObjectRequest {
  
  @scala.inline
  def apply(Bucket: BucketName, Key: ObjectKey): GetObjectRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectRequest]
  }
  
  @scala.inline
  implicit class GetObjectRequestOps[Self <: GetObjectRequest] (val x: Self) extends AnyVal {
    
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
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: ObjectKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwner(value: AccountId): Self = this.set("ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedBucketOwner: Self = this.set("ExpectedBucketOwner", js.undefined)
    
    @scala.inline
    def setIfMatch(value: IfMatch): Self = this.set("IfMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfMatch: Self = this.set("IfMatch", js.undefined)
    
    @scala.inline
    def setIfModifiedSince(value: IfModifiedSince): Self = this.set("IfModifiedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfModifiedSince: Self = this.set("IfModifiedSince", js.undefined)
    
    @scala.inline
    def setIfNoneMatch(value: IfNoneMatch): Self = this.set("IfNoneMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfNoneMatch: Self = this.set("IfNoneMatch", js.undefined)
    
    @scala.inline
    def setIfUnmodifiedSince(value: IfUnmodifiedSince): Self = this.set("IfUnmodifiedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfUnmodifiedSince: Self = this.set("IfUnmodifiedSince", js.undefined)
    
    @scala.inline
    def setPartNumber(value: PartNumber): Self = this.set("PartNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartNumber: Self = this.set("PartNumber", js.undefined)
    
    @scala.inline
    def setRange(value: Range): Self = this.set("Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("Range", js.undefined)
    
    @scala.inline
    def setRequestPayer(value: RequestPayer): Self = this.set("RequestPayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestPayer: Self = this.set("RequestPayer", js.undefined)
    
    @scala.inline
    def setResponseCacheControl(value: ResponseCacheControl): Self = this.set("ResponseCacheControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseCacheControl: Self = this.set("ResponseCacheControl", js.undefined)
    
    @scala.inline
    def setResponseContentDisposition(value: ResponseContentDisposition): Self = this.set("ResponseContentDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseContentDisposition: Self = this.set("ResponseContentDisposition", js.undefined)
    
    @scala.inline
    def setResponseContentEncoding(value: ResponseContentEncoding): Self = this.set("ResponseContentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseContentEncoding: Self = this.set("ResponseContentEncoding", js.undefined)
    
    @scala.inline
    def setResponseContentLanguage(value: ResponseContentLanguage): Self = this.set("ResponseContentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseContentLanguage: Self = this.set("ResponseContentLanguage", js.undefined)
    
    @scala.inline
    def setResponseContentType(value: ResponseContentType): Self = this.set("ResponseContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseContentType: Self = this.set("ResponseContentType", js.undefined)
    
    @scala.inline
    def setResponseExpires(value: ResponseExpires): Self = this.set("ResponseExpires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseExpires: Self = this.set("ResponseExpires", js.undefined)
    
    @scala.inline
    def setSSECustomerAlgorithm(value: SSECustomerAlgorithm): Self = this.set("SSECustomerAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSECustomerAlgorithm: Self = this.set("SSECustomerAlgorithm", js.undefined)
    
    @scala.inline
    def setSSECustomerKey(value: SSECustomerKey): Self = this.set("SSECustomerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSECustomerKey: Self = this.set("SSECustomerKey", js.undefined)
    
    @scala.inline
    def setSSECustomerKeyMD5(value: SSECustomerKeyMD5): Self = this.set("SSECustomerKeyMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSSECustomerKeyMD5: Self = this.set("SSECustomerKeyMD5", js.undefined)
    
    @scala.inline
    def setVersionId(value: ObjectVersionId): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
}
