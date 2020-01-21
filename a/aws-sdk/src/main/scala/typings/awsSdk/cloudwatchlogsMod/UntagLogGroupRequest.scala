package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagLogGroupRequest extends js.Object {
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName = js.native
  /**
    * The tag keys. The corresponding tags are removed from the log group.
    */
  var tags: TagList = js.native
}

object UntagLogGroupRequest {
  @scala.inline
  def apply(logGroupName: LogGroupName, tags: TagList): UntagLogGroupRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UntagLogGroupRequest]
  }
}

