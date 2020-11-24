package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreSummary extends js.Object {
  
  /**
    * Point in time or source backup time.
    */
  var RestoreDateTime: Date = js.native
  
  /**
    * Indicates if a restore is in progress or not.
    */
  var RestoreInProgress: typings.awsSdk.documentClientMod.DocumentClient.RestoreInProgress = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the backup from which the table was restored.
    */
  var SourceBackupArn: js.UndefOr[BackupArn] = js.native
  
  /**
    * The ARN of the source table of the backup that is being restored.
    */
  var SourceTableArn: js.UndefOr[TableArn] = js.native
}
object RestoreSummary {
  
  @scala.inline
  def apply(RestoreDateTime: Date, RestoreInProgress: RestoreInProgress): RestoreSummary = {
    val __obj = js.Dynamic.literal(RestoreDateTime = RestoreDateTime.asInstanceOf[js.Any], RestoreInProgress = RestoreInProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreSummary]
  }
  
  @scala.inline
  implicit class RestoreSummaryOps[Self <: RestoreSummary] (val x: Self) extends AnyVal {
    
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
    def setRestoreDateTime(value: Date): Self = this.set("RestoreDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreInProgress(value: RestoreInProgress): Self = this.set("RestoreInProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBackupArn(value: BackupArn): Self = this.set("SourceBackupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceBackupArn: Self = this.set("SourceBackupArn", js.undefined)
    
    @scala.inline
    def setSourceTableArn(value: TableArn): Self = this.set("SourceTableArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTableArn: Self = this.set("SourceTableArn", js.undefined)
  }
}
