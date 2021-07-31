package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestCancelActivityTaskDecisionAttributes extends StObject {
  
  /**
    * The activityId of the activity task to be canceled.
    */
  var activityId: ActivityId
}
object RequestCancelActivityTaskDecisionAttributes {
  
  @scala.inline
  def apply(activityId: ActivityId): RequestCancelActivityTaskDecisionAttributes = {
    val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestCancelActivityTaskDecisionAttributes]
  }
  
  @scala.inline
  implicit class RequestCancelActivityTaskDecisionAttributesMutableBuilder[Self <: RequestCancelActivityTaskDecisionAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityId(value: ActivityId): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
  }
}
