package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.typesCreateKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typings.awsSdkClientKmsNode.typesDeleteImportedKeyMaterialExceptionsUnionMod.DeleteImportedKeyMaterialExceptionsUnion
import typings.awsSdkClientKmsNode.typesDisableKeyRotationExceptionsUnionMod.DisableKeyRotationExceptionsUnion
import typings.awsSdkClientKmsNode.typesEnableKeyRotationExceptionsUnionMod.EnableKeyRotationExceptionsUnion
import typings.awsSdkClientKmsNode.typesGetKeyRotationStatusExceptionsUnionMod.GetKeyRotationStatusExceptionsUnion
import typings.awsSdkClientKmsNode.typesGetParametersForImportExceptionsUnionMod.GetParametersForImportExceptionsUnion
import typings.awsSdkClientKmsNode.typesImportKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typings.awsSdkClientKmsNode.typesPutKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUnsupportedOperationExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_UnsupportedOperationExceptionDetails> * / any */ trait UnsupportedOperationException
    extends StObject
       with CreateKeyExceptionsUnion
       with DeleteImportedKeyMaterialExceptionsUnion
       with DisableKeyRotationExceptionsUnion
       with EnableKeyRotationExceptionsUnion
       with GetKeyRotationStatusExceptionsUnion
       with GetParametersForImportExceptionsUnion
       with ImportKeyMaterialExceptionsUnion
       with PutKeyPolicyExceptionsUnion {
    
    var name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.UnsupportedOperationException
  }
  object UnsupportedOperationException {
    
    inline def apply(): UnsupportedOperationException = {
      val __obj = js.Dynamic.literal(name = "UnsupportedOperationException")
      __obj.asInstanceOf[UnsupportedOperationException]
    }
    
    extension [Self <: UnsupportedOperationException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.UnsupportedOperationException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnsupportedOperationExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object UnsupportedOperationExceptionDetails {
    
    inline def apply(): UnsupportedOperationExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnsupportedOperationExceptionDetails]
    }
    
    extension [Self <: UnsupportedOperationExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
