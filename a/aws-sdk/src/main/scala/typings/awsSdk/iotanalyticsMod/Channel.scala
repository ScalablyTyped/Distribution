package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends js.Object {
  /**
    * The ARN of the channel.
    */
  var arn: js.UndefOr[ChannelArn] = js.native
  /**
    * When the channel was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * When the channel was last updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the channel.
    */
  var name: js.UndefOr[ChannelName] = js.native
  /**
    * How long, in days, message data is kept for the channel.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
  /**
    * The status of the channel.
    */
  var status: js.UndefOr[ChannelStatus] = js.native
  /**
    * Where channel data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage. If not specified, the default is "serviceManagedS3". This cannot be changed after creation of the channel.
    */
  var storage: js.UndefOr[ChannelStorage] = js.native
}

object Channel {
  @scala.inline
  def apply(
    arn: ChannelArn = null,
    creationTime: Timestamp = null,
    lastUpdateTime: Timestamp = null,
    name: ChannelName = null,
    retentionPeriod: RetentionPeriod = null,
    status: ChannelStatus = null,
    storage: ChannelStorage = null
  ): Channel = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
}

