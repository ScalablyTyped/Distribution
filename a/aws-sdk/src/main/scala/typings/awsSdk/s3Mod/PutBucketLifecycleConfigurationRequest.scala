package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBucketLifecycleConfigurationRequest extends StObject {
  
  /**
    * The name of the bucket for which to set the configuration.
    */
  var Bucket: BucketName = js.native
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.native
  
  /**
    * Container for lifecycle rules. You can add as many as 1,000 rules.
    */
  var LifecycleConfiguration: js.UndefOr[BucketLifecycleConfiguration] = js.native
}
object PutBucketLifecycleConfigurationRequest {
  
  @scala.inline
  def apply(Bucket: BucketName): PutBucketLifecycleConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketLifecycleConfigurationRequest]
  }
  
  @scala.inline
  implicit class PutBucketLifecycleConfigurationRequestMutableBuilder[Self <: PutBucketLifecycleConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    @scala.inline
    def setLifecycleConfiguration(value: BucketLifecycleConfiguration): Self = StObject.set(x, "LifecycleConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleConfigurationUndefined: Self = StObject.set(x, "LifecycleConfiguration", js.undefined)
  }
}
