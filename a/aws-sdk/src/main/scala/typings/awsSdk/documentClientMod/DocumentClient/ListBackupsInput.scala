package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBackupsInput extends js.Object {
  
  /**
    * The backups from the table specified by BackupType are listed. Where BackupType can be:    USER - On-demand backup created by you.    SYSTEM - On-demand backup automatically created by DynamoDB.    ALL - All types of on-demand backups (USER and SYSTEM).  
    */
  var BackupType: js.UndefOr[BackupTypeFilter] = js.native
  
  /**
    *  LastEvaluatedBackupArn is the Amazon Resource Name (ARN) of the backup last evaluated when the current page of results was returned, inclusive of the current page of results. This value may be specified as the ExclusiveStartBackupArn of a new ListBackups operation in order to fetch the next page of results. 
    */
  var ExclusiveStartBackupArn: js.UndefOr[BackupArn] = js.native
  
  /**
    * Maximum number of backups to return at once.
    */
  var Limit: js.UndefOr[BackupsInputLimit] = js.native
  
  /**
    * The backups from the table specified by TableName are listed. 
    */
  var TableName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableName] = js.native
  
  /**
    * Only backups created after this time are listed. TimeRangeLowerBound is inclusive.
    */
  var TimeRangeLowerBound: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TimeRangeLowerBound] = js.native
  
  /**
    * Only backups created before this time are listed. TimeRangeUpperBound is exclusive. 
    */
  var TimeRangeUpperBound: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TimeRangeUpperBound] = js.native
}
object ListBackupsInput {
  
  @scala.inline
  def apply(): ListBackupsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackupsInput]
  }
  
  @scala.inline
  implicit class ListBackupsInputOps[Self <: ListBackupsInput] (val x: Self) extends AnyVal {
    
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
    def setBackupType(value: BackupTypeFilter): Self = this.set("BackupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupType: Self = this.set("BackupType", js.undefined)
    
    @scala.inline
    def setExclusiveStartBackupArn(value: BackupArn): Self = this.set("ExclusiveStartBackupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusiveStartBackupArn: Self = this.set("ExclusiveStartBackupArn", js.undefined)
    
    @scala.inline
    def setLimit(value: BackupsInputLimit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    
    @scala.inline
    def setTableName(value: TableName): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableName: Self = this.set("TableName", js.undefined)
    
    @scala.inline
    def setTimeRangeLowerBound(value: TimeRangeLowerBound): Self = this.set("TimeRangeLowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeRangeLowerBound: Self = this.set("TimeRangeLowerBound", js.undefined)
    
    @scala.inline
    def setTimeRangeUpperBound(value: TimeRangeUpperBound): Self = this.set("TimeRangeUpperBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeRangeUpperBound: Self = this.set("TimeRangeUpperBound", js.undefined)
  }
}
