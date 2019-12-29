package typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod

import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.chargeColonconfirmed
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.chargeColoncreated
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.chargeColondelayed
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.chargeColonfailed
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.chargeColonpending
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.chargeColonresolved
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
  var `type`: chargeColoncreated | chargeColonconfirmed | chargeColonfailed | chargeColondelayed | chargeColonpending | chargeColonresolved
}

object EventResource {
  @scala.inline
  def apply[T](
    api_version: String,
    created_at: Timestamp,
    data: T,
    id: String,
    resource: event,
    `type`: chargeColoncreated | chargeColonconfirmed | chargeColonfailed | chargeColondelayed | chargeColonpending | chargeColonresolved
  ): EventResource[T] = {
    val __obj = js.Dynamic.literal(api_version = api_version.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventResource[T]]
  }
}

