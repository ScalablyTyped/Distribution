package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeactivateEventSourceRequest extends js.Object {
  /**
    * The name of the partner event source to deactivate.
    */
  var Name: EventSourceName = js.native
}

object DeactivateEventSourceRequest {
  @scala.inline
  def apply(Name: EventSourceName): DeactivateEventSourceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeactivateEventSourceRequest]
  }
}

