package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddNotificationChannelsRequest extends StObject {
  
  /**
    * One or 2 channels to report to when anomalies are detected.
    */
  var channels: Channels
  
  /**
    * The name of the profiling group that we are setting up notifications for.
    */
  var profilingGroupName: ProfilingGroupName
}
object AddNotificationChannelsRequest {
  
  @scala.inline
  def apply(channels: Channels, profilingGroupName: ProfilingGroupName): AddNotificationChannelsRequest = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddNotificationChannelsRequest]
  }
  
  @scala.inline
  implicit class AddNotificationChannelsRequestMutableBuilder[Self <: AddNotificationChannelsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: Channels): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsVarargs(value: Channel*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    @scala.inline
    def setProfilingGroupName(value: ProfilingGroupName): Self = StObject.set(x, "profilingGroupName", value.asInstanceOf[js.Any])
  }
}
