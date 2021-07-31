package typings.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTraceGraphExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
    - typings.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
  */
  trait GetTraceGraphExceptionsUnion extends StObject
  object GetTraceGraphExceptionsUnion {
    
    @scala.inline
    def InvalidRequestException(): typings.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException = {
      val __obj = js.Dynamic.literal(name = "InvalidRequestException")
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException]
    }
    
    @scala.inline
    def ThrottledException(): typings.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException = {
      val __obj = js.Dynamic.literal(name = "ThrottledException")
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException]
    }
  }
}
