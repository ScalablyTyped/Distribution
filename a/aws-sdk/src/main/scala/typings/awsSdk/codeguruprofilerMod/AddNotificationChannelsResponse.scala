package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddNotificationChannelsResponse extends StObject {
  
  /**
    * The new notification configuration for this profiling group.
    */
  var notificationConfiguration: js.UndefOr[NotificationConfiguration] = js.undefined
}
object AddNotificationChannelsResponse {
  
  @scala.inline
  def apply(): AddNotificationChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddNotificationChannelsResponse]
  }
  
  @scala.inline
  implicit class AddNotificationChannelsResponseMutableBuilder[Self <: AddNotificationChannelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotificationConfiguration(value: NotificationConfiguration): Self = StObject.set(x, "notificationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationConfigurationUndefined: Self = StObject.set(x, "notificationConfiguration", js.undefined)
  }
}
