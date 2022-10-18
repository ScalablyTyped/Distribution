package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.typesRetireGrantExceptionsUnionMod.RetireGrantExceptionsUnion
import typings.awsSdkClientKmsBrowser.typesRevokeGrantExceptionsUnionMod.RevokeGrantExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidGrantIdExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidGrantIdExceptionDetails> * / any */ trait InvalidGrantIdException
    extends StObject
       with RetireGrantExceptionsUnion
       with RevokeGrantExceptionsUnion {
    
    var name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidGrantIdException
  }
  object InvalidGrantIdException {
    
    inline def apply(): InvalidGrantIdException = {
      val __obj = js.Dynamic.literal(name = "InvalidGrantIdException")
      __obj.asInstanceOf[InvalidGrantIdException]
    }
    
    extension [Self <: InvalidGrantIdException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidGrantIdException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidGrantIdExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object InvalidGrantIdExceptionDetails {
    
    inline def apply(): InvalidGrantIdExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidGrantIdExceptionDetails]
    }
    
    extension [Self <: InvalidGrantIdExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
