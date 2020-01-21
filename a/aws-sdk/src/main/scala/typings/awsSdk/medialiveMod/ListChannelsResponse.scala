package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListChannelsResponse extends js.Object {
  var Channels: js.UndefOr[listOfChannelSummary] = js.native
  var NextToken: js.UndefOr[string] = js.native
}

object ListChannelsResponse {
  @scala.inline
  def apply(Channels: listOfChannelSummary = null, NextToken: string = null): ListChannelsResponse = {
    val __obj = js.Dynamic.literal()
    if (Channels != null) __obj.updateDynamic("Channels")(Channels.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelsResponse]
  }
}

