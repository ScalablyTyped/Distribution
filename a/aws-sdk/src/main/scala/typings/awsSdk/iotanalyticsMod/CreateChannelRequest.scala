package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateChannelRequest extends js.Object {
  /**
    * The name of the channel.
    */
  var channelName: ChannelName = js.native
  /**
    * Where channel data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage. If not specified, the default is "serviceManagedS3". This cannot be changed after creation of the channel.
    */
  var channelStorage: js.UndefOr[ChannelStorage] = js.native
  /**
    * How long, in days, message data is kept for the channel. When "customerManagedS3" storage is selected, this parameter is ignored.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
  /**
    * Metadata which can be used to manage the channel.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateChannelRequest {
  @scala.inline
  def apply(
    channelName: ChannelName,
    channelStorage: ChannelStorage = null,
    retentionPeriod: RetentionPeriod = null,
    tags: TagList = null
  ): CreateChannelRequest = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any])
    if (channelStorage != null) __obj.updateDynamic("channelStorage")(channelStorage.asInstanceOf[js.Any])
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChannelRequest]
  }
}

