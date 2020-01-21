package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRetentionPolicyRequest extends js.Object {
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName = js.native
  var retentionInDays: Days = js.native
}

object PutRetentionPolicyRequest {
  @scala.inline
  def apply(logGroupName: LogGroupName, retentionInDays: Days): PutRetentionPolicyRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any], retentionInDays = retentionInDays.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutRetentionPolicyRequest]
  }
}

