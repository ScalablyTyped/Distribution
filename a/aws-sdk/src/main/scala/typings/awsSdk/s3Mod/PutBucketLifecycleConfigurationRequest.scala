package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBucketLifecycleConfigurationRequest extends js.Object {
  
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
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwner(value: AccountId): Self = this.set("ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedBucketOwner: Self = this.set("ExpectedBucketOwner", js.undefined)
    
    @scala.inline
    def setLifecycleConfiguration(value: BucketLifecycleConfiguration): Self = this.set("LifecycleConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecycleConfiguration: Self = this.set("LifecycleConfiguration", js.undefined)
  }
}
