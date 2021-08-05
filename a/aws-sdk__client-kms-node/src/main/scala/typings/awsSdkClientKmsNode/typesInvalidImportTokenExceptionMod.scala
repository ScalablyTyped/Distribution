package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidImportTokenExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidImportTokenExceptionDetails> * / any */ trait InvalidImportTokenException
    extends StObject
       with ImportKeyMaterialExceptionsUnion {
    
    var name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidImportTokenException
  }
  object InvalidImportTokenException {
    
    inline def apply(): InvalidImportTokenException = {
      val __obj = js.Dynamic.literal(name = "InvalidImportTokenException")
      __obj.asInstanceOf[InvalidImportTokenException]
    }
    
    extension [Self <: InvalidImportTokenException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidImportTokenException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidImportTokenExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object InvalidImportTokenExceptionDetails {
    
    inline def apply(): InvalidImportTokenExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidImportTokenExceptionDetails]
    }
    
    extension [Self <: InvalidImportTokenExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
