package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketLifecycleConfigurationRequest extends StObject {
  
  /**
    * The AWS account ID of the Outposts bucket.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId
  
  /**
    * The name of the bucket for which to set the configuration.
    */
  var Bucket: BucketName
  
  /**
    * Container for lifecycle rules. You can add as many as 1,000 rules.
    */
  var LifecycleConfiguration: js.UndefOr[typings.awsSdk.s3controlMod.LifecycleConfiguration] = js.undefined
}
object PutBucketLifecycleConfigurationRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, Bucket: BucketName): PutBucketLifecycleConfigurationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketLifecycleConfigurationRequest]
  }
  
  @scala.inline
  implicit class PutBucketLifecycleConfigurationRequestMutableBuilder[Self <: PutBucketLifecycleConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleConfiguration(value: LifecycleConfiguration): Self = StObject.set(x, "LifecycleConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleConfigurationUndefined: Self = StObject.set(x, "LifecycleConfiguration", js.undefined)
  }
}
