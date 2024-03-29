package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.typesEncryptExceptionsUnionMod.EncryptExceptionsUnion
import typings.awsSdkClientKmsNode.typesGenerateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typings.awsSdkClientKmsNode.typesGenerateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typings.awsSdkClientKmsNode.typesReEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidKeyUsageExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidKeyUsageExceptionDetails> * / any */ trait InvalidKeyUsageException
    extends StObject
       with EncryptExceptionsUnion
       with GenerateDataKeyExceptionsUnion
       with GenerateDataKeyWithoutPlaintextExceptionsUnion
       with ReEncryptExceptionsUnion {
    
    var name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidKeyUsageException
  }
  object InvalidKeyUsageException {
    
    inline def apply(): InvalidKeyUsageException = {
      val __obj = js.Dynamic.literal(name = "InvalidKeyUsageException")
      __obj.asInstanceOf[InvalidKeyUsageException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvalidKeyUsageException] (val x: Self) extends AnyVal {
      
      inline def setName(value: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidKeyUsageException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidKeyUsageExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object InvalidKeyUsageExceptionDetails {
    
    inline def apply(): InvalidKeyUsageExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidKeyUsageExceptionDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvalidKeyUsageExceptionDetails] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
