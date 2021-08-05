package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.createGlobalTableExceptionsUnionMod.CreateGlobalTableExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGlobalTableAlreadyExistsExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_GlobalTableAlreadyExistsExceptionDetails> * / any */ trait GlobalTableAlreadyExistsException
    extends StObject
       with CreateGlobalTableExceptionsUnion {
    
    var name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.GlobalTableAlreadyExistsException
  }
  object GlobalTableAlreadyExistsException {
    
    inline def apply(): GlobalTableAlreadyExistsException = {
      val __obj = js.Dynamic.literal(name = "GlobalTableAlreadyExistsException")
      __obj.asInstanceOf[GlobalTableAlreadyExistsException]
    }
    
    extension [Self <: GlobalTableAlreadyExistsException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.GlobalTableAlreadyExistsException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GlobalTableAlreadyExistsExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object GlobalTableAlreadyExistsExceptionDetails {
    
    inline def apply(): GlobalTableAlreadyExistsExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalTableAlreadyExistsExceptionDetails]
    }
    
    extension [Self <: GlobalTableAlreadyExistsExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
