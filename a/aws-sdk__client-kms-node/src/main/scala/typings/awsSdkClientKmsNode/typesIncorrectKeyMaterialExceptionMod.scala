package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIncorrectKeyMaterialExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_IncorrectKeyMaterialExceptionDetails> * / any */ trait IncorrectKeyMaterialException
    extends StObject
       with ImportKeyMaterialExceptionsUnion {
    
    var name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.IncorrectKeyMaterialException
  }
  object IncorrectKeyMaterialException {
    
    inline def apply(): IncorrectKeyMaterialException = {
      val __obj = js.Dynamic.literal(name = "IncorrectKeyMaterialException")
      __obj.asInstanceOf[IncorrectKeyMaterialException]
    }
    
    extension [Self <: IncorrectKeyMaterialException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.IncorrectKeyMaterialException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait IncorrectKeyMaterialExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object IncorrectKeyMaterialExceptionDetails {
    
    inline def apply(): IncorrectKeyMaterialExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IncorrectKeyMaterialExceptionDetails]
    }
    
    extension [Self <: IncorrectKeyMaterialExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
