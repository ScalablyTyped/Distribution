package typings
package coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event Resource.
  *
  * @link
  */
trait EventResource extends js.Object {
  /**
    * API version of the `data` payload.
    */
  var api_version: java.lang.String
  /**
    * Event creation time.
    */
  var created_at: coinbaseDashCommerceDashNodeLib.Timestamp
  /**
    * Event Payload.
    * Resource of the associated object at the time of the event.
    */
  var data: ChargeResource | CheckoutResource
  /**
    * Event UUID.
    */
  var id: java.lang.String
  /**
    * Resource name.
    */
  var resource: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.event
  /**
    * Event type.
    */
  var `type`: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:created` | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:confirmed` | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:failed` | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:delayed` | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:pending`
}

object EventResource {
  @scala.inline
  def apply(
    api_version: java.lang.String,
    created_at: coinbaseDashCommerceDashNodeLib.Timestamp,
    data: ChargeResource | CheckoutResource,
    id: java.lang.String,
    resource: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.event,
    `type`: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:created` | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:confirmed` | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:failed` | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:delayed` | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:pending`
  ): EventResource = {
    val __obj = js.Dynamic.literal(api_version = api_version, created_at = created_at, data = data.asInstanceOf[js.Any], id = id, resource = resource)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventResource]
  }
}

