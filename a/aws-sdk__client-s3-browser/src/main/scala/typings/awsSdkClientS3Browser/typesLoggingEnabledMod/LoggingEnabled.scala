package typings.awsSdkClientS3Browser.typesLoggingEnabledMod

import typings.awsSdkClientS3Browser.typesTargetGrantMod.TargetGrant
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggingEnabled extends js.Object {
  
  /**
    * <p>Specifies the bucket where you want Amazon S3 to store server access logs. You can have your logs delivered to any bucket that you own, including the same bucket that is being logged. You can also configure multiple buckets to deliver their logs to the same target bucket. In this case you should choose a different TargetPrefix for each source bucket so that the delivered log files can be distinguished by key.</p>
    */
  var TargetBucket: String = js.native
  
  /**
    * _TargetGrants shape
    */
  var TargetGrants: js.UndefOr[js.Array[TargetGrant] | Iterable[TargetGrant]] = js.native
  
  /**
    * <p>This element lets you specify a prefix for the keys that the log files will be stored under.</p>
    */
  var TargetPrefix: String = js.native
}
object LoggingEnabled {
  
  @scala.inline
  def apply(TargetBucket: String, TargetPrefix: String): LoggingEnabled = {
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
    def setTargetBucket(value: String): Self = this.set("TargetBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPrefix(value: String): Self = this.set("TargetPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGrantsVarargs(value: TargetGrant*): Self = this.set("TargetGrants", js.Array(value :_*))
    
    @scala.inline
    def setTargetGrants(value: js.Array[TargetGrant] | Iterable[TargetGrant]): Self = this.set("TargetGrants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetGrants: Self = this.set("TargetGrants", js.undefined)
  }
}
