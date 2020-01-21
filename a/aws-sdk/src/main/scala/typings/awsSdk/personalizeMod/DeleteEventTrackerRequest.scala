package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEventTrackerRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the event tracker to delete.
    */
  var eventTrackerArn: Arn = js.native
}

object DeleteEventTrackerRequest {
  @scala.inline
  def apply(eventTrackerArn: Arn): DeleteEventTrackerRequest = {
    val __obj = js.Dynamic.literal(eventTrackerArn = eventTrackerArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteEventTrackerRequest]
  }
}

