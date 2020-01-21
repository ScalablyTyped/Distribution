package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateDRTLogBucketRequest extends js.Object {
  /**
    * The Amazon S3 bucket that contains your AWS WAF logs.
    */
  var LogBucket: typings.awsSdk.shieldMod.LogBucket = js.native
}

object AssociateDRTLogBucketRequest {
  @scala.inline
  def apply(LogBucket: LogBucket): AssociateDRTLogBucketRequest = {
    val __obj = js.Dynamic.literal(LogBucket = LogBucket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssociateDRTLogBucketRequest]
  }
}

