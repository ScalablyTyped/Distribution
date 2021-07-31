package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.createGlobalTableExceptionsUnionMod.CreateGlobalTableExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGlobalTableAlreadyExistsExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_GlobalTableAlreadyExistsExceptionDetails> * / any */ trait GlobalTableAlreadyExistsException
    extends StObject
       with CreateGlobalTableExceptionsUnion {
    
    var name: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.GlobalTableAlreadyExistsException
  }
  object GlobalTableAlreadyExistsException {
    
    @scala.inline
    def apply(): GlobalTableAlreadyExistsException = {
      val __obj = js.Dynamic.literal(name = "GlobalTableAlreadyExistsException")
      __obj.asInstanceOf[GlobalTableAlreadyExistsException]
    }
    
    @scala.inline
    implicit class GlobalTableAlreadyExistsExceptionMutableBuilder[Self <: GlobalTableAlreadyExistsException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.GlobalTableAlreadyExistsException
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
    
    @scala.inline
    def apply(): GlobalTableAlreadyExistsExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalTableAlreadyExistsExceptionDetails]
    }
    
    @scala.inline
    implicit class GlobalTableAlreadyExistsExceptionDetailsMutableBuilder[Self <: GlobalTableAlreadyExistsExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
