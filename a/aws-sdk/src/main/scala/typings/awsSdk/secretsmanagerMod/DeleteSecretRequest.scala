package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSecretRequest extends js.Object {
  
  /**
    * (Optional) Specifies that the secret is to be deleted without any recovery window. You can't use both this parameter and the RecoveryWindowInDays parameter in the same API call. An asynchronous background process performs the actual deletion, so there can be a short delay before the operation completes. If you write code to delete and then immediately recreate a secret with the same name, ensure that your code includes appropriate back off and retry logic.  Use this parameter with caution. This parameter causes the operation to skip the normal waiting period before the permanent deletion that AWS would normally impose with the RecoveryWindowInDays parameter. If you delete a secret with the ForceDeleteWithouRecovery parameter, then you have no opportunity to recover the secret. It is permanently lost. 
    */
  var ForceDeleteWithoutRecovery: js.UndefOr[BooleanType] = js.native
  
  /**
    * (Optional) Specifies the number of days that Secrets Manager waits before it can delete the secret. You can't use both this parameter and the ForceDeleteWithoutRecovery parameter in the same API call. This value can range from 7 to 30 days. The default value is 30.
    */
  var RecoveryWindowInDays: js.UndefOr[RecoveryWindowInDaysType] = js.native
  
  /**
    * Specifies the secret that you want to delete. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.  If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters. If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you must not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a ResourceNotFoundException or an AccessDeniedException error, depending on your permissions. 
    */
  var SecretId: SecretIdType = js.native
}
object DeleteSecretRequest {
  
  @scala.inline
  def apply(SecretId: SecretIdType): DeleteSecretRequest = {
    val __obj = js.Dynamic.literal(SecretId = SecretId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSecretRequest]
  }
  
  @scala.inline
  implicit class DeleteSecretRequestOps[Self <: DeleteSecretRequest] (val x: Self) extends AnyVal {
    
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
    def setSecretId(value: SecretIdType): Self = this.set("SecretId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceDeleteWithoutRecovery(value: BooleanType): Self = this.set("ForceDeleteWithoutRecovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceDeleteWithoutRecovery: Self = this.set("ForceDeleteWithoutRecovery", js.undefined)
    
    @scala.inline
    def setRecoveryWindowInDays(value: RecoveryWindowInDaysType): Self = this.set("RecoveryWindowInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecoveryWindowInDays: Self = this.set("RecoveryWindowInDays", js.undefined)
  }
}
