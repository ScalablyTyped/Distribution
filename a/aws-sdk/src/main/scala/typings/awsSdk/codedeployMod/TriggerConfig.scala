package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerConfig extends StObject {
  
  /**
    * The event type or types for which notifications are triggered.
    */
  var triggerEvents: js.UndefOr[TriggerEventTypeList] = js.native
  
  /**
    * The name of the notification trigger.
    */
  var triggerName: js.UndefOr[TriggerName] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service topic through which notifications about deployment or instance events are sent.
    */
  var triggerTargetArn: js.UndefOr[TriggerTargetArn] = js.native
}
object TriggerConfig {
  
  @scala.inline
  def apply(): TriggerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerConfig]
  }
  
  @scala.inline
  implicit class TriggerConfigMutableBuilder[Self <: TriggerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerEvents(value: TriggerEventTypeList): Self = StObject.set(x, "triggerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerEventsUndefined: Self = StObject.set(x, "triggerEvents", js.undefined)
    
    @scala.inline
    def setTriggerEventsVarargs(value: TriggerEventType*): Self = StObject.set(x, "triggerEvents", js.Array(value :_*))
    
    @scala.inline
    def setTriggerName(value: TriggerName): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerNameUndefined: Self = StObject.set(x, "triggerName", js.undefined)
    
    @scala.inline
    def setTriggerTargetArn(value: TriggerTargetArn): Self = StObject.set(x, "triggerTargetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerTargetArnUndefined: Self = StObject.set(x, "triggerTargetArn", js.undefined)
  }
}
