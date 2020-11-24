package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSecretVersionStageRequest extends js.Object {
  
  /**
    * (Optional) The secret version ID that you want to add the staging label. If you want to remove a label from a version, then do not specify this parameter. If the staging label is already attached to a different version of the secret, then you must also specify the RemoveFromVersionId parameter. 
    */
  var MoveToVersionId: js.UndefOr[SecretVersionIdType] = js.native
  
  /**
    * Specifies the secret version ID of the version that the staging label is to be removed from. If the staging label you are trying to attach to one version is already attached to a different version, then you must include this parameter and specify the version that the label is to be removed from. If the label is attached and you either do not specify this parameter, or the version ID does not match, then the operation fails.
    */
  var RemoveFromVersionId: js.UndefOr[SecretVersionIdType] = js.native
  
  /**
    * Specifies the secret with the version with the list of staging labels you want to modify. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.  If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters. If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you must not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a ResourceNotFoundException or an AccessDeniedException error, depending on your permissions. 
    */
  var SecretId: SecretIdType = js.native
  
  /**
    * The staging label to add to this version.
    */
  var VersionStage: SecretVersionStageType = js.native
}
object UpdateSecretVersionStageRequest {
  
  @scala.inline
  def apply(SecretId: SecretIdType, VersionStage: SecretVersionStageType): UpdateSecretVersionStageRequest = {
    val __obj = js.Dynamic.literal(SecretId = SecretId.asInstanceOf[js.Any], VersionStage = VersionStage.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSecretVersionStageRequest]
  }
  
  @scala.inline
  implicit class UpdateSecretVersionStageRequestOps[Self <: UpdateSecretVersionStageRequest] (val x: Self) extends AnyVal {
    
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
    def setVersionStage(value: SecretVersionStageType): Self = this.set("VersionStage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveToVersionId(value: SecretVersionIdType): Self = this.set("MoveToVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveToVersionId: Self = this.set("MoveToVersionId", js.undefined)
    
    @scala.inline
    def setRemoveFromVersionId(value: SecretVersionIdType): Self = this.set("RemoveFromVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveFromVersionId: Self = this.set("RemoveFromVersionId", js.undefined)
  }
}
