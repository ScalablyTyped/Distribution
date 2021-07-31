package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VaultNotificationConfig extends StObject {
  
  /**
    * A list of one or more events for which Amazon S3 Glacier will send a notification to the specified Amazon SNS topic.
    */
  var Events: js.UndefOr[NotificationEventList] = js.undefined
  
  /**
    * The Amazon Simple Notification Service (Amazon SNS) topic Amazon Resource Name (ARN).
    */
  var SNSTopic: js.UndefOr[String] = js.undefined
}
object VaultNotificationConfig {
  
  @scala.inline
  def apply(): VaultNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VaultNotificationConfig]
  }
  
  @scala.inline
  implicit class VaultNotificationConfigMutableBuilder[Self <: VaultNotificationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: NotificationEventList): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: String*): Self = StObject.set(x, "Events", js.Array(value :_*))
    
    @scala.inline
    def setSNSTopic(value: String): Self = StObject.set(x, "SNSTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSNSTopicUndefined: Self = StObject.set(x, "SNSTopic", js.undefined)
  }
}
