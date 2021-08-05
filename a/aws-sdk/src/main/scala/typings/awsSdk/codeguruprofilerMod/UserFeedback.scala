package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserFeedback extends StObject {
  
  /**
    * Optional Positive or Negative feedback submitted by the user about whether the recommendation is useful or not.
    */
  var `type`: FeedbackType
}
object UserFeedback {
  
  inline def apply(`type`: FeedbackType): UserFeedback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserFeedback]
  }
  
  extension [Self <: UserFeedback](x: Self) {
    
    inline def setType(value: FeedbackType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
