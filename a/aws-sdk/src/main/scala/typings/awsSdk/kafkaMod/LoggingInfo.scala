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
}

