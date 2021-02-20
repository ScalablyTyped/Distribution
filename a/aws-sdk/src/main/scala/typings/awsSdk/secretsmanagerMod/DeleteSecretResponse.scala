package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSecretResponse extends StObject {
  
  /**
    * The ARN of the secret that is now scheduled for deletion.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  
  /**
    * The date and time after which this secret can be deleted by Secrets Manager and can no longer be restored. This value is the date and time of the delete request plus the number of days specified in RecoveryWindowInDays.
    */
  var DeletionDate: js.UndefOr[DeletionDateType] = js.native
  
  /**
    * The friendly name of the secret that is now scheduled for deletion.
    */
  var Name: js.UndefOr[SecretNameType] = js.native
}
object DeleteSecretResponse {
  
  @scala.inline
  def apply(): DeleteSecretResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSecretResponse]
  }
  
  @scala.inline
  implicit class DeleteSecretResponseMutableBuilder[Self <: DeleteSecretResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: SecretARNType): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    @scala.inline
    def setDeletionDate(value: DeletionDateType): Self = StObject.set(x, "DeletionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionDateUndefined: Self = StObject.set(x, "DeletionDate", js.undefined)
    
    @scala.inline
    def setName(value: SecretNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
