package typings
package azureDashSbLib.libModelsSubscriptionresultMod.AzureNs.ServiceBusNs.ResultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionResult extends js.Object {
  def parse(xml: js.Object): js.Object | js.Array[js.Object]
  def serialize(resource: SubscriptionProperties): java.lang.String
}

object SubscriptionResult {
  @scala.inline
  def apply(
    parse: js.Function1[js.Object, js.Object | js.Array[js.Object]],
    serialize: js.Function1[SubscriptionProperties, java.lang.String]
  ): SubscriptionResult = {
    val __obj = js.Dynamic.literal(parse = parse, serialize = serialize)
  
    __obj.asInstanceOf[SubscriptionResult]
  }
}

