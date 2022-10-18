package typings.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBatchGetTracesExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
    - typings.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
  */
  trait BatchGetTracesExceptionsUnion extends StObject
  object BatchGetTracesExceptionsUnion {
    
    inline def InvalidRequestException(): typings.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException = {
      val __obj = js.Dynamic.literal(name = "InvalidRequestException")
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException]
    }
    
    inline def ThrottledException(): typings.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException = {
      val __obj = js.Dynamic.literal(name = "ThrottledException")
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException]
    }
  }
}
