package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.retireGrantExceptionsUnionMod.RetireGrantExceptionsUnion
import typings.awsSdkClientKmsNode.revokeGrantExceptionsUnionMod.RevokeGrantExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidGrantIdExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidGrantIdExceptionDetails> * / any */ @js.native
  trait InvalidGrantIdException
    extends RetireGrantExceptionsUnion
       with RevokeGrantExceptionsUnion {
    
    var name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidGrantIdException = js.native
  }
  object InvalidGrantIdException {
    
    @scala.inline
    def apply(name: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidGrantIdException): InvalidGrantIdException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidGrantIdException]
    }
    
    @scala.inline
    implicit class InvalidGrantIdExceptionMutableBuilder[Self <: InvalidGrantIdException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidGrantIdException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InvalidGrantIdExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.native
  }
  object InvalidGrantIdExceptionDetails {
    
    @scala.inline
    def apply(): InvalidGrantIdExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidGrantIdExceptionDetails]
    }
    
    @scala.inline
    implicit class InvalidGrantIdExceptionDetailsMutableBuilder[Self <: InvalidGrantIdExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
