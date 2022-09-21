package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendPipelineExecutionStepFailureRequest extends StObject {
  
  /**
    * The pipeline generated token from the Amazon SQS queue.
    */
  var CallbackToken: typings.awsSdk.sagemakerMod.CallbackToken
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent operation completes no more than one time.
    */
  var ClientRequestToken: js.UndefOr[IdempotencyToken] = js.undefined
  
  /**
    * A message describing why the step failed.
    */
  var FailureReason: js.UndefOr[String256] = js.undefined
}
object SendPipelineExecutionStepFailureRequest {
  
  inline def apply(CallbackToken: CallbackToken): SendPipelineExecutionStepFailureRequest = {
    val __obj = js.Dynamic.literal(CallbackToken = CallbackToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendPipelineExecutionStepFailureRequest]
  }
  
  extension [Self <: SendPipelineExecutionStepFailureRequest](x: Self) {
    
    inline def setCallbackToken(value: CallbackToken): Self = StObject.set(x, "CallbackToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestToken(value: IdempotencyToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setFailureReason(value: String256): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
  }
}
