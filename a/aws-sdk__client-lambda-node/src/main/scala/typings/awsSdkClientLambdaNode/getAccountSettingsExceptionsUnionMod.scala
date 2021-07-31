package typings.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAccountSettingsExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
    - typings.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
  */
  trait GetAccountSettingsExceptionsUnion extends StObject
  object GetAccountSettingsExceptionsUnion {
    
    @scala.inline
    def ServiceException(): typings.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException = {
      val __obj = js.Dynamic.literal(name = "ServiceException")
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException]
    }
    
    @scala.inline
    def TooManyRequestsException(): typings.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException = {
      val __obj = js.Dynamic.literal(name = "TooManyRequestsException")
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException]
    }
  }
}
