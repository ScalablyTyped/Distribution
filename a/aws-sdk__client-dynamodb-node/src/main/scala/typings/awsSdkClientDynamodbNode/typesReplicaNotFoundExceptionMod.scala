package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.updateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import typings.awsSdkClientDynamodbNode.updateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReplicaNotFoundExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ReplicaNotFoundExceptionDetails> * / any */ trait ReplicaNotFoundException
    extends StObject
       with UpdateGlobalTableExceptionsUnion
       with UpdateGlobalTableSettingsExceptionsUnion {
    
    var name: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ReplicaNotFoundException
  }
  object ReplicaNotFoundException {
    
    @scala.inline
    def apply(): ReplicaNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ReplicaNotFoundException")
      __obj.asInstanceOf[ReplicaNotFoundException]
    }
    
    @scala.inline
    implicit class ReplicaNotFoundExceptionMutableBuilder[Self <: ReplicaNotFoundException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ReplicaNotFoundException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReplicaNotFoundExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object ReplicaNotFoundExceptionDetails {
    
    @scala.inline
    def apply(): ReplicaNotFoundExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicaNotFoundExceptionDetails]
    }
    
    @scala.inline
    implicit class ReplicaNotFoundExceptionDetailsMutableBuilder[Self <: ReplicaNotFoundExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
