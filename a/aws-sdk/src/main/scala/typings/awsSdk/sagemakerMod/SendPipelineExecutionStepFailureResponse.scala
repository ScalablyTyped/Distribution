package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendPipelineExecutionStepFailureResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the pipeline execution.
    */
  var PipelineExecutionArn: js.UndefOr[typings.awsSdk.sagemakerMod.PipelineExecutionArn] = js.undefined
}
object SendPipelineExecutionStepFailureResponse {
  
  inline def apply(): SendPipelineExecutionStepFailureResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendPipelineExecutionStepFailureResponse]
  }
  
  extension [Self <: SendPipelineExecutionStepFailureResponse](x: Self) {
    
    inline def setPipelineExecutionArn(value: PipelineExecutionArn): Self = StObject.set(x, "PipelineExecutionArn", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecutionArnUndefined: Self = StObject.set(x, "PipelineExecutionArn", js.undefined)
  }
}
