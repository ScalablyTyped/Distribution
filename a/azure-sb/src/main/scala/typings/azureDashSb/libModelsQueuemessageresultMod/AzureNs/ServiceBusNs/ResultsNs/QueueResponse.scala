package typings.azureDashSb.libModelsQueuemessageresultMod.AzureNs.ServiceBusNs.ResultsNs

import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueResponse extends js.Object {
  var body: js.Any
  var headers: Dictionary[String]
}

object QueueResponse {
  @scala.inline
  def apply(body: js.Any, headers: Dictionary[String]): QueueResponse = {
    val __obj = js.Dynamic.literal(body = body, headers = headers)
  
    __obj.asInstanceOf[QueueResponse]
  }
}

