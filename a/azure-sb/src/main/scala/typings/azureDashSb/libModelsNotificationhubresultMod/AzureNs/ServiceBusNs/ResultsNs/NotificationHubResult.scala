package typings.azureDashSb.libModelsNotificationhubresultMod.AzureNs.ServiceBusNs.ResultsNs

import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.CreateNotificationHubOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationHubResult extends js.Object {
  def parse(xml: js.Object): js.Object | js.Array[js.Object]
  def serialize(resource: CreateNotificationHubOptions): String
}

object NotificationHubResult {
  @scala.inline
  def apply(
    parse: js.Object => js.Object | js.Array[js.Object],
    serialize: CreateNotificationHubOptions => String
  ): NotificationHubResult = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), serialize = js.Any.fromFunction1(serialize))
  
    __obj.asInstanceOf[NotificationHubResult]
  }
}

