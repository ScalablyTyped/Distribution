package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLogStreamsResponse extends js.Object {
  /**
    * The log streams.
    */
  var logStreams: js.UndefOr[LogStreams] = js.native
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeLogStreamsResponse {
  @scala.inline
  def apply(logStreams: LogStreams = null, nextToken: NextToken = null): DescribeLogStreamsResponse = {
    val __obj = js.Dynamic.literal()
    if (logStreams != null) __obj.updateDynamic("logStreams")(logStreams.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLogStreamsResponse]
  }
}

