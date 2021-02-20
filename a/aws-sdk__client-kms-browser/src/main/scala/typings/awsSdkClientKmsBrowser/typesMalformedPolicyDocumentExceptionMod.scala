package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.createKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typings.awsSdkClientKmsBrowser.putKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMalformedPolicyDocumentExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_MalformedPolicyDocumentExceptionDetails> * / any */ @js.native
  trait MalformedPolicyDocumentException
    extends CreateKeyExceptionsUnion
       with PutKeyPolicyExceptionsUnion {
    
    var name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.MalformedPolicyDocumentException = js.native
  }
  object MalformedPolicyDocumentException {
    
    @scala.inline
    def apply(
      name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.MalformedPolicyDocumentException
    ): MalformedPolicyDocumentException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MalformedPolicyDocumentException]
    }
    
    @scala.inline
    implicit class MalformedPolicyDocumentExceptionMutableBuilder[Self <: MalformedPolicyDocumentException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.MalformedPolicyDocumentException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MalformedPolicyDocumentExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.native
  }
  object MalformedPolicyDocumentExceptionDetails {
    
    @scala.inline
    def apply(): MalformedPolicyDocumentExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MalformedPolicyDocumentExceptionDetails]
    }
    
    @scala.inline
    implicit class MalformedPolicyDocumentExceptionDetailsMutableBuilder[Self <: MalformedPolicyDocumentExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
