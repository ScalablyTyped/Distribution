package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pipeline extends StObject {
  
  var CreatedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * The creation time of the pipeline.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  var LastModifiedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * The time that the pipeline was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time when the pipeline was last run.
    */
  var LastRunTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The parallelism configuration applied to the pipeline.
    */
  var ParallelismConfiguration: js.UndefOr[typings.awsSdk.sagemakerMod.ParallelismConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the pipeline.
    */
  var PipelineArn: js.UndefOr[typings.awsSdk.sagemakerMod.PipelineArn] = js.undefined
  
  /**
    * The description of the pipeline.
    */
  var PipelineDescription: js.UndefOr[typings.awsSdk.sagemakerMod.PipelineDescription] = js.undefined
  
  /**
    * The display name of the pipeline.
    */
  var PipelineDisplayName: js.UndefOr[PipelineName] = js.undefined
  
  /**
    * The name of the pipeline.
    */
  var PipelineName: js.UndefOr[typings.awsSdk.sagemakerMod.PipelineName] = js.undefined
  
  /**
    * The status of the pipeline.
    */
  var PipelineStatus: js.UndefOr[typings.awsSdk.sagemakerMod.PipelineStatus] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role that created the pipeline.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.sagemakerMod.RoleArn] = js.undefined
  
  /**
    * A list of tags that apply to the pipeline.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object Pipeline {
  
  inline def apply(): Pipeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pipeline]
  }
  
  extension [Self <: Pipeline](x: Self) {
    
    inline def setCreatedBy(value: UserContext): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLastModifiedBy(value: UserContext): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setLastRunTime(value: js.Date): Self = StObject.set(x, "LastRunTime", value.asInstanceOf[js.Any])
    
    inline def setLastRunTimeUndefined: Self = StObject.set(x, "LastRunTime", js.undefined)
    
    inline def setParallelismConfiguration(value: ParallelismConfiguration): Self = StObject.set(x, "ParallelismConfiguration", value.asInstanceOf[js.Any])
    
    inline def setParallelismConfigurationUndefined: Self = StObject.set(x, "ParallelismConfiguration", js.undefined)
    
    inline def setPipelineArn(value: PipelineArn): Self = StObject.set(x, "PipelineArn", value.asInstanceOf[js.Any])
    
    inline def setPipelineArnUndefined: Self = StObject.set(x, "PipelineArn", js.undefined)
    
    inline def setPipelineDescription(value: PipelineDescription): Self = StObject.set(x, "PipelineDescription", value.asInstanceOf[js.Any])
    
    inline def setPipelineDescriptionUndefined: Self = StObject.set(x, "PipelineDescription", js.undefined)
    
    inline def setPipelineDisplayName(value: PipelineName): Self = StObject.set(x, "PipelineDisplayName", value.asInstanceOf[js.Any])
    
    inline def setPipelineDisplayNameUndefined: Self = StObject.set(x, "PipelineDisplayName", js.undefined)
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "PipelineName", value.asInstanceOf[js.Any])
    
    inline def setPipelineNameUndefined: Self = StObject.set(x, "PipelineName", js.undefined)
    
    inline def setPipelineStatus(value: PipelineStatus): Self = StObject.set(x, "PipelineStatus", value.asInstanceOf[js.Any])
    
    inline def setPipelineStatusUndefined: Self = StObject.set(x, "PipelineStatus", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
