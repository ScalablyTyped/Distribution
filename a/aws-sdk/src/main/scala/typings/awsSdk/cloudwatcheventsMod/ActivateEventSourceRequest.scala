package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivateEventSourceRequest extends js.Object {
  /**
    * The name of the partner event source to activate.
    */
  var Name: EventSourceName = js.native
}

object ActivateEventSourceRequest {
  @scala.inline
  def apply(Name: EventSourceName): ActivateEventSourceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActivateEventSourceRequest]
  }
}

