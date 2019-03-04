package typings
package azureDashSbLib.libModelsQueueresultMod.AzureNs.ServiceBusNs.ResultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueResult extends js.Object {
  def parse(xml: js.Object): js.Object | js.Array[js.Object]
  def serialize(resource: QueueProperties): java.lang.String
}

object QueueResult {
  @scala.inline
  def apply(
    parse: js.Function1[js.Object, js.Object | js.Array[js.Object]],
    serialize: js.Function1[QueueProperties, java.lang.String]
  ): QueueResult = {
    val __obj = js.Dynamic.literal(parse = parse, serialize = serialize)
  
    __obj.asInstanceOf[QueueResult]
  }
}

