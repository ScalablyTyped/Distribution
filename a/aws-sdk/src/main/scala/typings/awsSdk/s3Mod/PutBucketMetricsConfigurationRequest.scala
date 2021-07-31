package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketMetricsConfigurationRequest extends StObject {
  
  /**
    * The name of the bucket for which the metrics configuration is set.
    */
  var Bucket: BucketName
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The ID used to identify the metrics configuration.
    */
  var Id: MetricsId
  
  /**
    * Specifies the metrics configuration.
    */
  var MetricsConfiguration: typings.awsSdk.s3Mod.MetricsConfiguration
}
object PutBucketMetricsConfigurationRequest {
  
  @scala.inline
  def apply(Bucket: BucketName, Id: MetricsId, MetricsConfiguration: MetricsConfiguration): PutBucketMetricsConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], MetricsConfiguration = MetricsConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketMetricsConfigurationRequest]
  }
  
  @scala.inline
  implicit class PutBucketMetricsConfigurationRequestMutableBuilder[Self <: PutBucketMetricsConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    @scala.inline
    def setId(value: MetricsId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsConfiguration(value: MetricsConfiguration): Self = StObject.set(x, "MetricsConfiguration", value.asInstanceOf[js.Any])
  }
}
