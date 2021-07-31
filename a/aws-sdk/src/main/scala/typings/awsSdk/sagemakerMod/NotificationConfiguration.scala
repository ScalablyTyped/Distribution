package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationConfiguration extends StObject {
  
  /**
    * The ARN for the SNS topic to which notifications should be published.
    */
  var NotificationTopicArn: js.UndefOr[typings.awsSdk.sagemakerMod.NotificationTopicArn] = js.undefined
}
object NotificationConfiguration {
  
  @scala.inline
  def apply(): NotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfiguration]
  }
  
  @scala.inline
  implicit class NotificationConfigurationMutableBuilder[Self <: NotificationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotificationTopicArn(value: NotificationTopicArn): Self = StObject.set(x, "NotificationTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationTopicArnUndefined: Self = StObject.set(x, "NotificationTopicArn", js.undefined)
  }
}
