package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelSummary extends js.Object {
  /**
    * The name of the channel.
    */
  var channelName: js.UndefOr[ChannelName] = js.native
  /**
    * Where channel data is stored.
    */
  var channelStorage: js.UndefOr[ChannelStorageSummary] = js.native
  /**
    * When the channel was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The last time the channel was updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.native
  /**
    * The status of the channel.
    */
  var status: js.UndefOr[ChannelStatus] = js.native
}

object ChannelSummary {
  @scala.inline
  def apply(
    channelName: ChannelName = null,
    channelStorage: ChannelStorageSummary = null,
    creationTime: Timestamp = null,
    lastUpdateTime: Timestamp = null,
    status: ChannelStatus = null
  ): ChannelSummary = {
    val __obj = js.Dynamic.literal()
    if (channelName != null) __obj.updateDynamic("channelName")(channelName.asInstanceOf[js.Any])
    if (channelStorage != null) __obj.updateDynamic("channelStorage")(channelStorage.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSummary]
  }
}

