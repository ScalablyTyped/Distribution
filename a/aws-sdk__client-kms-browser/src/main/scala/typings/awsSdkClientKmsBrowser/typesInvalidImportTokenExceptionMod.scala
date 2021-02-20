package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidImportTokenExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidImportTokenExceptionDetails> * / any */ @js.native
  trait InvalidImportTokenException extends ImportKeyMaterialExceptionsUnion {
    
    var name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidImportTokenException = js.native
  }
  object InvalidImportTokenException {
    
    @scala.inline
    def apply(name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidImportTokenException): InvalidImportTokenException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidImportTokenException]
    }
    
    @scala.inline
    implicit class InvalidImportTokenExceptionMutableBuilder[Self <: InvalidImportTokenException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidImportTokenException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InvalidImportTokenExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.native
  }
  object InvalidImportTokenExceptionDetails {
    
    @scala.inline
    def apply(): InvalidImportTokenExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidImportTokenExceptionDetails]
    }
    
    @scala.inline
    implicit class InvalidImportTokenExceptionDetailsMutableBuilder[Self <: InvalidImportTokenExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
