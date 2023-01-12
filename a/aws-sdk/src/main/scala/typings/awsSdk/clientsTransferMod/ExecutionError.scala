package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionError extends StObject {
  
  /**
    * Specifies the descriptive message that corresponds to the ErrorType.
    */
  var Message: ExecutionErrorMessage
  
  /**
    * Specifies the error type.    ALREADY_EXISTS: occurs for a copy step, if the overwrite option is not selected and a file with the same name already exists in the target location.    BAD_REQUEST: a general bad request: for example, a step that attempts to tag an EFS file returns BAD_REQUEST, as only S3 files can be tagged.    CUSTOM_STEP_FAILED: occurs when the custom step provided a callback that indicates failure.    INTERNAL_SERVER_ERROR: a catch-all error that can occur for a variety of reasons.    NOT_FOUND: occurs when a requested entity, for example a source file for a copy step, does not exist.    PERMISSION_DENIED: occurs if your policy does not contain the correct permissions to complete one or more of the steps in the workflow.    TIMEOUT: occurs when the execution times out.   You can set the TimeoutSeconds for a custom step, anywhere from 1 second to 1800 seconds (30 minutes).      THROTTLED: occurs if you exceed the new execution refill rate of one workflow per second.  
    */
  var Type: ExecutionErrorType
}
object ExecutionError {
  
  inline def apply(Message: ExecutionErrorMessage, Type: ExecutionErrorType): ExecutionError = {
    val __obj = js.Dynamic.literal(Message = Message.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecutionError] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: ExecutionErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setType(value: ExecutionErrorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
