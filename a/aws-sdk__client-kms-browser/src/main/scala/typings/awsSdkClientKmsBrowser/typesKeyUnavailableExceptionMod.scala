package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.decryptExceptionsUnionMod.DecryptExceptionsUnion
import typings.awsSdkClientKmsBrowser.encryptExceptionsUnionMod.EncryptExceptionsUnion
import typings.awsSdkClientKmsBrowser.generateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typings.awsSdkClientKmsBrowser.generateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typings.awsSdkClientKmsBrowser.reEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKeyUnavailableExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_KeyUnavailableExceptionDetails> * / any */ trait KeyUnavailableException
    extends StObject
       with DecryptExceptionsUnion
       with EncryptExceptionsUnion
       with GenerateDataKeyExceptionsUnion
       with GenerateDataKeyWithoutPlaintextExceptionsUnion
       with ReEncryptExceptionsUnion {
    
    var name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.KeyUnavailableException
  }
  object KeyUnavailableException {
    
    inline def apply(): KeyUnavailableException = {
      val __obj = js.Dynamic.literal(name = "KeyUnavailableException")
      __obj.asInstanceOf[KeyUnavailableException]
    }
    
    extension [Self <: KeyUnavailableException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.KeyUnavailableException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyUnavailableExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object KeyUnavailableExceptionDetails {
    
    inline def apply(): KeyUnavailableExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyUnavailableExceptionDetails]
    }
    
    extension [Self <: KeyUnavailableExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
