package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePipelineRequest extends StObject {
  
  /**
    * If specified, it applies to all executions of this pipeline by default.
    */
  var ParallelismConfiguration: js.UndefOr[typings.awsSdk.sagemakerMod.ParallelismConfiguration] = js.undefined
  
  /**
    * The JSON pipeline definition.
    */
  var PipelineDefinition: js.UndefOr[typings.awsSdk.sagemakerMod.PipelineDefinition] = js.undefined
  
  /**
    * The location of the pipeline definition stored in Amazon S3. If specified, SageMaker will retrieve the pipeline definition from this location.
    */
  var PipelineDefinitionS3Location: js.UndefOr[typings.awsSdk.sagemakerMod.PipelineDefinitionS3Location] = js.undefined
  
  /**
    * The description of the pipeline.
    */
  var PipelineDescription: js.UndefOr[typings.awsSdk.sagemakerMod.PipelineDescription] = js.undefined
  
  /**
    * The display name of the pipeline.
    */
  var PipelineDisplayName: js.UndefOr[PipelineName] = js.undefined
  
  /**
    * The name of the pipeline to update.
    */
  var PipelineName: typings.awsSdk.sagemakerMod.PipelineName
  
  /**
    * The Amazon Resource Name (ARN) that the pipeline uses to execute.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.sagemakerMod.RoleArn] = js.undefined
}
object UpdatePipelineRequest {
  
  inline def apply(PipelineName: PipelineName): UpdatePipelineRequest = {
    val __obj = js.Dynamic.literal(PipelineName = PipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePipelineRequest]
  }
  
  extension [Self <: UpdatePipelineRequest](x: Self) {
    
    inline def setParallelismConfiguration(value: ParallelismConfiguration): Self = StObject.set(x, "ParallelismConfiguration", value.asInstanceOf[js.Any])
    
    inline def setParallelismConfigurationUndefined: Self = StObject.set(x, "ParallelismConfiguration", js.undefined)
    
    inline def setPipelineDefinition(value: PipelineDefinition): Self = StObject.set(x, "PipelineDefinition", value.asInstanceOf[js.Any])
    
    inline def setPipelineDefinitionS3Location(value: PipelineDefinitionS3Location): Self = StObject.set(x, "PipelineDefinitionS3Location", value.asInstanceOf[js.Any])
    
    inline def setPipelineDefinitionS3LocationUndefined: Self = StObject.set(x, "PipelineDefinitionS3Location", js.undefined)
    
    inline def setPipelineDefinitionUndefined: Self = StObject.set(x, "PipelineDefinition", js.undefined)
    
    inline def setPipelineDescription(value: PipelineDescription): Self = StObject.set(x, "PipelineDescription", value.asInstanceOf[js.Any])
    
    inline def setPipelineDescriptionUndefined: Self = StObject.set(x, "PipelineDescription", js.undefined)
    
    inline def setPipelineDisplayName(value: PipelineName): Self = StObject.set(x, "PipelineDisplayName", value.asInstanceOf[js.Any])
    
    inline def setPipelineDisplayNameUndefined: Self = StObject.set(x, "PipelineDisplayName", js.undefined)
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "PipelineName", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
