package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupDetails extends StObject {
  
  /**
    * <p>ARN associated with the backup.</p>
    */
  var BackupArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Time at which the backup was created. This is the request time of the backup. </p>
    */
  var BackupCreationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p>Time at which the automatic on-demand backup created by DynamoDB will
    *             expire. This <code>SYSTEM</code> on-demand backup expires automatically 35 days after
    *             its creation.</p>
    */
  var BackupExpiryDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p>Name of the requested backup.</p>
    */
  var BackupName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Size of the backup in bytes. DynamoDB updates this value approximately every six
    *             hours. Recent changes might not be reflected in this value.</p>
    */
  var BackupSizeBytes: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>Backup can be in one of the following states: CREATING, ACTIVE, DELETED. </p>
    */
  var BackupStatus: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.BackupStatus | String] = js.undefined
  
  /**
    * <p>BackupType:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>USER</code> - You create and manage these using the on-demand backup
    *                     feature.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>SYSTEM</code> - If you delete a table with point-in-time recovery enabled,
    *                     a <code>SYSTEM</code> backup is automatically created and is retained for 35
    *                     days (at no additional cost). System backups allow you to restore the deleted
    *                     table to the state it was in just before the point of deletion. </p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>AWS_BACKUP</code> - On-demand backup created by you from Backup service.</p>
    *             </li>
    *          </ul>
    */
  var BackupType: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.BackupType | String] = js.undefined
}
object BackupDetails {
  
  inline def apply(): BackupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackupDetails] (val x: Self) extends AnyVal {
    
    inline def setBackupArn(value: String): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
    
    inline def setBackupArnUndefined: Self = StObject.set(x, "BackupArn", js.undefined)
    
    inline def setBackupCreationDateTime(value: js.Date): Self = StObject.set(x, "BackupCreationDateTime", value.asInstanceOf[js.Any])
    
    inline def setBackupCreationDateTimeUndefined: Self = StObject.set(x, "BackupCreationDateTime", js.undefined)
    
    inline def setBackupExpiryDateTime(value: js.Date): Self = StObject.set(x, "BackupExpiryDateTime", value.asInstanceOf[js.Any])
    
    inline def setBackupExpiryDateTimeUndefined: Self = StObject.set(x, "BackupExpiryDateTime", js.undefined)
    
    inline def setBackupName(value: String): Self = StObject.set(x, "BackupName", value.asInstanceOf[js.Any])
    
    inline def setBackupNameUndefined: Self = StObject.set(x, "BackupName", js.undefined)
    
    inline def setBackupSizeBytes(value: Double): Self = StObject.set(x, "BackupSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setBackupSizeBytesUndefined: Self = StObject.set(x, "BackupSizeBytes", js.undefined)
    
    inline def setBackupStatus(value: BackupStatus | String): Self = StObject.set(x, "BackupStatus", value.asInstanceOf[js.Any])
    
    inline def setBackupStatusUndefined: Self = StObject.set(x, "BackupStatus", js.undefined)
    
    inline def setBackupType(value: BackupType | String): Self = StObject.set(x, "BackupType", value.asInstanceOf[js.Any])
    
    inline def setBackupTypeUndefined: Self = StObject.set(x, "BackupType", js.undefined)
  }
}
