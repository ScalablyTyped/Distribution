package typings.coinbaseCommerceNode.mod

import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColonconfirmed
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColoncreated
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColondelayed
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColonfailed
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColonpending
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColonresolved
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event Resource.
  *
  * @link
  */
@js.native
trait EventResource[T] extends js.Object {
  
  /**
    * API version of the `data` payload.
    */
  var api_version: String = js.native
  
  /**
    * Event creation time.
    */
  var created_at: Timestamp = js.native
  
  /**
    * Event Payload.
    * Resource of the associated object at the time of the event.
    */
  var data: T = js.native
  
  /**
    * Event UUID.
    */
  var id: String = js.native
  
  /**
    * Resource name.
    */
  var resource: event = js.native
  
  /**
    * Event type.
    */
  var `type`: chargeColoncreated | chargeColonconfirmed | chargeColonfailed | chargeColondelayed | chargeColonpending | chargeColonresolved = js.native
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
  
  @scala.inline
  implicit class EventResourceOps[Self <: EventResource[_], T] (val x: Self with EventResource[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApi_version(value: String): Self = this.set("api_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: Timestamp): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: event): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: chargeColoncreated | chargeColonconfirmed | chargeColonfailed | chargeColondelayed | chargeColonpending | chargeColonresolved
    ): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
