package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBucketLifecycleConfigurationRequest extends js.Object {
  
  /**
    * The AWS account ID of the Outposts bucket.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
  
  /**
    * The name of the bucket for which to set the configuration.
    */
  var Bucket: BucketName = js.native
  
  /**
    * Container for lifecycle rules. You can add as many as 1,000 rules.
    */
  var LifecycleConfiguration: js.UndefOr[typings.awsSdk.s3controlMod.LifecycleConfiguration] = js.native
}
object PutBucketLifecycleConfigurationRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, Bucket: BucketName): PutBucketLifecycleConfigurationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketLifecycleConfigurationRequest]
  }
  
  @scala.inline
  implicit class PutBucketLifecycleConfigurationRequestOps[Self <: PutBucketLifecycleConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleConfiguration(value: LifecycleConfiguration): Self = this.set("LifecycleConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecycleConfiguration: Self = this.set("LifecycleConfiguration", js.undefined)
  }
}
