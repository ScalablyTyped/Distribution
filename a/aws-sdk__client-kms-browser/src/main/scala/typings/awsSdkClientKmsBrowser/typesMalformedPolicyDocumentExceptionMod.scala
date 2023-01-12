package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.typesCreateKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesPutKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMalformedPolicyDocumentExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_MalformedPolicyDocumentExceptionDetails> * / any */ trait MalformedPolicyDocumentException
    extends StObject
       with CreateKeyExceptionsUnion
       with PutKeyPolicyExceptionsUnion {
    
    var name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.MalformedPolicyDocumentException
  }
  object MalformedPolicyDocumentException {
    
    inline def apply(): MalformedPolicyDocumentException = {
      val __obj = js.Dynamic.literal(name = "MalformedPolicyDocumentException")
      __obj.asInstanceOf[MalformedPolicyDocumentException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MalformedPolicyDocumentException] (val x: Self) extends AnyVal {
      
      inline def setName(
        value: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.MalformedPolicyDocumentException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MalformedPolicyDocumentExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object MalformedPolicyDocumentExceptionDetails {
    
    inline def apply(): MalformedPolicyDocumentExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MalformedPolicyDocumentExceptionDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MalformedPolicyDocumentExceptionDetails] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
