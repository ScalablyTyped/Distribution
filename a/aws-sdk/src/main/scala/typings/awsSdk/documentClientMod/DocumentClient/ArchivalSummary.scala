package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArchivalSummary extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the backup the table was archived to, when applicable in the archival reason. If you wish to restore this backup to the same table name, you will need to delete the original table.
    */
  var ArchivalBackupArn: js.UndefOr[BackupArn] = js.native
  
  /**
    * The date and time when table archival was initiated by DynamoDB, in UNIX epoch time format.
    */
  var ArchivalDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The reason DynamoDB archived the table. Currently, the only possible value is:    INACCESSIBLE_ENCRYPTION_CREDENTIALS - The table was archived due to the table's AWS KMS key being inaccessible for more than seven days. An On-Demand backup was created at the archival time.  
    */
  var ArchivalReason: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ArchivalReason] = js.native
}
object ArchivalSummary {
  
  @scala.inline
  def apply(): ArchivalSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArchivalSummary]
  }
  
  @scala.inline
  implicit class ArchivalSummaryOps[Self <: ArchivalSummary] (val x: Self) extends AnyVal {
    
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
    def setArchivalBackupArn(value: BackupArn): Self = this.set("ArchivalBackupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchivalBackupArn: Self = this.set("ArchivalBackupArn", js.undefined)
    
    @scala.inline
    def setArchivalDateTime(value: Date): Self = this.set("ArchivalDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchivalDateTime: Self = this.set("ArchivalDateTime", js.undefined)
    
    @scala.inline
    def setArchivalReason(value: ArchivalReason): Self = this.set("ArchivalReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchivalReason: Self = this.set("ArchivalReason", js.undefined)
  }
}
