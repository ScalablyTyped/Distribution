package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidAliasNameExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidAliasNameExceptionDetails> * / any */ @js.native
  trait InvalidAliasNameException extends CreateAliasExceptionsUnion {
    
    var name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidAliasNameException = js.native
  }
  object InvalidAliasNameException {
    
    @scala.inline
    def apply(name: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidAliasNameException): InvalidAliasNameException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidAliasNameException]
    }
    
    @scala.inline
    implicit class InvalidAliasNameExceptionMutableBuilder[Self <: InvalidAliasNameException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidAliasNameException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InvalidAliasNameExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.native
  }
  object InvalidAliasNameExceptionDetails {
    
    @scala.inline
    def apply(): InvalidAliasNameExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidAliasNameExceptionDetails]
    }
    
    @scala.inline
    implicit class InvalidAliasNameExceptionDetailsMutableBuilder[Self <: InvalidAliasNameExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
