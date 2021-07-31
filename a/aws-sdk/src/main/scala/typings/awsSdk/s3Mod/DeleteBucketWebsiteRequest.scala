package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBucketWebsiteRequest extends StObject {
  
  /**
    * The bucket name for which you want to remove the website configuration. 
    */
  var Bucket: BucketName
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
}
object DeleteBucketWebsiteRequest {
  
  @scala.inline
  def apply(Bucket: BucketName): DeleteBucketWebsiteRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketWebsiteRequest]
  }
  
  @scala.inline
  implicit class DeleteBucketWebsiteRequestMutableBuilder[Self <: DeleteBucketWebsiteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
  }
}
