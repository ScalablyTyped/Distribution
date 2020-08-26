package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateDRTLogBucketRequest extends js.Object {
  /**
    * The Amazon S3 bucket that contains your AWS WAF logs.
    */
  var LogBucket: typings.awsSdk.shieldMod.LogBucket = js.native
}

object DisassociateDRTLogBucketRequest {
  @scala.inline
  def apply(LogBucket: LogBucket): DisassociateDRTLogBucketRequest = {
    val __obj = js.Dynamic.literal(LogBucket = LogBucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateDRTLogBucketRequest]
  }
  @scala.inline
  implicit class DisassociateDRTLogBucketRequestOps[Self <: DisassociateDRTLogBucketRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLogBucket(value: LogBucket): Self = this.set("LogBucket", value.asInstanceOf[js.Any])
  }
  
}

