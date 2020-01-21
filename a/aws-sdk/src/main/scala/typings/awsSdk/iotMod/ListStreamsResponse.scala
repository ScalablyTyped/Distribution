package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamsResponse extends js.Object {
  /**
    * A token used to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of streams.
    */
  var streams: js.UndefOr[StreamsSummary] = js.native
}

object ListStreamsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, streams: StreamsSummary = null): ListStreamsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (streams != null) __obj.updateDynamic("streams")(streams.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStreamsResponse]
  }
}

