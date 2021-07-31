package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Channel extends StObject {
  
  /**
    * List of publishers for different type of events that may be detected in an application from the profile. Anomaly detection is the only event publisher in Profiler.
    */
  var eventPublishers: EventPublishers
  
  /**
    * Unique identifier for each Channel in the notification configuration of a Profiling Group. A random UUID for channelId is used when adding a channel to the notification configuration if not specified in the request.
    */
  var id: js.UndefOr[ChannelId] = js.undefined
  
  /**
    * Unique arn of the resource to be used for notifications. We support a valid SNS topic arn as a channel uri.
    */
  var uri: ChannelUri
}
object Channel {
  
  @scala.inline
  def apply(eventPublishers: EventPublishers, uri: ChannelUri): Channel = {
    val __obj = js.Dynamic.literal(eventPublishers = eventPublishers.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  
  @scala.inline
  implicit class ChannelMutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventPublishers(value: EventPublishers): Self = StObject.set(x, "eventPublishers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventPublishersVarargs(value: EventPublisher*): Self = StObject.set(x, "eventPublishers", js.Array(value :_*))
    
    @scala.inline
    def setId(value: ChannelId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setUri(value: ChannelUri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
