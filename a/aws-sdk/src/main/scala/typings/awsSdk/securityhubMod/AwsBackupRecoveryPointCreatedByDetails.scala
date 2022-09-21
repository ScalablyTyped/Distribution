package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsBackupRecoveryPointCreatedByDetails extends StObject {
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup plan. 
    */
  var BackupPlanArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Uniquely identifies a backup plan. 
    */
  var BackupPlanId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. Version IDs cannot be edited. 
    */
  var BackupPlanVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Uniquely identifies a rule used to schedule the backup of a selection of resources. 
    */
  var BackupRuleId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsBackupRecoveryPointCreatedByDetails {
  
  inline def apply(): AwsBackupRecoveryPointCreatedByDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsBackupRecoveryPointCreatedByDetails]
  }
  
  extension [Self <: AwsBackupRecoveryPointCreatedByDetails](x: Self) {
    
    inline def setBackupPlanArn(value: NonEmptyString): Self = StObject.set(x, "BackupPlanArn", value.asInstanceOf[js.Any])
    
    inline def setBackupPlanArnUndefined: Self = StObject.set(x, "BackupPlanArn", js.undefined)
    
    inline def setBackupPlanId(value: NonEmptyString): Self = StObject.set(x, "BackupPlanId", value.asInstanceOf[js.Any])
    
    inline def setBackupPlanIdUndefined: Self = StObject.set(x, "BackupPlanId", js.undefined)
    
    inline def setBackupPlanVersion(value: NonEmptyString): Self = StObject.set(x, "BackupPlanVersion", value.asInstanceOf[js.Any])
    
    inline def setBackupPlanVersionUndefined: Self = StObject.set(x, "BackupPlanVersion", js.undefined)
    
    inline def setBackupRuleId(value: NonEmptyString): Self = StObject.set(x, "BackupRuleId", value.asInstanceOf[js.Any])
    
    inline def setBackupRuleIdUndefined: Self = StObject.set(x, "BackupRuleId", js.undefined)
  }
}
