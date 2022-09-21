package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsBackupRecoveryPointCalculatedLifecycleDetails extends StObject {
  
  /**
    * Specifies the number of days after creation that a recovery point is deleted. Must be greater than 90 days plus MoveToColdStorageAfterDays. 
    */
  var DeleteAt: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies the number of days after creation that a recovery point is moved to cold storage. 
    */
  var MoveToColdStorageAt: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsBackupRecoveryPointCalculatedLifecycleDetails {
  
  inline def apply(): AwsBackupRecoveryPointCalculatedLifecycleDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsBackupRecoveryPointCalculatedLifecycleDetails]
  }
  
  extension [Self <: AwsBackupRecoveryPointCalculatedLifecycleDetails](x: Self) {
    
    inline def setDeleteAt(value: NonEmptyString): Self = StObject.set(x, "DeleteAt", value.asInstanceOf[js.Any])
    
    inline def setDeleteAtUndefined: Self = StObject.set(x, "DeleteAt", js.undefined)
    
    inline def setMoveToColdStorageAt(value: NonEmptyString): Self = StObject.set(x, "MoveToColdStorageAt", value.asInstanceOf[js.Any])
    
    inline def setMoveToColdStorageAtUndefined: Self = StObject.set(x, "MoveToColdStorageAt", js.undefined)
  }
}
