package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartPipelineExecutionRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent operation completes no more than once.
    */
  var ClientRequestToken: IdempotencyToken
  
  /**
    * This configuration, if specified, overrides the parallelism configuration of the parent pipeline for this specific run.
    */
  var ParallelismConfiguration: js.UndefOr[typings.awsSdk.sagemakerMod.ParallelismConfiguration] = js.undefined
  
  /**
    * The description of the pipeline execution.
    */
  var PipelineExecutionDescription: js.UndefOr[typings.awsSdk.sagemakerMod.PipelineExecutionDescription] = js.undefined
  
  /**
    * The display name of the pipeline execution.
    */
  var PipelineExecutionDisplayName: js.UndefOr[PipelineExecutionName] = js.undefined
  
  /**
    * The name of the pipeline.
    */
  var PipelineName: typings.awsSdk.sagemakerMod.PipelineName
  
  /**
    * Contains a list of pipeline parameters. This list can be empty. 
    */
  var PipelineParameters: js.UndefOr[ParameterList] = js.undefined
}
object StartPipelineExecutionRequest {
  
  inline def apply(ClientRequestToken: IdempotencyToken, PipelineName: PipelineName): StartPipelineExecutionRequest = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], PipelineName = PipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartPipelineExecutionRequest]
  }
  
  extension [Self <: StartPipelineExecutionRequest](x: Self) {
    
    inline def setClientRequestToken(value: IdempotencyToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setParallelismConfiguration(value: ParallelismConfiguration): Self = StObject.set(x, "ParallelismConfiguration", value.asInstanceOf[js.Any])
    
    inline def setParallelismConfigurationUndefined: Self = StObject.set(x, "ParallelismConfiguration", js.undefined)
    
    inline def setPipelineExecutionDescription(value: PipelineExecutionDescription): Self = StObject.set(x, "PipelineExecutionDescription", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecutionDescriptionUndefined: Self = StObject.set(x, "PipelineExecutionDescription", js.undefined)
    
    inline def setPipelineExecutionDisplayName(value: PipelineExecutionName): Self = StObject.set(x, "PipelineExecutionDisplayName", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecutionDisplayNameUndefined: Self = StObject.set(x, "PipelineExecutionDisplayName", js.undefined)
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "PipelineName", value.asInstanceOf[js.Any])
    
    inline def setPipelineParameters(value: ParameterList): Self = StObject.set(x, "PipelineParameters", value.asInstanceOf[js.Any])
    
    inline def setPipelineParametersUndefined: Self = StObject.set(x, "PipelineParameters", js.undefined)
    
    inline def setPipelineParametersVarargs(value: Parameter*): Self = StObject.set(x, "PipelineParameters", js.Array(value*))
  }
}
