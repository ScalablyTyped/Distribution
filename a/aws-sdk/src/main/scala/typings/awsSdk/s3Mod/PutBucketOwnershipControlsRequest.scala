package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketOwnershipControlsRequest extends StObject {
  
  /**
    * The name of the Amazon S3 bucket whose OwnershipControls you want to set.
    */
  var Bucket: BucketName
  
  /**
    * The MD5 hash of the OwnershipControls request body.  For requests made using the AWS Command Line Interface (CLI) or AWS SDKs, this field is calculated automatically.
    */
  var ContentMD5: js.UndefOr[typings.awsSdk.s3Mod.ContentMD5] = js.undefined
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The OwnershipControls (BucketOwnerPreferred or ObjectWriter) that you want to apply to this Amazon S3 bucket.
    */
  var OwnershipControls: typings.awsSdk.s3Mod.OwnershipControls
}
object PutBucketOwnershipControlsRequest {
  
  @scala.inline
  def apply(Bucket: BucketName, OwnershipControls: OwnershipControls): PutBucketOwnershipControlsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], OwnershipControls = OwnershipControls.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketOwnershipControlsRequest]
  }
  
  @scala.inline
  implicit class PutBucketOwnershipControlsRequestMutableBuilder[Self <: PutBucketOwnershipControlsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentMD5(value: ContentMD5): Self = StObject.set(x, "ContentMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentMD5Undefined: Self = StObject.set(x, "ContentMD5", js.undefined)
    
    @scala.inline
    def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    @scala.inline
    def setOwnershipControls(value: OwnershipControls): Self = StObject.set(x, "OwnershipControls", value.asInstanceOf[js.Any])
  }
}
