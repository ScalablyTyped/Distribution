package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAlreadyExistsExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_AlreadyExistsExceptionDetails> * / any */ trait AlreadyExistsException
    extends StObject
       with CreateAliasExceptionsUnion {
    
    var name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.AlreadyExistsException
  }
  object AlreadyExistsException {
    
    inline def apply(): AlreadyExistsException = {
      val __obj = js.Dynamic.literal(name = "AlreadyExistsException")
      __obj.asInstanceOf[AlreadyExistsException]
    }
    
    extension [Self <: AlreadyExistsException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.AlreadyExistsException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait AlreadyExistsExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object AlreadyExistsExceptionDetails {
    
    inline def apply(): AlreadyExistsExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlreadyExistsExceptionDetails]
    }
    
    extension [Self <: AlreadyExistsExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
