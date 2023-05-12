package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArchivalSummary extends StObject {
  
  /**
    * <p>The Amazon Resource Name (ARN) of the backup the table was archived to, when
    *             applicable in the archival reason. If you wish to restore this backup to the same table
    *             name, you will need to delete the original table.</p>
    */
  var ArchivalBackupArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The date and time when table archival was initiated by DynamoDB, in UNIX epoch time
    *             format.</p>
    */
  var ArchivalDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p>The reason DynamoDB archived the table. Currently, the only possible value is:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>INACCESSIBLE_ENCRYPTION_CREDENTIALS</code> - The table was archived due
    *                     to the table's KMS key being inaccessible for more than seven
    *                     days. An On-Demand backup was created at the archival time.</p>
    *             </li>
    *          </ul>
    */
  var ArchivalReason: js.UndefOr[String] = js.undefined
}
object ArchivalSummary {
  
  inline def apply(): ArchivalSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArchivalSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArchivalSummary] (val x: Self) extends AnyVal {
    
    inline def setArchivalBackupArn(value: String): Self = StObject.set(x, "ArchivalBackupArn", value.asInstanceOf[js.Any])
    
    inline def setArchivalBackupArnUndefined: Self = StObject.set(x, "ArchivalBackupArn", js.undefined)
    
    inline def setArchivalDateTime(value: js.Date): Self = StObject.set(x, "ArchivalDateTime", value.asInstanceOf[js.Any])
    
    inline def setArchivalDateTimeUndefined: Self = StObject.set(x, "ArchivalDateTime", js.undefined)
    
    inline def setArchivalReason(value: String): Self = StObject.set(x, "ArchivalReason", value.asInstanceOf[js.Any])
    
    inline def setArchivalReasonUndefined: Self = StObject.set(x, "ArchivalReason", js.undefined)
  }
}
