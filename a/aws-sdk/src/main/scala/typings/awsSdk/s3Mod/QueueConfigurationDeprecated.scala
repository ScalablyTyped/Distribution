package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueConfigurationDeprecated extends StObject {
  
  var Event: js.UndefOr[typings.awsSdk.s3Mod.Event] = js.undefined
  
  /**
    * A collection of bucket events for which to send notifications.
    */
  var Events: js.UndefOr[EventList] = js.undefined
  
  var Id: js.UndefOr[NotificationId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SQS queue to which Amazon S3 publishes a message when it detects events of the specified type. 
    */
  var Queue: js.UndefOr[QueueArn] = js.undefined
}
object QueueConfigurationDeprecated {
  
  inline def apply(): QueueConfigurationDeprecated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueConfigurationDeprecated]
  }
  
  extension [Self <: QueueConfigurationDeprecated](x: Self) {
    
    inline def setEvent(value: Event): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "Event", js.undefined)
    
    inline def setEvents(value: EventList): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "Events", js.Array(value*))
    
    inline def setId(value: NotificationId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setQueue(value: QueueArn): Self = StObject.set(x, "Queue", value.asInstanceOf[js.Any])
    
    inline def setQueueUndefined: Self = StObject.set(x, "Queue", js.undefined)
  }
}
