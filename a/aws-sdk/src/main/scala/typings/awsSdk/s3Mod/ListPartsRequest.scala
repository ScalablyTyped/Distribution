package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPartsRequest extends StObject {
  
  /**
    * The name of the bucket to which the parts are being uploaded.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation with an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide. When using this API with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this operation using S3 on Outposts through the AWS SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see Using S3 on Outposts in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * Object key for which the multipart upload was initiated.
    */
  var Key: ObjectKey
  
  /**
    * Sets the maximum number of parts to return.
    */
  var MaxParts: js.UndefOr[typings.awsSdk.s3Mod.MaxParts] = js.undefined
  
  /**
    * Specifies the part after which listing should begin. Only parts with higher part numbers will be listed.
    */
  var PartNumberMarker: js.UndefOr[typings.awsSdk.s3Mod.PartNumberMarker] = js.undefined
  
  var RequestPayer: js.UndefOr[typings.awsSdk.s3Mod.RequestPayer] = js.undefined
  
  /**
    * Upload ID identifying the multipart upload whose parts are being listed.
    */
  var UploadId: MultipartUploadId
}
object ListPartsRequest {
  
  @scala.inline
  def apply(Bucket: BucketName, Key: ObjectKey, UploadId: MultipartUploadId): ListPartsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartsRequest]
  }
  
  @scala.inline
  implicit class ListPartsRequestMutableBuilder[Self <: ListPartsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    @scala.inline
    def setKey(value: ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxParts(value: MaxParts): Self = StObject.set(x, "MaxParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPartsUndefined: Self = StObject.set(x, "MaxParts", js.undefined)
    
    @scala.inline
    def setPartNumberMarker(value: PartNumberMarker): Self = StObject.set(x, "PartNumberMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartNumberMarkerUndefined: Self = StObject.set(x, "PartNumberMarker", js.undefined)
    
    @scala.inline
    def setRequestPayer(value: RequestPayer): Self = StObject.set(x, "RequestPayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestPayerUndefined: Self = StObject.set(x, "RequestPayer", js.undefined)
    
    @scala.inline
    def setUploadId(value: MultipartUploadId): Self = StObject.set(x, "UploadId", value.asInstanceOf[js.Any])
  }
}
