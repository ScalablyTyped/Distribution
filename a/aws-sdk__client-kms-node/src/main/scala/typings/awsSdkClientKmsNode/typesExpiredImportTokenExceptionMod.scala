package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesExpiredImportTokenExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ExpiredImportTokenExceptionDetails> * / any */ trait ExpiredImportTokenException
    extends StObject
       with ImportKeyMaterialExceptionsUnion {
    
    var name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.ExpiredImportTokenException
  }
  object ExpiredImportTokenException {
    
    inline def apply(): ExpiredImportTokenException = {
      val __obj = js.Dynamic.literal(name = "ExpiredImportTokenException")
      __obj.asInstanceOf[ExpiredImportTokenException]
    }
    
    extension [Self <: ExpiredImportTokenException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.ExpiredImportTokenException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExpiredImportTokenExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object ExpiredImportTokenExceptionDetails {
    
    inline def apply(): ExpiredImportTokenExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpiredImportTokenExceptionDetails]
    }
    
    extension [Self <: ExpiredImportTokenExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
