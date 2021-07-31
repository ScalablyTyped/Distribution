package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.updateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReplicaAlreadyExistsExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ReplicaAlreadyExistsExceptionDetails> * / any */ trait ReplicaAlreadyExistsException
    extends StObject
       with UpdateGlobalTableExceptionsUnion {
    
    var name: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ReplicaAlreadyExistsException
  }
  object ReplicaAlreadyExistsException {
    
    @scala.inline
    def apply(): ReplicaAlreadyExistsException = {
      val __obj = js.Dynamic.literal(name = "ReplicaAlreadyExistsException")
      __obj.asInstanceOf[ReplicaAlreadyExistsException]
    }
    
    @scala.inline
    implicit class ReplicaAlreadyExistsExceptionMutableBuilder[Self <: ReplicaAlreadyExistsException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ReplicaAlreadyExistsException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReplicaAlreadyExistsExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object ReplicaAlreadyExistsExceptionDetails {
    
    @scala.inline
    def apply(): ReplicaAlreadyExistsExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicaAlreadyExistsExceptionDetails]
    }
    
    @scala.inline
    implicit class ReplicaAlreadyExistsExceptionDetailsMutableBuilder[Self <: ReplicaAlreadyExistsExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
