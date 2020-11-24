package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Channel extends js.Object {
  
  /**
    * List of publishers for different type of events that may be detected in an application from the profile. Anomaly detection is the only event publisher in Profiler.
    */
  var eventPublishers: EventPublishers = js.native
  
  /**
    * Unique identifier for each Channel in the notification configuration of a Profiling Group. A random UUID for channelId is used when adding a channel to the notification configuration if not specified in the request.
    */
  var id: js.UndefOr[ChannelId] = js.native
  
  /**
    * Unique arn of the resource to be used for notifications. We support a valid SNS topic arn as a channel uri.
    */
  var uri: ChannelUri = js.native
}
object Channel {
  
  @scala.inline
  def apply(eventPublishers: EventPublishers, uri: ChannelUri): Channel = {
    val __obj = js.Dynamic.literal(eventPublishers = eventPublishers.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  
  @scala.inline
  implicit class ChannelOps[Self <: Channel] (val x: Self) extends AnyVal {
    
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
    def setEventPublishersVarargs(value: EventPublisher*): Self = this.set("eventPublishers", js.Array(value :_*))
    
    @scala.inline
    def setEventPublishers(value: EventPublishers): Self = this.set("eventPublishers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: ChannelUri): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ChannelId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
