package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLogStreamRequest extends js.Object {
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName = js.native
  /**
    * The name of the log stream.
    */
  var logStreamName: LogStreamName = js.native
}

object CreateLogStreamRequest {
  @scala.inline
  def apply(logGroupName: LogGroupName, logStreamName: LogStreamName): CreateLogStreamRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any], logStreamName = logStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLogStreamRequest]
  }
}

