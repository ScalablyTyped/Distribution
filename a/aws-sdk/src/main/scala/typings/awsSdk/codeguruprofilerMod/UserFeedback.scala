package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class UserFeedbackOps[Self <: UserFeedback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: FeedbackType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
