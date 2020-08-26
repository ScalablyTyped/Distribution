package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingInfo extends js.Object {
  var BrokerLogs: typings.awsSdk.kafkaMod.BrokerLogs = js.native
}

object LoggingInfo {
  @scala.inline
  def apply(BrokerLogs: BrokerLogs): LoggingInfo = {
    val __obj = js.Dynamic.literal(BrokerLogs = BrokerLogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingInfo]
  }
  @scala.inline
  implicit class LoggingInfoOps[Self <: LoggingInfo] (val x: Self) extends AnyVal {
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
    def setBrokerLogs(value: BrokerLogs): Self = this.set("BrokerLogs", value.asInstanceOf[js.Any])
  }
  
}

