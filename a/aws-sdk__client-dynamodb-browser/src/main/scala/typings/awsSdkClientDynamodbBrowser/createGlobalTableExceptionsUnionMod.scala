package typings.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createGlobalTableExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException
    - typings.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
    - typings.awsSdkClientDynamodbBrowser.typesGlobalTableAlreadyExistsExceptionMod.GlobalTableAlreadyExistsException
    - typings.awsSdkClientDynamodbBrowser.typesTableNotFoundExceptionMod.TableNotFoundException
  */
  trait CreateGlobalTableExceptionsUnion extends StObject
  object CreateGlobalTableExceptionsUnion {
    
    inline def GlobalTableAlreadyExistsException(): typings.awsSdkClientDynamodbBrowser.typesGlobalTableAlreadyExistsExceptionMod.GlobalTableAlreadyExistsException = {
      val __obj = js.Dynamic.literal(name = "GlobalTableAlreadyExistsException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesGlobalTableAlreadyExistsExceptionMod.GlobalTableAlreadyExistsException]
    }
    
    inline def InternalServerError(): typings.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError = {
      val __obj = js.Dynamic.literal(name = "InternalServerError")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError]
    }
    
    inline def LimitExceededException(): typings.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = "LimitExceededException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    inline def TableNotFoundException(): typings.awsSdkClientDynamodbBrowser.typesTableNotFoundExceptionMod.TableNotFoundException = {
      val __obj = js.Dynamic.literal(name = "TableNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesTableNotFoundExceptionMod.TableNotFoundException]
    }
  }
}
