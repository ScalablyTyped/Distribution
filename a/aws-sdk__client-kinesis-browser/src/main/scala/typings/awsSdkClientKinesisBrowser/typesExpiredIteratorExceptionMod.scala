package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.getRecordsExceptionsUnionMod.GetRecordsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesExpiredIteratorExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ExpiredIteratorExceptionDetails> * / any */ trait ExpiredIteratorException
    extends StObject
       with GetRecordsExceptionsUnion {
    
    var name: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ExpiredIteratorException
  }
  object ExpiredIteratorException {
    
    @scala.inline
    def apply(): ExpiredIteratorException = {
      val __obj = js.Dynamic.literal(name = "ExpiredIteratorException")
      __obj.asInstanceOf[ExpiredIteratorException]
    }
    
    @scala.inline
    implicit class ExpiredIteratorExceptionMutableBuilder[Self <: ExpiredIteratorException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ExpiredIteratorException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExpiredIteratorExceptionDetails extends StObject {
    
    /**
      * <p>A message that provides information about the error.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object ExpiredIteratorExceptionDetails {
    
    @scala.inline
    def apply(): ExpiredIteratorExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpiredIteratorExceptionDetails]
    }
    
    @scala.inline
    implicit class ExpiredIteratorExceptionDetailsMutableBuilder[Self <: ExpiredIteratorExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
