package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamsOutput extends js.Object {
  /**
    * If the response is truncated, the call returns this element with a token. To get the next batch of streams, use this token in your next request. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.kinesisvideoMod.NextToken] = js.native
  /**
    * An array of StreamInfo objects.
    */
  var StreamInfoList: js.UndefOr[typings.awsSdk.kinesisvideoMod.StreamInfoList] = js.native
}

object ListStreamsOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, StreamInfoList: StreamInfoList = null): ListStreamsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StreamInfoList != null) __obj.updateDynamic("StreamInfoList")(StreamInfoList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStreamsOutput]
  }
}

