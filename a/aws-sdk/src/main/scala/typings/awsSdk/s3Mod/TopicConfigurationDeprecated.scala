package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicConfigurationDeprecated extends StObject {
  
  /**
    * Bucket event for which to send notifications.
    */
  var Event: js.UndefOr[typings.awsSdk.s3Mod.Event] = js.native
  
  /**
    * A collection of events related to objects
    */
  var Events: js.UndefOr[EventList] = js.native
  
  var Id: js.UndefOr[NotificationId] = js.native
  
  /**
    * Amazon SNS topic to which Amazon S3 will publish a message to report the specified events for the bucket.
    */
  var Topic: js.UndefOr[TopicArn] = js.native
}
object TopicConfigurationDeprecated {
  
  @scala.inline
  def apply(): TopicConfigurationDeprecated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicConfigurationDeprecated]
  }
  
  @scala.inline
  implicit class TopicConfigurationDeprecatedMutableBuilder[Self <: TopicConfigurationDeprecated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: Event): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "Event", js.undefined)
    
    @scala.inline
    def setEvents(value: EventList): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: Event*): Self = StObject.set(x, "Events", js.Array(value :_*))
    
    @scala.inline
    def setId(value: NotificationId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setTopic(value: TopicArn): Self = StObject.set(x, "Topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "Topic", js.undefined)
  }
}
