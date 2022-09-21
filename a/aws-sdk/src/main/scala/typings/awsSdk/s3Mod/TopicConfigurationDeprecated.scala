package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicConfigurationDeprecated extends StObject {
  
  /**
    * Bucket event for which to send notifications.
    */
  var Event: js.UndefOr[typings.awsSdk.s3Mod.Event] = js.undefined
  
  /**
    * A collection of events related to objects
    */
  var Events: js.UndefOr[EventList] = js.undefined
  
  var Id: js.UndefOr[NotificationId] = js.undefined
  
  /**
    * Amazon SNS topic to which Amazon S3 will publish a message to report the specified events for the bucket.
    */
  var Topic: js.UndefOr[TopicArn] = js.undefined
}
object TopicConfigurationDeprecated {
  
  inline def apply(): TopicConfigurationDeprecated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicConfigurationDeprecated]
  }
  
  extension [Self <: TopicConfigurationDeprecated](x: Self) {
    
    inline def setEvent(value: Event): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "Event", js.undefined)
    
    inline def setEvents(value: EventList): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "Events", js.Array(value*))
    
    inline def setId(value: NotificationId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setTopic(value: TopicArn): Self = StObject.set(x, "Topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "Topic", js.undefined)
  }
}
