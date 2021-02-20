package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventCondition extends StObject {
  
  /**
    * The dimensions for the event filter to use for the activity.
    */
  var Dimensions: js.UndefOr[EventDimensions] = js.native
  
  /**
    * The message identifier (message_id) for the message to use when determining whether message events meet the condition.
    */
  var MessageActivity: js.UndefOr[string] = js.native
}
object EventCondition {
  
  @scala.inline
  def apply(): EventCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventCondition]
  }
  
  @scala.inline
  implicit class EventConditionMutableBuilder[Self <: EventCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensions(value: EventDimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    @scala.inline
    def setMessageActivity(value: string): Self = StObject.set(x, "MessageActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageActivityUndefined: Self = StObject.set(x, "MessageActivity", js.undefined)
  }
}
