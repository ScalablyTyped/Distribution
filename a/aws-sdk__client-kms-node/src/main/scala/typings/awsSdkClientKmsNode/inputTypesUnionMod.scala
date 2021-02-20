package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.CreateGrant
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.Decrypt
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.DescribeKey
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.Encrypt
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.GenerateDataKey
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.GenerateDataKeyWithoutPlaintext
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.RSAES_OAEP_SHA_1
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.RSAES_OAEP_SHA_256
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.RSAES_PKCS1_V1_5
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.RSA_2048
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.ReEncryptFrom
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.ReEncryptTo
import typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.RetireGrant
import typings.awsSdkClientKmsNode.typesTagMod.Tag
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientKmsNode.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput
    - typings.awsSdkClientKmsNode.typesCreateAliasInputMod.CreateAliasInput
    - typings.awsSdkClientKmsNode.typesCreateGrantInputMod.CreateGrantInput
    - typings.awsSdkClientKmsNode.typesCreateKeyInputMod.CreateKeyInput
    - typings.awsSdkClientKmsNode.typesDecryptInputMod.DecryptInput
    - typings.awsSdkClientKmsNode.typesDeleteAliasInputMod.DeleteAliasInput
    - typings.awsSdkClientKmsNode.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput
    - typings.awsSdkClientKmsNode.typesDescribeKeyInputMod.DescribeKeyInput
    - typings.awsSdkClientKmsNode.typesDisableKeyInputMod.DisableKeyInput
    - typings.awsSdkClientKmsNode.typesDisableKeyRotationInputMod.DisableKeyRotationInput
    - typings.awsSdkClientKmsNode.typesEnableKeyInputMod.EnableKeyInput
    - typings.awsSdkClientKmsNode.typesEnableKeyRotationInputMod.EnableKeyRotationInput
    - typings.awsSdkClientKmsNode.typesEncryptInputMod.EncryptInput
    - typings.awsSdkClientKmsNode.typesGenerateDataKeyInputMod.GenerateDataKeyInput
    - typings.awsSdkClientKmsNode.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput
    - typings.awsSdkClientKmsNode.typesGenerateRandomInputMod.GenerateRandomInput
    - typings.awsSdkClientKmsNode.typesGetKeyPolicyInputMod.GetKeyPolicyInput
    - typings.awsSdkClientKmsNode.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput
    - typings.awsSdkClientKmsNode.typesGetParametersForImportInputMod.GetParametersForImportInput
    - typings.awsSdkClientKmsNode.typesImportKeyMaterialInputMod.ImportKeyMaterialInput
    - typings.awsSdkClientKmsNode.typesListAliasesInputMod.ListAliasesInput
    - typings.awsSdkClientKmsNode.typesListGrantsInputMod.ListGrantsInput
    - typings.awsSdkClientKmsNode.typesListKeyPoliciesInputMod.ListKeyPoliciesInput
    - typings.awsSdkClientKmsNode.typesListKeysInputMod.ListKeysInput
    - typings.awsSdkClientKmsNode.typesListResourceTagsInputMod.ListResourceTagsInput
    - typings.awsSdkClientKmsNode.typesListRetirableGrantsInputMod.ListRetirableGrantsInput
    - typings.awsSdkClientKmsNode.typesPutKeyPolicyInputMod.PutKeyPolicyInput
    - typings.awsSdkClientKmsNode.typesReEncryptInputMod.ReEncryptInput
    - typings.awsSdkClientKmsNode.typesRetireGrantInputMod.RetireGrantInput
    - typings.awsSdkClientKmsNode.typesRevokeGrantInputMod.RevokeGrantInput
    - typings.awsSdkClientKmsNode.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput
    - typings.awsSdkClientKmsNode.typesTagResourceInputMod.TagResourceInput
    - typings.awsSdkClientKmsNode.typesUntagResourceInputMod.UntagResourceInput
    - typings.awsSdkClientKmsNode.typesUpdateAliasInputMod.UpdateAliasInput
    - typings.awsSdkClientKmsNode.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    @scala.inline
    def CancelKeyDeletionInput(KeyId: String): typings.awsSdkClientKmsNode.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput]
    }
    
    @scala.inline
    def CreateAliasInput(AliasName: String, TargetKeyId: String): typings.awsSdkClientKmsNode.typesCreateAliasInputMod.CreateAliasInput = {
      val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], TargetKeyId = TargetKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesCreateAliasInputMod.CreateAliasInput]
    }
    
    @scala.inline
    def CreateGrantInput(
      GranteePrincipal: String,
      KeyId: String,
      Operations: (js.Array[
          Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
        ]) | (Iterable[
          Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
        ])
    ): typings.awsSdkClientKmsNode.typesCreateGrantInputMod.CreateGrantInput = {
      val __obj = js.Dynamic.literal(GranteePrincipal = GranteePrincipal.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any], Operations = Operations.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesCreateGrantInputMod.CreateGrantInput]
    }
    
    @scala.inline
    def CreateKeyInput(): typings.awsSdkClientKmsNode.typesCreateKeyInputMod.CreateKeyInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesCreateKeyInputMod.CreateKeyInput]
    }
    
    @scala.inline
    def DecryptInput(CiphertextBlob: ArrayBuffer | ArrayBufferView | String): typings.awsSdkClientKmsNode.typesDecryptInputMod.DecryptInput = {
      val __obj = js.Dynamic.literal(CiphertextBlob = CiphertextBlob.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesDecryptInputMod.DecryptInput]
    }
    
    @scala.inline
    def DeleteAliasInput(AliasName: String): typings.awsSdkClientKmsNode.typesDeleteAliasInputMod.DeleteAliasInput = {
      val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesDeleteAliasInputMod.DeleteAliasInput]
    }
    
    @scala.inline
    def DeleteImportedKeyMaterialInput(KeyId: String): typings.awsSdkClientKmsNode.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput]
    }
    
    @scala.inline
    def DescribeKeyInput(KeyId: String): typings.awsSdkClientKmsNode.typesDescribeKeyInputMod.DescribeKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesDescribeKeyInputMod.DescribeKeyInput]
    }
    
    @scala.inline
    def DisableKeyInput(KeyId: String): typings.awsSdkClientKmsNode.typesDisableKeyInputMod.DisableKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesDisableKeyInputMod.DisableKeyInput]
    }
    
    @scala.inline
    def DisableKeyRotationInput(KeyId: String): typings.awsSdkClientKmsNode.typesDisableKeyRotationInputMod.DisableKeyRotationInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesDisableKeyRotationInputMod.DisableKeyRotationInput]
    }
    
    @scala.inline
    def EnableKeyInput(KeyId: String): typings.awsSdkClientKmsNode.typesEnableKeyInputMod.EnableKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesEnableKeyInputMod.EnableKeyInput]
    }
    
    @scala.inline
    def EnableKeyRotationInput(KeyId: String): typings.awsSdkClientKmsNode.typesEnableKeyRotationInputMod.EnableKeyRotationInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesEnableKeyRotationInputMod.EnableKeyRotationInput]
    }
    
    @scala.inline
    def EncryptInput(KeyId: String, Plaintext: ArrayBuffer | ArrayBufferView | String): typings.awsSdkClientKmsNode.typesEncryptInputMod.EncryptInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Plaintext = Plaintext.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesEncryptInputMod.EncryptInput]
    }
    
    @scala.inline
    def GenerateDataKeyInput(KeyId: String): typings.awsSdkClientKmsNode.typesGenerateDataKeyInputMod.GenerateDataKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesGenerateDataKeyInputMod.GenerateDataKeyInput]
    }
    
    @scala.inline
    def GenerateDataKeyWithoutPlaintextInput(KeyId: String): typings.awsSdkClientKmsNode.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput]
    }
    
    @scala.inline
    def GenerateRandomInput(): typings.awsSdkClientKmsNode.typesGenerateRandomInputMod.GenerateRandomInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesGenerateRandomInputMod.GenerateRandomInput]
    }
    
    @scala.inline
    def GetKeyPolicyInput(KeyId: String, PolicyName: String): typings.awsSdkClientKmsNode.typesGetKeyPolicyInputMod.GetKeyPolicyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesGetKeyPolicyInputMod.GetKeyPolicyInput]
    }
    
    @scala.inline
    def GetKeyRotationStatusInput(KeyId: String): typings.awsSdkClientKmsNode.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput]
    }
    
    @scala.inline
    def GetParametersForImportInput(
      KeyId: String,
      WrappingAlgorithm: RSAES_PKCS1_V1_5 | RSAES_OAEP_SHA_1 | RSAES_OAEP_SHA_256 | String,
      WrappingKeySpec: RSA_2048 | String
    ): typings.awsSdkClientKmsNode.typesGetParametersForImportInputMod.GetParametersForImportInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], WrappingAlgorithm = WrappingAlgorithm.asInstanceOf[js.Any], WrappingKeySpec = WrappingKeySpec.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesGetParametersForImportInputMod.GetParametersForImportInput]
    }
    
    @scala.inline
    def ImportKeyMaterialInput(
      EncryptedKeyMaterial: ArrayBuffer | ArrayBufferView | String,
      ImportToken: ArrayBuffer | ArrayBufferView | String,
      KeyId: String
    ): typings.awsSdkClientKmsNode.typesImportKeyMaterialInputMod.ImportKeyMaterialInput = {
      val __obj = js.Dynamic.literal(EncryptedKeyMaterial = EncryptedKeyMaterial.asInstanceOf[js.Any], ImportToken = ImportToken.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesImportKeyMaterialInputMod.ImportKeyMaterialInput]
    }
    
    @scala.inline
    def ListAliasesInput(): typings.awsSdkClientKmsNode.typesListAliasesInputMod.ListAliasesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesListAliasesInputMod.ListAliasesInput]
    }
    
    @scala.inline
    def ListGrantsInput(KeyId: String): typings.awsSdkClientKmsNode.typesListGrantsInputMod.ListGrantsInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesListGrantsInputMod.ListGrantsInput]
    }
    
    @scala.inline
    def ListKeyPoliciesInput(KeyId: String): typings.awsSdkClientKmsNode.typesListKeyPoliciesInputMod.ListKeyPoliciesInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesListKeyPoliciesInputMod.ListKeyPoliciesInput]
    }
    
    @scala.inline
    def ListKeysInput(): typings.awsSdkClientKmsNode.typesListKeysInputMod.ListKeysInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesListKeysInputMod.ListKeysInput]
    }
    
    @scala.inline
    def ListResourceTagsInput(KeyId: String): typings.awsSdkClientKmsNode.typesListResourceTagsInputMod.ListResourceTagsInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesListResourceTagsInputMod.ListResourceTagsInput]
    }
    
    @scala.inline
    def ListRetirableGrantsInput(RetiringPrincipal: String): typings.awsSdkClientKmsNode.typesListRetirableGrantsInputMod.ListRetirableGrantsInput = {
      val __obj = js.Dynamic.literal(RetiringPrincipal = RetiringPrincipal.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesListRetirableGrantsInputMod.ListRetirableGrantsInput]
    }
    
    @scala.inline
    def PutKeyPolicyInput(KeyId: String, Policy: String, PolicyName: String): typings.awsSdkClientKmsNode.typesPutKeyPolicyInputMod.PutKeyPolicyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesPutKeyPolicyInputMod.PutKeyPolicyInput]
    }
    
    @scala.inline
    def ReEncryptInput(CiphertextBlob: ArrayBuffer | ArrayBufferView | String, DestinationKeyId: String): typings.awsSdkClientKmsNode.typesReEncryptInputMod.ReEncryptInput = {
      val __obj = js.Dynamic.literal(CiphertextBlob = CiphertextBlob.asInstanceOf[js.Any], DestinationKeyId = DestinationKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesReEncryptInputMod.ReEncryptInput]
    }
    
    @scala.inline
    def RetireGrantInput(): typings.awsSdkClientKmsNode.typesRetireGrantInputMod.RetireGrantInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesRetireGrantInputMod.RetireGrantInput]
    }
    
    @scala.inline
    def RevokeGrantInput(GrantId: String, KeyId: String): typings.awsSdkClientKmsNode.typesRevokeGrantInputMod.RevokeGrantInput = {
      val __obj = js.Dynamic.literal(GrantId = GrantId.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesRevokeGrantInputMod.RevokeGrantInput]
    }
    
    @scala.inline
    def ScheduleKeyDeletionInput(KeyId: String): typings.awsSdkClientKmsNode.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput]
    }
    
    @scala.inline
    def TagResourceInput(KeyId: String, Tags: js.Array[Tag] | Iterable[Tag]): typings.awsSdkClientKmsNode.typesTagResourceInputMod.TagResourceInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesTagResourceInputMod.TagResourceInput]
    }
    
    @scala.inline
    def UntagResourceInput(KeyId: String, TagKeys: js.Array[String] | Iterable[String]): typings.awsSdkClientKmsNode.typesUntagResourceInputMod.UntagResourceInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesUntagResourceInputMod.UntagResourceInput]
    }
    
    @scala.inline
    def UpdateAliasInput(AliasName: String, TargetKeyId: String): typings.awsSdkClientKmsNode.typesUpdateAliasInputMod.UpdateAliasInput = {
      val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], TargetKeyId = TargetKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesUpdateAliasInputMod.UpdateAliasInput]
    }
    
    @scala.inline
    def UpdateKeyDescriptionInput(Description: String, KeyId: String): typings.awsSdkClientKmsNode.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput = {
      val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput]
    }
  }
}
