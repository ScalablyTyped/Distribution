package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBackupsInput extends StObject {
  
  /**
    * <p>The backups from the table specified by <code>BackupType</code> are listed.</p>
    *          <p>Where <code>BackupType</code> can be:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>USER</code> - On-demand backup created by you. (The default setting if no
    *                     other backup types are specified.)</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>ALL</code> - All types of on-demand backups (USER and SYSTEM).</p>
    *             </li>
    *          </ul>
    */
  var BackupType: js.UndefOr[BackupTypeFilter | String] = js.undefined
  
  /**
    * <p>
    *             <code>LastEvaluatedBackupArn</code> is the Amazon Resource Name (ARN) of the backup last
    *             evaluated when the current page of results was returned, inclusive of the current page
    *             of results. This value may be specified as the <code>ExclusiveStartBackupArn</code> of a
    *             new <code>ListBackups</code> operation in order to fetch the next page of results.
    *         </p>
    */
  var ExclusiveStartBackupArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Maximum number of backups to return at once.</p>
    */
  var Limit: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>The backups from the table specified by <code>TableName</code> are listed. </p>
    */
  var TableName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Only backups created after this time are listed. <code>TimeRangeLowerBound</code> is
    *             inclusive.</p>
    */
  var TimeRangeLowerBound: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p>Only backups created before this time are listed. <code>TimeRangeUpperBound</code> is
    *             exclusive. </p>
    */
  var TimeRangeUpperBound: js.UndefOr[js.Date] = js.undefined
}
object ListBackupsInput {
  
  inline def apply(): ListBackupsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackupsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBackupsInput] (val x: Self) extends AnyVal {
    
    inline def setBackupType(value: BackupTypeFilter | String): Self = StObject.set(x, "BackupType", value.asInstanceOf[js.Any])
    
    inline def setBackupTypeUndefined: Self = StObject.set(x, "BackupType", js.undefined)
    
    inline def setExclusiveStartBackupArn(value: String): Self = StObject.set(x, "ExclusiveStartBackupArn", value.asInstanceOf[js.Any])
    
    inline def setExclusiveStartBackupArnUndefined: Self = StObject.set(x, "ExclusiveStartBackupArn", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    
    inline def setTimeRangeLowerBound(value: js.Date): Self = StObject.set(x, "TimeRangeLowerBound", value.asInstanceOf[js.Any])
    
    inline def setTimeRangeLowerBoundUndefined: Self = StObject.set(x, "TimeRangeLowerBound", js.undefined)
    
    inline def setTimeRangeUpperBound(value: js.Date): Self = StObject.set(x, "TimeRangeUpperBound", value.asInstanceOf[js.Any])
    
    inline def setTimeRangeUpperBoundUndefined: Self = StObject.set(x, "TimeRangeUpperBound", js.undefined)
  }
}
