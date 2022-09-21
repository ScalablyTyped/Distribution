package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartPipelineExecutionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the pipeline execution.
    */
  var PipelineExecutionArn: js.UndefOr[typings.awsSdk.sagemakerMod.PipelineExecutionArn] = js.undefined
}
object StartPipelineExecutionResponse {
  
  inline def apply(): StartPipelineExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPipelineExecutionResponse]
  }
  
  extension [Self <: StartPipelineExecutionResponse](x: Self) {
    
    inline def setPipelineExecutionArn(value: PipelineExecutionArn): Self = StObject.set(x, "PipelineExecutionArn", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecutionArnUndefined: Self = StObject.set(x, "PipelineExecutionArn", js.undefined)
  }
}
