package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoringJobDefinition extends StObject {
  
  /**
    * Baseline configuration used to validate that the data conforms to the specified constraints and statistics
    */
  var BaselineConfig: js.UndefOr[MonitoringBaselineConfig] = js.native
  
  /**
    * Sets the environment variables in the Docker container.
    */
  var Environment: js.UndefOr[MonitoringEnvironmentMap] = js.native
  
  /**
    * Configures the monitoring job to run a specified Docker container image.
    */
  var MonitoringAppSpecification: typings.awsSdk.sagemakerMod.MonitoringAppSpecification = js.native
  
  /**
    * The array of inputs for the monitoring job. Currently we support monitoring an Amazon SageMaker Endpoint.
    */
  var MonitoringInputs: typings.awsSdk.sagemakerMod.MonitoringInputs = js.native
  
  /**
    * The array of outputs from the monitoring job to be uploaded to Amazon Simple Storage Service (Amazon S3).
    */
  var MonitoringOutputConfig: typings.awsSdk.sagemakerMod.MonitoringOutputConfig = js.native
  
  /**
    * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a monitoring job. In distributed processing, you specify more than one instance.
    */
  var MonitoringResources: typings.awsSdk.sagemakerMod.MonitoringResources = js.native
  
  /**
    * Specifies networking options for an monitoring job.
    */
  var NetworkConfig: js.UndefOr[typings.awsSdk.sagemakerMod.NetworkConfig] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
    */
  var RoleArn: typings.awsSdk.sagemakerMod.RoleArn = js.native
  
  /**
    * Specifies a time limit for how long the monitoring job is allowed to run.
    */
  var StoppingCondition: js.UndefOr[MonitoringStoppingCondition] = js.native
}
object MonitoringJobDefinition {
  
  @scala.inline
  def apply(
    MonitoringAppSpecification: MonitoringAppSpecification,
    MonitoringInputs: MonitoringInputs,
    MonitoringOutputConfig: MonitoringOutputConfig,
    MonitoringResources: MonitoringResources,
    RoleArn: RoleArn
  ): MonitoringJobDefinition = {
    val __obj = js.Dynamic.literal(MonitoringAppSpecification = MonitoringAppSpecification.asInstanceOf[js.Any], MonitoringInputs = MonitoringInputs.asInstanceOf[js.Any], MonitoringOutputConfig = MonitoringOutputConfig.asInstanceOf[js.Any], MonitoringResources = MonitoringResources.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringJobDefinition]
  }
  
  @scala.inline
  implicit class MonitoringJobDefinitionMutableBuilder[Self <: MonitoringJobDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaselineConfig(value: MonitoringBaselineConfig): Self = StObject.set(x, "BaselineConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineConfigUndefined: Self = StObject.set(x, "BaselineConfig", js.undefined)
    
    @scala.inline
    def setEnvironment(value: MonitoringEnvironmentMap): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    @scala.inline
    def setMonitoringAppSpecification(value: MonitoringAppSpecification): Self = StObject.set(x, "MonitoringAppSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringInputs(value: MonitoringInputs): Self = StObject.set(x, "MonitoringInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringInputsVarargs(value: MonitoringInput*): Self = StObject.set(x, "MonitoringInputs", js.Array(value :_*))
    
    @scala.inline
    def setMonitoringOutputConfig(value: MonitoringOutputConfig): Self = StObject.set(x, "MonitoringOutputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringResources(value: MonitoringResources): Self = StObject.set(x, "MonitoringResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkConfig(value: NetworkConfig): Self = StObject.set(x, "NetworkConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkConfigUndefined: Self = StObject.set(x, "NetworkConfig", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoppingCondition(value: MonitoringStoppingCondition): Self = StObject.set(x, "StoppingCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoppingConditionUndefined: Self = StObject.set(x, "StoppingCondition", js.undefined)
  }
}
