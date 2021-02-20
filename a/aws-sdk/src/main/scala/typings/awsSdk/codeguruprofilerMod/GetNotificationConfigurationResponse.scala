package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNotificationConfigurationResponse extends StObject {
  
  /**
    * The current notification configuration for this profiling group.
    */
  var notificationConfiguration: NotificationConfiguration = js.native
}
object GetNotificationConfigurationResponse {
  
  @scala.inline
  def apply(notificationConfiguration: NotificationConfiguration): GetNotificationConfigurationResponse = {
    val __obj = js.Dynamic.literal(notificationConfiguration = notificationConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNotificationConfigurationResponse]
  }
  
  @scala.inline
  implicit class GetNotificationConfigurationResponseMutableBuilder[Self <: GetNotificationConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotificationConfiguration(value: NotificationConfiguration): Self = StObject.set(x, "notificationConfiguration", value.asInstanceOf[js.Any])
  }
}
