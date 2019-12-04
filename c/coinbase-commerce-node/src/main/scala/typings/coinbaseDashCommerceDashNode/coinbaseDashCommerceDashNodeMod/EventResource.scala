package typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod

import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.`charge:confirmed`
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.`charge:created`
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.`charge:delayed`
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.`charge:failed`
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.`charge:pending`
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.`charge:resolved`
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.event
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
  var api_version: String
  /**
    * Event creation time.
    */
  var created_at: Timestamp
  /**
    * Event Payload.
    * Resource of the associated object at the time of the event.
    */
  var data: T
  /**
    * Event UUID.
    */
  var id: String
  /**
    * Resource name.
    */
  var resource: event
  /**
    * Event type.
    */
  var `type`: `charge:created` | `charge:confirmed` | `charge:failed` | `charge:delayed` | `charge:pending` | `charge:resolved`
}

object EventResource {
  @scala.inline
  def apply[T](
    api_version: String,
    created_at: Timestamp,
    data: T,
    id: String,
    resource: event,
    `type`: `charge:created` | `charge:confirmed` | `charge:failed` | `charge:delayed` | `charge:pending` | `charge:resolved`
  ): EventResource[T] = {
    val __obj = js.Dynamic.literal(api_version = api_version.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventResource[T]]
  }
}

