package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.typesListShardsExceptionsUnionMod.ListShardsExceptionsUnion
import typings.awsSdkClientKinesisBrowser.typesListStreamConsumersExceptionsUnionMod.ListStreamConsumersExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesExpiredNextTokenExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ExpiredNextTokenExceptionDetails> * / any */ trait ExpiredNextTokenException
    extends StObject
       with ListShardsExceptionsUnion
       with ListStreamConsumersExceptionsUnion {
    
    var name: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ExpiredNextTokenException
  }
  object ExpiredNextTokenException {
    
    inline def apply(): ExpiredNextTokenException = {
      val __obj = js.Dynamic.literal(name = "ExpiredNextTokenException")
      __obj.asInstanceOf[ExpiredNextTokenException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpiredNextTokenException] (val x: Self) extends AnyVal {
      
      inline def setName(
        value: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ExpiredNextTokenException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExpiredNextTokenExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object ExpiredNextTokenExceptionDetails {
    
    inline def apply(): ExpiredNextTokenExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpiredNextTokenExceptionDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpiredNextTokenExceptionDetails] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
