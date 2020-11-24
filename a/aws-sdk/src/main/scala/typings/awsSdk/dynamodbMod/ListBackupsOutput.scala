package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBackupsOutput extends js.Object {
  
  /**
    * List of BackupSummary objects.
    */
  var BackupSummaries: js.UndefOr[typings.awsSdk.dynamodbMod.BackupSummaries] = js.native
  
  /**
    *  The ARN of the backup last evaluated when the current page of results was returned, inclusive of the current page of results. This value may be specified as the ExclusiveStartBackupArn of a new ListBackups operation in order to fetch the next page of results.   If LastEvaluatedBackupArn is empty, then the last page of results has been processed and there are no more results to be retrieved.   If LastEvaluatedBackupArn is not empty, this may or may not indicate that there is more data to be returned. All results are guaranteed to have been returned if and only if no value for LastEvaluatedBackupArn is returned. 
    */
  var LastEvaluatedBackupArn: js.UndefOr[BackupArn] = js.native
}
object ListBackupsOutput {
  
  @scala.inline
  def apply(): ListBackupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackupsOutput]
  }
  
  @scala.inline
  implicit class ListBackupsOutputOps[Self <: ListBackupsOutput] (val x: Self) extends AnyVal {
    
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
    def setBackupSummariesVarargs(value: BackupSummary*): Self = this.set("BackupSummaries", js.Array(value :_*))
    
    @scala.inline
    def setBackupSummaries(value: BackupSummaries): Self = this.set("BackupSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupSummaries: Self = this.set("BackupSummaries", js.undefined)
    
    @scala.inline
    def setLastEvaluatedBackupArn(value: BackupArn): Self = this.set("LastEvaluatedBackupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastEvaluatedBackupArn: Self = this.set("LastEvaluatedBackupArn", js.undefined)
  }
}
