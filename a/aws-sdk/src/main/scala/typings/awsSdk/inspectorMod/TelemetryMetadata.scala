package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TelemetryMetadata extends js.Object {
  /**
    * The count of messages that the agent sends to the Amazon Inspector service.
    */
  var count: Long = js.native
  /**
    * The data size of messages that the agent sends to the Amazon Inspector service.
    */
  var dataSize: js.UndefOr[Long] = js.native
  /**
    * A specific type of behavioral data that is collected by the agent.
    */
  var messageType: MessageType = js.native
}

object TelemetryMetadata {
  @scala.inline
  def apply(count: Long, messageType: MessageType): TelemetryMetadata = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryMetadata]
  }
  @scala.inline
  implicit class TelemetryMetadataOps[Self <: TelemetryMetadata] (val x: Self) extends AnyVal {
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
    def setCount(value: Long): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageType(value: MessageType): Self = this.set("messageType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSize(value: Long): Self = this.set("dataSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSize: Self = this.set("dataSize", js.undefined)
  }
  
}

