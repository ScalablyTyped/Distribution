package typings.azureDashSb.libModelsQueuemessageresultMod.AzureNs.ServiceBusNs.ResultsNs

import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.BrokerProperties
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueMessageResponse extends js.Object {
  var body: js.Any
  var brokerProperties: js.UndefOr[BrokerProperties] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var customProperties: js.UndefOr[Dictionary[_]] = js.undefined
  var location: js.UndefOr[String] = js.undefined
}

object QueueMessageResponse {
  @scala.inline
  def apply(
    body: js.Any,
    brokerProperties: BrokerProperties = null,
    contentType: String = null,
    customProperties: Dictionary[_] = null,
    location: String = null
  ): QueueMessageResponse = {
    val __obj = js.Dynamic.literal(body = body)
    if (brokerProperties != null) __obj.updateDynamic("brokerProperties")(brokerProperties)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (customProperties != null) __obj.updateDynamic("customProperties")(customProperties)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[QueueMessageResponse]
  }
}

