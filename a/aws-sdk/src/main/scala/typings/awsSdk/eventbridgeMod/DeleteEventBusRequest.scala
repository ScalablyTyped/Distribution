package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEventBusRequest extends js.Object {
  /**
    * The name of the event bus to delete.
    */
  var Name: EventBusName = js.native
}

object DeleteEventBusRequest {
  @scala.inline
  def apply(Name: EventBusName): DeleteEventBusRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteEventBusRequest]
  }
}

