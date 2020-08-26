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
  def apply(): ChannelSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelSummary]
  }
  @scala.inline
  implicit class ChannelSummaryOps[Self <: ChannelSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChannelName(value: ChannelName): Self = this.set("channelName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelName: Self = this.set("channelName", js.undefined)
    @scala.inline
    def setChannelStorage(value: ChannelStorageSummary): Self = this.set("channelStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelStorage: Self = this.set("channelStorage", js.undefined)
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setLastUpdateTime(value: Timestamp): Self = this.set("lastUpdateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("lastUpdateTime", js.undefined)
    @scala.inline
    def setStatus(value: ChannelStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

