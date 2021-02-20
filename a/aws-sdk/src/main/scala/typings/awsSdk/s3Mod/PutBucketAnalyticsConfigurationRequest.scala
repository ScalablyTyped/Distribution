package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBucketAnalyticsConfigurationRequest extends StObject {
  
  /**
    * The configuration and any analyses for the analytics filter.
    */
  var AnalyticsConfiguration: typings.awsSdk.s3Mod.AnalyticsConfiguration = js.native
  
  /**
    * The name of the bucket to which an analytics configuration is stored.
    */
  var Bucket: BucketName = js.native
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.native
  
  /**
    * The ID that identifies the analytics configuration.
    */
  var Id: AnalyticsId = js.native
}
object PutBucketAnalyticsConfigurationRequest {
  
  @scala.inline
  def apply(AnalyticsConfiguration: AnalyticsConfiguration, Bucket: BucketName, Id: AnalyticsId): PutBucketAnalyticsConfigurationRequest = {
    val __obj = js.Dynamic.literal(AnalyticsConfiguration = AnalyticsConfiguration.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketAnalyticsConfigurationRequest]
  }
  
  @scala.inline
  implicit class PutBucketAnalyticsConfigurationRequestMutableBuilder[Self <: PutBucketAnalyticsConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyticsConfiguration(value: AnalyticsConfiguration): Self = StObject.set(x, "AnalyticsConfiguration", value.asInstanceOf[js.Any])
    
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
