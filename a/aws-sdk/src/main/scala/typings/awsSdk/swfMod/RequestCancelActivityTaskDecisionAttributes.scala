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
}

