package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateContinuousBackupsExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException
    - typings.awsSdkClientDynamodbNode.typesContinuousBackupsUnavailableExceptionMod.ContinuousBackupsUnavailableException
    - typings.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
  */
  trait UpdateContinuousBackupsExceptionsUnion extends StObject
  object UpdateContinuousBackupsExceptionsUnion {
    
    @scala.inline
    def ContinuousBackupsUnavailableException(): typings.awsSdkClientDynamodbNode.typesContinuousBackupsUnavailableExceptionMod.ContinuousBackupsUnavailableException = {
      val __obj = js.Dynamic.literal(name = "ContinuousBackupsUnavailableException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesContinuousBackupsUnavailableExceptionMod.ContinuousBackupsUnavailableException]
    }
    
    @scala.inline
    def InternalServerError(): typings.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError = {
      val __obj = js.Dynamic.literal(name = "InternalServerError")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError]
    }
    
    @scala.inline
    def TableNotFoundException(): typings.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException = {
      val __obj = js.Dynamic.literal(name = "TableNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException]
    }
  }
}
