package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSecretResponse extends js.Object {
  
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
  implicit class DeleteSecretResponseOps[Self <: DeleteSecretResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setARN(value: SecretARNType): Self = this.set("ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteARN: Self = this.set("ARN", js.undefined)
    
    @scala.inline
    def setDeletionDate(value: DeletionDateType): Self = this.set("DeletionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionDate: Self = this.set("DeletionDate", js.undefined)
    
    @scala.inline
    def setName(value: SecretNameType): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
