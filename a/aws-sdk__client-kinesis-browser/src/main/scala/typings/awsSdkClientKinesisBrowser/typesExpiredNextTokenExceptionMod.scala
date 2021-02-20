package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.listShardsExceptionsUnionMod.ListShardsExceptionsUnion
import typings.awsSdkClientKinesisBrowser.listStreamConsumersExceptionsUnionMod.ListStreamConsumersExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesExpiredNextTokenExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ExpiredNextTokenExceptionDetails> * / any */ @js.native
  trait ExpiredNextTokenException
    extends ListShardsExceptionsUnion
       with ListStreamConsumersExceptionsUnion {
    
    var name: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ExpiredNextTokenException = js.native
  }
  object ExpiredNextTokenException {
    
    @scala.inline
    def apply(
      name: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ExpiredNextTokenException
    ): ExpiredNextTokenException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpiredNextTokenException]
    }
    
    @scala.inline
    implicit class ExpiredNextTokenExceptionMutableBuilder[Self <: ExpiredNextTokenException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ExpiredNextTokenException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExpiredNextTokenExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var message: js.UndefOr[String] = js.native
  }
  object ExpiredNextTokenExceptionDetails {
    
    @scala.inline
    def apply(): ExpiredNextTokenExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpiredNextTokenExceptionDetails]
    }
    
    @scala.inline
    implicit class ExpiredNextTokenExceptionDetailsMutableBuilder[Self <: ExpiredNextTokenExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
