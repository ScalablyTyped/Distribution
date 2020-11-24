package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Archive extends js.Object {
  
  /**
    * The name of the archive.
    */
  var ArchiveName: js.UndefOr[typings.awsSdk.eventbridgeMod.ArchiveName] = js.native
  
  /**
    * The time stamp for the time that the archive was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The number of events in the archive.
    */
  var EventCount: js.UndefOr[Long] = js.native
  
  /**
    * The ARN of the event bus associated with the archive. Only events from this event bus are sent to the archive.
    */
  var EventSourceArn: js.UndefOr[Arn] = js.native
  
  /**
    * The number of days to retain events in the archive before they are deleted.
    */
  var RetentionDays: js.UndefOr[typings.awsSdk.eventbridgeMod.RetentionDays] = js.native
  
  /**
    * The size of the archive, in bytes.
    */
  var SizeBytes: js.UndefOr[Long] = js.native
  
  /**
    * The current state of the archive.
    */
  var State: js.UndefOr[ArchiveState] = js.native
  
  /**
    * A description for the reason that the archive is in the current state.
    */
  var StateReason: js.UndefOr[ArchiveStateReason] = js.native
}
object Archive {
  
  @scala.inline
  def apply(): Archive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Archive]
  }
  
  @scala.inline
  implicit class ArchiveOps[Self <: Archive] (val x: Self) extends AnyVal {
    
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
    def deleteArchiveName: Self = this.set("ArchiveName", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setEventCount(value: Long): Self = this.set("EventCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventCount: Self = this.set("EventCount", js.undefined)
    
    @scala.inline
    def setEventSourceArn(value: Arn): Self = this.set("EventSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventSourceArn: Self = this.set("EventSourceArn", js.undefined)
    
    @scala.inline
    def setRetentionDays(value: RetentionDays): Self = this.set("RetentionDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionDays: Self = this.set("RetentionDays", js.undefined)
    
    @scala.inline
    def setSizeBytes(value: Long): Self = this.set("SizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeBytes: Self = this.set("SizeBytes", js.undefined)
    
    @scala.inline
    def setState(value: ArchiveState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setStateReason(value: ArchiveStateReason): Self = this.set("StateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateReason: Self = this.set("StateReason", js.undefined)
  }
}
