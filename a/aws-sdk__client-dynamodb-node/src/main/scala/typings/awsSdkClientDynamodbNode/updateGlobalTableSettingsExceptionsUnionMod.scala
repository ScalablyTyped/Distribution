package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateGlobalTableSettingsExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientDynamodbNode.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException
    - typings.awsSdkClientDynamodbNode.typesReplicaNotFoundExceptionMod.ReplicaNotFoundException
    - typings.awsSdkClientDynamodbNode.typesIndexNotFoundExceptionMod.IndexNotFoundException
    - typings.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException
    - typings.awsSdkClientDynamodbNode.typesResourceInUseExceptionMod.ResourceInUseException
    - typings.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
  */
  trait UpdateGlobalTableSettingsExceptionsUnion extends StObject
  object UpdateGlobalTableSettingsExceptionsUnion {
    
    @scala.inline
    def GlobalTableNotFoundException(): typings.awsSdkClientDynamodbNode.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException = {
      val __obj = js.Dynamic.literal(name = "GlobalTableNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException]
    }
    
    @scala.inline
    def IndexNotFoundException(): typings.awsSdkClientDynamodbNode.typesIndexNotFoundExceptionMod.IndexNotFoundException = {
      val __obj = js.Dynamic.literal(name = "IndexNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesIndexNotFoundExceptionMod.IndexNotFoundException]
    }
    
    @scala.inline
    def InternalServerError(): typings.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError = {
      val __obj = js.Dynamic.literal(name = "InternalServerError")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError]
    }
    
    @scala.inline
    def LimitExceededException(): typings.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = "LimitExceededException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    @scala.inline
    def ReplicaNotFoundException(): typings.awsSdkClientDynamodbNode.typesReplicaNotFoundExceptionMod.ReplicaNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ReplicaNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesReplicaNotFoundExceptionMod.ReplicaNotFoundException]
    }
    
    @scala.inline
    def ResourceInUseException(): typings.awsSdkClientDynamodbNode.typesResourceInUseExceptionMod.ResourceInUseException = {
      val __obj = js.Dynamic.literal(name = "ResourceInUseException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesResourceInUseExceptionMod.ResourceInUseException]
    }
  }
}
