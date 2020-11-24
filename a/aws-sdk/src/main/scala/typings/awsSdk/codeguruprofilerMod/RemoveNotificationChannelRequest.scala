package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveNotificationChannelRequest extends js.Object {
  
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
  implicit class RemoveNotificationChannelRequestOps[Self <: RemoveNotificationChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelId(value: ChannelId): Self = this.set("channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilingGroupName(value: ProfilingGroupName): Self = this.set("profilingGroupName", value.asInstanceOf[js.Any])
  }
}
