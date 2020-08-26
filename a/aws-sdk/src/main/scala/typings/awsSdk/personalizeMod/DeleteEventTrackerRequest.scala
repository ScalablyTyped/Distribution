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
  @scala.inline
  implicit class DeleteEventTrackerRequestOps[Self <: DeleteEventTrackerRequest] (val x: Self) extends AnyVal {
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
    def setEventTrackerArn(value: Arn): Self = this.set("eventTrackerArn", value.asInstanceOf[js.Any])
  }
  
}

