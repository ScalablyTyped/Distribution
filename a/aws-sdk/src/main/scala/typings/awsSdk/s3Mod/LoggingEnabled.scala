package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggingEnabled extends js.Object {
  
  /**
    * Specifies the bucket where you want Amazon S3 to store server access logs. You can have your logs delivered to any bucket that you own, including the same bucket that is being logged. You can also configure multiple buckets to deliver their logs to the same target bucket. In this case, you should choose a different TargetPrefix for each source bucket so that the delivered log files can be distinguished by key.
    */
  var TargetBucket: typings.awsSdk.s3Mod.TargetBucket = js.native
  
  /**
    * Container for granting information.
    */
  var TargetGrants: js.UndefOr[typings.awsSdk.s3Mod.TargetGrants] = js.native
  
  /**
    * A prefix for all log object keys. If you store log files from multiple Amazon S3 buckets in a single bucket, you can use a prefix to distinguish which log files came from which bucket.
    */
  var TargetPrefix: typings.awsSdk.s3Mod.TargetPrefix = js.native
}
object LoggingEnabled {
  
  @scala.inline
  def apply(TargetBucket: TargetBucket, TargetPrefix: TargetPrefix): LoggingEnabled = {
    val __obj = js.Dynamic.literal(TargetBucket = TargetBucket.asInstanceOf[js.Any], TargetPrefix = TargetPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingEnabled]
  }
  
  @scala.inline
  implicit class LoggingEnabledOps[Self <: LoggingEnabled] (val x: Self) extends AnyVal {
    
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
    def setTargetBucket(value: TargetBucket): Self = this.set("TargetBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPrefix(value: TargetPrefix): Self = this.set("TargetPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGrantsVarargs(value: TargetGrant*): Self = this.set("TargetGrants", js.Array(value :_*))
    
    @scala.inline
    def setTargetGrants(value: TargetGrants): Self = this.set("TargetGrants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetGrants: Self = this.set("TargetGrants", js.undefined)
  }
}
