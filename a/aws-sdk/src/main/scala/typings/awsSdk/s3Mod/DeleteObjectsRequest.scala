package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteObjectsRequest extends StObject {
  
  /**
    * The bucket name containing the objects to delete.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation with an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide. When using this API with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this operation using S3 on Outposts through the AWS SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see Using S3 on Outposts in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName
  
  /**
    * Specifies whether you want to delete this object even if it has a Governance-type Object Lock in place. You must have sufficient permissions to perform this operation.
    */
  var BypassGovernanceRetention: js.UndefOr[typings.awsSdk.s3Mod.BypassGovernanceRetention] = js.undefined
  
  /**
    * Container for the request.
    */
  var Delete: typings.awsSdk.s3Mod.Delete
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The concatenation of the authentication device's serial number, a space, and the value that is displayed on your authentication device. Required to permanently delete a versioned object if versioning is configured with MFA delete enabled.
    */
  var MFA: js.UndefOr[typings.awsSdk.s3Mod.MFA] = js.undefined
  
  var RequestPayer: js.UndefOr[typings.awsSdk.s3Mod.RequestPayer] = js.undefined
}
object DeleteObjectsRequest {
  
  @scala.inline
  def apply(Bucket: BucketName, Delete: Delete): DeleteObjectsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Delete = Delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectsRequest]
  }
  
  @scala.inline
  implicit class DeleteObjectsRequestMutableBuilder[Self <: DeleteObjectsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassGovernanceRetention(value: BypassGovernanceRetention): Self = StObject.set(x, "BypassGovernanceRetention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassGovernanceRetentionUndefined: Self = StObject.set(x, "BypassGovernanceRetention", js.undefined)
    
    @scala.inline
    def setDelete(value: Delete): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    @scala.inline
    def setMFA(value: MFA): Self = StObject.set(x, "MFA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMFAUndefined: Self = StObject.set(x, "MFA", js.undefined)
    
    @scala.inline
    def setRequestPayer(value: RequestPayer): Self = StObject.set(x, "RequestPayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestPayerUndefined: Self = StObject.set(x, "RequestPayer", js.undefined)
  }
}
