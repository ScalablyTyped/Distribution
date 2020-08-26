package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryChannelStatus extends js.Object {
  /**
    * A list that contains the status of the delivery of the configuration history to the specified Amazon S3 bucket.
    */
  var configHistoryDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo] = js.native
  /**
    * A list containing the status of the delivery of the snapshot to the specified Amazon S3 bucket.
    */
  var configSnapshotDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo] = js.native
  /**
    * A list containing the status of the delivery of the configuration stream notification to the specified Amazon SNS topic.
    */
  var configStreamDeliveryInfo: js.UndefOr[ConfigStreamDeliveryInfo] = js.native
  /**
    * The name of the delivery channel.
    */
  var name: js.UndefOr[String] = js.native
}

object DeliveryChannelStatus {
  @scala.inline
  def apply(): DeliveryChannelStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryChannelStatus]
  }
  @scala.inline
  implicit class DeliveryChannelStatusOps[Self <: DeliveryChannelStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigHistoryDeliveryInfo(value: ConfigExportDeliveryInfo): Self = this.set("configHistoryDeliveryInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigHistoryDeliveryInfo: Self = this.set("configHistoryDeliveryInfo", js.undefined)
    @scala.inline
    def setConfigSnapshotDeliveryInfo(value: ConfigExportDeliveryInfo): Self = this.set("configSnapshotDeliveryInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigSnapshotDeliveryInfo: Self = this.set("configSnapshotDeliveryInfo", js.undefined)
    @scala.inline
    def setConfigStreamDeliveryInfo(value: ConfigStreamDeliveryInfo): Self = this.set("configStreamDeliveryInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigStreamDeliveryInfo: Self = this.set("configStreamDeliveryInfo", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

