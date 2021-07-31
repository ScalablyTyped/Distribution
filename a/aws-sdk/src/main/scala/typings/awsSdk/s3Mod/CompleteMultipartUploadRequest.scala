package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteMultipartUploadRequest extends StObject {
  
  /**
    * Name of the bucket to which the multipart upload was initiated.
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
    * The container for the multipart upload request information.
    */
  var MultipartUpload: js.UndefOr[CompletedMultipartUpload] = js.undefined
  
  var RequestPayer: js.UndefOr[typings.awsSdk.s3Mod.RequestPayer] = js.undefined
  
  /**
    * ID for the initiated multipart upload.
    */
  var UploadId: MultipartUploadId
}
object CompleteMultipartUploadRequest {
  
  @scala.inline
  def apply(Bucket: BucketName, Key: ObjectKey, UploadId: MultipartUploadId): CompleteMultipartUploadRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteMultipartUploadRequest]
  }
  
  @scala.inline
  implicit class CompleteMultipartUploadRequestMutableBuilder[Self <: CompleteMultipartUploadRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    @scala.inline
    def setKey(value: ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipartUpload(value: CompletedMultipartUpload): Self = StObject.set(x, "MultipartUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipartUploadUndefined: Self = StObject.set(x, "MultipartUpload", js.undefined)
    
    @scala.inline
    def setRequestPayer(value: RequestPayer): Self = StObject.set(x, "RequestPayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestPayerUndefined: Self = StObject.set(x, "RequestPayer", js.undefined)
    
    @scala.inline
    def setUploadId(value: MultipartUploadId): Self = StObject.set(x, "UploadId", value.asInstanceOf[js.Any])
  }
}
