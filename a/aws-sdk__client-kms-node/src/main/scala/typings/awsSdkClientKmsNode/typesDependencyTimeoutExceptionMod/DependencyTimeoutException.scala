package typings.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod

import typings.awsSdkClientKmsNode.cancelKeyDeletionExceptionsUnionMod.CancelKeyDeletionExceptionsUnion
import typings.awsSdkClientKmsNode.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typings.awsSdkClientKmsNode.createGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typings.awsSdkClientKmsNode.createKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typings.awsSdkClientKmsNode.decryptExceptionsUnionMod.DecryptExceptionsUnion
import typings.awsSdkClientKmsNode.deleteAliasExceptionsUnionMod.DeleteAliasExceptionsUnion
import typings.awsSdkClientKmsNode.deleteImportedKeyMaterialExceptionsUnionMod.DeleteImportedKeyMaterialExceptionsUnion
import typings.awsSdkClientKmsNode.describeKeyExceptionsUnionMod.DescribeKeyExceptionsUnion
import typings.awsSdkClientKmsNode.disableKeyExceptionsUnionMod.DisableKeyExceptionsUnion
import typings.awsSdkClientKmsNode.disableKeyRotationExceptionsUnionMod.DisableKeyRotationExceptionsUnion
import typings.awsSdkClientKmsNode.enableKeyExceptionsUnionMod.EnableKeyExceptionsUnion
import typings.awsSdkClientKmsNode.enableKeyRotationExceptionsUnionMod.EnableKeyRotationExceptionsUnion
import typings.awsSdkClientKmsNode.encryptExceptionsUnionMod.EncryptExceptionsUnion
import typings.awsSdkClientKmsNode.generateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typings.awsSdkClientKmsNode.generateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typings.awsSdkClientKmsNode.generateRandomExceptionsUnionMod.GenerateRandomExceptionsUnion
import typings.awsSdkClientKmsNode.getKeyPolicyExceptionsUnionMod.GetKeyPolicyExceptionsUnion
import typings.awsSdkClientKmsNode.getKeyRotationStatusExceptionsUnionMod.GetKeyRotationStatusExceptionsUnion
import typings.awsSdkClientKmsNode.getParametersForImportExceptionsUnionMod.GetParametersForImportExceptionsUnion
import typings.awsSdkClientKmsNode.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typings.awsSdkClientKmsNode.listAliasesExceptionsUnionMod.ListAliasesExceptionsUnion
import typings.awsSdkClientKmsNode.listGrantsExceptionsUnionMod.ListGrantsExceptionsUnion
import typings.awsSdkClientKmsNode.listKeyPoliciesExceptionsUnionMod.ListKeyPoliciesExceptionsUnion
import typings.awsSdkClientKmsNode.listKeysExceptionsUnionMod.ListKeysExceptionsUnion
import typings.awsSdkClientKmsNode.listRetirableGrantsExceptionsUnionMod.ListRetirableGrantsExceptionsUnion
import typings.awsSdkClientKmsNode.putKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import typings.awsSdkClientKmsNode.reEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typings.awsSdkClientKmsNode.retireGrantExceptionsUnionMod.RetireGrantExceptionsUnion
import typings.awsSdkClientKmsNode.revokeGrantExceptionsUnionMod.RevokeGrantExceptionsUnion
import typings.awsSdkClientKmsNode.scheduleKeyDeletionExceptionsUnionMod.ScheduleKeyDeletionExceptionsUnion
import typings.awsSdkClientKmsNode.updateAliasExceptionsUnionMod.UpdateAliasExceptionsUnion
import typings.awsSdkClientKmsNode.updateKeyDescriptionExceptionsUnionMod.UpdateKeyDescriptionExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyTimeoutException
  extends ServiceException[DependencyTimeoutExceptionDetails]
     with CancelKeyDeletionExceptionsUnion
     with CreateAliasExceptionsUnion
     with CreateGrantExceptionsUnion
     with CreateKeyExceptionsUnion
     with DecryptExceptionsUnion
     with DeleteAliasExceptionsUnion
     with DeleteImportedKeyMaterialExceptionsUnion
     with DescribeKeyExceptionsUnion
     with DisableKeyExceptionsUnion
     with DisableKeyRotationExceptionsUnion
     with EnableKeyExceptionsUnion
     with EnableKeyRotationExceptionsUnion
     with EncryptExceptionsUnion
     with GenerateDataKeyExceptionsUnion
     with GenerateDataKeyWithoutPlaintextExceptionsUnion
     with GenerateRandomExceptionsUnion
     with GetKeyPolicyExceptionsUnion
     with GetKeyRotationStatusExceptionsUnion
     with GetParametersForImportExceptionsUnion
     with ImportKeyMaterialExceptionsUnion
     with ListAliasesExceptionsUnion
     with ListGrantsExceptionsUnion
     with ListKeyPoliciesExceptionsUnion
     with ListKeysExceptionsUnion
     with ListRetirableGrantsExceptionsUnion
     with PutKeyPolicyExceptionsUnion
     with ReEncryptExceptionsUnion
     with RetireGrantExceptionsUnion
     with RevokeGrantExceptionsUnion
     with ScheduleKeyDeletionExceptionsUnion
     with UpdateAliasExceptionsUnion
     with UpdateKeyDescriptionExceptionsUnion {
  @JSName("name")
  var name_DependencyTimeoutException: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.DependencyTimeoutException
}

object DependencyTimeoutException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: DependencyTimeoutExceptionDetails,
    message: String,
    name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.DependencyTimeoutException,
    stack: String = null
  ): DependencyTimeoutException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyTimeoutException]
  }
}

