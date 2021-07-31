package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.updateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIndexNotFoundExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_IndexNotFoundExceptionDetails> * / any */ trait IndexNotFoundException
    extends StObject
       with UpdateGlobalTableSettingsExceptionsUnion {
    
    var name: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.IndexNotFoundException
  }
  object IndexNotFoundException {
    
    @scala.inline
    def apply(): IndexNotFoundException = {
      val __obj = js.Dynamic.literal(name = "IndexNotFoundException")
      __obj.asInstanceOf[IndexNotFoundException]
    }
    
    @scala.inline
    implicit class IndexNotFoundExceptionMutableBuilder[Self <: IndexNotFoundException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.IndexNotFoundException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait IndexNotFoundExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object IndexNotFoundExceptionDetails {
    
    @scala.inline
    def apply(): IndexNotFoundExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndexNotFoundExceptionDetails]
    }
    
    @scala.inline
    implicit class IndexNotFoundExceptionDetailsMutableBuilder[Self <: IndexNotFoundExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
