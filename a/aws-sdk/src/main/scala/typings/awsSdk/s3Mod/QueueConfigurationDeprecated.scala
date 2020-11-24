package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueConfigurationDeprecated extends js.Object {
  
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
  implicit class QueueConfigurationDeprecatedOps[Self <: QueueConfigurationDeprecated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvent(value: Event): Self = this.set("Event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("Event", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: Event*): Self = this.set("Events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: EventList): Self = this.set("Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("Events", js.undefined)
    
    @scala.inline
    def setId(value: NotificationId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setQueue(value: QueueArn): Self = this.set("Queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueue: Self = this.set("Queue", js.undefined)
  }
}
