package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsBackupRecoveryPointLifecycleDetails extends StObject {
  
  /**
    * Specifies the number of days after creation that a recovery point is deleted. Must be greater than 90 days plus MoveToColdStorageAfterDays. 
    */
  var DeleteAfterDays: js.UndefOr[Long] = js.undefined
  
  /**
    * Specifies the number of days after creation that a recovery point is moved to cold storage. 
    */
  var MoveToColdStorageAfterDays: js.UndefOr[Long] = js.undefined
}
object AwsBackupRecoveryPointLifecycleDetails {
  
  inline def apply(): AwsBackupRecoveryPointLifecycleDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsBackupRecoveryPointLifecycleDetails]
  }
  
  extension [Self <: AwsBackupRecoveryPointLifecycleDetails](x: Self) {
    
    inline def setDeleteAfterDays(value: Long): Self = StObject.set(x, "DeleteAfterDays", value.asInstanceOf[js.Any])
    
    inline def setDeleteAfterDaysUndefined: Self = StObject.set(x, "DeleteAfterDays", js.undefined)
    
    inline def setMoveToColdStorageAfterDays(value: Long): Self = StObject.set(x, "MoveToColdStorageAfterDays", value.asInstanceOf[js.Any])
    
    inline def setMoveToColdStorageAfterDaysUndefined: Self = StObject.set(x, "MoveToColdStorageAfterDays", js.undefined)
  }
}
