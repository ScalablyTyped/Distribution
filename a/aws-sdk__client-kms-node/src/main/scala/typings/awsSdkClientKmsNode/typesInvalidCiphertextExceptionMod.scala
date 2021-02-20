package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.decryptExceptionsUnionMod.DecryptExceptionsUnion
import typings.awsSdkClientKmsNode.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typings.awsSdkClientKmsNode.reEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidCiphertextExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidCiphertextExceptionDetails> * / any */ @js.native
  trait InvalidCiphertextException
    extends DecryptExceptionsUnion
       with ImportKeyMaterialExceptionsUnion
       with ReEncryptExceptionsUnion {
    
    var name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidCiphertextException = js.native
  }
  object InvalidCiphertextException {
    
    @scala.inline
    def apply(name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidCiphertextException): InvalidCiphertextException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidCiphertextException]
    }
    
    @scala.inline
    implicit class InvalidCiphertextExceptionMutableBuilder[Self <: InvalidCiphertextException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidCiphertextException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InvalidCiphertextExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.native
  }
  object InvalidCiphertextExceptionDetails {
    
    @scala.inline
    def apply(): InvalidCiphertextExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidCiphertextExceptionDetails]
    }
    
    @scala.inline
    implicit class InvalidCiphertextExceptionDetailsMutableBuilder[Self <: InvalidCiphertextExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
