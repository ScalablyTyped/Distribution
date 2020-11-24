package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateArchiveRequest extends js.Object {
  
  /**
    * The name of the archive to update.
    */
  var ArchiveName: typings.awsSdk.cloudwatcheventsMod.ArchiveName = js.native
  
  /**
    * The description for the archive.
    */
  var Description: js.UndefOr[ArchiveDescription] = js.native
  
  /**
    * The event pattern to use to filter events sent to the archive.
    */
  var EventPattern: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.EventPattern] = js.native
  
  /**
    * The number of days to retain events in the archive.
    */
  var RetentionDays: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.RetentionDays] = js.native
}
object UpdateArchiveRequest {
  
  @scala.inline
  def apply(ArchiveName: ArchiveName): UpdateArchiveRequest = {
    val __obj = js.Dynamic.literal(ArchiveName = ArchiveName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateArchiveRequest]
  }
  
  @scala.inline
  implicit class UpdateArchiveRequestOps[Self <: UpdateArchiveRequest] (val x: Self) extends AnyVal {
    
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
