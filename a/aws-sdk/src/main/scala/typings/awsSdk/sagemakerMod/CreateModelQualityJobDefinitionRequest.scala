package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelQualityJobDefinitionRequest extends StObject {
  
  /**
    * The name of the monitoring job definition.
    */
  var JobDefinitionName: MonitoringJobDefinitionName
  
  var JobResources: MonitoringResources
  
  /**
    * The container that runs the monitoring job.
    */
  var ModelQualityAppSpecification: typings.awsSdk.sagemakerMod.ModelQualityAppSpecification
  
  /**
    * Specifies the constraints and baselines for the monitoring job.
    */
  var ModelQualityBaselineConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ModelQualityBaselineConfig] = js.undefined
  
  /**
    * A list of the inputs that are monitored. Currently endpoints are supported.
    */
  var ModelQualityJobInput: typings.awsSdk.sagemakerMod.ModelQualityJobInput
  
  var ModelQualityJobOutputConfig: MonitoringOutputConfig
  
  /**
    * Specifies the network configuration for the monitoring job.
    */
  var NetworkConfig: js.UndefOr[MonitoringNetworkConfig] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
    */
  var RoleArn: typings.awsSdk.sagemakerMod.RoleArn
  
  var StoppingCondition: js.UndefOr[MonitoringStoppingCondition] = js.undefined
  
  /**
    * (Optional) An array of key-value pairs. For more information, see Using Cost Allocation Tags in the Amazon Web Services Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateModelQualityJobDefinitionRequest {
  
  inline def apply(
    JobDefinitionName: MonitoringJobDefinitionName,
    JobResources: MonitoringResources,
    ModelQualityAppSpecification: ModelQualityAppSpecification,
    ModelQualityJobInput: ModelQualityJobInput,
    ModelQualityJobOutputConfig: MonitoringOutputConfig,
    RoleArn: RoleArn
  ): CreateModelQualityJobDefinitionRequest = {
    val __obj = js.Dynamic.literal(JobDefinitionName = JobDefinitionName.asInstanceOf[js.Any], JobResources = JobResources.asInstanceOf[js.Any], ModelQualityAppSpecification = ModelQualityAppSpecification.asInstanceOf[js.Any], ModelQualityJobInput = ModelQualityJobInput.asInstanceOf[js.Any], ModelQualityJobOutputConfig = ModelQualityJobOutputConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelQualityJobDefinitionRequest]
  }
  
  extension [Self <: CreateModelQualityJobDefinitionRequest](x: Self) {
    
    inline def setJobDefinitionName(value: MonitoringJobDefinitionName): Self = StObject.set(x, "JobDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setJobResources(value: MonitoringResources): Self = StObject.set(x, "JobResources", value.asInstanceOf[js.Any])
    
    inline def setModelQualityAppSpecification(value: ModelQualityAppSpecification): Self = StObject.set(x, "ModelQualityAppSpecification", value.asInstanceOf[js.Any])
    
    inline def setModelQualityBaselineConfig(value: ModelQualityBaselineConfig): Self = StObject.set(x, "ModelQualityBaselineConfig", value.asInstanceOf[js.Any])
    
    inline def setModelQualityBaselineConfigUndefined: Self = StObject.set(x, "ModelQualityBaselineConfig", js.undefined)
    
    inline def setModelQualityJobInput(value: ModelQualityJobInput): Self = StObject.set(x, "ModelQualityJobInput", value.asInstanceOf[js.Any])
    
    inline def setModelQualityJobOutputConfig(value: MonitoringOutputConfig): Self = StObject.set(x, "ModelQualityJobOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfig(value: MonitoringNetworkConfig): Self = StObject.set(x, "NetworkConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigUndefined: Self = StObject.set(x, "NetworkConfig", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setStoppingCondition(value: MonitoringStoppingCondition): Self = StObject.set(x, "StoppingCondition", value.asInstanceOf[js.Any])
    
    inline def setStoppingConditionUndefined: Self = StObject.set(x, "StoppingCondition", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
