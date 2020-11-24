package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateArchiveRequest extends js.Object {
  
  /**
    * The name for the archive to create.
    */
  var ArchiveName: typings.awsSdk.eventbridgeMod.ArchiveName = js.native
  
  /**
    * A description for the archive.
    */
  var Description: js.UndefOr[ArchiveDescription] = js.native
  
  /**
    * An event pattern to use to filter events sent to the archive.
    */
  var EventPattern: js.UndefOr[typings.awsSdk.eventbridgeMod.EventPattern] = js.native
  
  /**
    * The ARN of the event source associated with the archive.
    */
  var EventSourceArn: Arn = js.native
  
  /**
    * The number of days to retain events for. Default value is 0. If set to 0, events are retained indefinitely
    */
  var RetentionDays: js.UndefOr[typings.awsSdk.eventbridgeMod.RetentionDays] = js.native
}
object CreateArchiveRequest {
  
  @scala.inline
  def apply(ArchiveName: ArchiveName, EventSourceArn: Arn): CreateArchiveRequest = {
    val __obj = js.Dynamic.literal(ArchiveName = ArchiveName.asInstanceOf[js.Any], EventSourceArn = EventSourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateArchiveRequest]
  }
  
  @scala.inline
  implicit class CreateArchiveRequestOps[Self <: CreateArchiveRequest] (val x: Self) extends AnyVal {
    
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
    def setArchiveName(value: ArchiveName): Self = this.set("ArchiveName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSourceArn(value: Arn): Self = this.set("EventSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: ArchiveDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setEventPattern(value: EventPattern): Self = this.set("EventPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventPattern: Self = this.set("EventPattern", js.undefined)
    
    @scala.inline
    def setRetentionDays(value: RetentionDays): Self = this.set("RetentionDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionDays: Self = this.set("RetentionDays", js.undefined)
  }
}
