package typings
package azureDashSbLib.libModelsNotificationhubresultMod.AzureNs.ServiceBusNs.ResultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationHubResult extends js.Object {
  def parse(xml: js.Object): js.Object | js.Array[js.Object]
  def serialize(resource: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.CreateNotificationHubOptions): java.lang.String
}

object NotificationHubResult {
  @scala.inline
  def apply(
    parse: js.Function1[js.Object, js.Object | js.Array[js.Object]],
    serialize: js.Function1[
      azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.CreateNotificationHubOptions, 
      java.lang.String
    ]
  ): NotificationHubResult = {
    val __obj = js.Dynamic.literal(parse = parse, serialize = serialize)
  
    __obj.asInstanceOf[NotificationHubResult]
  }
}

