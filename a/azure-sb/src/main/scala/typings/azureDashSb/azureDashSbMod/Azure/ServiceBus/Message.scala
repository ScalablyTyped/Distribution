package typings.azureDashSb.azureDashSbMod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var body: String
  var brokerProperties: js.UndefOr[BrokerProperties] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var customProperties: js.UndefOr[Dictionary[_]] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    body: String,
    brokerProperties: BrokerProperties = null,
    contentType: String = null,
    customProperties: Dictionary[_] = null
  ): Message = {
    val __obj = js.Dynamic.literal(body = body)
    if (brokerProperties != null) __obj.updateDynamic("brokerProperties")(brokerProperties)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (customProperties != null) __obj.updateDynamic("customProperties")(customProperties)
    __obj.asInstanceOf[Message]
  }
}

