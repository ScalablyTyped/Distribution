package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoringJobDefinition extends js.Object {
  
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
  implicit class MonitoringJobDefinitionOps[Self <: MonitoringJobDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMonitoringAppSpecification(value: MonitoringAppSpecification): Self = this.set("MonitoringAppSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringInputsVarargs(value: MonitoringInput*): Self = this.set("MonitoringInputs", js.Array(value :_*))
    
    @scala.inline
    def setMonitoringInputs(value: MonitoringInputs): Self = this.set("MonitoringInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringOutputConfig(value: MonitoringOutputConfig): Self = this.set("MonitoringOutputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringResources(value: MonitoringResources): Self = this.set("MonitoringResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineConfig(value: MonitoringBaselineConfig): Self = this.set("BaselineConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaselineConfig: Self = this.set("BaselineConfig", js.undefined)
    
    @scala.inline
    def setEnvironment(value: MonitoringEnvironmentMap): Self = this.set("Environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("Environment", js.undefined)
    
    @scala.inline
    def setNetworkConfig(value: NetworkConfig): Self = this.set("NetworkConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkConfig: Self = this.set("NetworkConfig", js.undefined)
    
    @scala.inline
    def setStoppingCondition(value: MonitoringStoppingCondition): Self = this.set("StoppingCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoppingCondition: Self = this.set("StoppingCondition", js.undefined)
  }
}
