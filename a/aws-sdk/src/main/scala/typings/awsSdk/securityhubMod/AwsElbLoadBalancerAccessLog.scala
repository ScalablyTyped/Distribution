package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElbLoadBalancerAccessLog extends js.Object {
  
  /**
    * The interval in minutes for publishing the access logs. You can publish access logs either every 5 minutes or every 60 minutes.
    */
  var EmitInterval: js.UndefOr[Integer] = js.native
  
  /**
    * Indicates whether access logs are enabled for the load balancer.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the S3 bucket where the access logs are stored.
    */
  var S3BucketName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The logical hierarchy that was created for the S3 bucket. If a prefix is not provided, the log is placed at the root level of the bucket.
    */
  var S3BucketPrefix: js.UndefOr[NonEmptyString] = js.native
}
object AwsElbLoadBalancerAccessLog {
  
  @scala.inline
  def apply(): AwsElbLoadBalancerAccessLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerAccessLog]
  }
  
  @scala.inline
  implicit class AwsElbLoadBalancerAccessLogOps[Self <: AwsElbLoadBalancerAccessLog] (val x: Self) extends AnyVal {
    
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
    def setEmitInterval(value: Integer): Self = this.set("EmitInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmitInterval: Self = this.set("EmitInterval", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setS3BucketName(value: NonEmptyString): Self = this.set("S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BucketName: Self = this.set("S3BucketName", js.undefined)
    
    @scala.inline
    def setS3BucketPrefix(value: NonEmptyString): Self = this.set("S3BucketPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BucketPrefix: Self = this.set("S3BucketPrefix", js.undefined)
  }
}
