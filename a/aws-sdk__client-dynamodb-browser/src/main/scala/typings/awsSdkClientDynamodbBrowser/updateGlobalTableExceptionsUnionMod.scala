package typings.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateGlobalTableExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
    - typings.awsSdkClientDynamodbBrowser.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException
    - typings.awsSdkClientDynamodbBrowser.typesReplicaAlreadyExistsExceptionMod.ReplicaAlreadyExistsException
    - typings.awsSdkClientDynamodbBrowser.typesReplicaNotFoundExceptionMod.ReplicaNotFoundException
    - typings.awsSdkClientDynamodbBrowser.typesTableNotFoundExceptionMod.TableNotFoundException
  */
  trait UpdateGlobalTableExceptionsUnion extends StObject
  object UpdateGlobalTableExceptionsUnion {
    
    inline def GlobalTableNotFoundException(): typings.awsSdkClientDynamodbBrowser.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException = {
      val __obj = js.Dynamic.literal(name = "GlobalTableNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesGlobalTableNotFoundExceptionMod.GlobalTableNotFoundException]
    }
    
    inline def InternalServerError(): typings.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError = {
      val __obj = js.Dynamic.literal(name = "InternalServerError")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError]
    }
    
    inline def ReplicaAlreadyExistsException(): typings.awsSdkClientDynamodbBrowser.typesReplicaAlreadyExistsExceptionMod.ReplicaAlreadyExistsException = {
      val __obj = js.Dynamic.literal(name = "ReplicaAlreadyExistsException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesReplicaAlreadyExistsExceptionMod.ReplicaAlreadyExistsException]
    }
    
    inline def ReplicaNotFoundException(): typings.awsSdkClientDynamodbBrowser.typesReplicaNotFoundExceptionMod.ReplicaNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ReplicaNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesReplicaNotFoundExceptionMod.ReplicaNotFoundException]
    }
    
    inline def TableNotFoundException(): typings.awsSdkClientDynamodbBrowser.typesTableNotFoundExceptionMod.TableNotFoundException = {
      val __obj = js.Dynamic.literal(name = "TableNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesTableNotFoundExceptionMod.TableNotFoundException]
    }
  }
}
