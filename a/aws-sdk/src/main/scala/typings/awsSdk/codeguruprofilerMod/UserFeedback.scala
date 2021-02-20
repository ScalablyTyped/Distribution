package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserFeedback extends StObject {
  
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
  implicit class UserFeedbackMutableBuilder[Self <: UserFeedback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: FeedbackType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
