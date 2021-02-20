package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIncorrectKeyMaterialExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_IncorrectKeyMaterialExceptionDetails> * / any */ @js.native
  trait IncorrectKeyMaterialException extends ImportKeyMaterialExceptionsUnion {
    
    var name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.IncorrectKeyMaterialException = js.native
  }
  object IncorrectKeyMaterialException {
    
    @scala.inline
    def apply(name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.IncorrectKeyMaterialException): IncorrectKeyMaterialException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncorrectKeyMaterialException]
    }
    
    @scala.inline
    implicit class IncorrectKeyMaterialExceptionMutableBuilder[Self <: IncorrectKeyMaterialException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.IncorrectKeyMaterialException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IncorrectKeyMaterialExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.native
  }
  object IncorrectKeyMaterialExceptionDetails {
    
    @scala.inline
    def apply(): IncorrectKeyMaterialExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IncorrectKeyMaterialExceptionDetails]
    }
    
    @scala.inline
    implicit class IncorrectKeyMaterialExceptionDetailsMutableBuilder[Self <: IncorrectKeyMaterialExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
