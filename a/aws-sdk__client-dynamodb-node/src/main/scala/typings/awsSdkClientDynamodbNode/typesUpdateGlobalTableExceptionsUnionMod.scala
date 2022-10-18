package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateGlobalTableExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
    - typings.awsSdkClientDynamodbNode.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException
    - typings.awsSdkClientDynamodbNode.typesReplicaAlreadyExistsExceptionMod.ReplicaAlreadyExistsException
    - typings.awsSdkClientDynamodbNode.typesReplicaNotFoundExceptionMod.ReplicaNotFoundException
    - typings.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException
  */
  trait UpdateGlobalTableExceptionsUnion extends StObject
  object UpdateGlobalTableExceptionsUnion {
    
    inline def GlobalTableNotFoundException(): typings.awsSdkClientDynamodbNode.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException = {
      val __obj = js.Dynamic.literal(name = "GlobalTableNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException]
    }
    
    inline def InternalServerError(): typings.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError = {
      val __obj = js.Dynamic.literal(name = "InternalServerError")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError]
    }
    
    inline def ReplicaAlreadyExistsException(): typings.awsSdkClientDynamodbNode.typesReplicaAlreadyExistsExceptionMod.ReplicaAlreadyExistsException = {
      val __obj = js.Dynamic.literal(name = "ReplicaAlreadyExistsException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesReplicaAlreadyExistsExceptionMod.ReplicaAlreadyExistsException]
    }
    
    inline def ReplicaNotFoundException(): typings.awsSdkClientDynamodbNode.typesReplicaNotFoundExceptionMod.ReplicaNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ReplicaNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesReplicaNotFoundExceptionMod.ReplicaNotFoundException]
    }
    
    inline def TableNotFoundException(): typings.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException = {
      val __obj = js.Dynamic.literal(name = "TableNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException]
    }
  }
}
