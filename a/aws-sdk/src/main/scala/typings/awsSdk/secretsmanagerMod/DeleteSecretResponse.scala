package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSecretResponse extends StObject {
  
  /**
    * The ARN of the secret that is now scheduled for deletion.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  
  /**
    * The date and time after which this secret can be deleted by Secrets Manager and can no longer be restored. This value is the date and time of the delete request plus the number of days specified in RecoveryWindowInDays.
    */
  var DeletionDate: js.UndefOr[DeletionDateType] = js.undefined
  
  /**
    * The friendly name of the secret that is now scheduled for deletion.
    */
  var Name: js.UndefOr[SecretNameType] = js.undefined
}
object DeleteSecretResponse {
  
  inline def apply(): DeleteSecretResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSecretResponse]
  }
  
  extension [Self <: DeleteSecretResponse](x: Self) {
    
    inline def setARN(value: SecretARNType): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setDeletionDate(value: DeletionDateType): Self = StObject.set(x, "DeletionDate", value.asInstanceOf[js.Any])
    
    inline def setDeletionDateUndefined: Self = StObject.set(x, "DeletionDate", js.undefined)
    
    inline def setName(value: SecretNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
