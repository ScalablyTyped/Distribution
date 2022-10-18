package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.typesCancelKeyDeletionExceptionsUnionMod.CancelKeyDeletionExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesCreateAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesCreateGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesCreateKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesDecryptExceptionsUnionMod.DecryptExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesDeleteAliasExceptionsUnionMod.DeleteAliasExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesDeleteImportedKeyMaterialExceptionsUnionMod.DeleteImportedKeyMaterialExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesDescribeKeyExceptionsUnionMod.DescribeKeyExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesDisableKeyExceptionsUnionMod.DisableKeyExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesDisableKeyRotationExceptionsUnionMod.DisableKeyRotationExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesEnableKeyExceptionsUnionMod.EnableKeyExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesEnableKeyRotationExceptionsUnionMod.EnableKeyRotationExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesEncryptExceptionsUnionMod.EncryptExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesGenerateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesGenerateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesGenerateRandomExceptionsUnionMod.GenerateRandomExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesGetKeyPolicyExceptionsUnionMod.GetKeyPolicyExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesGetKeyRotationStatusExceptionsUnionMod.GetKeyRotationStatusExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesGetParametersForImportExceptionsUnionMod.GetParametersForImportExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesImportKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesListAliasesExceptionsUnionMod.ListAliasesExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesListGrantsExceptionsUnionMod.ListGrantsExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesListKeyPoliciesExceptionsUnionMod.ListKeyPoliciesExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesListKeysExceptionsUnionMod.ListKeysExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesListResourceTagsExceptionsUnionMod.ListResourceTagsExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesListRetirableGrantsExceptionsUnionMod.ListRetirableGrantsExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesPutKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesReEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesRetireGrantExceptionsUnionMod.RetireGrantExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesRevokeGrantExceptionsUnionMod.RevokeGrantExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesScheduleKeyDeletionExceptionsUnionMod.ScheduleKeyDeletionExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesTagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesUntagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesUpdateAliasExceptionsUnionMod.UpdateAliasExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesUpdateKeyDescriptionExceptionsUnionMod.UpdateKeyDescriptionExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKmsinternalexceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_KMSInternalExceptionDetails> * / any */ trait KMSInternalException
    extends StObject
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
       with ListResourceTagsExceptionsUnion
       with ListRetirableGrantsExceptionsUnion
       with PutKeyPolicyExceptionsUnion
       with ReEncryptExceptionsUnion
       with RetireGrantExceptionsUnion
       with RevokeGrantExceptionsUnion
       with ScheduleKeyDeletionExceptionsUnion
       with TagResourceExceptionsUnion
       with UntagResourceExceptionsUnion
       with UpdateAliasExceptionsUnion
       with UpdateKeyDescriptionExceptionsUnion {
    
    var name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.KMSInternalException
  }
  object KMSInternalException {
    
    inline def apply(): KMSInternalException = {
      val __obj = js.Dynamic.literal(name = "KMSInternalException")
      __obj.asInstanceOf[KMSInternalException]
    }
    
    extension [Self <: KMSInternalException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.KMSInternalException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait KMSInternalExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object KMSInternalExceptionDetails {
    
    inline def apply(): KMSInternalExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KMSInternalExceptionDetails]
    }
    
    extension [Self <: KMSInternalExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
