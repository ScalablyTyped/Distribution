package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBucketAnalyticsConfigurationsRequest extends StObject {
  
  /**
    * The name of the bucket from which analytics configurations are retrieved.
    */
  var Bucket: BucketName = js.native
  
  /**
    * The ContinuationToken that represents a placeholder from where this request should begin.
    */
  var ContinuationToken: js.UndefOr[Token] = js.native
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.native
}
object ListBucketAnalyticsConfigurationsRequest {
  
  @scala.inline
  def apply(Bucket: BucketName): ListBucketAnalyticsConfigurationsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBucketAnalyticsConfigurationsRequest]
  }
  
  @scala.inline
  implicit class ListBucketAnalyticsConfigurationsRequestMutableBuilder[Self <: ListBucketAnalyticsConfigurationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuationToken(value: Token): Self = StObject.set(x, "ContinuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuationTokenUndefined: Self = StObject.set(x, "ContinuationToken", js.undefined)
    
    @scala.inline
    def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
  }
}
