package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDataQualityJobDefinitionResponse extends StObject {
  
  /**
    * The time that the data quality monitoring job definition was created.
    */
  var CreationTime: js.Date
  
  /**
    * Information about the container that runs the data quality monitoring job.
    */
  var DataQualityAppSpecification: typings.awsSdk.sagemakerMod.DataQualityAppSpecification
  
  /**
    * The constraints and baselines for the data quality monitoring job definition.
    */
  var DataQualityBaselineConfig: js.UndefOr[typings.awsSdk.sagemakerMod.DataQualityBaselineConfig] = js.undefined
  
  /**
    * The list of inputs for the data quality monitoring job. Currently endpoints are supported.
    */
  var DataQualityJobInput: typings.awsSdk.sagemakerMod.DataQualityJobInput
  
  var DataQualityJobOutputConfig: MonitoringOutputConfig
  
  /**
    * The Amazon Resource Name (ARN) of the data quality monitoring job definition.
    */
  var JobDefinitionArn: MonitoringJobDefinitionArn
  
  /**
    * The name of the data quality monitoring job definition.
    */
  var JobDefinitionName: MonitoringJobDefinitionName
  
  var JobResources: MonitoringResources
  
  /**
    * The networking configuration for the data quality monitoring job.
    */
  var NetworkConfig: js.UndefOr[MonitoringNetworkConfig] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
    */
  var RoleArn: typings.awsSdk.sagemakerMod.RoleArn
  
  var StoppingCondition: js.UndefOr[MonitoringStoppingCondition] = js.undefined
}
object DescribeDataQualityJobDefinitionResponse {
  
  inline def apply(
    CreationTime: js.Date,
    DataQualityAppSpecification: DataQualityAppSpecification,
    DataQualityJobInput: DataQualityJobInput,
    DataQualityJobOutputConfig: MonitoringOutputConfig,
    JobDefinitionArn: MonitoringJobDefinitionArn,
    JobDefinitionName: MonitoringJobDefinitionName,
    JobResources: MonitoringResources,
    RoleArn: RoleArn
  ): DescribeDataQualityJobDefinitionResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], DataQualityAppSpecification = DataQualityAppSpecification.asInstanceOf[js.Any], DataQualityJobInput = DataQualityJobInput.asInstanceOf[js.Any], DataQualityJobOutputConfig = DataQualityJobOutputConfig.asInstanceOf[js.Any], JobDefinitionArn = JobDefinitionArn.asInstanceOf[js.Any], JobDefinitionName = JobDefinitionName.asInstanceOf[js.Any], JobResources = JobResources.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDataQualityJobDefinitionResponse]
  }
  
  extension [Self <: DescribeDataQualityJobDefinitionResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setDataQualityAppSpecification(value: DataQualityAppSpecification): Self = StObject.set(x, "DataQualityAppSpecification", value.asInstanceOf[js.Any])
    
    inline def setDataQualityBaselineConfig(value: DataQualityBaselineConfig): Self = StObject.set(x, "DataQualityBaselineConfig", value.asInstanceOf[js.Any])
    
    inline def setDataQualityBaselineConfigUndefined: Self = StObject.set(x, "DataQualityBaselineConfig", js.undefined)
    
    inline def setDataQualityJobInput(value: DataQualityJobInput): Self = StObject.set(x, "DataQualityJobInput", value.asInstanceOf[js.Any])
    
    inline def setDataQualityJobOutputConfig(value: MonitoringOutputConfig): Self = StObject.set(x, "DataQualityJobOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setJobDefinitionArn(value: MonitoringJobDefinitionArn): Self = StObject.set(x, "JobDefinitionArn", value.asInstanceOf[js.Any])
    
    inline def setJobDefinitionName(value: MonitoringJobDefinitionName): Self = StObject.set(x, "JobDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setJobResources(value: MonitoringResources): Self = StObject.set(x, "JobResources", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfig(value: MonitoringNetworkConfig): Self = StObject.set(x, "NetworkConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigUndefined: Self = StObject.set(x, "NetworkConfig", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setStoppingCondition(value: MonitoringStoppingCondition): Self = StObject.set(x, "StoppingCondition", value.asInstanceOf[js.Any])
    
    inline def setStoppingConditionUndefined: Self = StObject.set(x, "StoppingCondition", js.undefined)
  }
}
