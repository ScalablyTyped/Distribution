package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreSummary extends StObject {
  
  /**
    * Point in time or source backup time.
    */
  var RestoreDateTime: Date
  
  /**
    * Indicates if a restore is in progress or not.
    */
  var RestoreInProgress: typings.awsSdk.dynamodbMod.RestoreInProgress
  
  /**
    * The Amazon Resource Name (ARN) of the backup from which the table was restored.
    */
  var SourceBackupArn: js.UndefOr[BackupArn] = js.undefined
  
  /**
    * The ARN of the source table of the backup that is being restored.
    */
  var SourceTableArn: js.UndefOr[TableArn] = js.undefined
}
object RestoreSummary {
  
  @scala.inline
  def apply(RestoreDateTime: Date, RestoreInProgress: RestoreInProgress): RestoreSummary = {
    val __obj = js.Dynamic.literal(RestoreDateTime = RestoreDateTime.asInstanceOf[js.Any], RestoreInProgress = RestoreInProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreSummary]
  }
  
  @scala.inline
  implicit class RestoreSummaryMutableBuilder[Self <: RestoreSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRestoreDateTime(value: Date): Self = StObject.set(x, "RestoreDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreInProgress(value: RestoreInProgress): Self = StObject.set(x, "RestoreInProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBackupArn(value: BackupArn): Self = StObject.set(x, "SourceBackupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBackupArnUndefined: Self = StObject.set(x, "SourceBackupArn", js.undefined)
    
    @scala.inline
    def setSourceTableArn(value: TableArn): Self = StObject.set(x, "SourceTableArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTableArnUndefined: Self = StObject.set(x, "SourceTableArn", js.undefined)
  }
}
