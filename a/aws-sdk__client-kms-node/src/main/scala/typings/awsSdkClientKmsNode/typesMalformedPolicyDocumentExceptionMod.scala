package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.createKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typings.awsSdkClientKmsNode.putKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMalformedPolicyDocumentExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_MalformedPolicyDocumentExceptionDetails> * / any */ trait MalformedPolicyDocumentException
    extends StObject
       with CreateKeyExceptionsUnion
       with PutKeyPolicyExceptionsUnion {
    
    var name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.MalformedPolicyDocumentException
  }
  object MalformedPolicyDocumentException {
    
    inline def apply(): MalformedPolicyDocumentException = {
      val __obj = js.Dynamic.literal(name = "MalformedPolicyDocumentException")
      __obj.asInstanceOf[MalformedPolicyDocumentException]
    }
    
    extension [Self <: MalformedPolicyDocumentException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.MalformedPolicyDocumentException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
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
    
    extension [Self <: MalformedPolicyDocumentExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
