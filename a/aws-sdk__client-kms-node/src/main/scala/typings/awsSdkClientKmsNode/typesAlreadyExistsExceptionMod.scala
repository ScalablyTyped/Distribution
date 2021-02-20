package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAlreadyExistsExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_AlreadyExistsExceptionDetails> * / any */ @js.native
  trait AlreadyExistsException extends CreateAliasExceptionsUnion {
    
    var name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.AlreadyExistsException = js.native
  }
  object AlreadyExistsException {
    
    @scala.inline
    def apply(name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.AlreadyExistsException): AlreadyExistsException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlreadyExistsException]
    }
    
    @scala.inline
    implicit class AlreadyExistsExceptionMutableBuilder[Self <: AlreadyExistsException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.AlreadyExistsException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AlreadyExistsExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.native
  }
  object AlreadyExistsExceptionDetails {
    
    @scala.inline
    def apply(): AlreadyExistsExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlreadyExistsExceptionDetails]
    }
    
    @scala.inline
    implicit class AlreadyExistsExceptionDetailsMutableBuilder[Self <: AlreadyExistsExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
