package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeArchiveResponse extends js.Object {
  
  /**
    * The ARN of the archive.
    */
  var ArchiveArn: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.ArchiveArn] = js.native
  
  /**
    * The name of the archive.
    */
  var ArchiveName: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.ArchiveName] = js.native
  
  /**
    * The time at which the archive was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The description of the archive.
    */
  var Description: js.UndefOr[ArchiveDescription] = js.native
  
  /**
    * The number of events in the archive.
    */
  var EventCount: js.UndefOr[Long] = js.native
  
  /**
    * The event pattern used to filter events sent to the archive.
    */
  var EventPattern: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.EventPattern] = js.native
  
  /**
    * The ARN of the event source associated with the archive.
    */
  var EventSourceArn: js.UndefOr[Arn] = js.native
  
  /**
    * The number of days to retain events for in the archive.
    */
  var RetentionDays: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.RetentionDays] = js.native
  
  /**
    * The size of the archive in bytes.
    */
  var SizeBytes: js.UndefOr[Long] = js.native
  
  /**
    * The state of the archive.
    */
  var State: js.UndefOr[ArchiveState] = js.native
  
  /**
    * The reason that the archive is in the state.
    */
  var StateReason: js.UndefOr[ArchiveStateReason] = js.native
}
object DescribeArchiveResponse {
  
  @scala.inline
  def apply(): DescribeArchiveResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeArchiveResponse]
  }
  
  @scala.inline
  implicit class DescribeArchiveResponseOps[Self <: DescribeArchiveResponse] (val x: Self) extends AnyVal {
    
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
    def setArchiveArn(value: ArchiveArn): Self = this.set("ArchiveArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchiveArn: Self = this.set("ArchiveArn", js.undefined)
    
    @scala.inline
    def setArchiveName(value: ArchiveName): Self = this.set("ArchiveName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchiveName: Self = this.set("ArchiveName", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: ArchiveDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setEventCount(value: Long): Self = this.set("EventCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventCount: Self = this.set("EventCount", js.undefined)
    
    @scala.inline
    def setEventPattern(value: EventPattern): Self = this.set("EventPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventPattern: Self = this.set("EventPattern", js.undefined)
    
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
