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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInputTypesUnionMod {
  
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
    
    inline def CancelKeyDeletionInput(KeyId: String): typings.awsSdkClientKmsNode.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput]
    }
    
    inline def CreateAliasInput(AliasName: String, TargetKeyId: String): typings.awsSdkClientKmsNode.typesCreateAliasInputMod.CreateAliasInput = {
      val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], TargetKeyId = TargetKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesCreateAliasInputMod.CreateAliasInput]
    }
    
    inline def CreateGrantInput(
      GranteePrincipal: String,
      KeyId: String,
      Operations: (js.Array[
          Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
        ]) | (js.Iterable[
          Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
        ])
    ): typings.awsSdkClientKmsNode.typesCreateGrantInputMod.CreateGrantInput = {
      val __obj = js.Dynamic.literal(GranteePrincipal = GranteePrincipal.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any], Operations = Operations.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesCreateGrantInputMod.CreateGrantInput]
    }
    
    inline def CreateKeyInput(): typings.awsSdkClientKmsNode.typesCreateKeyInputMod.CreateKeyInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesCreateKeyInputMod.CreateKeyInput]
    }
    
    inline def DecryptInput(CiphertextBlob: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): typings.awsSdkClientKmsNode.typesDecryptInputMod.DecryptInput = {
      val __obj = js.Dynamic.literal(CiphertextBlob = CiphertextBlob.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesDecryptInputMod.DecryptInput]
    }
    
    inline def DeleteAliasInput(AliasName: String): typings.awsSdkClientKmsNode.typesDeleteAliasInputMod.DeleteAliasInput = {
      val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesDeleteAliasInputMod.DeleteAliasInput]
    }
    
    inline def DeleteImportedKeyMaterialInput(KeyId: String): typings.awsSdkClientKmsNode.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput]
    }
    
    inline def DescribeKeyInput(KeyId: String): typings.awsSdkClientKmsNode.typesDescribeKeyInputMod.DescribeKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesDescribeKeyInputMod.DescribeKeyInput]
    }
    
    inline def DisableKeyInput(KeyId: String): typings.awsSdkClientKmsNode.typesDisableKeyInputMod.DisableKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesDisableKeyInputMod.DisableKeyInput]
    }
    
    inline def DisableKeyRotationInput(KeyId: String): typings.awsSdkClientKmsNode.typesDisableKeyRotationInputMod.DisableKeyRotationInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesDisableKeyRotationInputMod.DisableKeyRotationInput]
    }
    
    inline def EnableKeyInput(KeyId: String): typings.awsSdkClientKmsNode.typesEnableKeyInputMod.EnableKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesEnableKeyInputMod.EnableKeyInput]
    }
    
    inline def EnableKeyRotationInput(KeyId: String): typings.awsSdkClientKmsNode.typesEnableKeyRotationInputMod.EnableKeyRotationInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesEnableKeyRotationInputMod.EnableKeyRotationInput]
    }
    
    inline def EncryptInput(KeyId: String, Plaintext: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): typings.awsSdkClientKmsNode.typesEncryptInputMod.EncryptInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Plaintext = Plaintext.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesEncryptInputMod.EncryptInput]
    }
    
    inline def GenerateDataKeyInput(KeyId: String): typings.awsSdkClientKmsNode.typesGenerateDataKeyInputMod.GenerateDataKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesGenerateDataKeyInputMod.GenerateDataKeyInput]
    }
    
    inline def GenerateDataKeyWithoutPlaintextInput(KeyId: String): typings.awsSdkClientKmsNode.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput]
    }
    
    inline def GenerateRandomInput(): typings.awsSdkClientKmsNode.typesGenerateRandomInputMod.GenerateRandomInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesGenerateRandomInputMod.GenerateRandomInput]
    }
    
    inline def GetKeyPolicyInput(KeyId: String, PolicyName: String): typings.awsSdkClientKmsNode.typesGetKeyPolicyInputMod.GetKeyPolicyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesGetKeyPolicyInputMod.GetKeyPolicyInput]
    }
    
    inline def GetKeyRotationStatusInput(KeyId: String): typings.awsSdkClientKmsNode.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput]
    }
    
    inline def GetParametersForImportInput(
      KeyId: String,
      WrappingAlgorithm: RSAES_PKCS1_V1_5 | RSAES_OAEP_SHA_1 | RSAES_OAEP_SHA_256 | String,
      WrappingKeySpec: RSA_2048 | String
    ): typings.awsSdkClientKmsNode.typesGetParametersForImportInputMod.GetParametersForImportInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], WrappingAlgorithm = WrappingAlgorithm.asInstanceOf[js.Any], WrappingKeySpec = WrappingKeySpec.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesGetParametersForImportInputMod.GetParametersForImportInput]
    }
    
    inline def ImportKeyMaterialInput(
      EncryptedKeyMaterial: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      ImportToken: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      KeyId: String
    ): typings.awsSdkClientKmsNode.typesImportKeyMaterialInputMod.ImportKeyMaterialInput = {
      val __obj = js.Dynamic.literal(EncryptedKeyMaterial = EncryptedKeyMaterial.asInstanceOf[js.Any], ImportToken = ImportToken.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesImportKeyMaterialInputMod.ImportKeyMaterialInput]
    }
    
    inline def ListAliasesInput(): typings.awsSdkClientKmsNode.typesListAliasesInputMod.ListAliasesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesListAliasesInputMod.ListAliasesInput]
    }
    
    inline def ListGrantsInput(KeyId: String): typings.awsSdkClientKmsNode.typesListGrantsInputMod.ListGrantsInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesListGrantsInputMod.ListGrantsInput]
    }
    
    inline def ListKeyPoliciesInput(KeyId: String): typings.awsSdkClientKmsNode.typesListKeyPoliciesInputMod.ListKeyPoliciesInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesListKeyPoliciesInputMod.ListKeyPoliciesInput]
    }
    
    inline def ListKeysInput(): typings.awsSdkClientKmsNode.typesListKeysInputMod.ListKeysInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesListKeysInputMod.ListKeysInput]
    }
    
    inline def ListResourceTagsInput(KeyId: String): typings.awsSdkClientKmsNode.typesListResourceTagsInputMod.ListResourceTagsInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesListResourceTagsInputMod.ListResourceTagsInput]
    }
    
    inline def ListRetirableGrantsInput(RetiringPrincipal: String): typings.awsSdkClientKmsNode.typesListRetirableGrantsInputMod.ListRetirableGrantsInput = {
      val __obj = js.Dynamic.literal(RetiringPrincipal = RetiringPrincipal.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesListRetirableGrantsInputMod.ListRetirableGrantsInput]
    }
    
    inline def PutKeyPolicyInput(KeyId: String, Policy: String, PolicyName: String): typings.awsSdkClientKmsNode.typesPutKeyPolicyInputMod.PutKeyPolicyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesPutKeyPolicyInputMod.PutKeyPolicyInput]
    }
    
    inline def ReEncryptInput(
      CiphertextBlob: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      DestinationKeyId: String
    ): typings.awsSdkClientKmsNode.typesReEncryptInputMod.ReEncryptInput = {
      val __obj = js.Dynamic.literal(CiphertextBlob = CiphertextBlob.asInstanceOf[js.Any], DestinationKeyId = DestinationKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesReEncryptInputMod.ReEncryptInput]
    }
    
    inline def RetireGrantInput(): typings.awsSdkClientKmsNode.typesRetireGrantInputMod.RetireGrantInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesRetireGrantInputMod.RetireGrantInput]
    }
    
    inline def RevokeGrantInput(GrantId: String, KeyId: String): typings.awsSdkClientKmsNode.typesRevokeGrantInputMod.RevokeGrantInput = {
      val __obj = js.Dynamic.literal(GrantId = GrantId.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesRevokeGrantInputMod.RevokeGrantInput]
    }
    
    inline def ScheduleKeyDeletionInput(KeyId: String): typings.awsSdkClientKmsNode.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput]
    }
    
    inline def TagResourceInput(KeyId: String, Tags: js.Array[Tag] | js.Iterable[Tag]): typings.awsSdkClientKmsNode.typesTagResourceInputMod.TagResourceInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesTagResourceInputMod.TagResourceInput]
    }
    
    inline def UntagResourceInput(KeyId: String, TagKeys: js.Array[String] | js.Iterable[String]): typings.awsSdkClientKmsNode.typesUntagResourceInputMod.UntagResourceInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesUntagResourceInputMod.UntagResourceInput]
    }
    
    inline def UpdateAliasInput(AliasName: String, TargetKeyId: String): typings.awsSdkClientKmsNode.typesUpdateAliasInputMod.UpdateAliasInput = {
      val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], TargetKeyId = TargetKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesUpdateAliasInputMod.UpdateAliasInput]
    }
    
    inline def UpdateKeyDescriptionInput(Description: String, KeyId: String): typings.awsSdkClientKmsNode.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput = {
      val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsNode.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput]
    }
  }
}
