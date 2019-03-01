package typings
package azureDashSbLib.libModelsQueuemessageresultMod.AzureNs.ServiceBusNs.ResultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueMessageResponse extends js.Object {
  var body: js.Any
  var brokerProperties: js.UndefOr[azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.BrokerProperties] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var customProperties: js.UndefOr[azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.Dictionary[_]] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
}

object QueueMessageResponse {
  @scala.inline
  def apply(
    body: js.Any,
    brokerProperties: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.BrokerProperties = null,
    contentType: java.lang.String = null,
    customProperties: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.Dictionary[_] = null,
    location: java.lang.String = null
  ): QueueMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    if (brokerProperties != null) __obj.updateDynamic("brokerProperties")(brokerProperties)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (customProperties != null) __obj.updateDynamic("customProperties")(customProperties)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[QueueMessageResponse]
  }
}

