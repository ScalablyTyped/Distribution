package typings.awsSdkClientKmsNode.typesKmsinvalidstateexceptionMod

import typings.awsSdkClientKmsNode.cancelKeyDeletionExceptionsUnionMod.CancelKeyDeletionExceptionsUnion
import typings.awsSdkClientKmsNode.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typings.awsSdkClientKmsNode.createGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typings.awsSdkClientKmsNode.decryptExceptionsUnionMod.DecryptExceptionsUnion
import typings.awsSdkClientKmsNode.deleteAliasExceptionsUnionMod.DeleteAliasExceptionsUnion
import typings.awsSdkClientKmsNode.deleteImportedKeyMaterialExceptionsUnionMod.DeleteImportedKeyMaterialExceptionsUnion
import typings.awsSdkClientKmsNode.disableKeyExceptionsUnionMod.DisableKeyExceptionsUnion
import typings.awsSdkClientKmsNode.disableKeyRotationExceptionsUnionMod.DisableKeyRotationExceptionsUnion
import typings.awsSdkClientKmsNode.enableKeyExceptionsUnionMod.EnableKeyExceptionsUnion
import typings.awsSdkClientKmsNode.enableKeyRotationExceptionsUnionMod.EnableKeyRotationExceptionsUnion
import typings.awsSdkClientKmsNode.encryptExceptionsUnionMod.EncryptExceptionsUnion
import typings.awsSdkClientKmsNode.generateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typings.awsSdkClientKmsNode.generateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typings.awsSdkClientKmsNode.getKeyPolicyExceptionsUnionMod.GetKeyPolicyExceptionsUnion
import typings.awsSdkClientKmsNode.getKeyRotationStatusExceptionsUnionMod.GetKeyRotationStatusExceptionsUnion
import typings.awsSdkClientKmsNode.getParametersForImportExceptionsUnionMod.GetParametersForImportExceptionsUnion
import typings.awsSdkClientKmsNode.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typings.awsSdkClientKmsNode.listGrantsExceptionsUnionMod.ListGrantsExceptionsUnion
import typings.awsSdkClientKmsNode.listKeyPoliciesExceptionsUnionMod.ListKeyPoliciesExceptionsUnion
import typings.awsSdkClientKmsNode.putKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import typings.awsSdkClientKmsNode.reEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typings.awsSdkClientKmsNode.retireGrantExceptionsUnionMod.RetireGrantExceptionsUnion
import typings.awsSdkClientKmsNode.revokeGrantExceptionsUnionMod.RevokeGrantExceptionsUnion
import typings.awsSdkClientKmsNode.scheduleKeyDeletionExceptionsUnionMod.ScheduleKeyDeletionExceptionsUnion
import typings.awsSdkClientKmsNode.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.awsSdkClientKmsNode.untagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typings.awsSdkClientKmsNode.updateAliasExceptionsUnionMod.UpdateAliasExceptionsUnion
import typings.awsSdkClientKmsNode.updateKeyDescriptionExceptionsUnionMod.UpdateKeyDescriptionExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMSInvalidStateException
  extends ServiceException[KMSInvalidStateExceptionDetails]
     with CancelKeyDeletionExceptionsUnion
     with CreateAliasExceptionsUnion
     with CreateGrantExceptionsUnion
     with DecryptExceptionsUnion
     with DeleteAliasExceptionsUnion
     with DeleteImportedKeyMaterialExceptionsUnion
     with DisableKeyExceptionsUnion
     with DisableKeyRotationExceptionsUnion
     with EnableKeyExceptionsUnion
     with EnableKeyRotationExceptionsUnion
     with EncryptExceptionsUnion
     with GenerateDataKeyExceptionsUnion
     with GenerateDataKeyWithoutPlaintextExceptionsUnion
     with GetKeyPolicyExceptionsUnion
     with GetKeyRotationStatusExceptionsUnion
     with GetParametersForImportExceptionsUnion
     with ImportKeyMaterialExceptionsUnion
     with ListGrantsExceptionsUnion
     with ListKeyPoliciesExceptionsUnion
     with PutKeyPolicyExceptionsUnion
     with ReEncryptExceptionsUnion
     with RetireGrantExceptionsUnion
     with RevokeGrantExceptionsUnion
     with ScheduleKeyDeletionExceptionsUnion
     with TagResourceExceptionsUnion
     with UntagResourceExceptionsUnion
     with UpdateAliasExceptionsUnion
     with UpdateKeyDescriptionExceptionsUnion {
  @JSName("name")
  var name_KMSInvalidStateException: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.KMSInvalidStateException = js.native
}

object KMSInvalidStateException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: KMSInvalidStateExceptionDetails,
    message: String,
    name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.KMSInvalidStateException
  ): KMSInvalidStateException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMSInvalidStateException]
  }
  @scala.inline
  implicit class KMSInvalidStateExceptionOps[Self <: KMSInvalidStateException] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.KMSInvalidStateException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

