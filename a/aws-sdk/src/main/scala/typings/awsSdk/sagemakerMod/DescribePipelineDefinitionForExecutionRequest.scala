package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePipelineDefinitionForExecutionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the pipeline execution.
    */
  var PipelineExecutionArn: typings.awsSdk.sagemakerMod.PipelineExecutionArn
}
object DescribePipelineDefinitionForExecutionRequest {
  
  inline def apply(PipelineExecutionArn: PipelineExecutionArn): DescribePipelineDefinitionForExecutionRequest = {
    val __obj = js.Dynamic.literal(PipelineExecutionArn = PipelineExecutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePipelineDefinitionForExecutionRequest]
  }
  
  extension [Self <: DescribePipelineDefinitionForExecutionRequest](x: Self) {
    
    inline def setPipelineExecutionArn(value: PipelineExecutionArn): Self = StObject.set(x, "PipelineExecutionArn", value.asInstanceOf[js.Any])
  }
}
