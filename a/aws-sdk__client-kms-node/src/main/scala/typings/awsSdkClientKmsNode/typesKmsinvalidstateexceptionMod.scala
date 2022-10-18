package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.typesCancelKeyDeletionExceptionsUnionMod.CancelKeyDeletionExceptionsUnion
import typings.awsSdkClientKmsNode.typesCreateAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typings.awsSdkClientKmsNode.typesCreateGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typings.awsSdkClientKmsNode.typesDecryptExceptionsUnionMod.DecryptExceptionsUnion
import typings.awsSdkClientKmsNode.typesDeleteAliasExceptionsUnionMod.DeleteAliasExceptionsUnion
import typings.awsSdkClientKmsNode.typesDeleteImportedKeyMaterialExceptionsUnionMod.DeleteImportedKeyMaterialExceptionsUnion
import typings.awsSdkClientKmsNode.typesDisableKeyExceptionsUnionMod.DisableKeyExceptionsUnion
import typings.awsSdkClientKmsNode.typesDisableKeyRotationExceptionsUnionMod.DisableKeyRotationExceptionsUnion
import typings.awsSdkClientKmsNode.typesEnableKeyExceptionsUnionMod.EnableKeyExceptionsUnion
import typings.awsSdkClientKmsNode.typesEnableKeyRotationExceptionsUnionMod.EnableKeyRotationExceptionsUnion
import typings.awsSdkClientKmsNode.typesEncryptExceptionsUnionMod.EncryptExceptionsUnion
import typings.awsSdkClientKmsNode.typesGenerateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typings.awsSdkClientKmsNode.typesGenerateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typings.awsSdkClientKmsNode.typesGetKeyPolicyExceptionsUnionMod.GetKeyPolicyExceptionsUnion
import typings.awsSdkClientKmsNode.typesGetKeyRotationStatusExceptionsUnionMod.GetKeyRotationStatusExceptionsUnion
import typings.awsSdkClientKmsNode.typesGetParametersForImportExceptionsUnionMod.GetParametersForImportExceptionsUnion
import typings.awsSdkClientKmsNode.typesImportKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typings.awsSdkClientKmsNode.typesListGrantsExceptionsUnionMod.ListGrantsExceptionsUnion
import typings.awsSdkClientKmsNode.typesListKeyPoliciesExceptionsUnionMod.ListKeyPoliciesExceptionsUnion
import typings.awsSdkClientKmsNode.typesPutKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import typings.awsSdkClientKmsNode.typesReEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typings.awsSdkClientKmsNode.typesRetireGrantExceptionsUnionMod.RetireGrantExceptionsUnion
import typings.awsSdkClientKmsNode.typesRevokeGrantExceptionsUnionMod.RevokeGrantExceptionsUnion
import typings.awsSdkClientKmsNode.typesScheduleKeyDeletionExceptionsUnionMod.ScheduleKeyDeletionExceptionsUnion
import typings.awsSdkClientKmsNode.typesTagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.awsSdkClientKmsNode.typesUntagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typings.awsSdkClientKmsNode.typesUpdateAliasExceptionsUnionMod.UpdateAliasExceptionsUnion
import typings.awsSdkClientKmsNode.typesUpdateKeyDescriptionExceptionsUnionMod.UpdateKeyDescriptionExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKmsinvalidstateexceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_KMSInvalidStateExceptionDetails> * / any */ trait KMSInvalidStateException
    extends StObject
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
    
    var name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.KMSInvalidStateException
  }
  object KMSInvalidStateException {
    
    inline def apply(): KMSInvalidStateException = {
      val __obj = js.Dynamic.literal(name = "KMSInvalidStateException")
      __obj.asInstanceOf[KMSInvalidStateException]
    }
    
    extension [Self <: KMSInvalidStateException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.KMSInvalidStateException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait KMSInvalidStateExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object KMSInvalidStateExceptionDetails {
    
    inline def apply(): KMSInvalidStateExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KMSInvalidStateExceptionDetails]
    }
    
    extension [Self <: KMSInvalidStateExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
