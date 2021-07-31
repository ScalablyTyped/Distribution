package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketPolicyRequest extends StObject {
  
  /**
    * The name of the bucket.
    */
  var Bucket: BucketName
  
  /**
    * Set this parameter to true to confirm that you want to remove your permissions to change this bucket policy in the future.
    */
  var ConfirmRemoveSelfBucketAccess: js.UndefOr[typings.awsSdk.s3Mod.ConfirmRemoveSelfBucketAccess] = js.undefined
  
  /**
    * The MD5 hash of the request body. For requests made using the AWS Command Line Interface (CLI) or AWS SDKs, this field is calculated automatically.
    */
  var ContentMD5: js.UndefOr[typings.awsSdk.s3Mod.ContentMD5] = js.undefined
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The bucket policy as a JSON document.
    */
  var Policy: typings.awsSdk.s3Mod.Policy
}
object PutBucketPolicyRequest {
  
  @scala.inline
  def apply(Bucket: BucketName, Policy: Policy): PutBucketPolicyRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketPolicyRequest]
  }
  
  @scala.inline
  implicit class PutBucketPolicyRequestMutableBuilder[Self <: PutBucketPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmRemoveSelfBucketAccess(value: ConfirmRemoveSelfBucketAccess): Self = StObject.set(x, "ConfirmRemoveSelfBucketAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmRemoveSelfBucketAccessUndefined: Self = StObject.set(x, "ConfirmRemoveSelfBucketAccess", js.undefined)
    
    @scala.inline
    def setContentMD5(value: ContentMD5): Self = StObject.set(x, "ContentMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentMD5Undefined: Self = StObject.set(x, "ContentMD5", js.undefined)
    
    @scala.inline
    def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    @scala.inline
    def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
  }
}
