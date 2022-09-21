package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.CreateGrant
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.Decrypt
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.DescribeKey
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.Encrypt
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.GenerateDataKey
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.GenerateDataKeyWithoutPlaintext
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.RSAES_OAEP_SHA_1
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.RSAES_OAEP_SHA_256
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.RSAES_PKCS1_V1_5
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.RSA_2048
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.ReEncryptFrom
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.ReEncryptTo
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.RetireGrant
import typings.awsSdkClientKmsBrowser.typesTagMod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientKmsBrowser.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput
    - typings.awsSdkClientKmsBrowser.typesCreateAliasInputMod.CreateAliasInput
    - typings.awsSdkClientKmsBrowser.typesCreateGrantInputMod.CreateGrantInput
    - typings.awsSdkClientKmsBrowser.typesCreateKeyInputMod.CreateKeyInput
    - typings.awsSdkClientKmsBrowser.typesDecryptInputMod.DecryptInput
    - typings.awsSdkClientKmsBrowser.typesDeleteAliasInputMod.DeleteAliasInput
    - typings.awsSdkClientKmsBrowser.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput
    - typings.awsSdkClientKmsBrowser.typesDescribeKeyInputMod.DescribeKeyInput
    - typings.awsSdkClientKmsBrowser.typesDisableKeyInputMod.DisableKeyInput
    - typings.awsSdkClientKmsBrowser.typesDisableKeyRotationInputMod.DisableKeyRotationInput
    - typings.awsSdkClientKmsBrowser.typesEnableKeyInputMod.EnableKeyInput
    - typings.awsSdkClientKmsBrowser.typesEnableKeyRotationInputMod.EnableKeyRotationInput
    - typings.awsSdkClientKmsBrowser.typesEncryptInputMod.EncryptInput
    - typings.awsSdkClientKmsBrowser.typesGenerateDataKeyInputMod.GenerateDataKeyInput
    - typings.awsSdkClientKmsBrowser.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput
    - typings.awsSdkClientKmsBrowser.typesGenerateRandomInputMod.GenerateRandomInput
    - typings.awsSdkClientKmsBrowser.typesGetKeyPolicyInputMod.GetKeyPolicyInput
    - typings.awsSdkClientKmsBrowser.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput
    - typings.awsSdkClientKmsBrowser.typesGetParametersForImportInputMod.GetParametersForImportInput
    - typings.awsSdkClientKmsBrowser.typesImportKeyMaterialInputMod.ImportKeyMaterialInput
    - typings.awsSdkClientKmsBrowser.typesListAliasesInputMod.ListAliasesInput
    - typings.awsSdkClientKmsBrowser.typesListGrantsInputMod.ListGrantsInput
    - typings.awsSdkClientKmsBrowser.typesListKeyPoliciesInputMod.ListKeyPoliciesInput
    - typings.awsSdkClientKmsBrowser.typesListKeysInputMod.ListKeysInput
    - typings.awsSdkClientKmsBrowser.typesListResourceTagsInputMod.ListResourceTagsInput
    - typings.awsSdkClientKmsBrowser.typesListRetirableGrantsInputMod.ListRetirableGrantsInput
    - typings.awsSdkClientKmsBrowser.typesPutKeyPolicyInputMod.PutKeyPolicyInput
    - typings.awsSdkClientKmsBrowser.typesReEncryptInputMod.ReEncryptInput
    - typings.awsSdkClientKmsBrowser.typesRetireGrantInputMod.RetireGrantInput
    - typings.awsSdkClientKmsBrowser.typesRevokeGrantInputMod.RevokeGrantInput
    - typings.awsSdkClientKmsBrowser.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput
    - typings.awsSdkClientKmsBrowser.typesTagResourceInputMod.TagResourceInput
    - typings.awsSdkClientKmsBrowser.typesUntagResourceInputMod.UntagResourceInput
    - typings.awsSdkClientKmsBrowser.typesUpdateAliasInputMod.UpdateAliasInput
    - typings.awsSdkClientKmsBrowser.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    inline def CancelKeyDeletionInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput]
    }
    
    inline def CreateAliasInput(AliasName: String, TargetKeyId: String): typings.awsSdkClientKmsBrowser.typesCreateAliasInputMod.CreateAliasInput = {
      val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], TargetKeyId = TargetKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesCreateAliasInputMod.CreateAliasInput]
    }
    
    inline def CreateGrantInput(
      GranteePrincipal: String,
      KeyId: String,
      Operations: (js.Array[
          Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
        ]) | (js.Iterable[
          Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
        ])
    ): typings.awsSdkClientKmsBrowser.typesCreateGrantInputMod.CreateGrantInput = {
      val __obj = js.Dynamic.literal(GranteePrincipal = GranteePrincipal.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any], Operations = Operations.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesCreateGrantInputMod.CreateGrantInput]
    }
    
    inline def CreateKeyInput(): typings.awsSdkClientKmsBrowser.typesCreateKeyInputMod.CreateKeyInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesCreateKeyInputMod.CreateKeyInput]
    }
    
    inline def DecryptInput(CiphertextBlob: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): typings.awsSdkClientKmsBrowser.typesDecryptInputMod.DecryptInput = {
      val __obj = js.Dynamic.literal(CiphertextBlob = CiphertextBlob.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesDecryptInputMod.DecryptInput]
    }
    
    inline def DeleteAliasInput(AliasName: String): typings.awsSdkClientKmsBrowser.typesDeleteAliasInputMod.DeleteAliasInput = {
      val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesDeleteAliasInputMod.DeleteAliasInput]
    }
    
    inline def DeleteImportedKeyMaterialInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput]
    }
    
    inline def DescribeKeyInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesDescribeKeyInputMod.DescribeKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesDescribeKeyInputMod.DescribeKeyInput]
    }
    
    inline def DisableKeyInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesDisableKeyInputMod.DisableKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesDisableKeyInputMod.DisableKeyInput]
    }
    
    inline def DisableKeyRotationInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesDisableKeyRotationInputMod.DisableKeyRotationInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesDisableKeyRotationInputMod.DisableKeyRotationInput]
    }
    
    inline def EnableKeyInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesEnableKeyInputMod.EnableKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesEnableKeyInputMod.EnableKeyInput]
    }
    
    inline def EnableKeyRotationInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesEnableKeyRotationInputMod.EnableKeyRotationInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesEnableKeyRotationInputMod.EnableKeyRotationInput]
    }
    
    inline def EncryptInput(KeyId: String, Plaintext: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): typings.awsSdkClientKmsBrowser.typesEncryptInputMod.EncryptInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Plaintext = Plaintext.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesEncryptInputMod.EncryptInput]
    }
    
    inline def GenerateDataKeyInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesGenerateDataKeyInputMod.GenerateDataKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesGenerateDataKeyInputMod.GenerateDataKeyInput]
    }
    
    inline def GenerateDataKeyWithoutPlaintextInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput]
    }
    
    inline def GenerateRandomInput(): typings.awsSdkClientKmsBrowser.typesGenerateRandomInputMod.GenerateRandomInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesGenerateRandomInputMod.GenerateRandomInput]
    }
    
    inline def GetKeyPolicyInput(KeyId: String, PolicyName: String): typings.awsSdkClientKmsBrowser.typesGetKeyPolicyInputMod.GetKeyPolicyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesGetKeyPolicyInputMod.GetKeyPolicyInput]
    }
    
    inline def GetKeyRotationStatusInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput]
    }
    
    inline def GetParametersForImportInput(
      KeyId: String,
      WrappingAlgorithm: RSAES_PKCS1_V1_5 | RSAES_OAEP_SHA_1 | RSAES_OAEP_SHA_256 | String,
      WrappingKeySpec: RSA_2048 | String
    ): typings.awsSdkClientKmsBrowser.typesGetParametersForImportInputMod.GetParametersForImportInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], WrappingAlgorithm = WrappingAlgorithm.asInstanceOf[js.Any], WrappingKeySpec = WrappingKeySpec.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesGetParametersForImportInputMod.GetParametersForImportInput]
    }
    
    inline def ImportKeyMaterialInput(
      EncryptedKeyMaterial: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      ImportToken: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      KeyId: String
    ): typings.awsSdkClientKmsBrowser.typesImportKeyMaterialInputMod.ImportKeyMaterialInput = {
      val __obj = js.Dynamic.literal(EncryptedKeyMaterial = EncryptedKeyMaterial.asInstanceOf[js.Any], ImportToken = ImportToken.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesImportKeyMaterialInputMod.ImportKeyMaterialInput]
    }
    
    inline def ListAliasesInput(): typings.awsSdkClientKmsBrowser.typesListAliasesInputMod.ListAliasesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesListAliasesInputMod.ListAliasesInput]
    }
    
    inline def ListGrantsInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesListGrantsInputMod.ListGrantsInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesListGrantsInputMod.ListGrantsInput]
    }
    
    inline def ListKeyPoliciesInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesListKeyPoliciesInputMod.ListKeyPoliciesInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesListKeyPoliciesInputMod.ListKeyPoliciesInput]
    }
    
    inline def ListKeysInput(): typings.awsSdkClientKmsBrowser.typesListKeysInputMod.ListKeysInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesListKeysInputMod.ListKeysInput]
    }
    
    inline def ListResourceTagsInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesListResourceTagsInputMod.ListResourceTagsInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesListResourceTagsInputMod.ListResourceTagsInput]
    }
    
    inline def ListRetirableGrantsInput(RetiringPrincipal: String): typings.awsSdkClientKmsBrowser.typesListRetirableGrantsInputMod.ListRetirableGrantsInput = {
      val __obj = js.Dynamic.literal(RetiringPrincipal = RetiringPrincipal.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesListRetirableGrantsInputMod.ListRetirableGrantsInput]
    }
    
    inline def PutKeyPolicyInput(KeyId: String, Policy: String, PolicyName: String): typings.awsSdkClientKmsBrowser.typesPutKeyPolicyInputMod.PutKeyPolicyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesPutKeyPolicyInputMod.PutKeyPolicyInput]
    }
    
    inline def ReEncryptInput(
      CiphertextBlob: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      DestinationKeyId: String
    ): typings.awsSdkClientKmsBrowser.typesReEncryptInputMod.ReEncryptInput = {
      val __obj = js.Dynamic.literal(CiphertextBlob = CiphertextBlob.asInstanceOf[js.Any], DestinationKeyId = DestinationKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesReEncryptInputMod.ReEncryptInput]
    }
    
    inline def RetireGrantInput(): typings.awsSdkClientKmsBrowser.typesRetireGrantInputMod.RetireGrantInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesRetireGrantInputMod.RetireGrantInput]
    }
    
    inline def RevokeGrantInput(GrantId: String, KeyId: String): typings.awsSdkClientKmsBrowser.typesRevokeGrantInputMod.RevokeGrantInput = {
      val __obj = js.Dynamic.literal(GrantId = GrantId.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesRevokeGrantInputMod.RevokeGrantInput]
    }
    
    inline def ScheduleKeyDeletionInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput]
    }
    
    inline def TagResourceInput(KeyId: String, Tags: js.Array[Tag] | js.Iterable[Tag]): typings.awsSdkClientKmsBrowser.typesTagResourceInputMod.TagResourceInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesTagResourceInputMod.TagResourceInput]
    }
    
    inline def UntagResourceInput(KeyId: String, TagKeys: js.Array[String] | js.Iterable[String]): typings.awsSdkClientKmsBrowser.typesUntagResourceInputMod.UntagResourceInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesUntagResourceInputMod.UntagResourceInput]
    }
    
    inline def UpdateAliasInput(AliasName: String, TargetKeyId: String): typings.awsSdkClientKmsBrowser.typesUpdateAliasInputMod.UpdateAliasInput = {
      val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], TargetKeyId = TargetKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesUpdateAliasInputMod.UpdateAliasInput]
    }
    
    inline def UpdateKeyDescriptionInput(Description: String, KeyId: String): typings.awsSdkClientKmsBrowser.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput = {
      val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput]
    }
  }
}
