package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueConfigurationDeprecated extends StObject {
  
  var Event: js.UndefOr[typings.awsSdk.s3Mod.Event] = js.native
  
  /**
    * A collection of bucket events for which to send notifications
    */
  var Events: js.UndefOr[EventList] = js.native
  
  var Id: js.UndefOr[NotificationId] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SQS queue to which Amazon S3 publishes a message when it detects events of the specified type. 
    */
  var Queue: js.UndefOr[QueueArn] = js.native
}
object QueueConfigurationDeprecated {
  
  @scala.inline
  def apply(): QueueConfigurationDeprecated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueConfigurationDeprecated]
  }
  
  @scala.inline
  implicit class QueueConfigurationDeprecatedMutableBuilder[Self <: QueueConfigurationDeprecated] (val x: Self) extends AnyVal {
    
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
    def setQueue(value: QueueArn): Self = StObject.set(x, "Queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUndefined: Self = StObject.set(x, "Queue", js.undefined)
  }
}
