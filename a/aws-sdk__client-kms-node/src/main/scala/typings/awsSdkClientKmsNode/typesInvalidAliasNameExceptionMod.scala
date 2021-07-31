package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidAliasNameExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidAliasNameExceptionDetails> * / any */ trait InvalidAliasNameException
    extends StObject
       with CreateAliasExceptionsUnion {
    
    var name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidAliasNameException
  }
  object InvalidAliasNameException {
    
    @scala.inline
    def apply(): InvalidAliasNameException = {
      val __obj = js.Dynamic.literal(name = "InvalidAliasNameException")
      __obj.asInstanceOf[InvalidAliasNameException]
    }
    
    @scala.inline
    implicit class InvalidAliasNameExceptionMutableBuilder[Self <: InvalidAliasNameException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidAliasNameException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidAliasNameExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.undefined
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
