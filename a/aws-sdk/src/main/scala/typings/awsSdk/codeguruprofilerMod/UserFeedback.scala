package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserFeedback extends js.Object {
  /**
    * Optional Positive or Negative feedback submitted by the user about whether the recommendation is useful or not.
    */
  var `type`: FeedbackType = js.native
}

object UserFeedback {
  @scala.inline
  def apply(`type`: FeedbackType): UserFeedback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserFeedback]
  }
}

