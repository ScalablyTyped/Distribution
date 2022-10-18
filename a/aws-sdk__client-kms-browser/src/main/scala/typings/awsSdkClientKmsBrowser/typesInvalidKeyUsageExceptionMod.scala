package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.typesEncryptExceptionsUnionMod.EncryptExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesGenerateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesGenerateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesReEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
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
    
    var name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidKeyUsageException
  }
  object InvalidKeyUsageException {
    
    inline def apply(): InvalidKeyUsageException = {
      val __obj = js.Dynamic.literal(name = "InvalidKeyUsageException")
      __obj.asInstanceOf[InvalidKeyUsageException]
    }
    
    extension [Self <: InvalidKeyUsageException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidKeyUsageException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
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
    
    extension [Self <: InvalidKeyUsageExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
