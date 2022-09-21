package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArchivalSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the backup the table was archived to, when applicable in the archival reason. If you wish to restore this backup to the same table name, you will need to delete the original table.
    */
  var ArchivalBackupArn: js.UndefOr[BackupArn] = js.undefined
  
  /**
    * The date and time when table archival was initiated by DynamoDB, in UNIX epoch time format.
    */
  var ArchivalDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The reason DynamoDB archived the table. Currently, the only possible value is:    INACCESSIBLE_ENCRYPTION_CREDENTIALS - The table was archived due to the table's KMS key being inaccessible for more than seven days. An On-Demand backup was created at the archival time.  
    */
  var ArchivalReason: js.UndefOr[typings.awsSdk.dynamodbMod.ArchivalReason] = js.undefined
}
object ArchivalSummary {
  
  inline def apply(): ArchivalSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArchivalSummary]
  }
  
  extension [Self <: ArchivalSummary](x: Self) {
    
    inline def setArchivalBackupArn(value: BackupArn): Self = StObject.set(x, "ArchivalBackupArn", value.asInstanceOf[js.Any])
    
    inline def setArchivalBackupArnUndefined: Self = StObject.set(x, "ArchivalBackupArn", js.undefined)
    
    inline def setArchivalDateTime(value: js.Date): Self = StObject.set(x, "ArchivalDateTime", value.asInstanceOf[js.Any])
    
    inline def setArchivalDateTimeUndefined: Self = StObject.set(x, "ArchivalDateTime", js.undefined)
    
    inline def setArchivalReason(value: ArchivalReason): Self = StObject.set(x, "ArchivalReason", value.asInstanceOf[js.Any])
    
    inline def setArchivalReasonUndefined: Self = StObject.set(x, "ArchivalReason", js.undefined)
  }
}
