package typings
package azureDashSbLib.libModelsQueuemessageresultMod.AzureNs.ServiceBusNs.ResultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueResponse extends js.Object {
  var body: js.Any
  var headers: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.Dictionary[java.lang.String]
}

object QueueResponse {
  @scala.inline
  def apply(
    body: js.Any,
    headers: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.Dictionary[java.lang.String]
  ): QueueResponse = {
    val __obj = js.Dynamic.literal(body = body, headers = headers)
  
    __obj.asInstanceOf[QueueResponse]
  }
}

