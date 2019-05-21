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
trait EventResource[T] extends js.Object {
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
  var data: T
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
  var `type`: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:created` | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:confirmed` | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:failed` | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:delayed` | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:pending` | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:resolved`
}

object EventResource {
  @scala.inline
  def apply[T](
    api_version: java.lang.String,
    created_at: coinbaseDashCommerceDashNodeLib.Timestamp,
    data: T,
    id: java.lang.String,
    resource: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.event,
    `type`: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:created` | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:confirmed` | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:failed` | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:delayed` | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:pending` | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:resolved`
  ): EventResource[T] = {
    val __obj = js.Dynamic.literal(api_version = api_version, created_at = created_at, data = data.asInstanceOf[js.Any], id = id, resource = resource)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventResource[T]]
  }
}

