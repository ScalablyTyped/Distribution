package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationTaskSummary extends js.Object {
  
  /**
    * Unique identifier that references the migration task. Do not store personal data in this field. 
    */
  var MigrationTaskName: js.UndefOr[typings.awsSdk.migrationhubMod.MigrationTaskName] = js.native
  
  /**
    * Indication of the percentage completion of the task.
    */
  var ProgressPercent: js.UndefOr[typings.awsSdk.migrationhubMod.ProgressPercent] = js.native
  
  /**
    * An AWS resource used for access control. It should uniquely identify the migration tool as it is used for all updates made by the tool.
    */
  var ProgressUpdateStream: js.UndefOr[typings.awsSdk.migrationhubMod.ProgressUpdateStream] = js.native
  
  /**
    * Status of the task.
    */
  var Status: js.UndefOr[typings.awsSdk.migrationhubMod.Status] = js.native
  
  /**
    * Detail information of what is being done within the overall status state.
    */
  var StatusDetail: js.UndefOr[typings.awsSdk.migrationhubMod.StatusDetail] = js.native
  
  /**
    * The timestamp when the task was gathered.
    */
  var UpdateDateTime: js.UndefOr[typings.awsSdk.migrationhubMod.UpdateDateTime] = js.native
}
object MigrationTaskSummary {
  
  @scala.inline
  def apply(): MigrationTaskSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrationTaskSummary]
  }
  
  @scala.inline
  implicit class MigrationTaskSummaryOps[Self <: MigrationTaskSummary] (val x: Self) extends AnyVal {
    
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
    def setMigrationTaskName(value: MigrationTaskName): Self = this.set("MigrationTaskName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMigrationTaskName: Self = this.set("MigrationTaskName", js.undefined)
    
    @scala.inline
    def setProgressPercent(value: ProgressPercent): Self = this.set("ProgressPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressPercent: Self = this.set("ProgressPercent", js.undefined)
    
    @scala.inline
    def setProgressUpdateStream(value: ProgressUpdateStream): Self = this.set("ProgressUpdateStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressUpdateStream: Self = this.set("ProgressUpdateStream", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusDetail(value: StatusDetail): Self = this.set("StatusDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusDetail: Self = this.set("StatusDetail", js.undefined)
    
    @scala.inline
    def setUpdateDateTime(value: UpdateDateTime): Self = this.set("UpdateDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateDateTime: Self = this.set("UpdateDateTime", js.undefined)
  }
}
