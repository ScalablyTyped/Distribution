package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendPipelineExecutionStepSuccessRequest extends StObject {
  
  /**
    * The pipeline generated token from the Amazon SQS queue.
    */
  var CallbackToken: typings.awsSdk.sagemakerMod.CallbackToken
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent operation completes no more than one time.
    */
  var ClientRequestToken: js.UndefOr[IdempotencyToken] = js.undefined
  
  /**
    * A list of the output parameters of the callback step.
    */
  var OutputParameters: js.UndefOr[OutputParameterList] = js.undefined
}
object SendPipelineExecutionStepSuccessRequest {
  
  inline def apply(CallbackToken: CallbackToken): SendPipelineExecutionStepSuccessRequest = {
    val __obj = js.Dynamic.literal(CallbackToken = CallbackToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendPipelineExecutionStepSuccessRequest]
  }
  
  extension [Self <: SendPipelineExecutionStepSuccessRequest](x: Self) {
    
    inline def setCallbackToken(value: CallbackToken): Self = StObject.set(x, "CallbackToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestToken(value: IdempotencyToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setOutputParameters(value: OutputParameterList): Self = StObject.set(x, "OutputParameters", value.asInstanceOf[js.Any])
    
    inline def setOutputParametersUndefined: Self = StObject.set(x, "OutputParameters", js.undefined)
    
    inline def setOutputParametersVarargs(value: OutputParameter*): Self = StObject.set(x, "OutputParameters", js.Array(value*))
  }
}
