package typings.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getEncryptionConfigExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
    - typings.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
  */
  trait GetEncryptionConfigExceptionsUnion extends StObject
  object GetEncryptionConfigExceptionsUnion {
    
    @scala.inline
    def InvalidRequestException(name: typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.InvalidRequestException): typings.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException]
    }
    
    @scala.inline
    def ThrottledException(name: typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.ThrottledException): typings.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException]
    }
  }
}
