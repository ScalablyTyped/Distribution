package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLedgerResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the ledger.
    */
  var Arn: js.UndefOr[typings.awsSdk.qldbMod.Arn] = js.undefined
  
  /**
    * The date and time, in epoch time format, when the ledger was created. (Epoch time format is the number of seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
    */
  var CreationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this feature is enabled (true) by default. If deletion protection is enabled, you must first disable it before you can delete the ledger. You can disable it by calling the UpdateLedger operation to set the flag to false.
    */
  var DeletionProtection: js.UndefOr[typings.awsSdk.qldbMod.DeletionProtection] = js.undefined
  
  /**
    * The ARN of the customer managed KMS key that the ledger uses for encryption at rest. If this parameter is undefined, the ledger uses an Amazon Web Services owned KMS key for encryption.
    */
  var KmsKeyArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the ledger.
    */
  var Name: js.UndefOr[LedgerName] = js.undefined
  
  /**
    * The permissions mode of the ledger that you created.
    */
  var PermissionsMode: js.UndefOr[typings.awsSdk.qldbMod.PermissionsMode] = js.undefined
  
  /**
    * The current status of the ledger.
    */
  var State: js.UndefOr[LedgerState] = js.undefined
}
object CreateLedgerResponse {
  
  inline def apply(): CreateLedgerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLedgerResponse]
  }
  
  extension [Self <: CreateLedgerResponse](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
    
    inline def setDeletionProtection(value: DeletionProtection): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    inline def setKmsKeyArn(value: Arn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
    
    inline def setName(value: LedgerName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPermissionsMode(value: PermissionsMode): Self = StObject.set(x, "PermissionsMode", value.asInstanceOf[js.Any])
    
    inline def setPermissionsModeUndefined: Self = StObject.set(x, "PermissionsMode", js.undefined)
    
    inline def setState(value: LedgerState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
