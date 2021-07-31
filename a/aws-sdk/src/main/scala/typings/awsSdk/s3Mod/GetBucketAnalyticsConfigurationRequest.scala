package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketAnalyticsConfigurationRequest extends StObject {
  
  /**
    * The name of the bucket from which an analytics configuration is retrieved.
    */
  var Bucket: BucketName
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The ID that identifies the analytics configuration.
    */
  var Id: AnalyticsId
}
object GetBucketAnalyticsConfigurationRequest {
  
  @scala.inline
  def apply(Bucket: BucketName, Id: AnalyticsId): GetBucketAnalyticsConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketAnalyticsConfigurationRequest]
  }
  
  @scala.inline
  implicit class GetBucketAnalyticsConfigurationRequestMutableBuilder[Self <: GetBucketAnalyticsConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    @scala.inline
    def setId(value: AnalyticsId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
