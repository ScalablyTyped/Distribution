package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationConfiguration extends StObject {
  
  /**
    * List of up to two channels to be used for sending notifications for events detected from the application profile.
    */
  var channels: js.UndefOr[Channels] = js.undefined
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
    def setChannels(value: Channels): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    @scala.inline
    def setChannelsVarargs(value: Channel*): Self = StObject.set(x, "channels", js.Array(value :_*))
  }
}
