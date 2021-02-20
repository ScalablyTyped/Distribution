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
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    @scala.inline
    def CancelKeyDeletionInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput]
    }
    
    @scala.inline
    def CreateAliasInput(AliasName: String, TargetKeyId: String): typings.awsSdkClientKmsBrowser.typesCreateAliasInputMod.CreateAliasInput = {
      val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], TargetKeyId = TargetKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesCreateAliasInputMod.CreateAliasInput]
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
    ): typings.awsSdkClientKmsBrowser.typesCreateGrantInputMod.CreateGrantInput = {
      val __obj = js.Dynamic.literal(GranteePrincipal = GranteePrincipal.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any], Operations = Operations.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesCreateGrantInputMod.CreateGrantInput]
    }
    
    @scala.inline
    def CreateKeyInput(): typings.awsSdkClientKmsBrowser.typesCreateKeyInputMod.CreateKeyInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesCreateKeyInputMod.CreateKeyInput]
    }
    
    @scala.inline
    def DecryptInput(CiphertextBlob: ArrayBuffer | ArrayBufferView | String): typings.awsSdkClientKmsBrowser.typesDecryptInputMod.DecryptInput = {
      val __obj = js.Dynamic.literal(CiphertextBlob = CiphertextBlob.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesDecryptInputMod.DecryptInput]
    }
    
    @scala.inline
    def DeleteAliasInput(AliasName: String): typings.awsSdkClientKmsBrowser.typesDeleteAliasInputMod.DeleteAliasInput = {
      val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesDeleteAliasInputMod.DeleteAliasInput]
    }
    
    @scala.inline
    def DeleteImportedKeyMaterialInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput]
    }
    
    @scala.inline
    def DescribeKeyInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesDescribeKeyInputMod.DescribeKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesDescribeKeyInputMod.DescribeKeyInput]
    }
    
    @scala.inline
    def DisableKeyInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesDisableKeyInputMod.DisableKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesDisableKeyInputMod.DisableKeyInput]
    }
    
    @scala.inline
    def DisableKeyRotationInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesDisableKeyRotationInputMod.DisableKeyRotationInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesDisableKeyRotationInputMod.DisableKeyRotationInput]
    }
    
    @scala.inline
    def EnableKeyInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesEnableKeyInputMod.EnableKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesEnableKeyInputMod.EnableKeyInput]
    }
    
    @scala.inline
    def EnableKeyRotationInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesEnableKeyRotationInputMod.EnableKeyRotationInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesEnableKeyRotationInputMod.EnableKeyRotationInput]
    }
    
    @scala.inline
    def EncryptInput(KeyId: String, Plaintext: ArrayBuffer | ArrayBufferView | String): typings.awsSdkClientKmsBrowser.typesEncryptInputMod.EncryptInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Plaintext = Plaintext.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesEncryptInputMod.EncryptInput]
    }
    
    @scala.inline
    def GenerateDataKeyInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesGenerateDataKeyInputMod.GenerateDataKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesGenerateDataKeyInputMod.GenerateDataKeyInput]
    }
    
    @scala.inline
    def GenerateDataKeyWithoutPlaintextInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput]
    }
    
    @scala.inline
    def GenerateRandomInput(): typings.awsSdkClientKmsBrowser.typesGenerateRandomInputMod.GenerateRandomInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesGenerateRandomInputMod.GenerateRandomInput]
    }
    
    @scala.inline
    def GetKeyPolicyInput(KeyId: String, PolicyName: String): typings.awsSdkClientKmsBrowser.typesGetKeyPolicyInputMod.GetKeyPolicyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesGetKeyPolicyInputMod.GetKeyPolicyInput]
    }
    
    @scala.inline
    def GetKeyRotationStatusInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput]
    }
    
    @scala.inline
    def GetParametersForImportInput(
      KeyId: String,
      WrappingAlgorithm: RSAES_PKCS1_V1_5 | RSAES_OAEP_SHA_1 | RSAES_OAEP_SHA_256 | String,
      WrappingKeySpec: RSA_2048 | String
    ): typings.awsSdkClientKmsBrowser.typesGetParametersForImportInputMod.GetParametersForImportInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], WrappingAlgorithm = WrappingAlgorithm.asInstanceOf[js.Any], WrappingKeySpec = WrappingKeySpec.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesGetParametersForImportInputMod.GetParametersForImportInput]
    }
    
    @scala.inline
    def ImportKeyMaterialInput(
      EncryptedKeyMaterial: ArrayBuffer | ArrayBufferView | String,
      ImportToken: ArrayBuffer | ArrayBufferView | String,
      KeyId: String
    ): typings.awsSdkClientKmsBrowser.typesImportKeyMaterialInputMod.ImportKeyMaterialInput = {
      val __obj = js.Dynamic.literal(EncryptedKeyMaterial = EncryptedKeyMaterial.asInstanceOf[js.Any], ImportToken = ImportToken.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesImportKeyMaterialInputMod.ImportKeyMaterialInput]
    }
    
    @scala.inline
    def ListAliasesInput(): typings.awsSdkClientKmsBrowser.typesListAliasesInputMod.ListAliasesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesListAliasesInputMod.ListAliasesInput]
    }
    
    @scala.inline
    def ListGrantsInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesListGrantsInputMod.ListGrantsInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesListGrantsInputMod.ListGrantsInput]
    }
    
    @scala.inline
    def ListKeyPoliciesInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesListKeyPoliciesInputMod.ListKeyPoliciesInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesListKeyPoliciesInputMod.ListKeyPoliciesInput]
    }
    
    @scala.inline
    def ListKeysInput(): typings.awsSdkClientKmsBrowser.typesListKeysInputMod.ListKeysInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesListKeysInputMod.ListKeysInput]
    }
    
    @scala.inline
    def ListResourceTagsInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesListResourceTagsInputMod.ListResourceTagsInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesListResourceTagsInputMod.ListResourceTagsInput]
    }
    
    @scala.inline
    def ListRetirableGrantsInput(RetiringPrincipal: String): typings.awsSdkClientKmsBrowser.typesListRetirableGrantsInputMod.ListRetirableGrantsInput = {
      val __obj = js.Dynamic.literal(RetiringPrincipal = RetiringPrincipal.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesListRetirableGrantsInputMod.ListRetirableGrantsInput]
    }
    
    @scala.inline
    def PutKeyPolicyInput(KeyId: String, Policy: String, PolicyName: String): typings.awsSdkClientKmsBrowser.typesPutKeyPolicyInputMod.PutKeyPolicyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesPutKeyPolicyInputMod.PutKeyPolicyInput]
    }
    
    @scala.inline
    def ReEncryptInput(CiphertextBlob: ArrayBuffer | ArrayBufferView | String, DestinationKeyId: String): typings.awsSdkClientKmsBrowser.typesReEncryptInputMod.ReEncryptInput = {
      val __obj = js.Dynamic.literal(CiphertextBlob = CiphertextBlob.asInstanceOf[js.Any], DestinationKeyId = DestinationKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesReEncryptInputMod.ReEncryptInput]
    }
    
    @scala.inline
    def RetireGrantInput(): typings.awsSdkClientKmsBrowser.typesRetireGrantInputMod.RetireGrantInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesRetireGrantInputMod.RetireGrantInput]
    }
    
    @scala.inline
    def RevokeGrantInput(GrantId: String, KeyId: String): typings.awsSdkClientKmsBrowser.typesRevokeGrantInputMod.RevokeGrantInput = {
      val __obj = js.Dynamic.literal(GrantId = GrantId.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesRevokeGrantInputMod.RevokeGrantInput]
    }
    
    @scala.inline
    def ScheduleKeyDeletionInput(KeyId: String): typings.awsSdkClientKmsBrowser.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput]
    }
    
    @scala.inline
    def TagResourceInput(KeyId: String, Tags: js.Array[Tag] | Iterable[Tag]): typings.awsSdkClientKmsBrowser.typesTagResourceInputMod.TagResourceInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesTagResourceInputMod.TagResourceInput]
    }
    
    @scala.inline
    def UntagResourceInput(KeyId: String, TagKeys: js.Array[String] | Iterable[String]): typings.awsSdkClientKmsBrowser.typesUntagResourceInputMod.UntagResourceInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesUntagResourceInputMod.UntagResourceInput]
    }
    
    @scala.inline
    def UpdateAliasInput(AliasName: String, TargetKeyId: String): typings.awsSdkClientKmsBrowser.typesUpdateAliasInputMod.UpdateAliasInput = {
      val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], TargetKeyId = TargetKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesUpdateAliasInputMod.UpdateAliasInput]
    }
    
    @scala.inline
    def UpdateKeyDescriptionInput(Description: String, KeyId: String): typings.awsSdkClientKmsBrowser.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput = {
      val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientKmsBrowser.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput]
    }
  }
}
