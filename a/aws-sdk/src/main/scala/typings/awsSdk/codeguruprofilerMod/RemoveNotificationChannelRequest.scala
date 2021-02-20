package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveNotificationChannelRequest extends StObject {
  
  /**
    * The id of the channel that we want to stop receiving notifications.
    */
  var channelId: ChannelId = js.native
  
  /**
    * The name of the profiling group we want to change notification configuration for.
    */
  var profilingGroupName: ProfilingGroupName = js.native
}
object RemoveNotificationChannelRequest {
  
  @scala.inline
  def apply(channelId: ChannelId, profilingGroupName: ProfilingGroupName): RemoveNotificationChannelRequest = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveNotificationChannelRequest]
  }
  
  @scala.inline
  implicit class RemoveNotificationChannelRequestMutableBuilder[Self <: RemoveNotificationChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: ChannelId): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilingGroupName(value: ProfilingGroupName): Self = StObject.set(x, "profilingGroupName", value.asInstanceOf[js.Any])
  }
}
