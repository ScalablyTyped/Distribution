package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.typesCreateGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typings.awsSdkClientKmsNode.typesDecryptExceptionsUnionMod.DecryptExceptionsUnion
import typings.awsSdkClientKmsNode.typesDisableKeyRotationExceptionsUnionMod.DisableKeyRotationExceptionsUnion
import typings.awsSdkClientKmsNode.typesEnableKeyRotationExceptionsUnionMod.EnableKeyRotationExceptionsUnion
import typings.awsSdkClientKmsNode.typesEncryptExceptionsUnionMod.EncryptExceptionsUnion
import typings.awsSdkClientKmsNode.typesGenerateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typings.awsSdkClientKmsNode.typesGenerateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typings.awsSdkClientKmsNode.typesReEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDisabledExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_DisabledExceptionDetails> * / any */ trait DisabledException
    extends StObject
       with CreateGrantExceptionsUnion
       with DecryptExceptionsUnion
       with DisableKeyRotationExceptionsUnion
       with EnableKeyRotationExceptionsUnion
       with EncryptExceptionsUnion
       with GenerateDataKeyExceptionsUnion
       with GenerateDataKeyWithoutPlaintextExceptionsUnion
       with ReEncryptExceptionsUnion {
    
    var name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.DisabledException
  }
  object DisabledException {
    
    inline def apply(): DisabledException = {
      val __obj = js.Dynamic.literal(name = "DisabledException")
      __obj.asInstanceOf[DisabledException]
    }
    
    extension [Self <: DisabledException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.DisabledException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait DisabledExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object DisabledExceptionDetails {
    
    inline def apply(): DisabledExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisabledExceptionDetails]
    }
    
    extension [Self <: DisabledExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
