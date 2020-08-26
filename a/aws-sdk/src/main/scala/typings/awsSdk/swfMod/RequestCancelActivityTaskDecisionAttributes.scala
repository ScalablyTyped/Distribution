package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestCancelActivityTaskDecisionAttributes extends js.Object {
  /**
    * The activityId of the activity task to be canceled.
    */
  var activityId: ActivityId = js.native
}

object RequestCancelActivityTaskDecisionAttributes {
  @scala.inline
  def apply(activityId: ActivityId): RequestCancelActivityTaskDecisionAttributes = {
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestCancelActivityTaskDecisionAttributes]
  }
  @scala.inline
  implicit class RequestCancelActivityTaskDecisionAttributesOps[Self <: RequestCancelActivityTaskDecisionAttributes] (val x: Self) extends AnyVal {
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
    def setActivityId(value: ActivityId): Self = this.set("activityId", value.asInstanceOf[js.Any])
  }
  
}

