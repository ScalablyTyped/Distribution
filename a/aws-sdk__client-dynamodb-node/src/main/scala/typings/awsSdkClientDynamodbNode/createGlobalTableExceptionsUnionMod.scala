package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createGlobalTableExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException
    - typings.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
    - typings.awsSdkClientDynamodbNode.typesGlobalTableAlreadyExistsExceptionMod.GlobalTableAlreadyExistsException
    - typings.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException
  */
  trait CreateGlobalTableExceptionsUnion extends StObject
  object CreateGlobalTableExceptionsUnion {
    
    inline def GlobalTableAlreadyExistsException(): typings.awsSdkClientDynamodbNode.typesGlobalTableAlreadyExistsExceptionMod.GlobalTableAlreadyExistsException = {
      val __obj = js.Dynamic.literal(name = "GlobalTableAlreadyExistsException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesGlobalTableAlreadyExistsExceptionMod.GlobalTableAlreadyExistsException]
    }
    
    inline def InternalServerError(): typings.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError = {
      val __obj = js.Dynamic.literal(name = "InternalServerError")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError]
    }
    
    inline def LimitExceededException(): typings.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = "LimitExceededException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    inline def TableNotFoundException(): typings.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException = {
      val __obj = js.Dynamic.literal(name = "TableNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException]
    }
  }
}
