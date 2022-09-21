package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryPipelineExecutionRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent operation completes no more than once.
    */
  var ClientRequestToken: IdempotencyToken
  
  /**
    * This configuration, if specified, overrides the parallelism configuration of the parent pipeline.
    */
  var ParallelismConfiguration: js.UndefOr[typings.awsSdk.sagemakerMod.ParallelismConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the pipeline execution.
    */
  var PipelineExecutionArn: typings.awsSdk.sagemakerMod.PipelineExecutionArn
}
object RetryPipelineExecutionRequest {
  
  inline def apply(ClientRequestToken: IdempotencyToken, PipelineExecutionArn: PipelineExecutionArn): RetryPipelineExecutionRequest = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], PipelineExecutionArn = PipelineExecutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryPipelineExecutionRequest]
  }
  
  extension [Self <: RetryPipelineExecutionRequest](x: Self) {
    
    inline def setClientRequestToken(value: IdempotencyToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setParallelismConfiguration(value: ParallelismConfiguration): Self = StObject.set(x, "ParallelismConfiguration", value.asInstanceOf[js.Any])
    
    inline def setParallelismConfigurationUndefined: Self = StObject.set(x, "ParallelismConfiguration", js.undefined)
    
    inline def setPipelineExecutionArn(value: PipelineExecutionArn): Self = StObject.set(x, "PipelineExecutionArn", value.asInstanceOf[js.Any])
  }
}
